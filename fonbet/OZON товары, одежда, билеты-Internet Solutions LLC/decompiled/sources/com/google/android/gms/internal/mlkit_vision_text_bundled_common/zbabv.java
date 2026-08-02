package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbabv extends zbuf implements zbvn {
    private static final zbabv zbb;
    private zbun zbd = zbuf.zby();
    private zbun zbe = zbuf.zby();

    static {
        zbabv zbabvVar = new zbabv();
        zbb = zbabvVar;
        zbuf.zbD(zbabv.class, zbabvVar);
    }

    private zbabv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zbd", zbabs.class, "zbe", zbadi.class});
        }
        if (i12 == 3) {
            return new zbabv();
        }
        zbabt zbabtVar = null;
        if (i12 == 4) {
            return new zbabu(zbabtVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
