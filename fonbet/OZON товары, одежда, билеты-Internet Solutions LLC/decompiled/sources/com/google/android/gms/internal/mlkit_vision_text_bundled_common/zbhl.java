package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbhl extends zbuf implements zbvn {
    private static final zbhl zbb;
    private int zbd;
    private zbtc zbe = zbtc.zbb;
    private String zbf = "";
    private zbho zbg;

    static {
        zbhl zbhlVar = new zbhl();
        zbb = zbhlVar;
        zbuf.zbD(zbhl.class, zbhlVar);
    }

    private zbhl() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0002ည\u0000\u0004ဉ\u0002", new Object[]{"zbd", "zbf", "zbe", "zbg"});
        }
        if (i12 == 3) {
            return new zbhl();
        }
        zbhj zbhjVar = null;
        if (i12 == 4) {
            return new zbhk(zbhjVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
