package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbgr extends zbuf implements zbvn {
    private static final zbgr zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;

    static {
        zbgr zbgrVar = new zbgr();
        zbb = zbgrVar;
        zbuf.zbD(zbgr.class, zbgrVar);
    }

    private zbgr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new zbgr();
        }
        zbgp zbgpVar = null;
        if (i12 == 4) {
            return new zbgq(zbgpVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
