package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class R0 extends zbuf implements zbvn {
    private static final R0 zbb;
    private int zbd;
    private String zbe = "";
    private zbun zbf = zbuf.zby();
    private boolean zbg;

    static {
        R0 r02 = new R0();
        zbb = r02;
        zbuf.zbD(R0.class, r02);
    }

    private R0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new R0();
        }
        if (i12 == 4) {
            return new Q0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
