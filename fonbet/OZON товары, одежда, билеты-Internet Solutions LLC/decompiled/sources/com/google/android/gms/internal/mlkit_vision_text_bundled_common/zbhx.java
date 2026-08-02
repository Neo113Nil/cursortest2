package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbhx extends zbuf implements zbvn {
    private static final zbhx zbb;
    private zbuk zbd = zbuf.zbv();

    static {
        zbhx zbhxVar = new zbhx();
        zbb = zbhxVar;
        zbuf.zbD(zbhx.class, zbhxVar);
    }

    private zbhx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zbd"});
        }
        if (i12 == 3) {
            return new zbhx();
        }
        zbhs zbhsVar = null;
        if (i12 == 4) {
            return new zbhw(zbhsVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
