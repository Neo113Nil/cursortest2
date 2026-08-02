package com.google.android.gms.internal.cast;

import defpackage.wcp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztd extends zzyd implements zzzj {
    private static final zztd zzh;
    private int zzb;
    private float zze;
    private int zzg;
    private String zzd = "";
    private zzyi zzf = wcp.e;

    static {
        zztd zztdVar = new zztd();
        zzh = zztdVar;
        zzyd.g(zztd.class, zztdVar);
    }

    private zztd() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003$\u0004င\u0002", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zztd();
        }
        if (i2 == 4) {
            return new zztc(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
