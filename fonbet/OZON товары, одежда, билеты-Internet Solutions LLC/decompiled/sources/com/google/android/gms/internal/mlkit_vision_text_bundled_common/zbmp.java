package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbmp extends zbub implements zbvn {
    private static final zbmp zbd;
    private byte zbe = 2;

    static {
        zbmp zbmpVar = new zbmp();
        zbd = zbmpVar;
        zbuf.zbD(zbmp.class, zbmpVar);
    }

    private zbmp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbe);
        }
        zbml zbmlVar = null;
        if (i12 == 2) {
            return zbuf.zbA(zbd, "\u0001\u0000", null);
        }
        if (i12 == 3) {
            return new zbmp();
        }
        if (i12 == 4) {
            return new zbmo(zbmlVar);
        }
        if (i12 == 5) {
            return zbd;
        }
        this.zbe = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
