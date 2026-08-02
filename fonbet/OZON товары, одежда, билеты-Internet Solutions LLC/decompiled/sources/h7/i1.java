package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaiv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class i1 extends zbuf implements zbvn {
    private static final i1 zbb;
    private int zbd;
    private zbaiv zbe;
    private String zbf = "";
    private boolean zbg;
    private F0 zbh;

    static {
        i1 i1Var = new i1();
        zbb = i1Var;
        zbuf.zbD(i1.class, i1Var);
    }

    private i1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new i1();
        }
        if (i12 == 4) {
            return new h1();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
