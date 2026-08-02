package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbjm extends zbub implements zbvn {
    private static final zbjm zbd;
    private int zbe;
    private long zbf;
    private zbgo zbg;
    private zbgw zbh;
    private byte zbj = 2;
    private zbun zbi = zbuf.zby();

    static {
        zbjm zbjmVar = new zbjm();
        zbd = zbjmVar;
        zbuf.zbD(zbjm.class, zbjmVar);
    }

    private zbjm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbj);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"zbe", "zbf", "zbg", "zbi", zbgz.class, "zbh"});
        }
        if (i12 == 3) {
            return new zbjm();
        }
        zbjk zbjkVar = null;
        if (i12 == 4) {
            return new zbjl(zbjkVar);
        }
        if (i12 == 5) {
            return zbd;
        }
        this.zbj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
