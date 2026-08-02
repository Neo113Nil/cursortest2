package com.google.android.gms.internal.cast;

import defpackage.ccd;
import defpackage.mdp;
import defpackage.rik;
import defpackage.ug5;
import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvr extends zzyd implements zzzj {
    private static final zzvr zzl;
    private int zzb;
    private int zzd;
    private int zze;
    private zzyl zzf;
    private zzyl zzg;
    private int zzh;
    private zzyj zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzvr zzvrVar = new zzvr();
        zzl = zzvrVar;
        zzyd.g(zzvr.class, zzvrVar);
    }

    private zzvr() {
        wfp wfpVar = wfp.e;
        this.zzf = wfpVar;
        this.zzg = wfpVar;
        this.zzi = mdp.e;
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            rik rikVar = rik.o;
            return new zfp(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002\u0006ࠬ\u0007ဇ\u0003\bဇ\u0004", new Object[]{"zzb", "zzd", rikVar, "zze", ug5.l, "zzf", zzrp.class, "zzg", zzrp.class, "zzh", ccd.k, "zzi", rikVar, "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzvr();
        }
        if (i2 == 4) {
            return new zzvq(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }
}
