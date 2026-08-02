package com.google.android.gms.internal.cast;

import defpackage.uxf;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqi extends zzyd implements zzzj {
    private static final zzqi zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzqi zzqiVar = new zzqi();
        zzh = zzqiVar;
        zzyd.g(zzqi.class, zzqiVar);
    }

    private zzqi() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", uxf.A, "zzg"});
        }
        if (i2 == 3) {
            return new zzqi();
        }
        if (i2 == 4) {
            return new zzqh(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
