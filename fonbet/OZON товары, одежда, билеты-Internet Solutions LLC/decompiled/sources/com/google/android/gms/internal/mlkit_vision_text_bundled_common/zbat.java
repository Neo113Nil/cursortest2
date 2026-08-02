package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbat extends zbuf implements zbvn {
    private static final zbat zbb;
    private int zbd;
    private float zbe;
    private boolean zbf;

    static {
        zbat zbatVar = new zbat();
        zbb = zbatVar;
        zbuf.zbD(zbat.class, zbatVar);
    }

    private zbat() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbat();
        }
        zbar zbarVar = null;
        if (i12 == 4) {
            return new zbas(zbarVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
