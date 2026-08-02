package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbho extends zbuf implements zbvn {
    private static final zbho zbb;
    private int zbd;
    private int zbe;
    private long zbf;
    private long zbg;

    static {
        zbho zbhoVar = new zbho();
        zbb = zbhoVar;
        zbuf.zbD(zbho.class, zbhoVar);
    }

    private zbho() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new zbho();
        }
        zbhm zbhmVar = null;
        if (i12 == 4) {
            return new zbhn(zbhmVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
