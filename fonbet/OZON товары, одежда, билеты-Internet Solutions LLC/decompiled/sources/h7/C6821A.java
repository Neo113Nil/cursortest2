package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbee;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbeh;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbek;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.A, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6821A extends zbuf implements zbvn {
    private static final C6821A zbb;
    private int zbd;
    private zbee zbe;
    private zbek zbf;
    private zbeh zbg;

    static {
        C6821A c6821a = new C6821A();
        zbb = c6821a;
        zbuf.zbD(C6821A.class, c6821a);
    }

    private C6821A() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new C6821A();
        }
        if (i12 == 4) {
            return new C6871z();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
