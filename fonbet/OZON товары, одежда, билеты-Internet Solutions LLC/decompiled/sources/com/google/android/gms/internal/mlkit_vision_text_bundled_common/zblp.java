package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zblp extends zbub implements zbvn {
    private static final zblp zbd;
    private int zbe;
    private boolean zbf;
    private byte zbg = 2;

    static {
        zblp zblpVar = new zblp();
        zbd = zblpVar;
        zbuf.zbD(zblp.class, zblpVar);
    }

    private zblp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zblp();
        }
        zbln zblnVar = null;
        if (i12 == 4) {
            return new zblo(zblnVar);
        }
        if (i12 == 5) {
            return zbd;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
