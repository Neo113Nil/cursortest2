package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzte extends zzqm implements zzrr {
    private static final zzte zzb;
    private String zzd = "";
    private long zze;
    private int zzf;

    static {
        zzte zzteVar = new zzte();
        zzb = zzteVar;
        zzqm.m(zzte.class, zzteVar);
    }

    private zzte() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzte();
        }
        if (i2 == 4) {
            return new zztc(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
