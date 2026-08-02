package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class E0 extends zbuf implements zbvn {
    private static final E0 zbb;
    private int zbd;
    private String zbe = "";

    static {
        E0 e02 = new E0();
        zbb = e02;
        zbuf.zbD(E0.class, e02);
    }

    private E0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i12 == 3) {
            return new E0();
        }
        if (i12 == 4) {
            return new D0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
