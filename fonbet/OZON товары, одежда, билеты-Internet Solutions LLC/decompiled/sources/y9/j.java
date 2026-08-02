package y9;

import h9.EnumC6876a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes9.dex */
public final class j extends z {
    @Override // y9.s
    public final boolean[] d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + y.q(str);
            } catch (h9.h e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
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
        int i11 = i.f106327j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b11 = s.b(zArr, 0, y.f106355d, true);
        for (int i12 = 1; i12 <= 6; i12++) {
            int digit = Character.digit(str.charAt(i12), 10);
            if (((i11 >> (6 - i12)) & 1) == 1) {
                digit += 10;
            }
            b11 += s.b(zArr, b11, y.f106359h[digit], false);
        }
        int b12 = b11 + s.b(zArr, b11, y.f106356e, false);
        for (int i13 = 7; i13 <= 12; i13++) {
            b12 += s.b(zArr, b12, y.f106358g[Character.digit(str.charAt(i13), 10)], true);
        }
        s.b(zArr, b12, y.f106355d, true);
        return zArr;
    }

    @Override // y9.s
    protected final Set f() {
        return Collections.singleton(EnumC6876a.EAN_13);
    }
}
