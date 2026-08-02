package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class F0 extends zbuf implements zbvn {
    private static final F0 zbb;
    private int zbd;
    private E0 zbe;

    static {
        F0 f02 = new F0();
        zbb = f02;
        zbuf.zbD(F0.class, f02);
    }

    private F0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i12 == 3) {
            return new F0();
        }
        if (i12 == 4) {
            return new C0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
