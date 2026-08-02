package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbahx extends zbuf implements zbvn {
    private static final zbahx zbb;
    private zbuk zbd = zbuf.zbv();

    static {
        zbahx zbahxVar = new zbahx();
        zbb = zbahxVar;
        zbuf.zbD(zbahx.class, zbahxVar);
    }

    private zbahx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"zbd"});
        }
        if (i12 == 3) {
            return new zbahx();
        }
        zbagx zbagxVar = null;
        if (i12 == 4) {
            return new zbahw(zbagxVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
