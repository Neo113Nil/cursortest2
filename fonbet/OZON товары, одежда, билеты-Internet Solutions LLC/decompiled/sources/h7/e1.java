package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaiv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class e1 extends zbuf implements zbvn {
    private static final e1 zbb;
    private int zbd;
    private zbaiv zbe;
    private String zbf = "";
    private int zbg;
    private boolean zbh;
    private int zbi;

    static {
        e1 e1Var = new e1();
        zbb = e1Var;
        zbuf.zbD(e1.class, e1Var);
    }

    private e1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", d1.f65045a});
        }
        if (i12 == 3) {
            return new e1();
        }
        if (i12 == 4) {
            return new c1();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
