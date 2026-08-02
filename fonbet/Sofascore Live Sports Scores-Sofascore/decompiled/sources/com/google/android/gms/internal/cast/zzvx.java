package com.google.android.gms.internal.cast;

import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvx extends zzyd implements zzzj {
    private static final zzvx zzh;
    private int zzb;
    private String zzd = "";
    private long zze;
    private long zzf;
    private zzvz zzg;

    static {
        zzvx zzvxVar = new zzvx();
        zzh = zzvxVar;
        zzyd.g(zzvx.class, zzvxVar);
    }

    private zzvx() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzvx();
        }
        if (i2 == 4) {
            return new zzvw(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
