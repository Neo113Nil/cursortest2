package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbadp extends zbuf implements zbvn {
    private static final zbadp zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private String zbf = "";
    private float zbg;

    static {
        zbadp zbadpVar = new zbadp();
        zbb = zbadpVar;
        zbuf.zbD(zbadp.class, zbadpVar);
    }

    private zbadp() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ခ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new zbadp();
        }
        zbadn zbadnVar = null;
        if (i12 == 4) {
            return new zbado(zbadnVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
