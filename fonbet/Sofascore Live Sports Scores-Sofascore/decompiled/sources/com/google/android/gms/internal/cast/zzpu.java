package com.google.android.gms.internal.cast;

import defpackage.ccd;
import defpackage.mdp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpu extends zzyd implements zzzj {
    private static final zzpu zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private zzyj zzf = mdp.e;

    static {
        zzpu zzpuVar = new zzpu();
        zzg = zzpuVar;
        zzyd.g(zzpu.class, zzpuVar);
    }

    private zzpu() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zzb", "zzd", "zze", "zzf", ccd.n});
        }
        if (i2 == 3) {
            return new zzpu();
        }
        if (i2 == 4) {
            return new zzpt(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
