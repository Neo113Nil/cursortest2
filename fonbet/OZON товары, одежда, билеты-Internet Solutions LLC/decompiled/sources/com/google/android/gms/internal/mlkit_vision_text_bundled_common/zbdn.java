package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbdn extends zbuf implements zbvn {
    private static final zbdn zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";

    static {
        zbdn zbdnVar = new zbdn();
        zbb = zbdnVar;
        zbuf.zbD(zbdn.class, zbdnVar);
    }

    private zbdn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", zbdm.zba, "zbf"});
        }
        if (i12 == 3) {
            return new zbdn();
        }
        zbdk zbdkVar = null;
        if (i12 == 4) {
            return new zbdl(zbdkVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
