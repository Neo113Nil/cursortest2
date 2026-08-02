package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6828d extends zbuf<C6828d, C6826c> implements zbvn {
    private static final C6828d zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private String zbf = "";

    static {
        C6828d c6828d = new C6828d();
        zbb = c6828d;
        zbuf.zbD(C6828d.class, c6828d);
    }

    private C6828d() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zbd", "zbe", C6836h.class, "zbf"});
        }
        if (i12 == 3) {
            return new C6828d();
        }
        if (i12 == 4) {
            return new C6826c();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
