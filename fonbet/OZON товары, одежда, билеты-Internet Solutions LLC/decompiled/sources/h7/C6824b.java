package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6824b extends zbuf implements zbvn {
    private static final C6824b zbb;
    private int zbd;
    private int zbf;
    private zbun zbe = zbuf.zby();
    private zbun zbg = zbuf.zby();

    static {
        C6824b c6824b = new C6824b();
        zbb = c6824b;
        zbuf.zbD(C6824b.class, c6824b);
    }

    private C6824b() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002င\u0000\u0003\u001a", new Object[]{"zbd", "zbe", zbix.class, "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new C6824b();
        }
        if (i12 == 4) {
            return new j1();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
