package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbyg extends zbuf implements zbvn {
    private static final zbyg zbb;
    private int zbd;
    private boolean zbe;
    private boolean zbf;

    static {
        zbyg zbygVar = new zbyg();
        zbb = zbygVar;
        zbuf.zbD(zbyg.class, zbygVar);
    }

    private zbyg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbyg();
        }
        zbwz zbwzVar = null;
        if (i12 == 4) {
            return new zbyf(zbwzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
