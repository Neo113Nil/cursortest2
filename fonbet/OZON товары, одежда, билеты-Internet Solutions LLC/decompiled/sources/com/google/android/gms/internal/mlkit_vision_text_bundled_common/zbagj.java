package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbagj extends zbuf implements zbvn {
    private static final zbagj zbb;
    private int zbd;
    private int zbe;
    private int zbg;
    private boolean zbh;
    private byte zbi = 2;
    private zbun zbf = zbuf.zby();

    static {
        zbagj zbagjVar = new zbagj();
        zbb = zbagjVar;
        zbuf.zbD(zbagj.class, zbagjVar);
    }

    private zbagj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0001\u0002\u0003ᔄ\u0000\u0004Л\u0005င\u0001\u0006ဇ\u0002", new Object[]{"zbd", "zbe", "zbf", zbagn.class, "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new zbagj();
        }
        zbagg zbaggVar = null;
        if (i12 == 4) {
            return new zbagi(zbaggVar);
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
