package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbala extends zbuf implements zbvn {
    private static final zbala zbb;
    private long zbe;
    private long zbf;
    private zbtc zbd = zbtc.zbb;
    private zbun zbg = zbuf.zby();

    static {
        zbala zbalaVar = new zbala();
        zbb = zbalaVar;
        zbuf.zbD(zbala.class, zbalaVar);
    }

    private zbala() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\n\u0002\u0002\u0003\u0002\u0004\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", zbajt.class});
        }
        if (i12 == 3) {
            return new zbala();
        }
        zbaky zbakyVar = null;
        if (i12 == 4) {
            return new zbakz(zbakyVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
