package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbadz extends zbub implements zbvn {
    private static final zbadz zbd;
    private byte zbf = 2;
    private zbun zbe = zbuf.zby();

    static {
        zbadz zbadzVar = new zbadz();
        zbd = zbadzVar;
        zbuf.zbD(zbadz.class, zbadzVar);
    }

    private zbadz() {
    }

    public static zbadz zbe() {
        return zbd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbf);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbd, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"zbe", zbady.class});
        }
        if (i12 == 3) {
            return new zbadz();
        }
        zbadn zbadnVar = null;
        if (i12 == 4) {
            return new zbadw(zbadnVar);
        }
        if (i12 == 5) {
            return zbd;
        }
        this.zbf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
