package com.google.android.gms.internal.cast;

import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpy extends zzyd implements zzzj {
    private static final zzpy zzi;
    private int zzb;
    private int zzd;
    private double zze;
    private double zzf;
    private double zzg;
    private double zzh;

    static {
        zzpy zzpyVar = new zzpy();
        zzi = zzpyVar;
        zzyd.g(zzpy.class, zzpyVar);
    }

    private zzpy() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzpy();
        }
        if (i2 == 4) {
            return new zzpx(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
