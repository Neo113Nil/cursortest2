package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbakc extends zbuf implements zbvn {
    private static final zbakc zbb;

    static {
        zbakc zbakcVar = new zbakc();
        zbb = zbakcVar;
        zbuf.zbD(zbakc.class, zbakcVar);
    }

    private zbakc() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        zbaka zbakaVar = null;
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0000", null);
        }
        if (i12 == 3) {
            return new zbakc();
        }
        if (i12 == 4) {
            return new zbakb(zbakaVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
