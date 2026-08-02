package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbaew extends zbuf implements zbvn {
    private static final zbaew zbb;
    private int zbd;
    private float zbe = 0.01f;

    static {
        zbaew zbaewVar = new zbaew();
        zbb = zbaewVar;
        zbuf.zbD(zbaew.class, zbaewVar);
    }

    private zbaew() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zbd", "zbe"});
        }
        if (i12 == 3) {
            return new zbaew();
        }
        zbaeu zbaeuVar = null;
        if (i12 == 4) {
            return new zbaev(zbaeuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
