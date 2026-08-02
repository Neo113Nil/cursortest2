package com.google.android.gms.internal.play_billing;

import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjx extends zzgp implements zzhs {
    private static final zzjx zzb;

    static {
        zzjx zzjxVar = new zzjx();
        zzb = zzjxVar;
        zzgp.e(zzjx.class, zzjxVar);
    }

    private zzjx() {
    }

    public static zzjx p() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new zzjx();
        }
        if (i2 == 4) {
            return new zzjv(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
