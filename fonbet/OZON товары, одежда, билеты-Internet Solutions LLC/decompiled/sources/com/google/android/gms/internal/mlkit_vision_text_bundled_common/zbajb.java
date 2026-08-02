package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbajb extends zbuf implements zbvn {
    private static final zbajb zbb;
    private String zbd = "";
    private zbun zbe = zbuf.zby();

    static {
        zbajb zbajbVar = new zbajb();
        zbb = zbajbVar;
        zbuf.zbD(zbajb.class, zbajbVar);
    }

    private zbajb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zbd", "zbe", zbajh.class});
        }
        if (i12 == 3) {
            return new zbajb();
        }
        zbaiz zbaizVar = null;
        if (i12 == 4) {
            return new zbaja(zbaizVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
