package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class P extends zbuf implements zbvn {
    private static final P zbb;
    private int zbd;
    private boolean zbe;
    private String zbf = "";

    static {
        P p11 = new P();
        zbb = p11;
        zbuf.zbD(P.class, p11);
    }

    private P() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new P();
        }
        if (i12 == 4) {
            return new O();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
