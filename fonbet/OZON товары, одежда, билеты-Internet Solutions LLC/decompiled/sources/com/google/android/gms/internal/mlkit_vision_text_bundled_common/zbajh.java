package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbajh extends zbuf implements zbvn {
    private static final zbajh zbb;
    private String zbd = "";
    private String zbe = "";
    private double zbf;

    static {
        zbajh zbajhVar = new zbajh();
        zbb = zbajhVar;
        zbuf.zbD(zbajh.class, zbajhVar);
    }

    private zbajh() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0000\u0003Ȉ", new Object[]{"zbd", "zbf", "zbe"});
        }
        if (i12 == 3) {
            return new zbajh();
        }
        zbajf zbajfVar = null;
        if (i12 == 4) {
            return new zbajg(zbajfVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
