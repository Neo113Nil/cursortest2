package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6832f extends zbuf implements zbvn {
    private static final C6832f zbb;
    private int zbd;
    private long zbe;
    private float zbf = 0.5f;

    static {
        C6832f c6832f = new C6832f();
        zbb = c6832f;
        zbuf.zbD(C6832f.class, c6832f);
    }

    private C6832f() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new C6832f();
        }
        if (i12 == 4) {
            return new C6830e();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
