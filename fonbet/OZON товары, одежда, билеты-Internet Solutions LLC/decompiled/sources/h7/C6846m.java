package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6846m extends zbuf implements zbvn {
    private static final C6846m zbb;
    private int zbd;
    private String zbe = "";
    private zbun zbf = zbuf.zby();
    private zbun zbg = zbuf.zby();
    private long zbh;

    static {
        C6846m c6846m = new C6846m();
        zbb = c6846m;
        zbuf.zbD(C6846m.class, c6846m);
    }

    private C6846m() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001b\u0004ဂ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg", C6850o.class, "zbh"});
        }
        if (i12 == 3) {
            return new C6846m();
        }
        if (i12 == 4) {
            return new C6844l();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
