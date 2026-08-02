package com.google.android.gms.internal.cast;

import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzuo extends zzyd implements zzzj {
    private static final zzuo zzh;
    private int zzb;
    private String zzd = "";
    private zzyl zze;
    private zzyl zzf;
    private boolean zzg;

    static {
        zzuo zzuoVar = new zzuo();
        zzh = zzuoVar;
        zzyd.g(zzuo.class, zzuoVar);
    }

    private zzuo() {
        wfp wfpVar = wfp.e;
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
            return new zfp(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzb", "zzd", "zze", zzsl.class, "zzf", zzrp.class, "zzg"});
        }
        if (i2 == 3) {
            return new zzuo();
        }
        if (i2 == 4) {
            return new zzun(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
