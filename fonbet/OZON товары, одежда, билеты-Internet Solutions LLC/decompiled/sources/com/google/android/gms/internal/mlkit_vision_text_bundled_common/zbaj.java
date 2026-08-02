package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaj extends zbuf implements zbvn {
    private static final zbaj zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";
    private String zbg = "";
    private int zbh;

    static {
        zbaj zbajVar = new zbaj();
        zbb = zbajVar;
        zbuf.zbD(zbaj.class, zbajVar);
    }

    private zbaj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", zbai.zba});
        }
        if (i12 == 3) {
            return new zbaj();
        }
        zbag zbagVar = null;
        if (i12 == 4) {
            return new zbah(zbagVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
