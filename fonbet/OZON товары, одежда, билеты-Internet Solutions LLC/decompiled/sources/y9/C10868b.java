package y9;

import h9.EnumC6876a;
import java.util.Collections;
import java.util.Set;

/* renamed from: y9.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10868b extends s {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f106313b;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f106314c = {'T', 'N', '*', 'E'};

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f106315d = {'/', ':', '+', '.'};

    /* renamed from: e, reason: collision with root package name */
    private static final char f106316e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f106313b = cArr;
        f106316e = cArr[0];
    }

    @Override // y9.s
    public final boolean[] d(String str) {
        int i11;
        int length = str.length();
        char c11 = f106316e;
        if (length < 2) {
            str = c11 + str + c11;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f106313b;
            boolean g10 = C10867a.g(cArr, upperCase);
            boolean g11 = C10867a.g(cArr, upperCase2);
            char[] cArr2 = f106314c;
            boolean g12 = C10867a.g(cArr2, upperCase);
            boolean g13 = C10867a.g(cArr2, upperCase2);
            if (g10) {
                if (!g11) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!g12) {
                if (g11 || g13) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                str = c11 + str + c11;
            } else if (!g13) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i12 = 20;
        for (int i13 = 1; i13 < str.length() - 1; i13++) {
            if (Character.isDigit(str.charAt(i13)) || str.charAt(i13) == '-' || str.charAt(i13) == '$') {
                i12 += 9;
            } else {
                if (!C10867a.g(f106315d, str.charAt(i13))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i13) + '\'');
                }
                i12 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i12];
        int i14 = 0;
        for (int i15 = 0; i15 < str.length(); i15++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i15));
            if (i15 == 0 || i15 == str.length() - 1) {
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
            int i16 = 0;
            while (true) {
                char[] cArr3 = C10867a.f106307d;
                if (i16 >= cArr3.length) {
                    i11 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i16]) {
                    i11 = C10867a.f106308e[i16];
                    break;
                }
                i16++;
            }
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            while (i17 < 7) {
                zArr[i14] = z11;
                i14++;
                if (((i11 >> (6 - i17)) & 1) == 0 || i18 == 1) {
                    z11 = !z11;
                    i17++;
                    i18 = 0;
                } else {
                    i18++;
                }
            }
            if (i15 < str.length() - 1) {
                zArr[i14] = false;
                i14++;
            }
        }
        return zArr;
    }

    @Override // y9.s
    protected final Set f() {
        return Collections.singleton(EnumC6876a.CODABAR);
    }
}
