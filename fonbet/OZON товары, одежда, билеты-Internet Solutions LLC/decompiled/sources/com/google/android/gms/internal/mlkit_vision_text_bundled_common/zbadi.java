package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbadi extends zbuf implements zbvn {
    private static final zbadi zbb;
    private int zbd;
    private int zbe;
    private int zbf;

    static {
        zbadi zbadiVar = new zbadi();
        zbb = zbadiVar;
        zbuf.zbD(zbadi.class, zbadiVar);
    }

    private zbadi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbadi();
        }
        zbadg zbadgVar = null;
        if (i12 == 4) {
            return new zbadh(zbadgVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
