package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbafq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.z0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6872z0 extends zbuf implements zbvn {
    private static final C6872z0 zbb;
    private int zbd;
    private zbbk zbe;
    private zbix zbf;
    private zbafq zbg;
    private zbix zbh;
    private byte zbi = 2;

    static {
        C6872z0 c6872z0 = new C6872z0();
        zbb = c6872z0;
        zbuf.zbD(C6872z0.class, c6872z0);
    }

    private C6872z0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new C6872z0();
        }
        if (i12 == 4) {
            return new C6870y0();
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
