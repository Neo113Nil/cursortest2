package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class W0 extends zbuf implements zbvn {
    private static final W0 zbb;
    private int zbd;
    private int zbe;
    private C6841j0 zbf;

    static {
        W0 w02 = new W0();
        zbb = w02;
        zbuf.zbD(W0.class, w02);
    }

    private W0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zbd", "zbe", Z0.f65042a, "zbf"});
        }
        if (i12 == 3) {
            return new W0();
        }
        if (i12 == 4) {
            return new T0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
