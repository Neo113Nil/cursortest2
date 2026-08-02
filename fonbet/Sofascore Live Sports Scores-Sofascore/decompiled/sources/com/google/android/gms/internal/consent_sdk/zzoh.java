package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzoh extends zzqm implements zzrr {
    private static final zzoh zzb;
    private int zzd;
    private zzod zze;
    private zznx zzf;
    private zzof zzg;

    static {
        zzoh zzohVar = new zzoh();
        zzb = zzohVar;
        zzqm.m(zzoh.class, zzohVar);
    }

    private zzoh() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzoh();
        }
        if (i2 == 4) {
            return new zznv(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
