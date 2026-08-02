package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbxv extends zbuf implements zbvn {
    private static final zbxv zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private zbun zbg = zbuf.zby();
    private int zbh;

    static {
        zbxv zbxvVar = new zbxv();
        zbb = zbxvVar;
        zbuf.zbD(zbxv.class, zbxvVar);
    }

    private zbxv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zbd", "zbe", zbxu.zba, "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new zbxv();
        }
        zbwz zbwzVar = null;
        if (i12 == 4) {
            return new zbxt(zbwzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
