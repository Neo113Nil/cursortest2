package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbahv extends zbuf implements zbvn {
    private static final zbahv zbb;
    private int zbd = 0;
    private Object zbe;
    private float zbf;

    static {
        zbahv zbahvVar = new zbahv();
        zbb = zbahvVar;
        zbuf.zbD(zbahv.class, zbahvVar);
    }

    private zbahv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000\u0003\u0001\u0004<\u0000", new Object[]{"zbe", "zbd", "zbf", zbahx.class});
        }
        if (i12 == 3) {
            return new zbahv();
        }
        zbagx zbagxVar = null;
        if (i12 == 4) {
            return new zbahu(zbagxVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
