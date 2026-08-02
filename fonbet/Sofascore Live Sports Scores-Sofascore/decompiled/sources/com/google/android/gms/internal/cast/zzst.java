package com.google.android.gms.internal.cast;

import defpackage.hjg;
import defpackage.wxf;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzst extends zzyd implements zzzj {
    private static final zzst zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        zzst zzstVar = new zzst();
        zzh = zzstVar;
        zzyd.g(zzst.class, zzstVar);
    }

    private zzst() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new zfp(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", wxf.n, "zze", "zzf", hjg.o});
        }
        if (i2 == 3) {
            return new zzst();
        }
        if (i2 == 4) {
            return new zzss(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        this.zzg = zzydVar == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
