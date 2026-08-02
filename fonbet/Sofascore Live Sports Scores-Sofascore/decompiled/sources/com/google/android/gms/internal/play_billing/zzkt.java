package com.google.android.gms.internal.play_billing;

import defpackage.boo;
import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzkt extends zzgp implements zzhs {
    private static final zzkt zzb;
    private int zzd;
    private zzgu zze = boo.e;
    private String zzf = "";
    private boolean zzg;

    static {
        zzkt zzktVar = new zzkt();
        zzb = zzktVar;
        zzgp.e(zzkt.class, zzktVar);
    }

    private zzkt() {
    }

    public static zzkt p() {
        return zzb;
    }

    public static /* synthetic */ void q(zzkt zzktVar, boolean z) {
        zzktVar.zzd |= 2;
        zzktVar.zzg = z;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", zzkr.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzkt();
        }
        if (i2 == 4) {
            return new zzko(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
