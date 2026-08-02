package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbail;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class b1 extends zbuf implements zbvn {
    private static final b1 zbb;
    private int zbd;
    private int zbe = 0;
    private Object zbf;
    private zbix zbg;

    static {
        b1 b1Var = new b1();
        zbb = b1Var;
        zbuf.zbD(b1.class, b1Var);
    }

    private b1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zbf", "zbe", "zbd", "zbg", zbbq.class, zbail.class});
        }
        if (i12 == 3) {
            return new b1();
        }
        if (i12 == 4) {
            return new a1();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
