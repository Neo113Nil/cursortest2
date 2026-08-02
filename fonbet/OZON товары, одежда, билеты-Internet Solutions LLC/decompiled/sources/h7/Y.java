package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class Y extends zbuf implements zbvn {
    private static final Y zbb;
    private zbun zbd = zbuf.zby();

    static {
        Y y11 = new Y();
        zbb = y11;
        zbuf.zbD(Y.class, y11);
    }

    private Y() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", X.class});
        }
        if (i12 == 3) {
            return new Y();
        }
        if (i12 == 4) {
            return new Q();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
