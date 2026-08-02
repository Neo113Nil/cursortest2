package com.google.android.gms.internal.cast;

import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztr extends zzyd implements zzzj {
    private static final zztr zzg;
    private int zzb;
    private zzyl zzd;
    private zzyl zze;
    private zzuq zzf;

    static {
        zztr zztrVar = new zztr();
        zzg = zztrVar;
        zzyd.g(zztr.class, zztrVar);
    }

    private zztr() {
        wfp wfpVar = wfp.e;
        this.zzd = wfpVar;
        this.zze = wfpVar;
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzb", "zzd", zzvg.class, "zze", zzrn.class, "zzf"});
        }
        if (i2 == 3) {
            return new zztr();
        }
        if (i2 == 4) {
            return new zztq(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
