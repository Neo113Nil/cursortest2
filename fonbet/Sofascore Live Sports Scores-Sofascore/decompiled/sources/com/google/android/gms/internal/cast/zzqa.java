package com.google.android.gms.internal.cast;

import defpackage.ccd;
import defpackage.k03;
import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqa extends zzyd implements zzzj {
    private static final zzqa zzk;
    private int zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private boolean zzg;
    private zzyl zzh;
    private zzyl zzi;
    private String zzj;

    static {
        zzqa zzqaVar = new zzqa();
        zzk = zzqaVar;
        zzyd.g(zzqa.class, zzqaVar);
    }

    private zzqa() {
        wfp wfpVar = wfp.e;
        this.zzh = wfpVar;
        this.zzi = wfpVar;
        this.zzj = "";
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzk, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzb", "zzd", k03.n, "zze", "zzf", ccd.k, "zzg", "zzh", zztl.class, "zzi", zztl.class, "zzj"});
        }
        if (i2 == 3) {
            return new zzqa();
        }
        if (i2 == 4) {
            return new zzpz(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
