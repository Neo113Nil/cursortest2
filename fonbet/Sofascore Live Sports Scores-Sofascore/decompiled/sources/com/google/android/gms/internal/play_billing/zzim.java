package com.google.android.gms.internal.play_billing;

import defpackage.loo;
import defpackage.vqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzim extends zzgp implements zzhs {
    private static final zzim zzb;
    private zzhm zzd = zzhm.b;

    static {
        zzim zzimVar = new zzim();
        zzb = zzimVar;
        zzgp.e(zzim.class, zzimVar);
    }

    private zzim() {
    }

    public static zzij p() {
        return (zzij) zzb.j();
    }

    public static zzhm q(zzim zzimVar) {
        zzhm zzhmVar = zzimVar.zzd;
        if (zzhmVar.a) {
            return zzhmVar;
        }
        zzhm g = zzhmVar.g();
        zzimVar.zzd = g;
        return g;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zzd", vqo.a});
        }
        if (i2 == 3) {
            return new zzim();
        }
        if (i2 == 4) {
            return new zzij(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
