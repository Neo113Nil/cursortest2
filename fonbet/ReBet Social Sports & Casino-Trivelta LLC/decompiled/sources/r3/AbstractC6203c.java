package r3;

import o3.C5797b;
import q3.C6110b;

/* renamed from: r3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6203c {
    public static String a(C6110b c6110b) {
        if (c6110b == null) {
            throw new C5797b("Card cannot be null");
        }
        String d10 = d(c6110b.e());
        String d11 = d(c6110b.a());
        int intValue = c6110b.b().intValue();
        String str = intValue + "";
        String[] strArr = {d10, d11, str, c6110b.c().intValue() + ""};
        if (b(d10)) {
            throw new C5797b("Invalid card details: Card number is empty or null");
        }
        String str2 = null;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i10 == 0) {
                str2 = strArr[i10] + "*";
            } else if (i10 == 3) {
                str2 = str2 + strArr[i10];
            } else {
                str2 = str2 + strArr[i10] + "*";
            }
        }
        return str2;
    }

    public static boolean b(String str) {
        return str == null || str.length() < 1 || str.equalsIgnoreCase("null");
    }

    public static String c(String str) {
        return str.replaceAll("[^\\d]", "");
    }

    public static String d(String str) {
        if (b(str)) {
            return null;
        }
        return str;
    }
}
