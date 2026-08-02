package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaia extends zbuf implements zbvn {
    private static final zbaia zbb;
    private zbun zbd = zbuf.zby();
    private zbun zbe = zbuf.zby();
    private zbun zbf = zbuf.zby();
    private zbun zbg = zbuf.zby();

    static {
        zbaia zbaiaVar = new zbaia();
        zbb = zbaiaVar;
        zbuf.zbD(zbaia.class, zbaiaVar);
    }

    private zbaia() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zbd", zbahm.class, "zbe", zbahb.class, "zbf", zbaif.class, "zbg", zbahy.class});
        }
        if (i12 == 3) {
            return new zbaia();
        }
        zbagx zbagxVar = null;
        if (i12 == 4) {
            return new zbahz(zbagxVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
