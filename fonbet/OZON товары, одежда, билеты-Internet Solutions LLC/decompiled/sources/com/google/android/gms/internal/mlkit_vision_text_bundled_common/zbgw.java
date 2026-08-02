package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbgw extends zbuf implements zbvn {
    private static final zbgw zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbgw zbgwVar = new zbgw();
        zbb = zbgwVar;
        zbuf.zbD(zbgw.class, zbgwVar);
    }

    private zbgw() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbgv.class});
        }
        if (i12 == 3) {
            return new zbgw();
        }
        zbgs zbgsVar = null;
        if (i12 == 4) {
            return new zbgt(zbgsVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
