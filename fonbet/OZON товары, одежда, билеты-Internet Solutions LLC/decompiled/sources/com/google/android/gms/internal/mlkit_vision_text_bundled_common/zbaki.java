package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaki extends zbuf implements zbvn {
    private static final zbaki zbb;
    private int zbd;
    private zbakx zbe;
    private double zbf;

    static {
        zbaki zbakiVar = new zbaki();
        zbb = zbakiVar;
        zbuf.zbD(zbaki.class, zbakiVar);
    }

    private zbaki() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbaki();
        }
        zbakg zbakgVar = null;
        if (i12 == 4) {
            return new zbakh(zbakgVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
