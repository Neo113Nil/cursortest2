package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbalg extends zbuf implements zbvn {
    private static final zbalg zbb;
    private int zbd;
    private zbakx zbe;
    private double zbf;
    private double zbg;

    static {
        zbalg zbalgVar = new zbalg();
        zbb = zbalgVar;
        zbuf.zbD(zbalg.class, zbalgVar);
    }

    private zbalg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000\u0003\u0000", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new zbalg();
        }
        zbale zbaleVar = null;
        if (i12 == 4) {
            return new zbalf(zbaleVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
