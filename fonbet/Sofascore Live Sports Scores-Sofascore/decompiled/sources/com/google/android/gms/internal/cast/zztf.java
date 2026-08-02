package com.google.android.gms.internal.cast;

import defpackage.qep;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztf extends zzyd implements zzzj {
    private static final zztf zzg;
    private int zzb;
    private long zzd;
    private zzyk zze;
    private zzyk zzf;

    static {
        zztf zztfVar = new zztf();
        zzg = zztfVar;
        zzyd.g(zztf.class, zztfVar);
    }

    private zztf() {
        qep qepVar = qep.e;
        this.zze = qepVar;
        this.zzf = qepVar;
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zztf();
        }
        if (i2 == 4) {
            return new zzte(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
