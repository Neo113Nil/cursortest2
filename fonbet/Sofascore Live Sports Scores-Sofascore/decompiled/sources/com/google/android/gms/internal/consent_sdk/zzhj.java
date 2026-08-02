package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhj extends zzqm implements zzrr {
    private static final zzhj zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzhj zzhjVar = new zzhj();
        zzb = zzhjVar;
        zzqm.m(zzhj.class, zzhjVar);
    }

    private zzhj() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzhi.class, zzhg.class});
        }
        if (i2 == 3) {
            return new zzhj();
        }
        if (i2 == 4) {
            return new zzhe(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
