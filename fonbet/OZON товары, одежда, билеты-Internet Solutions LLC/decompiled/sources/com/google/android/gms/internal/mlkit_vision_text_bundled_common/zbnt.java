package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbnt extends zbuf implements zbvn {
    private static final zbnt zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private int zbf;
    private int zbg;

    static {
        zbnt zbntVar = new zbnt();
        zbb = zbntVar;
        zbuf.zbD(zbnt.class, zbntVar);
    }

    private zbnt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000\u0003᠌\u0001", new Object[]{"zbd", "zbe", zbnr.class, "zbf", zbns.zba, "zbg", zbnn.zba});
        }
        if (i12 == 3) {
            return new zbnt();
        }
        zbno zbnoVar = null;
        if (i12 == 4) {
            return new zbnp(zbnoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
