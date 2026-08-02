package com.google.android.gms.internal.cast;

import defpackage.ccd;
import defpackage.f7a;
import defpackage.kpg;
import defpackage.tnf;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrv extends zzyd implements zzzj {
    private static final zzrv zzm;
    private int zzb;
    private boolean zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zztb zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;

    static {
        zzrv zzrvVar = new zzrv();
        zzm = zzrvVar;
        zzyd.g(zzrv.class, zzrvVar);
    }

    private zzrv() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007ဇ\u0006\b᠌\u0007\tင\b", new Object[]{"zzb", "zzd", "zze", ccd.k, "zzf", kpg.l, "zzg", f7a.p, "zzh", "zzi", tnf.m, "zzj", "zzk", tnf.p, "zzl"});
        }
        if (i2 == 3) {
            return new zzrv();
        }
        if (i2 == 4) {
            return new zzru(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }
}
