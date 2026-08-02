package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6863v extends zbuf implements zbvn {
    private static final C6863v zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private long zbf;

    static {
        C6863v c6863v = new C6863v();
        zbb = c6863v;
        zbuf.zbD(C6863v.class, c6863v);
    }

    private C6863v() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new C6863v();
        }
        if (i12 == 4) {
            return new C6861u();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
