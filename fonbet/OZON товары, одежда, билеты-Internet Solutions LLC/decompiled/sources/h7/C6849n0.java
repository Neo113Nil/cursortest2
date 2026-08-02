package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.n0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6849n0 extends zbuf implements zbvn {
    private static final C6849n0 zbb;
    private int zbd;
    private boolean zbe;

    static {
        C6849n0 c6849n0 = new C6849n0();
        zbb = c6849n0;
        zbuf.zbD(C6849n0.class, c6849n0);
    }

    private C6849n0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i12 == 3) {
            return new C6849n0();
        }
        if (i12 == 4) {
            return new C6847m0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
