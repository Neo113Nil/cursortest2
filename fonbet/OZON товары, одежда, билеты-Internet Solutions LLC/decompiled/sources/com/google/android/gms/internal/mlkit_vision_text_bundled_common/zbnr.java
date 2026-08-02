package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbnr extends zbuf implements zbvn {
    private static final zbnr zbb;
    private int zbd;
    private float zbe;
    private float zbf;

    static {
        zbnr zbnrVar = new zbnr();
        zbb = zbnrVar;
        zbuf.zbD(zbnr.class, zbnrVar);
    }

    private zbnr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbnr();
        }
        zbno zbnoVar = null;
        if (i12 == 4) {
            return new zbnq(zbnoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
