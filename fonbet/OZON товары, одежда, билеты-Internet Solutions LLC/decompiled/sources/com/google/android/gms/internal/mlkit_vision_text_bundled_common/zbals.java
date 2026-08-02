package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbals extends zbuf implements zbvn {
    private static final zbals zbb;
    private int zbd;
    private zbalp zbe;
    private zbalv zbf;
    private zbaly zbg;

    static {
        zbals zbalsVar = new zbals();
        zbb = zbalsVar;
        zbuf.zbD(zbals.class, zbalsVar);
    }

    private zbals() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new zbals();
        }
        zbalq zbalqVar = null;
        if (i12 == 4) {
            return new zbalr(zbalqVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
