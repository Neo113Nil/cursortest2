package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;
import defpackage.f7a;
import defpackage.it7;
import defpackage.k03;
import defpackage.mx9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjd extends zzqm implements zzrr {
    private static final zzjd zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzjd zzjdVar = new zzjd();
        zzb = zzjdVar;
        zzqm.m(zzjd.class, zzjdVar);
    }

    private zzjd() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005᠌\u0005\u0006င\u0002\t᠌\u0006\n᠌\u0007", new Object[]{"zzd", "zze", it7.s, "zzf", "zzh", "zzi", "zzj", k03.m, "zzg", "zzk", mx9.j, "zzl", f7a.o});
        }
        if (i2 == 3) {
            return new zzjd();
        }
        if (i2 == 4) {
            return new zziy(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
