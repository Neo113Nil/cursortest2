package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbrv extends zbuf implements zbvn {
    private static final zbrv zbb;
    private int zbd;
    private String zbe = "";
    private double zbf = 1.0d;
    private zbun zbg = zbuf.zby();

    static {
        zbrv zbrvVar = new zbrv();
        zbb = zbrvVar;
        zbuf.zbD(zbrv.class, zbrvVar);
    }

    private zbrv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002က\u0001\u000f\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new zbrv();
        }
        zbrt zbrtVar = null;
        if (i12 == 4) {
            return new zbru(zbrtVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
