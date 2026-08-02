package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbzg extends zbuf implements zbvn {
    private static final zbzg zbb;
    private int zbd;
    private int zbg;
    private String zbe = "";
    private String zbf = "";
    private String zbh = "";

    static {
        zbzg zbzgVar = new zbzg();
        zbb = zbzgVar;
        zbuf.zbD(zbzg.class, zbzgVar);
    }

    private zbzg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new zbzg();
        }
        zbwz zbwzVar = null;
        if (i12 == 4) {
            return new zbzf(zbwzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
