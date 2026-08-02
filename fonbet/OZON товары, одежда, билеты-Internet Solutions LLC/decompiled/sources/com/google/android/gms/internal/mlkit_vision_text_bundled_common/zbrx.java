package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbrx extends zbuf implements zbvn {
    private static final zbrx zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private zbuk zbg = zbuf.zbv();
    private int zbh;
    private int zbi;
    private float zbj;

    static {
        zbrx zbrxVar = new zbrx();
        zbb = zbrxVar;
        zbuf.zbD(zbrx.class, zbrxVar);
    }

    private zbrx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0013\u0004င\u0002\u0005င\u0003\u0006ခ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        if (i12 == 3) {
            return new zbrx();
        }
        zbrt zbrtVar = null;
        if (i12 == 4) {
            return new zbrw(zbrtVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
