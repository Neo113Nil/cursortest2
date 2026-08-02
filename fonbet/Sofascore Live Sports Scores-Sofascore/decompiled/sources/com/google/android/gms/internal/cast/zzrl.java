package com.google.android.gms.internal.cast;

import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrl extends zzyd implements zzzj {
    private static final zzrl zzg;
    private int zzb;
    private int zzd = 0;
    private Object zze;
    private long zzf;

    static {
        zzrl zzrlVar = new zzrl();
        zzg = zzrlVar;
        zzyd.g(zzrl.class, zzrlVar);
    }

    private zzrl() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002:\u0000\u00035\u0000\u00048\u0000", new Object[]{"zze", "zzd", "zzb", "zzf"});
        }
        if (i2 == 3) {
            return new zzrl();
        }
        if (i2 == 4) {
            return new zzrk(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
