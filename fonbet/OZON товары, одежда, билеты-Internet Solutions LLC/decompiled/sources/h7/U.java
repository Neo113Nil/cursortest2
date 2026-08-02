package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* loaded from: classes9.dex */
public final class U extends zbuf implements zbvn {
    private static final U zbb;
    private int zbd;
    private long zbe;
    private long zbf;

    static {
        U u11 = new U();
        zbb = u11;
        zbuf.zbD(U.class, u11);
    }

    private U() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new U();
        }
        if (i12 == 4) {
            return new T();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
