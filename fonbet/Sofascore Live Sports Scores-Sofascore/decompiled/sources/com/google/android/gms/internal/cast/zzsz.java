package com.google.android.gms.internal.cast;

import defpackage.inb;
import defpackage.tnf;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsz extends zzyd implements zzzj {
    private static final zzsz zzg;
    private int zzb;
    private int zzd;
    private long zze;
    private int zzf;

    static {
        zzsz zzszVar = new zzsz();
        zzg = zzszVar;
        zzyd.g(zzsz.class, zzszVar);
    }

    private zzsz() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", tnf.n, "zze", "zzf", inb.p});
        }
        if (i2 == 3) {
            return new zzsz();
        }
        if (i2 == 4) {
            return new zzsy(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
