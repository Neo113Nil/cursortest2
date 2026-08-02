package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class Y0 extends zbuf implements zbvn {
    private static final Y0 zbb;
    private int zbd;
    private K0 zbe;

    static {
        Y0 y02 = new Y0();
        zbb = y02;
        zbuf.zbD(Y0.class, y02);
    }

    private Y0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i12 == 3) {
            return new Y0();
        }
        if (i12 == 4) {
            return new X0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
