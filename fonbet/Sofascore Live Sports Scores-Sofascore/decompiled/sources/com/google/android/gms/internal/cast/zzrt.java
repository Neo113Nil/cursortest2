package com.google.android.gms.internal.cast;

import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrt extends zzyd implements zzzj {
    private static final zzrt zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzyl zzg = wfp.e;

    static {
        zzrt zzrtVar = new zzrt();
        zzh = zzrtVar;
        zzyd.g(zzrt.class, zzrtVar);
    }

    private zzrt() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", zzrs.class});
        }
        if (i2 == 3) {
            return new zzrt();
        }
        if (i2 == 4) {
            return new zzrq(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
