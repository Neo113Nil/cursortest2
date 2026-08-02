package com.google.android.gms.internal.cast;

import defpackage.a99;
import defpackage.mdp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrx extends zzyd implements zzzj {
    private static final zzrx zzl;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private zzvv zzg;
    private boolean zzh;
    private long zzj;
    private long zzk;
    private String zzd = "";
    private zzyj zzi = mdp.e;

    static {
        zzrx zzrxVar = new zzrx();
        zzl = zzrxVar;
        zzyd.g(zzrx.class, zzrxVar);
    }

    private zzrx() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဇ\u0004\u0005ࠬ\u0006ဇ\u0002\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zzd", "zze", "zzg", "zzh", "zzi", a99.o, "zzf", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzrx();
        }
        if (i2 == 4) {
            return new zzrw(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }
}
