package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbxj extends zbuf implements zbvn {
    private static final zbxj zbb;
    private int zbd;
    private int zbe = -1;

    static {
        zbxj zbxjVar = new zbxj();
        zbb = zbxjVar;
        zbuf.zbD(zbxj.class, zbxjVar);
    }

    private zbxj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i12 == 3) {
            return new zbxj();
        }
        zbwz zbwzVar = null;
        if (i12 == 4) {
            return new zbxi(zbwzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
