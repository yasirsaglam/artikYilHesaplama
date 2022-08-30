import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sene;
        boolean artikYil = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Yılı giriniz : ");
        sene = input.nextInt();
        if (sene % 4 == 0) {
            if (sene % 100 == 0) {
                if (sene % 400 == 0) {
                    artikYil = true;
                }
            } else {
                artikYil = true;
            }
        }
        if (artikYil) {
            System.out.print(+sene + " artık bir yıldır.");
        } else {
            System.out.print(+sene + " artık bir yıl değildir.");
        }
    }
}