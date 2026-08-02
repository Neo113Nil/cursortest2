package com.google.android.gms.internal.cast;

import defpackage.inb;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztu extends zzyd implements zzzj {
    private static final zztu zze;
    private int zzb;
    private int zzd;

    static {
        zztu zztuVar = new zztu();
        zze = zztuVar;
        zzyd.g(zztu.class, zztuVar);
    }

    private zztu() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzd", inb.t});
        }
        if (i2 == 3) {
            return new zztu();
        }
        if (i2 == 4) {
            return new zzts(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
