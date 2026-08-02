package y9;

import h9.EnumC6876a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes9.dex */
public final class l extends z {
    @Override // y9.s
    public final boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.q(str);
            } catch (h9.h e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!y.h(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (h9.h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        s.c(str);
        boolean[] zArr = new boolean[67];
        int b11 = s.b(zArr, 0, y.f106355d, true);
        for (int i11 = 0; i11 <= 3; i11++) {
            b11 += s.b(zArr, b11, y.f106358g[Character.digit(str.charAt(i11), 10)], false);
        }
        int b12 = b11 + s.b(zArr, b11, y.f106356e, false);
        for (int i12 = 4; i12 <= 7; i12++) {
            b12 += s.b(zArr, b12, y.f106358g[Character.digit(str.charAt(i12), 10)], true);
        }
        s.b(zArr, b12, y.f106355d, true);
        return zArr;
    }

    @Override // y9.s
    protected final Set f() {
        return Collections.singleton(EnumC6876a.EAN_8);
    }
}
