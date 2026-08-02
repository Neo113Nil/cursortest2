package com.google.android.gms.internal.cast;

import defpackage.ccd;
import defpackage.it7;
import defpackage.mdp;
import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrz extends zzyd implements zzzj {
    private static final zzrz zzk;
    private int zzb;
    private int zzd;
    private int zze;
    private zzyj zzf;
    private zzyj zzg;
    private zzyl zzh;
    private zzyl zzi;
    private int zzj;

    static {
        zzrz zzrzVar = new zzrz();
        zzk = zzrzVar;
        zzyd.g(zzrz.class, zzrzVar);
    }

    private zzrz() {
        mdp mdpVar = mdp.e;
        this.zzf = mdpVar;
        this.zzg = mdpVar;
        wfp wfpVar = wfp.e;
        this.zzh = wfpVar;
        this.zzi = wfpVar;
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzb", "zzd", "zze", it7.u, "zzf", "zzg", "zzh", "zzi", "zzj", ccd.k});
        }
        if (i2 == 3) {
            return new zzrz();
        }
        if (i2 == 4) {
            return new zzry(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
