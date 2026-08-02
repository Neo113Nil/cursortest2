package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbqe extends zbuf implements zbvn {
    private static final zbqe zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbqe zbqeVar = new zbqe();
        zbb = zbqeVar;
        zbuf.zbD(zbqe.class, zbqeVar);
    }

    private zbqe() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbqd.class});
        }
        if (i12 == 3) {
            return new zbqe();
        }
        zbpu zbpuVar = null;
        if (i12 == 4) {
            return new zbqb(zbpuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
