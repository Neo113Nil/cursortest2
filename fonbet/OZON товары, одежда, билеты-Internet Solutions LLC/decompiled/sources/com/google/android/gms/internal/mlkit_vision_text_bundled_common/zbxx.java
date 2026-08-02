package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbxx extends zbuf implements zbvn {
    private static final zbxx zbb;
    private int zbd;
    private int zbe;
    private long zbf;

    static {
        zbxx zbxxVar = new zbxx();
        zbb = zbxxVar;
        zbuf.zbD(zbxx.class, zbxxVar);
    }

    private zbxx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zbd", "zbe", zbxy.zba, "zbf"});
        }
        if (i12 == 3) {
            return new zbxx();
        }
        zbwz zbwzVar = null;
        if (i12 == 4) {
            return new zbxw(zbwzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
