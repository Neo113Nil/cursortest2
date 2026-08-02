package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbahl extends zbuf implements zbvn {
    private static final zbahl zbb;
    private String zbd = "";
    private String zbe = "";
    private float zbf;

    static {
        zbahl zbahlVar = new zbahl();
        zbb = zbahlVar;
        zbuf.zbD(zbahl.class, zbahlVar);
    }

    private zbahl() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbahl();
        }
        zbagx zbagxVar = null;
        if (i12 == 4) {
            return new zbahk(zbagxVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
