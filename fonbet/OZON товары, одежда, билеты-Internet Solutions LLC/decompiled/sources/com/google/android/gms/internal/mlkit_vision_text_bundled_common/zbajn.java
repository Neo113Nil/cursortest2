package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbajn extends zbuf implements zbvn {
    private static final zbajn zbb;
    private String zbd = "";
    private zbun zbe = zbuf.zby();
    private String zbf = "";

    static {
        zbajn zbajnVar = new zbajn();
        zbb = zbajnVar;
        zbuf.zbD(zbajn.class, zbajnVar);
    }

    private zbajn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"zbd", "zbe", zbajk.class, "zbf"});
        }
        if (i12 == 3) {
            return new zbajn();
        }
        zbajl zbajlVar = null;
        if (i12 == 4) {
            return new zbajm(zbajlVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
