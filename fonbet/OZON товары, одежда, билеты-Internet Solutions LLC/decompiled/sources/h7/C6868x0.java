package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.x0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6868x0 extends zbuf implements zbvn {
    private static final C6868x0 zbb;
    private int zbd;
    private Y zbe;
    private C6852p zbf;
    private C6832f zbg;
    private S0 zbh;
    private boolean zbi;
    private r zbj;
    private C6823a0 zbk;
    private P zbl;

    static {
        C6868x0 c6868x0 = new C6868x0();
        zbb = c6868x0;
        zbuf.zbD(C6868x0.class, c6868x0);
    }

    private C6868x0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဉ\u0005\u0004ဉ\u0000\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဇ\u0004\bဉ\u0006\tဉ\u0007", new Object[]{"zbd", "zbf", "zbj", "zbe", "zbg", "zbh", "zbi", "zbk", "zbl"});
        }
        if (i12 == 3) {
            return new C6868x0();
        }
        if (i12 == 4) {
            return new C6866w0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
