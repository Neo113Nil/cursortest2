package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbhv extends zbuf implements zbvn {
    private static final zbhv zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private String zbh = "";
    private String zbi = "";

    static {
        zbhv zbhvVar = new zbhv();
        zbb = zbhvVar;
        zbuf.zbD(zbhv.class, zbhvVar);
    }

    private zbhv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i12 == 3) {
            return new zbhv();
        }
        zbhs zbhsVar = null;
        if (i12 == 4) {
            return new zbhu(zbhsVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
