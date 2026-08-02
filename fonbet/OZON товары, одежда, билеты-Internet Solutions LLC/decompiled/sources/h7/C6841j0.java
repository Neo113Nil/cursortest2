package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.j0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6841j0 extends zbuf implements zbvn {
    private static final C6841j0 zbb;
    private int zbd;
    private int zbe = 1;
    private int zbf = 5;

    static {
        C6841j0 c6841j0 = new C6841j0();
        zbb = c6841j0;
        zbuf.zbD(C6841j0.class, c6841j0);
    }

    private C6841j0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", C6839i0.f65046a, "zbf"});
        }
        if (i12 == 3) {
            return new C6841j0();
        }
        if (i12 == 4) {
            return new C6837h0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
