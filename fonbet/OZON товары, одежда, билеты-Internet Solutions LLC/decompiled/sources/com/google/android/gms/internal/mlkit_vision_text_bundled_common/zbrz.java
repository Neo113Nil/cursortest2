package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbrz extends zbuf implements zbvn {
    private static final zbrz zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private zbun zbf = zbuf.zby();
    private int zbg;

    static {
        zbrz zbrzVar = new zbrz();
        zbb = zbrzVar;
        zbuf.zbD(zbrz.class, zbrzVar);
    }

    private zbrz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003င\u0000", new Object[]{"zbd", "zbe", zbsb.class, "zbf", zbrv.class, "zbg"});
        }
        if (i12 == 3) {
            return new zbrz();
        }
        zbrt zbrtVar = null;
        if (i12 == 4) {
            return new zbry(zbrtVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
