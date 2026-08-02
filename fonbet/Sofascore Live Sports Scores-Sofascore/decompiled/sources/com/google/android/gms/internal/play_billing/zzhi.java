package com.google.android.gms.internal.play_billing;

import defpackage.boo;
import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhi extends zzgp implements zzhs {
    private static final zzhi zzb;
    private zzgu zzd = boo.e;

    static {
        zzhi zzhiVar = new zzhi();
        zzb = zzhiVar;
        zzgp.e(zzhi.class, zzhiVar);
    }

    private zzhi() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzjf.class});
        }
        if (i2 == 3) {
            return new zzhi();
        }
        if (i2 == 4) {
            return new zzhg(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
