package com.google.android.gms.internal.play_billing;

import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzea extends zzgp implements zzhs {
    private static final zzea zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzea zzeaVar = new zzea();
        zzb = zzeaVar;
        zzgp.e(zzea.class, zzeaVar);
    }

    private zzea() {
    }

    public static zzea p(byte[] bArr) {
        return (zzea) zzgp.m(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzea();
        }
        if (i2 == 4) {
            return new zzdy(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String q() {
        return this.zze;
    }

    public final String r() {
        return this.zzf;
    }
}
