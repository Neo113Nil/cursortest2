package com.google.android.gms.internal.play_billing;

import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdx extends zzgp implements zzhs {
    private static final zzdx zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzdx zzdxVar = new zzdx();
        zzb = zzdxVar;
        zzgp.e(zzdx.class, zzdxVar);
    }

    private zzdx() {
    }

    public static zzdx p(byte[] bArr) {
        return (zzdx) zzgp.m(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzeg.class});
        }
        if (i2 == 3) {
            return new zzdx();
        }
        if (i2 == 4) {
            return new zzdv(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzeg q() {
        return this.zzd == 2 ? (zzeg) this.zze : zzeg.p();
    }
}
