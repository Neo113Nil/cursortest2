package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbgo;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbjg;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.l0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6845l0 extends zbuf implements zbvn {
    private static final C6845l0 zbb;
    private int zbd;
    private zbgo zbe;
    private zbun zbf = zbuf.zby();
    private zbun zbg = zbuf.zby();

    static {
        C6845l0 c6845l0 = new C6845l0();
        zbb = c6845l0;
        zbuf.zbD(C6845l0.class, c6845l0);
    }

    private C6845l0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", zbjg.class, "zbg", zbcw.class});
        }
        if (i12 == 3) {
            return new C6845l0();
        }
        if (i12 == 4) {
            return new C6843k0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
