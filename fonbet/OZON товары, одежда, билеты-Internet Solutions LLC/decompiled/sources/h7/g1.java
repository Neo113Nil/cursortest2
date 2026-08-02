package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaiv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class g1 extends zbuf implements zbvn {
    private static final g1 zbb;
    private int zbd;
    private zbaiv zbe;
    private int zbg;
    private String zbf = "";
    private int zbh = 93;

    static {
        g1 g1Var = new g1();
        zbb = g1Var;
        zbuf.zbD(g1.class, g1Var);
    }

    private g1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new g1();
        }
        if (i12 == 4) {
            return new f1();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
