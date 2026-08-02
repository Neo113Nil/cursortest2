package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbek extends zbuf implements zbvn {
    private static final zbek zbb;
    private int zbd;
    private long zbe;
    private float zbf;

    static {
        zbek zbekVar = new zbek();
        zbb = zbekVar;
        zbuf.zbD(zbek.class, zbekVar);
    }

    private zbek() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbek();
        }
        zbei zbeiVar = null;
        if (i12 == 4) {
            return new zbej(zbeiVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
