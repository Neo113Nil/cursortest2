package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbna extends zbuf implements zbvn {
    private static final zbna zbb;
    private int zbd;
    private zbmd zbf;
    private byte zbg = 2;
    private String zbe = "DefaultInputStreamHandler";

    static {
        zbna zbnaVar = new zbna();
        zbb = zbnaVar;
        zbuf.zbD(zbna.class, zbnaVar);
    }

    private zbna() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbna();
        }
        zbmy zbmyVar = null;
        if (i12 == 4) {
            return new zbmz(zbmyVar);
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
