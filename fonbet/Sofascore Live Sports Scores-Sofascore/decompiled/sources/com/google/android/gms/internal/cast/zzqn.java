package com.google.android.gms.internal.cast;

import defpackage.zfp;
import defpackage.zic;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqn extends zzyd implements zzzj {
    private static final zzqn zze;
    private int zzb;
    private int zzd;

    static {
        zzqn zzqnVar = new zzqn();
        zze = zzqnVar;
        zzyd.g(zzqn.class, zzqnVar);
    }

    private zzqn() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzd", zic.j});
        }
        if (i2 == 3) {
            return new zzqn();
        }
        if (i2 == 4) {
            return new zzqm(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
