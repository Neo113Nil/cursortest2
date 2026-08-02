package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;
import defpackage.p4h;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgr extends zzqm implements zzrr {
    private static final zzgr zzb;
    private int zzd;
    private int zze;
    private zzgp zzf;

    static {
        zzgr zzgrVar = new zzgr();
        zzb = zzgrVar;
        zzqm.m(zzgr.class, zzgrVar);
    }

    private zzgr() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", p4h.k, "zzf"});
        }
        if (i2 == 3) {
            return new zzgr();
        }
        if (i2 == 4) {
            return new zzgk(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
