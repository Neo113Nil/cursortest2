package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;
import defpackage.a99;
import defpackage.q1f;
import defpackage.wib;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznh extends zzqm implements zzrr {
    private static final zznh zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;
    private zzte zzi;
    private zzte zzj;
    private int zzk;

    static {
        zznh zznhVar = new zznh();
        zzb = zznhVar;
        zzqm.m(zznh.class, zznhVar);
    }

    private zznh() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005᠌\u0004\u00067\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", a99.m, "zzh", wib.n, "zzi", "zzj", "zzk", q1f.l, zzqa.class});
        }
        if (i2 == 3) {
            return new zznh();
        }
        if (i2 == 4) {
            return new zznf(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
