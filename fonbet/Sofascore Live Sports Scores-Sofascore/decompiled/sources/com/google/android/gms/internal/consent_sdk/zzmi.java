package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;
import defpackage.hjg;
import defpackage.q1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzmi extends zzqm implements zzrr {
    private static final zzmi zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzmi zzmiVar = new zzmi();
        zzb = zzmiVar;
        zzqm.m(zzmi.class, zzmiVar);
    }

    private zzmi() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", q1f.k, "zzf", hjg.l, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzmi();
        }
        if (i2 == 4) {
            return new zzmg(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
