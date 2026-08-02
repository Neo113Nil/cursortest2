package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbcp extends zbuf implements zbvn {
    private static final zbcp zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";
    private int zbg = 1;

    static {
        zbcp zbcpVar = new zbcp();
        zbb = zbcpVar;
        zbuf.zbD(zbcp.class, zbcpVar);
    }

    private zbcp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg", zbco.zba});
        }
        if (i12 == 3) {
            return new zbcp();
        }
        zbcm zbcmVar = null;
        if (i12 == 4) {
            return new zbcn(zbcmVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
