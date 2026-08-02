package com.google.android.gms.internal.play_billing;

import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzej extends zzgp implements zzhs {
    private static final zzej zzb;
    private int zzd;
    private int zze;
    private zzdu zzf;

    static {
        zzej zzejVar = new zzej();
        zzb = zzejVar;
        zzgp.e(zzej.class, zzejVar);
    }

    private zzej() {
    }

    public static zzej q(byte[] bArr) {
        return (zzej) zzgp.m(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzej();
        }
        if (i2 == 4) {
            return new zzeh(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzdu p() {
        zzdu zzduVar = this.zzf;
        return zzduVar == null ? zzdu.p() : zzduVar;
    }

    public final boolean r() {
        return (this.zzd & 2) != 0;
    }
}
