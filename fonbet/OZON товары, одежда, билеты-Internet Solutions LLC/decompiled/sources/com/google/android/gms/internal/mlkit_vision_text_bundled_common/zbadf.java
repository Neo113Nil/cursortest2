package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbadf extends zbuf implements zbvn {
    private static final zbadf zbb;
    private byte zbe = 2;
    private zbun zbd = zbuf.zby();

    static {
        zbadf zbadfVar = new zbadf();
        zbb = zbadfVar;
        zbuf.zbD(zbadf.class, zbadfVar);
    }

    private zbadf() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbe);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", zbadb.class});
        }
        if (i12 == 3) {
            return new zbadf();
        }
        zbadd zbaddVar = null;
        if (i12 == 4) {
            return new zbade(zbaddVar);
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbe = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
