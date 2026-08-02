package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaif extends zbuf implements zbvn {
    private static final zbaif zbb;
    private int zbd = 0;
    private Object zbe;
    private float zbf;

    static {
        zbaif zbaifVar = new zbaif();
        zbb = zbaifVar;
        zbuf.zbD(zbaif.class, zbaifVar);
    }

    private zbaif() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00017\u0000\u0002\u0001\u0003<\u0000", new Object[]{"zbe", "zbd", "zbf", zbaid.class});
        }
        if (i12 == 3) {
            return new zbaif();
        }
        zbaib zbaibVar = null;
        if (i12 == 4) {
            return new zbaie(zbaibVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
