package com.google.android.gms.internal.cast;

import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzum extends zzyd implements zzzj {
    private static final zzum zzg;
    private int zzb;
    private long zzd;
    private long zze;
    private zzyl zzf = wfp.e;

    static {
        zzum zzumVar = new zzum();
        zzg = zzumVar;
        zzyd.g(zzum.class, zzumVar);
    }

    private zzum() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", zzuo.class});
        }
        if (i2 == 3) {
            return new zzum();
        }
        if (i2 == 4) {
            return new zzul(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
