package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaje extends zbuf implements zbvn {
    private static final zbaje zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbaje zbajeVar = new zbaje();
        zbb = zbajeVar;
        zbuf.zbD(zbaje.class, zbajeVar);
    }

    private zbaje() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbajb.class});
        }
        if (i12 == 3) {
            return new zbaje();
        }
        zbajc zbajcVar = null;
        if (i12 == 4) {
            return new zbajd(zbajcVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
