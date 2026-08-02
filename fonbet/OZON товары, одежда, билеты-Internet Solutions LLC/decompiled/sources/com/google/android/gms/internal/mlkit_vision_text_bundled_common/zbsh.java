package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbsh extends zbuf implements zbvn {
    private static final zbsh zbb;
    private int zbd;
    private float zbf;
    private String zbe = "";
    private int zbg = 1;

    static {
        zbsh zbshVar = new zbsh();
        zbb = zbshVar;
        zbuf.zbD(zbsh.class, zbshVar);
    }

    private zbsh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003င\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new zbsh();
        }
        zbsf zbsfVar = null;
        if (i12 == 4) {
            return new zbsg(zbsfVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
