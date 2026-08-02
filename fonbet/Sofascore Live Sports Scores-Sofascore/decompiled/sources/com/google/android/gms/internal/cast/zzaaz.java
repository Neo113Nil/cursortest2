package com.google.android.gms.internal.cast;

import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaaz extends zzyd implements zzzj {
    private static final zzaaz zzg;
    private zzyl zzb;
    private zzyl zzd;
    private zzyl zze;
    private zzyl zzf;

    static {
        zzaaz zzaazVar = new zzaaz();
        zzg = zzaazVar;
        zzyd.g(zzaaz.class, zzaazVar);
    }

    private zzaaz() {
        wfp wfpVar = wfp.e;
        this.zzb = wfpVar;
        this.zzd = wfpVar;
        this.zze = wfpVar;
        this.zzf = wfpVar;
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zzb", zzaax.class, "zzd", zzaat.class, "zze", zzaax.class, "zzf", zzaat.class});
        }
        if (i2 == 3) {
            return new zzaaz();
        }
        if (i2 == 4) {
            return new zzaay(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
