package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaem extends zbuf implements zbvn {
    private static final zbaem zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private int zbh;
    private int zbi;
    private float zbj;

    static {
        zbaem zbaemVar = new zbaem();
        zbb = zbaemVar;
        zbuf.zbD(zbaem.class, zbaemVar);
    }

    private zbaem() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ခ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", zbaek.zba, "zbi", zbael.zba, "zbj"});
        }
        if (i12 == 3) {
            return new zbaem();
        }
        zbaef zbaefVar = null;
        if (i12 == 4) {
            return new zbaej(zbaefVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
