package com.google.android.gms.internal.cast;

import defpackage.f7a;
import defpackage.uxf;
import defpackage.zfp;
import defpackage.zic;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqp extends zzyd implements zzzj {
    private static final zzqp zzk;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;

    static {
        zzqp zzqpVar = new zzqp();
        zzk = zzqpVar;
        zzyd.g(zzqp.class, zzqpVar);
    }

    private zzqp() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", uxf.B, "zze", f7a.r, "zzf", zic.l, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzqp();
        }
        if (i2 == 4) {
            return new zzqo(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
