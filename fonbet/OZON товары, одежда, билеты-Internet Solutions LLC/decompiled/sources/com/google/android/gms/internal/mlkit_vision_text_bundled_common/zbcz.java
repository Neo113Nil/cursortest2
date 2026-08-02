package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbcz extends zbuf implements zbvn {
    private static final zbcz zbb;
    private int zbd;
    private zbalp zbe;
    private zbhl zbf;
    private float zbi;
    private zbxb zbm;
    private String zbg = "en";
    private int zbh = -1;
    private zbun zbj = zbuf.zby();
    private zbun zbk = zbuf.zby();
    private int zbl = -1;

    static {
        zbcz zbczVar = new zbcz();
        zbb = zbczVar;
        zbuf.zbD(zbcz.class, zbczVar);
    }

    private zbcz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဉ\u0001\u0002ဈ\u0002\u0003င\u0003\u0004ခ\u0004\u0005\u001a\u0006\u001a\u0007င\u0005\bဉ\u0006\tဉ\u0000", new Object[]{"zbd", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbe"});
        }
        if (i12 == 3) {
            return new zbcz();
        }
        zbcx zbcxVar = null;
        if (i12 == 4) {
            return new zbcy(zbcxVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
