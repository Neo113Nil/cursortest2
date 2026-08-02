package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.g0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6835g0 extends zbuf implements zbvn {
    private static final C6835g0 zbb;
    private int zbd;
    private boolean zbe;
    private String zbf = "";

    static {
        C6835g0 c6835g0 = new C6835g0();
        zbb = c6835g0;
        zbuf.zbD(C6835g0.class, c6835g0);
    }

    private C6835g0() {
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
            return new C6835g0();
        }
        if (i12 == 4) {
            return new M();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
