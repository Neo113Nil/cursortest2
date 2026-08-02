package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class r extends zbuf implements zbvn {
    private static final r zbb;
    private int zbd;
    private int zbe;

    static {
        r rVar = new r();
        zbb = rVar;
        zbuf.zbD(r.class, rVar);
    }

    private r() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i12 == 3) {
            return new r();
        }
        if (i12 == 4) {
            return new C6854q();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
