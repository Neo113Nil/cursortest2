package com.google.android.gms.internal.cast;

import defpackage.ccd;
import defpackage.p4h;
import defpackage.rik;
import defpackage.ug5;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsv extends zzyd implements zzzj {
    private static final zzsv zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzsv zzsvVar = new zzsv();
        zzk = zzsvVar;
        zzyd.g(zzsv.class, zzsvVar);
    }

    private zzsv() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", p4h.n, "zzh", ug5.j, "zzi", rik.m, "zzj", ccd.l});
        }
        if (i2 == 3) {
            return new zzsv();
        }
        if (i2 == 4) {
            return new zzsu(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
