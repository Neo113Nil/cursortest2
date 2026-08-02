package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbjj extends zbuf implements zbvn {
    private static final zbjj zbb;
    private int zbd;
    private zbuk zbe = zbuf.zbv();
    private zbtc zbf = zbtc.zbb;

    static {
        zbjj zbjjVar = new zbjj();
        zbb = zbjjVar;
        zbuf.zbD(zbjj.class, zbjjVar);
    }

    private zbjj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001$\u0002ည\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbjj();
        }
        zbjh zbjhVar = null;
        if (i12 == 4) {
            return new zbji(zbjhVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
