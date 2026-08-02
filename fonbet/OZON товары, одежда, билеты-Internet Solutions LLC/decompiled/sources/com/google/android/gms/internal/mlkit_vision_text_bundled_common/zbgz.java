package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbgz extends zbuf implements zbvn {
    private static final zbgz zbb;
    private int zbd;
    private int zbe;
    private float zbf;
    private String zbg = "";
    private String zbh = "";

    static {
        zbgz zbgzVar = new zbgz();
        zbb = zbgzVar;
        zbuf.zbD(zbgz.class, zbgzVar);
    }

    private zbgz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new zbgz();
        }
        zbgx zbgxVar = null;
        if (i12 == 4) {
            return new zbgy(zbgxVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
