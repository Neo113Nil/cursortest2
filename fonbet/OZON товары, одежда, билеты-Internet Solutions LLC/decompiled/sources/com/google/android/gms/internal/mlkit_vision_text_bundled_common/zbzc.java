package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbzc extends zbuf implements zbvn {
    private static final zbzc zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";

    static {
        zbzc zbzcVar = new zbzc();
        zbb = zbzcVar;
        zbuf.zbD(zbzc.class, zbzcVar);
    }

    private zbzc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i12 == 3) {
            return new zbzc();
        }
        zbwz zbwzVar = null;
        if (i12 == 4) {
            return new zbzb(zbwzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
