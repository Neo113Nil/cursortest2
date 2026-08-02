package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class I extends zbuf implements zbvn {
    private static final I zbb;
    private int zbd;
    private int zbe = -1;
    private float zbf = 0.3f;
    private int zbg = 5;
    private float zbh = 0.5f;
    private int zbi = 1;
    private boolean zbj = true;
    private float zbk = 0.85f;
    private boolean zbl = true;
    private float zbm;

    static {
        I i11 = new I();
        zbb = i11;
        zbuf.zbD(I.class, i11);
    }

    private I() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\t\u0000\u0001\u0001\u0011\t\u0000\u0000\u0000\u0001င\u0000\u0005ခ\u0001\u0006င\u0002\u0007ခ\u0003\f᠌\u0004\u000eဇ\u0005\u000fခ\u0006\u0010ဇ\u0007\u0011ခ\b", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", H.f65040a, "zbj", "zbk", "zbl", "zbm"});
        }
        if (i12 == 3) {
            return new I();
        }
        if (i12 == 4) {
            return new G();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
