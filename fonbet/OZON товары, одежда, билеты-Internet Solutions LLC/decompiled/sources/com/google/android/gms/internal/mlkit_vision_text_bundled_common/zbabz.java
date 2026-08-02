package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbabz extends zbuf implements zbvn {
    private static final zbabz zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private float zbg;
    private float zbh;

    static {
        zbabz zbabzVar = new zbabz();
        zbb = zbabzVar;
        zbuf.zbD(zbabz.class, zbabzVar);
    }

    private zbabz() {
    }

    public static zbabz zbe() {
        return zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zbd", "zbe", zbaby.zba, "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new zbabz();
        }
        zbabw zbabwVar = null;
        if (i12 == 4) {
            return new zbabx(zbabwVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
