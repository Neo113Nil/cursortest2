package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6852p extends zbuf implements zbvn {
    private static final C6852p zbb;
    private zbun zbd = zbuf.zby();

    static {
        C6852p c6852p = new C6852p();
        zbb = c6852p;
        zbuf.zbD(C6852p.class, c6852p);
    }

    private C6852p() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", C6846m.class});
        }
        if (i12 == 3) {
            return new C6852p();
        }
        if (i12 == 4) {
            return new C6842k();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
