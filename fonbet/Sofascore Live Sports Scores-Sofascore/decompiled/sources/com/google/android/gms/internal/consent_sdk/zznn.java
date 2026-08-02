package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;
import defpackage.a99;
import defpackage.f3p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznn extends zzqm implements zzrr {
    private static final zznn zzb;
    private zzqq zzd = f3p.e;

    static {
        zznn zznnVar = new zznn();
        zzb = zznnVar;
        zzqm.m(zznn.class, zznnVar);
    }

    private zznn() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", a99.m});
        }
        if (i2 == 3) {
            return new zznn();
        }
        if (i2 == 4) {
            return new zznm(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
