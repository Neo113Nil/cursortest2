package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbpm extends zbuf implements zbvn {
    private static final zbpm zbb;
    private int zbd;
    private zbsp zbe;

    static {
        zbpm zbpmVar = new zbpm();
        zbb = zbpmVar;
        zbuf.zbD(zbpm.class, zbpmVar);
    }

    private zbpm() {
    }

    public static zbpm zbc() {
        return zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i12 == 3) {
            return new zbpm();
        }
        zbph zbphVar = null;
        if (i12 == 4) {
            return new zbpl(zbphVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
