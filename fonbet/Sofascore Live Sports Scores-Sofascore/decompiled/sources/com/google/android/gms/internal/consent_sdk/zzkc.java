package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;
import defpackage.q1f;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzkc extends zzqm implements zzrr {
    private static final zzkc zzb;
    private int zzd;
    private zzka zze;
    private zzlj zzf;
    private int zzg;

    static {
        zzkc zzkcVar = new zzkc();
        zzb = zzkcVar;
        zzqm.m(zzkc.class, zzkcVar);
    }

    private zzkc() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003᠌\u0002\u0004ဉ\u0001", new Object[]{"zzd", "zze", "zzg", q1f.i, "zzf"});
        }
        if (i2 == 3) {
            return new zzkc();
        }
        if (i2 == 4) {
            return new zzjp(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
