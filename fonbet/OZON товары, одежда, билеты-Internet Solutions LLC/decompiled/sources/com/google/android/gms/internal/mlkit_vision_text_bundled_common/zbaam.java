package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaam extends zbuf implements zbvn {
    private static final zbaam zbb;
    private int zbd;
    private zbpb zbf;
    private float zbg;
    private byte zbh = 2;
    private int zbe = 2;

    static {
        zbaam zbaamVar = new zbaam();
        zbb = zbaamVar;
        zbuf.zbD(zbaam.class, zbaamVar);
    }

    private zbaam() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbh);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002ᐉ\u0001\u0007ခ\u0002", new Object[]{"zbd", "zbe", zbaak.zba, "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new zbaam();
        }
        zbaad zbaadVar = null;
        if (i12 == 4) {
            return new zbaal(zbaadVar);
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
