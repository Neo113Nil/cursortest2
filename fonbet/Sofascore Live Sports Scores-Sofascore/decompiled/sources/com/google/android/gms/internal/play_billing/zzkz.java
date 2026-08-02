package com.google.android.gms.internal.play_billing;

import defpackage.boo;
import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzkz extends zzgp implements zzhs {
    private static final zzkz zzb;
    private int zzd;
    private int zzf;
    private zzgu zze = boo.e;
    private String zzg = "";

    static {
        zzkz zzkzVar = new zzkz();
        zzb = zzkzVar;
        zzgp.e(zzkz.class, zzkzVar);
    }

    private zzkz() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzkz();
        }
        if (i2 == 4) {
            return new zzkx(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
