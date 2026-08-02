package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbady extends zbuf implements zbvn {
    private static final zbady zbb;
    private int zbd;
    private Object zbf;
    private int zbe = 0;
    private String zbg = "";

    static {
        zbady zbadyVar = new zbady();
        zbb = zbadyVar;
        zbuf.zbD(zbady.class, zbadyVar);
    }

    private zbady() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"zbf", "zbe", "zbd", "zbg", zbadp.class, zbadr.class, zbaee.class, zbadv.class});
        }
        if (i12 == 3) {
            return new zbady();
        }
        zbadn zbadnVar = null;
        if (i12 == 4) {
            return new zbadx(zbadnVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
