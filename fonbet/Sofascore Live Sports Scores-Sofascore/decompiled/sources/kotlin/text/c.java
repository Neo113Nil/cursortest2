package kotlin.text;

import defpackage.lnb;
import defpackage.me4;
import defpackage.ogj;
import defpackage.q4;
import defpackage.u4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class c extends StringsKt__StringNumberConversionsKt {
    public static String i(char[] cArr, int i, int i2) {
        q4 q4Var = u4.Companion;
        int length = cArr.length;
        q4Var.getClass();
        q4.a(i, i2, length);
        return new String(cArr, i, i2 - i);
    }

    public static boolean j(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String k(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, Charsets.UTF_8);
    }

    public static String l(int i, int i2, int i3, byte[] bArr) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        bArr.getClass();
        q4 q4Var = u4.Companion;
        int length = bArr.length;
        q4Var.getClass();
        q4.a(i, i2, length);
        return new String(bArr, i, i2 - i, Charsets.UTF_8);
    }

    public static byte[] m(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return bytes;
    }

    public static boolean n(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean o(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean p(String str, int i, String str2, int i2, int i3, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String q(int i, String str) {
        if (i < 0) {
            ogj.h(lnb.n("Count 'n' must be non-negative, but was ", i, '.'));
            return null;
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append((CharSequence) str);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char charAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = charAt;
        }
        return new String(cArr);
    }

    public static String r(String str, String str2, String str3, boolean z) {
        me4.p(str, str2, str3);
        int i = 0;
        int w = StringsKt__StringsKt.w(0, str, str2, z);
        if (w < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, w);
            sb.append(str3);
            i = w + length;
            if (w >= str.length()) {
                break;
            }
            w = StringsKt__StringsKt.w(w + i2, str, str2, z);
        } while (w > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static String s(String str, char c, char c2) {
        str.getClass();
        String replace = str.replace(c, c2);
        replace.getClass();
        return replace;
    }

    public static String t(String str, String str2, String str3, boolean z) {
        str.getClass();
        int P = StringsKt.P(str, str2, 0, z, 2);
        return P < 0 ? str : StringsKt.X(str, P, str2.length() + P, str3).toString();
    }

    public static boolean u(int i, String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : p(str, i, str2, 0, str2.length(), z);
    }

    public static boolean v(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : p(str, 0, str2, 0, str2.length(), z);
    }
}
