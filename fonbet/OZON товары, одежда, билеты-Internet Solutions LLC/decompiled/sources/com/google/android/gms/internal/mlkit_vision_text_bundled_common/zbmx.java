package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbmx extends zbuf implements zbvn {
    private static final zbmx zbb;
    private int zbd;
    private zbmd zbh;
    private byte zbi = 2;
    private String zbe = "";
    private zbun zbf = zbuf.zby();
    private zbun zbg = zbuf.zby();

    static {
        zbmx zbmxVar = new zbmx();
        zbb = zbmxVar;
        zbuf.zbD(zbmx.class, zbmxVar);
    }

    private zbmx() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbi);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001Ϫ\u0004\u0000\u0002\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0001Ϫ\u001a", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbg"});
        }
        if (i12 == 3) {
            return new zbmx();
        }
        zbmv zbmvVar = null;
        if (i12 == 4) {
            return new zbmw(zbmvVar);
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
