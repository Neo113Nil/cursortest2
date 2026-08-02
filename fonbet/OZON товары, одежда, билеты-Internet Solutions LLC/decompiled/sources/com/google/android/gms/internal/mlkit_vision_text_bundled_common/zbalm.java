package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbalm extends zbuf implements zbvn {
    private static final zbalm zbb;

    static {
        zbalm zbalmVar = new zbalm();
        zbb = zbalmVar;
        zbuf.zbD(zbalm.class, zbalmVar);
    }

    private zbalm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        zbalk zbalkVar = null;
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0000", null);
        }
        if (i12 == 3) {
            return new zbalm();
        }
        if (i12 == 4) {
            return new zball(zbalkVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
