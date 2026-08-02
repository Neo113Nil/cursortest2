package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbxl extends zbuf implements zbvn {
    private static final zbxl zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";

    static {
        zbxl zbxlVar = new zbxl();
        zbb = zbxlVar;
        zbuf.zbD(zbxl.class, zbxlVar);
    }

    private zbxl() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbxl();
        }
        zbwz zbwzVar = null;
        if (i12 == 4) {
            return new zbxk(zbwzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
