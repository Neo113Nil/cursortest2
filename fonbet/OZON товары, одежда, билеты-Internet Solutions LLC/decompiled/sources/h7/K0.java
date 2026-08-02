package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class K0 extends zbuf implements zbvn {
    private static final K0 zbb;
    private int zbd = 0;
    private Object zbe;

    static {
        K0 k02 = new K0();
        zbb = k02;
        zbuf.zbD(K0.class, k02);
    }

    private K0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zbe", "zbd", C6863v.class, K.class});
        }
        if (i12 == 3) {
            return new K0();
        }
        if (i12 == 4) {
            return new J0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
