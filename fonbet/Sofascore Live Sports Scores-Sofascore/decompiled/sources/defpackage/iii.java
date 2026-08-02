package defpackage;

import kotlin.text.f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class iii extends f {
    public static String C(int i, String str) {
        str.getClass();
        if (i < 0) {
            ogj.h(lnb.k(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static String D(int i, String str) {
        str.getClass();
        if (i < 0) {
            ogj.h(lnb.k(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return H(length, str);
    }

    public static char E(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        ogj.m("Char sequence is empty.");
        return (char) 0;
    }

    public static Character F(int i, String str) {
        if (i < 0 || i >= str.length()) {
            return null;
        }
        return Character.valueOf(str.charAt(i));
    }

    public static char G(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        ogj.m("Char sequence is empty.");
        return (char) 0;
    }

    public static String H(int i, String str) {
        str.getClass();
        if (i < 0) {
            ogj.h(lnb.k(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String I(String str) {
        int length = str.length();
        return str.substring(length - (2 > length ? length : 2));
    }
}
