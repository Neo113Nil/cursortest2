package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbsp extends zbuf implements zbvn {
    private static final zbsp zbb;
    private String zbd = "";
    private zbtc zbe = zbtc.zbb;

    static {
        zbsp zbspVar = new zbsp();
        zbb = zbspVar;
        zbuf.zbD(zbsp.class, zbspVar);
    }

    private zbsp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zbvw(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"zbd", "zbe"});
        }
        if (i12 == 3) {
            return new zbsp();
        }
        zbsn zbsnVar = null;
        if (i12 == 4) {
            return new zbso(zbsnVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
