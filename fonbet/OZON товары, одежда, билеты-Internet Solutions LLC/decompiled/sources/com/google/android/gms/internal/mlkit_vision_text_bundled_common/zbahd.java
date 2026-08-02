package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbahd extends zbuf implements zbvn {
    private static final zbahd zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbahd zbahdVar = new zbahd();
        zbb = zbahdVar;
        zbuf.zbD(zbahd.class, zbahdVar);
    }

    private zbahd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbaid.class});
        }
        if (i12 == 3) {
            return new zbahd();
        }
        zbagx zbagxVar = null;
        if (i12 == 4) {
            return new zbahc(zbagxVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
