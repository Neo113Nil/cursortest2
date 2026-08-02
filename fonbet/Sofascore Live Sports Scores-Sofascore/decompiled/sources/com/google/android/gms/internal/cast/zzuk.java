package com.google.android.gms.internal.cast;

import defpackage.ccd;
import defpackage.inb;
import defpackage.p4h;
import defpackage.wfp;
import defpackage.wxf;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzuk extends zzyd implements zzzj {
    private static final zzuk zzk;
    private int zzb;
    private zzrp zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private zzyl zzj = wfp.e;

    static {
        zzuk zzukVar = new zzuk();
        zzk = zzukVar;
        zzyd.g(zzuk.class, zzukVar);
    }

    private zzuk() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzb", "zzd", "zze", p4h.o, "zzf", wxf.o, "zzg", ccd.k, "zzh", inb.p, "zzi", "zzj", zzrp.class});
        }
        if (i2 == 3) {
            return new zzuk();
        }
        if (i2 == 4) {
            return new zzuj(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
