package com.google.android.gms.internal.cast;

import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabb extends zzyd implements zzzj {
    private static final zzabb zzd;
    private zzyl zzb = wfp.e;

    static {
        zzabb zzabbVar = new zzabb();
        zzd = zzabbVar;
        zzyd.g(zzabb.class, zzabbVar);
    }

    private zzabb() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzabd.class});
        }
        if (i2 == 3) {
            return new zzabb();
        }
        if (i2 == 4) {
            return new zzaba(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
