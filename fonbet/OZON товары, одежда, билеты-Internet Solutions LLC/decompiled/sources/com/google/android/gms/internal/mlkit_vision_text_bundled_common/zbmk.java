package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbmk extends zbuf implements zbvn {
    private static final zbmk zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbmk zbmkVar = new zbmk();
        zbb = zbmkVar;
        zbuf.zbD(zbmk.class, zbmkVar);
    }

    private zbmk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbmj.class});
        }
        if (i12 == 3) {
            return new zbmk();
        }
        zbme zbmeVar = null;
        if (i12 == 4) {
            return new zbmh(zbmeVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
