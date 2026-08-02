package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbxf extends zbuf implements zbvn {
    private static final zbxf zbb;
    private int zbd;
    private zbyw zbe;
    private zbun zbf = zbuf.zby();
    private zbun zbg = zbuf.zby();

    static {
        zbxf zbxfVar = new zbxf();
        zbb = zbxfVar;
        zbuf.zbD(zbxf.class, zbxfVar);
    }

    private zbxf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", zbzm.class, "zbg", zbxb.class});
        }
        if (i12 == 3) {
            return new zbxf();
        }
        zbwz zbwzVar = null;
        if (i12 == 4) {
            return new zbxe(zbwzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
