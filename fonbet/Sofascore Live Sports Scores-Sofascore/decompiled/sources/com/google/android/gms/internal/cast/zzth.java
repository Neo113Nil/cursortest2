package com.google.android.gms.internal.cast;

import defpackage.k03;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzth extends zzyd implements zzzj {
    private static final zzth zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;

    static {
        zzth zzthVar = new zzth();
        zzk = zzthVar;
        zzyd.g(zzth.class, zzthVar);
    }

    private zzth() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            k03 k03Var = k03.p;
            return new zfp(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", k03Var, "zzi", k03Var, "zzj"});
        }
        if (i2 == 3) {
            return new zzth();
        }
        if (i2 == 4) {
            return new zztg(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
