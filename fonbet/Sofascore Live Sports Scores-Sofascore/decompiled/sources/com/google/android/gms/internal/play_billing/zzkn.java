package com.google.android.gms.internal.play_billing;

import defpackage.loo;
import defpackage.p6o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzkn extends zzgp implements zzhs {
    private static final zzkn zzb;
    private int zzd;
    private int zze;

    static {
        zzkn zzknVar = new zzkn();
        zzb = zzknVar;
        zzgp.e(zzkn.class, zzknVar);
    }

    private zzkn() {
    }

    public static zzkk p() {
        return (zzkk) zzb.j();
    }

    public static /* synthetic */ void q(zzkn zzknVar, int i) {
        zzknVar.zze = i - 1;
        zzknVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", p6o.g});
        }
        if (i2 == 3) {
            return new zzkn();
        }
        if (i2 == 4) {
            return new zzkk(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
