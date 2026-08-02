package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaen extends zbuf implements zbvn {
    private static final zbaen zbb;
    private int zbd;
    private zbaeh zbe;
    private zbun zbf = zbuf.zby();
    private float zbg;

    static {
        zbaen zbaenVar = new zbaen();
        zbb = zbaenVar;
        zbuf.zbD(zbaen.class, zbaenVar);
    }

    private zbaen() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001", new Object[]{"zbd", "zbe", "zbf", zbaem.class, "zbg"});
        }
        if (i12 == 3) {
            return new zbaen();
        }
        zbaef zbaefVar = null;
        if (i12 == 4) {
            return new zbaei(zbaefVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
