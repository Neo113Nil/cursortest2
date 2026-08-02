package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class V0 extends zbuf implements zbvn {
    private static final V0 zbb;
    private int zbd;
    private int zbe = 1;
    private boolean zbf;

    static {
        V0 v02 = new V0();
        zbb = v02;
        zbuf.zbD(V0.class, v02);
    }

    private V0() {
    }

    public static U0 a() {
        return (U0) zbb.zbq();
    }

    static /* synthetic */ void c(V0 v02) {
        v02.zbe = 1;
        v02.zbd = 1 | v02.zbd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"zbd", "zbe", Z0.f65042a, "zbf"});
        }
        if (i12 == 3) {
            return new V0();
        }
        if (i12 == 4) {
            return new U0(0);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
