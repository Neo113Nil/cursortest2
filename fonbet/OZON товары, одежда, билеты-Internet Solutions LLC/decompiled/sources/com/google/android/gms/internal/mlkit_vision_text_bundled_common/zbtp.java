package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zbtp {
    static final zbtp zba = new zbtp(true);
    public static final /* synthetic */ int zbb = 0;
    private static volatile boolean zbc = false;
    private static volatile zbtp zbd;
    private final Map zbe;

    zbtp() {
        this.zbe = new HashMap();
    }

    public static zbtp zba() {
        int i11 = zbvu.zba;
        return zba;
    }

    public static zbtp zbb() {
        zbtp zbtpVar = zbd;
        if (zbtpVar != null) {
            return zbtpVar;
        }
        synchronized (zbtp.class) {
            try {
                zbtp zbtpVar2 = zbd;
                if (zbtpVar2 != null) {
                    return zbtpVar2;
                }
                int i11 = zbvu.zba;
                zbtp zbb2 = zbtx.zbb(zbtp.class);
                zbd = zbb2;
                return zbb2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zbud zbc(zbvm zbvmVar, int i11) {
        return (zbud) this.zbe.get(new zbto(zbvmVar, i11));
    }

    zbtp(boolean z11) {
        this.zbe = Collections.EMPTY_MAP;
    }
}
