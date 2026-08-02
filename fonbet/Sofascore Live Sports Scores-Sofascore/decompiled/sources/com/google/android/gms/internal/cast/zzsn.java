package com.google.android.gms.internal.cast;

import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsn extends zzyd implements zzzj {
    private static final zzsn zzk;
    private int zzb;
    private zzyl zzd = wfp.e;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;

    static {
        zzsn zzsnVar = new zzsn();
        zzk = zzsnVar;
        zzyd.g(zzsn.class, zzsnVar);
    }

    private zzsn() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဇ\u0005", new Object[]{"zzb", "zzd", zzrx.class, "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzsn();
        }
        if (i2 == 4) {
            return new zzsm(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
