package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;
import defpackage.rvo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlf extends zzqm implements zzrr {
    private static final zzlf zzb;
    private int zzd;
    private zzrk zzh = zzrk.b;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzlf zzlfVar = new zzlf();
        zzb = zzlfVar;
        zzqm.m(zzlf.class, zzlfVar);
    }

    private zzlf() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", rvo.a});
        }
        if (i2 == 3) {
            return new zzlf();
        }
        if (i2 == 4) {
            return new zzld(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
