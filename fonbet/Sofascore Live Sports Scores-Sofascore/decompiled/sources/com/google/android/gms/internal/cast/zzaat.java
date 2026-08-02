package com.google.android.gms.internal.cast;

import defpackage.hjg;
import defpackage.kpg;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaat extends zzyd implements zzzj {
    private static final zzaat zzg;
    private int zzb;
    private zzabb zzd;
    private int zze;
    private int zzf;

    static {
        zzaat zzaatVar = new zzaat();
        zzg = zzaatVar;
        zzyd.g(zzaat.class, zzaatVar);
    }

    private zzaat() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", "zze", kpg.i, "zzf", hjg.i});
        }
        if (i2 == 3) {
            return new zzaat();
        }
        if (i2 == 4) {
            return new zzaaq(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
