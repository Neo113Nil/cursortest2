package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbac extends zbuf implements zbvn {
    private static final zbac zbb;
    private int zbd;
    private int zbf;
    private float zbh;
    private boolean zbi;
    private boolean zbj;
    private String zbe = "";
    private String zbg = "";

    static {
        zbac zbacVar = new zbac();
        zbb = zbacVar;
        zbuf.zbD(zbac.class, zbacVar);
    }

    private zbac() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i12 == 3) {
            return new zbac();
        }
        zbaa zbaaVar = null;
        if (i12 == 4) {
            return new zbab(zbaaVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
