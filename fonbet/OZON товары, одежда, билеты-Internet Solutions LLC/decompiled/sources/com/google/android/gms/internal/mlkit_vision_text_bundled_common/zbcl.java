package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbcl extends zbuf implements zbvn {
    private static final zbcl zbb;
    private int zbd;
    private zbbz zbe;
    private zbuk zbf = zbuf.zbv();

    static {
        zbcl zbclVar = new zbcl();
        zbb = zbclVar;
        zbuf.zbD(zbcl.class, zbclVar);
    }

    private zbcl() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0013", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbcl();
        }
        zbcj zbcjVar = null;
        if (i12 == 4) {
            return new zbck(zbcjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
