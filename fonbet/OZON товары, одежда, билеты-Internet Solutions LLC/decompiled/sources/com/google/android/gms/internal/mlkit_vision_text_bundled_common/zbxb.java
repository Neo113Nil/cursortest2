package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbxb extends zbuf implements zbvn {
    private static final zbxb zbb;
    private int zbd;
    private int zbe;
    private zbzo zbf;
    private zbyw zbg;
    private zbyy zbh;

    static {
        zbxb zbxbVar = new zbxb();
        zbb = zbxbVar;
        zbuf.zbD(zbxb.class, zbxbVar);
    }

    private zbxb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zbd", "zbe", zbye.zba, "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new zbxb();
        }
        zbwz zbwzVar = null;
        if (i12 == 4) {
            return new zbxa(zbwzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
