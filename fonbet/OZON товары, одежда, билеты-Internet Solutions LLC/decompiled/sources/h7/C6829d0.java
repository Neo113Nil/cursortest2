package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.d0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6829d0 extends zbuf implements zbvn {
    private static final C6829d0 zbb;
    private int zbd;
    private int zbe;
    private int zbf = 2;
    private String zbg = "";

    static {
        C6829d0 c6829d0 = new C6829d0();
        zbb = c6829d0;
        zbuf.zbD(C6829d0.class, c6829d0);
    }

    private C6829d0() {
    }

    public static C6825b0 a() {
        return (C6825b0) zbb.zbq();
    }

    static /* synthetic */ void c(C6829d0 c6829d0, int i11) {
        c6829d0.zbe = i11 - 1;
        c6829d0.zbd |= 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", C6827c0.f65044a, "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new C6829d0();
        }
        if (i12 == 4) {
            return new C6825b0(0);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
