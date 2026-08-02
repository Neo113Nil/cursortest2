package com.google.android.gms.internal.cast;

import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrh extends zzyd implements zzzj {
    private static final zzrh zzm;
    private int zzb;
    private long zze;
    private long zzf;
    private int zzh;
    private boolean zzi;
    private long zzk;
    private long zzl;
    private String zzd = "";
    private zzyl zzg = wfp.e;
    private String zzj = "";

    static {
        zzrh zzrhVar = new zzrh();
        zzm = zzrhVar;
        zzyd.g(zzrh.class, zzrhVar);
    }

    private zzrh() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u001b\u0005င\u0003\u0006ဇ\u0004\u0007ဈ\u0005\bဂ\u0006\tဂ\u0007", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", zzrf.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzrh();
        }
        if (i2 == 4) {
            return new zzrg(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }
}
