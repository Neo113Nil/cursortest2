package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbfc extends zbuf implements zbvn {
    private static final zbfc zbb;
    private int zbd;
    private float zbe = 0.3f;

    static {
        zbfc zbfcVar = new zbfc();
        zbb = zbfcVar;
        zbuf.zbD(zbfc.class, zbfcVar);
    }

    private zbfc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i12 == 3) {
            return new zbfc();
        }
        zbfa zbfaVar = null;
        if (i12 == 4) {
            return new zbfb(zbfaVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
