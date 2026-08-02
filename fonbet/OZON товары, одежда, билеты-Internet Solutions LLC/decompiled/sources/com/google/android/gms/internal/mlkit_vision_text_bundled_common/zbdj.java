package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbdj extends zbuf implements zbvn {
    private static final zbdj zbb;
    private int zbd;
    private float zbe = 1.0f;
    private int zbf;

    static {
        zbdj zbdjVar = new zbdj();
        zbb = zbdjVar;
        zbuf.zbD(zbdj.class, zbdjVar);
    }

    private zbdj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbdj();
        }
        zbdh zbdhVar = null;
        if (i12 == 4) {
            return new zbdi(zbdhVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
