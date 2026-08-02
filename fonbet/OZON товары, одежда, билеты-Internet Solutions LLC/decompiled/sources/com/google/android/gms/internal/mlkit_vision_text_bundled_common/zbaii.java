package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import androidx.recyclerview.widget.m;

/* loaded from: classes9.dex */
public final class zbaii extends zbuf implements zbvn {
    private static final zbaii zbb;
    private int zbd;
    private boolean zbg;
    private boolean zbo;
    private float zbe = 0.05f;
    private float zbf = 0.5f;
    private int zbh = 10;
    private int zbi = m.e.DEFAULT_DRAG_ANIMATION_DURATION;
    private float zbj = 0.8f;
    private int zbk = 4;
    private int zbl = 10;
    private float zbm = 0.2f;
    private float zbn = 0.1f;

    static {
        zbaii zbaiiVar = new zbaii();
        zbb = zbaiiVar;
        zbuf.zbD(zbaii.class, zbaiiVar);
    }

    private zbaii() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0006\u0006င\u0007\u0007ခ\b\bခ\t\tဇ\n\nခ\u0005\u000bဇ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbi", "zbk", "zbl", "zbm", "zbn", "zbo", "zbj", "zbg"});
        }
        if (i12 == 3) {
            return new zbaii();
        }
        zbaig zbaigVar = null;
        if (i12 == 4) {
            return new zbaih(zbaigVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
