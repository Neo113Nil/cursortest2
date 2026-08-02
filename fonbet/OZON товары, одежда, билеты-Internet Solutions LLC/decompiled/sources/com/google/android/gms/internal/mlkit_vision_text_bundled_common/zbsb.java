package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbsb extends zbuf implements zbvn {
    private static final zbsb zbb;
    private zbun zbd = zbuf.zby();
    private zbun zbe = zbuf.zby();

    static {
        zbsb zbsbVar = new zbsb();
        zbb = zbsbVar;
        zbuf.zbD(zbsb.class, zbsbVar);
    }

    private zbsb() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0000\u0001\u000f\u0002\u0000\u0002\u0000\u0001\u001b\u000f\u001a", new Object[]{"zbd", zbrx.class, "zbe"});
        }
        if (i12 == 3) {
            return new zbsb();
        }
        zbrt zbrtVar = null;
        if (i12 == 4) {
            return new zbsa(zbrtVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
