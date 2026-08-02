package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzok extends zzqm implements zzrr {
    private static final zzok zzb;
    private int zzd;
    private int zze;

    static {
        zzok zzokVar = new zzok();
        zzb = zzokVar;
        zzqm.m(zzok.class, zzokVar);
    }

    private zzok() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzok();
        }
        if (i2 == 4) {
            return new zzoi(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
