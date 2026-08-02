package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbmg extends zbuf implements zbvn {
    private static final zbmg zbb;
    private Object zbe;
    private int zbd = 0;
    private zbun zbf = zbuf.zby();

    static {
        zbmg zbmgVar = new zbmg();
        zbb = zbmgVar;
        zbuf.zbD(zbmg.class, zbmgVar);
    }

    private zbmg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001;\u0000\u00023\u0000\u0003<\u0000\u0004\u001b", new Object[]{"zbe", "zbd", zbmk.class, "zbf", zbmg.class});
        }
        if (i12 == 3) {
            return new zbmg();
        }
        zbme zbmeVar = null;
        if (i12 == 4) {
            return new zbmf(zbmeVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
