package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;
import defpackage.f3p;
import defpackage.hjg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzoo extends zzqm implements zzrr {
    private static final zzoo zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzqq zzg = f3p.e;

    static {
        zzoo zzooVar = new zzoo();
        zzb = zzooVar;
        zzqm.m(zzoo.class, zzooVar);
    }

    private zzoo() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            hjg hjgVar = hjg.n;
            return new a5p(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ࠬ\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzg", hjgVar, "zzf", hjgVar});
        }
        if (i2 == 3) {
            return new zzoo();
        }
        if (i2 == 4) {
            return new zzol(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
