package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class S0 extends zbuf implements zbvn {
    private static final S0 zbb;
    private zbun zbd = zbuf.zby();

    static {
        S0 s02 = new S0();
        zbb = s02;
        zbuf.zbD(S0.class, s02);
    }

    private S0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", R0.class});
        }
        if (i12 == 3) {
            return new S0();
        }
        if (i12 == 4) {
            return new P0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
