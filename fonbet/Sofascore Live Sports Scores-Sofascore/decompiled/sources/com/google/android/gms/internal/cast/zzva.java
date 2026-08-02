package com.google.android.gms.internal.cast;

import defpackage.ccd;
import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzva extends zzyd implements zzzj {
    private static final zzva zzi;
    private int zzb;
    private int zzd;
    private long zze;
    private zzyl zzf;
    private zzyl zzg;
    private zzyl zzh;

    static {
        zzva zzvaVar = new zzva();
        zzi = zzvaVar;
        zzyd.g(zzva.class, zzvaVar);
    }

    private zzva() {
        wfp wfpVar = wfp.e;
        this.zzf = wfpVar;
        this.zzg = wfpVar;
        this.zzh = wfpVar;
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"zzb", "zzd", ccd.m, "zze", "zzf", zzus.class, "zzg", zzqt.class, "zzh", zzuy.class});
        }
        if (i2 == 3) {
            return new zzva();
        }
        if (i2 == 4) {
            return new zzuz(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
