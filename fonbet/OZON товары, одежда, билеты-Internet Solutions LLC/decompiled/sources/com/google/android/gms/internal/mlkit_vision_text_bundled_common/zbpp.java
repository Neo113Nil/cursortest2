package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbpp extends zbuf implements zbvn {
    private static final zbpp zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private String zbh = "";

    static {
        zbpp zbppVar = new zbpp();
        zbb = zbppVar;
        zbuf.zbD(zbpp.class, zbppVar);
    }

    private zbpp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဏ\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", zbpt.zba, "zbf", zbps.zba, "zbg", "zbh"});
        }
        if (i12 == 3) {
            return new zbpp();
        }
        zbpn zbpnVar = null;
        if (i12 == 4) {
            return new zbpo(zbpnVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
