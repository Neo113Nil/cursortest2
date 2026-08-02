package y9;

import T7.E;
import h9.EnumC6876a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes9.dex */
public final class f extends s {
    private static void g(int[] iArr, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = 1;
            if (((1 << (8 - i12)) & i11) != 0) {
                i13 = 2;
            }
            iArr[i12] = i13;
        }
    }

    @Override // y9.s
    public final boolean[] d(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11)) < 0) {
                int length2 = str.length();
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = 0; i12 < length2; i12++) {
                    char charAt = str.charAt(i12);
                    if (charAt != 0) {
                        if (charAt != ' ') {
                            if (charAt == '@') {
                                sb2.append("%V");
                            } else if (charAt == '`') {
                                sb2.append("%W");
                            } else if (charAt != '-' && charAt != '.') {
                                if (charAt <= 26) {
                                    sb2.append('$');
                                    sb2.append((char) (charAt + '@'));
                                } else if (charAt < ' ') {
                                    sb2.append('%');
                                    sb2.append((char) (charAt + '&'));
                                } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                                    sb2.append('/');
                                    sb2.append((char) (charAt + ' '));
                                } else if (charAt <= '9') {
                                    sb2.append(charAt);
                                } else if (charAt <= '?') {
                                    sb2.append('%');
                                    sb2.append((char) (charAt + 11));
                                } else if (charAt <= 'Z') {
                                    sb2.append(charAt);
                                } else if (charAt <= '_') {
                                    sb2.append('%');
                                    sb2.append((char) (charAt - 16));
                                } else if (charAt <= 'z') {
                                    sb2.append('+');
                                    sb2.append((char) (charAt - ' '));
                                } else {
                                    if (charAt > 127) {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i12) + "'");
                                    }
                                    sb2.append('%');
                                    sb2.append((char) (charAt - '+'));
                                }
                            }
                        }
                        sb2.append(charAt);
                    } else {
                        sb2.append("%U");
                    }
                }
                str = sb2.toString();
                length = str.length();
                if (length > 80) {
                    throw new IllegalArgumentException(E.a(length, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
                }
            } else {
                i11++;
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        g(iArr, 148);
        int b11 = s.b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int b12 = b11 + s.b(zArr, b11, iArr2, false);
        for (int i13 = 0; i13 < length; i13++) {
            g(iArr, e.f106318d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i13))]);
            int b13 = b12 + s.b(zArr, b12, iArr, true);
            b12 = b13 + s.b(zArr, b13, iArr2, false);
        }
        g(iArr, 148);
        s.b(zArr, b12, iArr, true);
        return zArr;
    }

    @Override // y9.s
    protected final Set f() {
        return Collections.singleton(EnumC6876a.CODE_39);
    }
}
