package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbzr extends zbuf implements zbvn {
    private static final zbzr zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private String zbg = "";

    static {
        zbzr zbzrVar = new zbzr();
        zbb = zbzrVar;
        zbuf.zbD(zbzr.class, zbzrVar);
    }

    private zbzr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", "zbf", zbzp.zba, "zbg"});
        }
        if (i12 == 3) {
            return new zbzr();
        }
        zbwz zbwzVar = null;
        if (i12 == 4) {
            return new zbzq(zbwzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
