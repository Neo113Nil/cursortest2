package com.google.android.gms.internal.cast;

import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzuy extends zzyd implements zzzj {
    private static final zzuy zzi;
    private int zzb;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzuy zzuyVar = new zzuy();
        zzi = zzuyVar;
        zzyd.g(zzuy.class, zzuyVar);
    }

    private zzuy() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzuy();
        }
        if (i2 == 4) {
            return new zzux(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
