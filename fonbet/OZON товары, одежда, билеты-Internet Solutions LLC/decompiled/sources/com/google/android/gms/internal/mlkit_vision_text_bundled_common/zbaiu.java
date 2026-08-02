package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaiu extends zbuf implements zbvn {
    private static final zbaiu zbb;
    private int zbd;
    private String zbe = "";
    private zbtc zbf = zbtc.zbb;

    static {
        zbaiu zbaiuVar = new zbaiu();
        zbb = zbaiuVar;
        zbuf.zbD(zbaiu.class, zbaiuVar);
    }

    private zbaiu() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbaiu();
        }
        zbair zbairVar = null;
        if (i12 == 4) {
            return new zbait(zbairVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
