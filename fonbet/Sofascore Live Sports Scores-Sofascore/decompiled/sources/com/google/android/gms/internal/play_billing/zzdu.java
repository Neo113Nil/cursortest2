package com.google.android.gms.internal.play_billing;

import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdu extends zzgp implements zzhs {
    private static final zzdu zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzdu zzduVar = new zzdu();
        zzb = zzduVar;
        zzgp.e(zzdu.class, zzduVar);
    }

    private zzdu() {
    }

    public static zzdu p() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzdu();
        }
        if (i2 == 4) {
            return new zzds(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean q() {
        return this.zzf;
    }

    public final int r() {
        int i = this.zze;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
