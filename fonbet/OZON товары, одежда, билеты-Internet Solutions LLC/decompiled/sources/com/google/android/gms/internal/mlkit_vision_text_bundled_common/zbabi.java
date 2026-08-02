package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbabi extends zbuf implements zbvn {
    private static final zbabi zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg = 1;
    private int zbh = 1;

    static {
        zbabi zbabiVar = new zbabi();
        zbb = zbabiVar;
        zbuf.zbD(zbabi.class, zbabiVar);
    }

    private zbabi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new zbabi();
        }
        zbaad zbaadVar = null;
        if (i12 == 4) {
            return new zbabh(zbaadVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
