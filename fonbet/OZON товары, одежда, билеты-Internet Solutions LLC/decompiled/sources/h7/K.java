package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class K extends zbuf implements zbvn {
    private static final K zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private long zbf;

    static {
        K k11 = new K();
        zbb = k11;
        zbuf.zbD(K.class, k11);
    }

    private K() {
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
            return new K();
        }
        if (i12 == 4) {
            return new J();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
