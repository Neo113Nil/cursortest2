package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.v0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6864v0 extends zbuf implements zbvn {
    private static final C6864v0 zbb;
    private zbun zbd = zbuf.zby();

    static {
        C6864v0 c6864v0 = new C6864v0();
        zbb = c6864v0;
        zbuf.zbD(C6864v0.class, c6864v0);
    }

    private C6864v0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", C6862u0.class});
        }
        if (i12 == 3) {
            return new C6864v0();
        }
        if (i12 == 4) {
            return new C6858s0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
