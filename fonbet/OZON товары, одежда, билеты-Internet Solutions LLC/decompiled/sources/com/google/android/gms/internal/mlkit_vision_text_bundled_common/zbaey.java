package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaey extends zbuf implements zbvn {
    private static final zbaey zbb;
    private zbuk zbd = zbuf.zbv();
    private zbuk zbe = zbuf.zbv();
    private zbuk zbf = zbuf.zbv();
    private zbuk zbg = zbuf.zbv();
    private zbuk zbh = zbuf.zbv();
    private zbuk zbi = zbuf.zbv();

    static {
        zbaey zbaeyVar = new zbaey();
        zbb = zbaeyVar;
        zbuf.zbD(zbaey.class, zbaeyVar);
    }

    private zbaey() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001\u0013\u0002\u0013\u0003\u0013\u0004\u0013\u0005\u0013\u0006\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        if (i12 == 3) {
            return new zbaey();
        }
        zbaeu zbaeuVar = null;
        if (i12 == 4) {
            return new zbaex(zbaeuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
