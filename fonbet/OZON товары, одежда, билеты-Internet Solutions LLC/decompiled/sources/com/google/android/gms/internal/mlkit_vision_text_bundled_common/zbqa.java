package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbqa extends zbuf implements zbvn {
    private static final zbqa zbb;
    private int zbd;
    private float zbe;
    private int zbf;
    private byte zbg = 2;

    static {
        zbqa zbqaVar = new zbqa();
        zbb = zbqaVar;
        zbuf.zbD(zbqa.class, zbqaVar);
    }

    private zbqa() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbg);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔁ\u0000\u0002င\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbqa();
        }
        zbpu zbpuVar = null;
        if (i12 == 4) {
            return new zbpz(zbpuVar);
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
