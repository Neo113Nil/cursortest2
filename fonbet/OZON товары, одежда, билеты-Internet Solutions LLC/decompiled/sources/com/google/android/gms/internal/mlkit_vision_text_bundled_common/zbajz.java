package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbajz extends zbuf implements zbvn {
    private static final zbajz zbb;
    private zbuk zbd = zbuf.zbv();

    static {
        zbajz zbajzVar = new zbajz();
        zbb = zbajzVar;
        zbuf.zbD(zbajz.class, zbajzVar);
    }

    private zbajz() {
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
            return new zbajz();
        }
        zbajx zbajxVar = null;
        if (i12 == 4) {
            return new zbajy(zbajxVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
