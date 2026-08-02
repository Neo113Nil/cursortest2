package com.google.android.gms.internal.cast;

import defpackage.wib;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvt extends zzyd implements zzzj {
    private static final zzvt zzg;
    private int zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        zzvt zzvtVar = new zzvt();
        zzg = zzvtVar;
        zzyd.g(zzvt.class, zzvtVar);
    }

    private zzvt() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zzd", wib.p, "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzvt();
        }
        if (i2 == 4) {
            return new zzvs(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
