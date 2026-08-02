package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zblm;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class C extends zbuf implements zbvn {
    private static final C zbb;
    private int zbd;
    private zblm zbe;
    private zbnw zbf;
    private boolean zbg;
    private byte zbi = 2;
    private String zbh = "";

    static {
        C c11 = new C();
        zbb = c11;
        zbuf.zbD(C.class, c11);
    }

    private C() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new C();
        }
        if (i12 == 4) {
            return new B();
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
