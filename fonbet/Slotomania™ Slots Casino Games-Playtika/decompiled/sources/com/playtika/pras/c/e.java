package com.playtika.pras.c;

import com.ironsource.X3;

/* loaded from: classes7.dex */
public abstract class e {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String lowerCase = str.toLowerCase();
        switch (lowerCase.hashCode()) {
            case -1700437898:
                if (lowerCase.equals("sensor_landscape")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1626174665:
                if (lowerCase.equals("unspecified")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1006764182:
                if (lowerCase.equals("full_sensor")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -905948230:
                if (lowerCase.equals("sensor")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -675508834:
                if (lowerCase.equals("reverse_landscape")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -203019648:
                if (lowerCase.equals("sensor_portrait")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -31410088:
                if (lowerCase.equals("reverse_portrait")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 729267099:
                if (lowerCase.equals(X3.i.D)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1430647483:
                if (lowerCase.equals(X3.i.C)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return -1;
    }
}
