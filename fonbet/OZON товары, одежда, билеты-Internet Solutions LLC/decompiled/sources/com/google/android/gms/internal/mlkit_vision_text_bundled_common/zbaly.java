package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaly extends zbuf implements zbvn {
    private static final zbaly zbb;
    private int zbd;
    private boolean zbe;
    private boolean zbf;

    static {
        zbaly zbalyVar = new zbaly();
        zbb = zbalyVar;
        zbuf.zbD(zbaly.class, zbalyVar);
    }

    private zbaly() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbaly();
        }
        zbalw zbalwVar = null;
        if (i12 == 4) {
            return new zbalx(zbalwVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
