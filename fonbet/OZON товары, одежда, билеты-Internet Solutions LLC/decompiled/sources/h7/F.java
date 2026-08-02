package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbdg;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class F extends zbuf implements zbvn {
    private static final F zbb;
    private int zbd;
    private int zbe;
    private zbdg zbf;
    private g1 zbg;

    static {
        F f7 = new F();
        zbb = f7;
        zbuf.zbD(F.class, f7);
    }

    private F() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zbd", "zbe", E.f65039a, "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new F();
        }
        if (i12 == 4) {
            return new D();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
