package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbfo extends zbuf implements zbvn {
    private static final zbfo zbb;
    private int zbd;
    private boolean zbe;
    private float zbf = 0.8f;
    private int zbg;
    private int zbh;

    static {
        zbfo zbfoVar = new zbfo();
        zbb = zbfoVar;
        zbuf.zbD(zbfo.class, zbfoVar);
    }

    private zbfo() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new zbfo();
        }
        zbfm zbfmVar = null;
        if (i12 == 4) {
            return new zbfn(zbfmVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
