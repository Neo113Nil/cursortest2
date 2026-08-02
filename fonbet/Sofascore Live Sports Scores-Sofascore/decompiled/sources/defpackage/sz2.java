package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sz2 extends waa {
    public static final char[] d;
    public static final char[] e = {'T', 'N', '*', 'E'};
    public static final char[] f = {'/', ':', '+', '.'};
    public static final char g;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        d = cArr;
        g = cArr[0];
    }

    @Override // defpackage.waa
    public final boolean[] x(String str) {
        int i;
        int length = str.length();
        char c = g;
        if (length < 2) {
            str = c + str + c;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = d;
            boolean E = rz2.E(cArr, upperCase);
            boolean E2 = rz2.E(cArr, upperCase2);
            char[] cArr2 = e;
            boolean E3 = rz2.E(cArr2, upperCase);
            boolean E4 = rz2.E(cArr2, upperCase2);
            if (E) {
                if (!E2) {
                    a70.p("Invalid start/end guards: ".concat(str));
                    return null;
                }
            } else if (!E3) {
                if (E2 || E4) {
                    a70.p("Invalid start/end guards: ".concat(str));
                    return null;
                }
                str = c + str + c;
            } else if (!E4) {
                a70.p("Invalid start/end guards: ".concat(str));
                return null;
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!rz2.E(f, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i2];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = rz2.e;
                if (i6 >= 20) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = rz2.f[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
