package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;
import defpackage.dti;
import defpackage.kpg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznl extends zzqm implements zzrr {
    private static final zznl zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zznl zznlVar = new zznl();
        zzb = zznlVar;
        zzqm.m(zznl.class, zznlVar);
    }

    private zznl() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", kpg.m, "zzf", dti.m});
        }
        if (i2 == 3) {
            return new zznl();
        }
        if (i2 == 4) {
            return new zzni(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
