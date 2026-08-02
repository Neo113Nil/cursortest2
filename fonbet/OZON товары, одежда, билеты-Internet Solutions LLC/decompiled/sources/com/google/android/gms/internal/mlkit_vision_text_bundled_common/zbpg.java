package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbpg extends zbuf implements zbvn {
    private static final zbpg zbb;
    private int zbd;
    private zbpk zbe;
    private double zbf;
    private double zbg;

    static {
        zbpg zbpgVar = new zbpg();
        zbb = zbpgVar;
        zbuf.zbD(zbpg.class, zbpgVar);
    }

    private zbpg() {
    }

    public static zbpf zba() {
        return (zbpf) zbb.zbq();
    }

    static /* synthetic */ void zbd(zbpg zbpgVar, zbpk zbpkVar) {
        zbpkVar.getClass();
        zbpgVar.zbe = zbpkVar;
        zbpgVar.zbd |= 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000\u0003\u0000", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        if (i12 == 3) {
            return new zbpg();
        }
        zbpe zbpeVar = null;
        if (i12 == 4) {
            return new zbpf(zbpeVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
