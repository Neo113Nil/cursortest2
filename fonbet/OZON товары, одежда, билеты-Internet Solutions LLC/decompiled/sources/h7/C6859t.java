package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbadm;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6859t extends zbuf implements zbvn {
    private static final C6859t zbb;
    private Object zbe;
    private int zbd = 0;
    private byte zbg = 2;
    private zbun zbf = zbuf.zby();

    static {
        C6859t c6859t = new C6859t();
        zbb = c6859t;
        zbuf.zbD(C6859t.class, c6859t);
    }

    private C6859t() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0001\u0001:\u0000\u0003Л", new Object[]{"zbe", "zbd", "zbf", zbadm.class});
        }
        if (i12 == 3) {
            return new C6859t();
        }
        if (i12 == 4) {
            return new C6857s();
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
