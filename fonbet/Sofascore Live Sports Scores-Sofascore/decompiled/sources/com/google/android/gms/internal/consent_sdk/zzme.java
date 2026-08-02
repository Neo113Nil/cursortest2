package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;
import defpackage.f3p;
import defpackage.inb;
import defpackage.k03;
import defpackage.mx9;
import defpackage.zic;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzme extends zzqm implements zzrr {
    private static final zzme zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzqq zzi = f3p.e;
    private String zzj = "";
    private zzmc zzk;

    static {
        zzme zzmeVar = new zzme();
        zzb = zzmeVar;
        zzqm.m(zzme.class, zzmeVar);
    }

    private zzme() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ࠬ\u0006ဉ\u0005\u0007ለ\u0004", new Object[]{"zzd", "zze", "zzf", mx9.n, "zzg", zic.m, "zzh", inb.s, "zzi", k03.q, "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new zzme();
        }
        if (i2 == 4) {
            return new zzma(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
