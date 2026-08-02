package y9;

import Ij.C3261b;
import h9.EnumC6876a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes9.dex */
public final class h extends s {
    private static void g(boolean[] zArr, int i11, int i12) {
        for (int i13 = 0; i13 < 9; i13++) {
            boolean z11 = true;
            int i14 = i11 + i13;
            if (((1 << (8 - i13)) & i12) == 0) {
                z11 = false;
            }
            zArr[i14] = z11;
        }
    }

    private static int h(int i11, String str) {
        int i12 = 0;
        int i13 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        return i12 % 47;
    }

    @Override // y9.s
    public final boolean[] d(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length << 1);
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == 0) {
                sb2.append("bU");
            } else if (charAt <= 26) {
                sb2.append('a');
                sb2.append((char) (charAt + '@'));
            } else if (charAt <= 31) {
                sb2.append('b');
                sb2.append((char) (charAt + '&'));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb2.append(charAt);
            } else if (charAt <= ',') {
                sb2.append('c');
                sb2.append((char) (charAt + ' '));
            } else if (charAt <= '9') {
                sb2.append(charAt);
            } else if (charAt == ':') {
                sb2.append("cZ");
            } else if (charAt <= '?') {
                sb2.append('b');
                sb2.append((char) (charAt + 11));
            } else if (charAt == '@') {
                sb2.append("bV");
            } else if (charAt <= 'Z') {
                sb2.append(charAt);
            } else if (charAt <= '_') {
                sb2.append('b');
                sb2.append((char) (charAt - 16));
            } else if (charAt == '`') {
                sb2.append("bW");
            } else if (charAt <= 'z') {
                sb2.append('d');
                sb2.append((char) (charAt - ' '));
            } else {
                if (charAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
                }
                sb2.append('b');
                sb2.append((char) (charAt - '+'));
            }
        }
        String sb3 = sb2.toString();
        int length2 = sb3.length();
        if (length2 > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length2)));
        }
        int i12 = 9;
        boolean[] zArr = new boolean[((sb3.length() + 4) * 9) + 1];
        g(zArr, 0, g.f106324e);
        for (int i13 = 0; i13 < length2; i13++) {
            g(zArr, i12, g.f106323d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(sb3.charAt(i13))]);
            i12 += 9;
        }
        int h11 = h(20, sb3);
        int[] iArr = g.f106323d;
        g(zArr, i12, iArr[h11]);
        StringBuilder e11 = C3261b.e(sb3);
        e11.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(h11));
        g(zArr, i12 + 9, iArr[h(15, e11.toString())]);
        g(zArr, i12 + 18, g.f106324e);
        zArr[i12 + 27] = true;
        return zArr;
    }

    @Override // y9.s
    protected final Set f() {
        return Collections.singleton(EnumC6876a.CODE_93);
    }
}
