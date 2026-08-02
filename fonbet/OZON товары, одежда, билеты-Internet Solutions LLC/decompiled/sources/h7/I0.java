package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbafq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbdy;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbja;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class I0 extends zbuf implements zbvn {
    private static final I0 zbb;
    private int zbd;
    private int zbe;
    private zbafq zbf;
    private zbja zbg;
    private zbdy zbh;
    private i1 zbi;
    private byte zbj = 2;

    static {
        I0 i02 = new I0();
        zbb = i02;
        zbuf.zbD(I0.class, i02);
    }

    private I0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbj);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0002\u0002ဉ\u0003\u0003᠌\u0000\u0004ဉ\u0004\u0005ᐉ\u0001", new Object[]{"zbd", "zbg", "zbh", "zbe", H0.f65041a, "zbi", "zbf"});
        }
        if (i12 == 3) {
            return new I0();
        }
        if (i12 == 4) {
            return new G0();
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
