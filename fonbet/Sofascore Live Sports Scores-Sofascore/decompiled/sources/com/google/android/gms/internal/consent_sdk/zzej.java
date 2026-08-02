package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzej extends zzqm implements zzrr {
    private static final zzej zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        zzej zzejVar = new zzej();
        zzb = zzejVar;
        zzqm.m(zzej.class, zzejVar);
    }

    private zzej() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzej();
        }
        if (i2 == 4) {
            return new zzeh(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
