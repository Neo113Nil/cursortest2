package com.google.android.gms.internal.cast;

import defpackage.k03;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvp extends zzyd implements zzzj {
    private static final zzvp zzg;
    private int zzb;
    private String zzd = "";
    private int zze;
    private zztd zzf;

    static {
        zzvp zzvpVar = new zzvp();
        zzg = zzvpVar;
        zzyd.g(zzvp.class, zzvpVar);
    }

    private zzvp() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", k03.r, "zzf"});
        }
        if (i2 == 3) {
            return new zzvp();
        }
        if (i2 == 4) {
            return new zzvo(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
