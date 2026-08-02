package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbqd extends zbuf implements zbvn {
    private static final zbqd zbb;
    private int zbd;
    private double zbe;
    private double zbf;

    static {
        zbqd zbqdVar = new zbqd();
        zbb = zbqdVar;
        zbuf.zbD(zbqd.class, zbqdVar);
    }

    private zbqd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbqd();
        }
        zbpu zbpuVar = null;
        if (i12 == 4) {
            return new zbqc(zbpuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
