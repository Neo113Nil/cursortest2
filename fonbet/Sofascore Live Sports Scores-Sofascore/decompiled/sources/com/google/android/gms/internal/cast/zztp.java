package com.google.android.gms.internal.cast;

import defpackage.mx9;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztp extends zzyd implements zzzj {
    private static final zztp zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zztp zztpVar = new zztp();
        zzg = zztpVar;
        zzyd.g(zztp.class, zztpVar);
    }

    private zztp() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zzb", "zzd", "zze", mx9.m, "zzf"});
        }
        if (i2 == 3) {
            return new zztp();
        }
        if (i2 == 4) {
            return new zzto(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
