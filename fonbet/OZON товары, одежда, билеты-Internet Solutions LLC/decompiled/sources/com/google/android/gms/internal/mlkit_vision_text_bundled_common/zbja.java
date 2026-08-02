package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbja extends zbuf implements zbvn {
    private static final zbja zbb;
    private int zbd;
    private zbhl zbg;
    private zbhl zbh;
    private boolean zbi;
    private boolean zbj;
    private boolean zbk;
    private zbxb zbm;
    private String zbe = "";
    private String zbf = "";
    private int zbl = 1;

    static {
        zbja zbjaVar = new zbja();
        zbb = zbjaVar;
        zbuf.zbD(zbja.class, zbjaVar);
    }

    private zbja() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0005\u0003ဇ\u0006\u0004ဉ\u0002\u0006ဇ\u0004\u0007င\u0007\bဉ\b\tဉ\u0003\nဈ\u0001", new Object[]{"zbd", "zbe", "zbj", "zbk", "zbg", "zbi", "zbl", "zbm", "zbh", "zbf"});
        }
        if (i12 == 3) {
            return new zbja();
        }
        zbiy zbiyVar = null;
        if (i12 == 4) {
            return new zbiz(zbiyVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
