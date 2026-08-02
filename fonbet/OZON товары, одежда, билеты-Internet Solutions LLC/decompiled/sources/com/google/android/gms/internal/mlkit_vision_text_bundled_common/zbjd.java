package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbjd extends zbuf implements zbvn {
    private static final zbjd zbb;
    private int zbd;
    private zbjj zbe;
    private int zbf;

    static {
        zbjd zbjdVar = new zbjd();
        zbb = zbjdVar;
        zbuf.zbD(zbjd.class, zbjdVar);
    }

    private zbjd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbjd();
        }
        zbjb zbjbVar = null;
        if (i12 == 4) {
            return new zbjc(zbjbVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
