package com.google.android.gms.internal.play_billing;

import defpackage.loo;
import defpackage.p6o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzld extends zzgp implements zzhs {
    private static final zzld zzb;
    private int zzd;
    private int zze;

    static {
        zzld zzldVar = new zzld();
        zzb = zzldVar;
        zzgp.e(zzld.class, zzldVar);
    }

    private zzld() {
    }

    public static zzla p() {
        return (zzla) zzb.j();
    }

    public static /* synthetic */ void q(zzld zzldVar, int i) {
        zzldVar.zze = i - 1;
        zzldVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", p6o.i});
        }
        if (i2 == 3) {
            return new zzld();
        }
        if (i2 == 4) {
            return new zzla(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
