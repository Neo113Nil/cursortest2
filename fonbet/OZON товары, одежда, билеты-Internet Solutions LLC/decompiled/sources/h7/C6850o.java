package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6850o extends zbuf implements zbvn {
    private static final C6850o zbb;
    private int zbd;
    private float zbe;
    private long zbf;
    private long zbg;
    private long zbh;

    static {
        C6850o c6850o = new C6850o();
        zbb = c6850o;
        zbuf.zbD(C6850o.class, c6850o);
    }

    private C6850o() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new C6850o();
        }
        if (i12 == 4) {
            return new C6848n();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
