package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbdr extends zbuf implements zbvn {
    private static final zbdr zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";

    static {
        zbdr zbdrVar = new zbdr();
        zbb = zbdrVar;
        zbuf.zbD(zbdr.class, zbdrVar);
    }

    private zbdr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", zbdq.zba, "zbf"});
        }
        if (i12 == 3) {
            return new zbdr();
        }
        zbdo zbdoVar = null;
        if (i12 == 4) {
            return new zbdp(zbdoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
