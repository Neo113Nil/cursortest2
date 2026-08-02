package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbahb extends zbuf implements zbvn {
    private static final zbahb zbb;
    private Object zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private int zbd = 0;
    private zbun zbi = zbuf.zby();

    static {
        zbahb zbahbVar = new zbahb();
        zbb = zbahbVar;
        zbuf.zbD(zbahb.class, zbahbVar);
    }

    private zbahb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002<\u0000\u0003\u0004\u0004\u001b\u00057\u0000\u0006\u0004", new Object[]{"zbe", "zbd", "zbf", zbaha.class, "zbg", "zbi", zbsp.class, "zbh"});
        }
        if (i12 == 3) {
            return new zbahb();
        }
        zbagx zbagxVar = null;
        if (i12 == 4) {
            return new zbagy(zbagxVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
