package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbjp extends zbuf implements zbvn {
    private static final zbjp zbb;
    private byte zbe = 2;
    private zbun zbd = zbuf.zby();

    static {
        zbjp zbjpVar = new zbjp();
        zbb = zbjpVar;
        zbuf.zbD(zbjp.class, zbjpVar);
    }

    private zbjp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbe);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", zbjm.class});
        }
        if (i12 == 3) {
            return new zbjp();
        }
        zbjn zbjnVar = null;
        if (i12 == 4) {
            return new zbjo(zbjnVar);
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbe = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
