package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbis extends zbuf implements zbvn {
    private static final zbis zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private int zbf;

    static {
        zbis zbisVar = new zbis();
        zbb = zbisVar;
        zbuf.zbD(zbis.class, zbisVar);
    }

    private zbis() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zbd", "zbe", zbgz.class, "zbf"});
        }
        if (i12 == 3) {
            return new zbis();
        }
        zbiq zbiqVar = null;
        if (i12 == 4) {
            return new zbir(zbiqVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
