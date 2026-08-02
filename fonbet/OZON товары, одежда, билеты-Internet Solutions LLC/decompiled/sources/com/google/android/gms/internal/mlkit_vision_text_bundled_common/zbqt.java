package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbqt extends zbuf implements zbvn {
    private static final zbqt zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private zbul zbg = zbuf.zbw();

    static {
        zbqt zbqtVar = new zbqt();
        zbb = zbqtVar;
        zbuf.zbD(zbqt.class, zbqtVar);
    }

    private zbqt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0001\u0002င\u0000\u0003ࠞ", new Object[]{"zbd", "zbf", "zbe", "zbg", zbqu.zba});
        }
        if (i12 == 3) {
            return new zbqt();
        }
        zbpu zbpuVar = null;
        if (i12 == 4) {
            return new zbqs(zbpuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
