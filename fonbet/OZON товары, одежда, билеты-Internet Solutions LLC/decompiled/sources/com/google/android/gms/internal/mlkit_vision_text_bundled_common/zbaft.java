package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaft extends zbuf implements zbvn {
    private static final zbaft zbb;
    private int zbd;
    private zbafw zbe;
    private zbaey zbf;
    private zbaff zbg;

    static {
        zbaft zbaftVar = new zbaft();
        zbb = zbaftVar;
        zbuf.zbD(zbaft.class, zbaftVar);
    }

    private zbaft() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new zbaft();
        }
        zbafr zbafrVar = null;
        if (i12 == 4) {
            return new zbafs(zbafrVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
