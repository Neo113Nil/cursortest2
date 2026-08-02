package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbmn extends zbuf implements zbvn {
    private static final zbmn zbb;
    private int zbd;
    private zbmp zbh;
    private byte zbi = 2;
    private String zbe = "";
    private String zbf = "";
    private String zbg = "";

    static {
        zbmn zbmnVar = new zbmn();
        zbb = zbmnVar;
        zbuf.zbD(zbmn.class, zbmnVar);
    }

    private zbmn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001Ϫ\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0003Ϫဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbg"});
        }
        if (i12 == 3) {
            return new zbmn();
        }
        zbml zbmlVar = null;
        if (i12 == 4) {
            return new zbmm(zbmlVar);
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
