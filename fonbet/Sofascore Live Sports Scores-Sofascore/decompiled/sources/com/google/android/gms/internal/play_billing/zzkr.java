package com.google.android.gms.internal.play_billing;

import defpackage.loo;
import defpackage.p6o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzkr extends zzgp implements zzhs {
    private static final zzkr zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzkr zzkrVar = new zzkr();
        zzb = zzkrVar;
        zzgp.e(zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", p6o.h, "zzf"});
        }
        if (i2 == 3) {
            return new zzkr();
        }
        if (i2 == 4) {
            return new zzkp(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
