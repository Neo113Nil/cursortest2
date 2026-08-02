package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zban extends zbuf implements zbvn {
    private static final zban zbb;
    private int zbd;
    private int zbe;
    private float zbf = 1.0f;

    static {
        zban zbanVar = new zban();
        zbb = zbanVar;
        zbuf.zbD(zban.class, zbanVar);
    }

    private zban() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", zbam.zba, "zbf"});
        }
        if (i12 == 3) {
            return new zban();
        }
        zbak zbakVar = null;
        if (i12 == 4) {
            return new zbal(zbakVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
