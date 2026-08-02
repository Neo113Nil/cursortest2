package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfa extends zzqm implements zzrr {
    private static final zzfa zzb;
    private int zzd;
    private zzew zze;
    private zzey zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzfa zzfaVar = new zzfa();
        zzb = zzfaVar;
        zzqm.m(zzfa.class, zzfaVar);
    }

    private zzfa() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfa();
        }
        if (i2 == 4) {
            return new zzek(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
