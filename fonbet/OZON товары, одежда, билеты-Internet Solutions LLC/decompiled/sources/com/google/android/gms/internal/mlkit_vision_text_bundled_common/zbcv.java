package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbcv extends zbuf implements zbvn {
    private static final zbcv zbb;
    private int zbd;
    private zbtc zbe = zbtc.zbb;
    private float zbf;
    private zbgw zbg;
    private long zbh;

    static {
        zbcv zbcvVar = new zbcv();
        zbb = zbcvVar;
        zbuf.zbD(zbcv.class, zbcvVar);
    }

    private zbcv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဂ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new zbcv();
        }
        zbcs zbcsVar = null;
        if (i12 == 4) {
            return new zbcu(zbcsVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
