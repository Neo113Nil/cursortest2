package com.google.android.gms.internal.cast;

import defpackage.a99;
import defpackage.ccd;
import defpackage.mdp;
import defpackage.p4h;
import defpackage.wfp;
import defpackage.wib;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvv extends zzyd implements zzzj {
    private static final zzvv zzj;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private long zzi;
    private zzyj zzf = mdp.e;
    private zzyl zzh = wfp.e;

    static {
        zzvv zzvvVar = new zzvv();
        zzj = zzvvVar;
        zzyd.g(zzvv.class, zzvvVar);
    }

    private zzvv() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzj, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zzb", "zzd", wib.p, "zze", ccd.k, "zzf", a99.o, "zzg", p4h.m, "zzh", zzvt.class, "zzi"});
        }
        if (i2 == 3) {
            return new zzvv();
        }
        if (i2 == 4) {
            return new zzvu(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }
}
