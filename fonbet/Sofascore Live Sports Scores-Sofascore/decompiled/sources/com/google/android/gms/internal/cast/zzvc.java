package com.google.android.gms.internal.cast;

import defpackage.q1f;
import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvc extends zzyd implements zzzj {
    private static final zzvc zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private zzyl zzf;
    private zzyl zzg;
    private boolean zzh;

    static {
        zzvc zzvcVar = new zzvc();
        zzi = zzvcVar;
        zzyd.g(zzvc.class, zzvcVar);
    }

    private zzvc() {
        wfp wfpVar = wfp.e;
        this.zzf = wfpVar;
        this.zzg = wfpVar;
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b\u0005ဇ\u0002", new Object[]{"zzb", "zzd", q1f.m, "zze", "zzf", zzuy.class, "zzg", zzva.class, "zzh"});
        }
        if (i2 == 3) {
            return new zzvc();
        }
        if (i2 == 4) {
            return new zzvb(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
