package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzik extends zzqm implements zzrr {
    private static final zzik zzb;

    static {
        zzik zzikVar = new zzik();
        zzb = zzikVar;
        zzqm.m(zzik.class, zzikVar);
    }

    private zzik() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new zzik();
        }
        if (i2 == 4) {
            return new zzij(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
