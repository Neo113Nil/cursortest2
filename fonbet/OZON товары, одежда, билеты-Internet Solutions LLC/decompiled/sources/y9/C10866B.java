package y9;

import h9.EnumC6876a;
import java.util.Collections;
import java.util.Set;

/* renamed from: y9.B, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10866B extends z {
    @Override // y9.s
    public final boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.q(C10865A.r(str));
            } catch (h9.h e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!y.h(C10865A.r(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (h9.h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        s.c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i11 = C10865A.f106305k[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int b11 = s.b(zArr, 0, y.f106355d, true);
        for (int i12 = 1; i12 <= 6; i12++) {
            int digit2 = Character.digit(str.charAt(i12), 10);
            if (((i11 >> (6 - i12)) & 1) == 1) {
                digit2 += 10;
            }
            b11 += s.b(zArr, b11, y.f106359h[digit2], false);
        }
        s.b(zArr, b11, y.f106357f, false);
        return zArr;
    }

    @Override // y9.s
    protected final Set f() {
        return Collections.singleton(EnumC6876a.UPC_E);
    }
}
