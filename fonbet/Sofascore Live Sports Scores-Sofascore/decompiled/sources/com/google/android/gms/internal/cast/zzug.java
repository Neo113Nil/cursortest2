package com.google.android.gms.internal.cast;

import defpackage.dti;
import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzug extends zzyd implements zzzj {
    private static final zzug zzl;
    private int zzb;
    private zzaaz zzd;
    private zzyl zze;
    private zzyl zzf;
    private zzyl zzg;
    private String zzh;
    private long zzi;
    private int zzj;
    private String zzk;

    static {
        zzug zzugVar = new zzug();
        zzl = zzugVar;
        zzyd.g(zzug.class, zzugVar);
    }

    private zzug() {
        wfp wfpVar = wfp.e;
        this.zze = wfpVar;
        this.zzf = wfpVar;
        this.zzg = wfpVar;
        this.zzh = "";
        this.zzk = "";
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001a\u0003\u001b\u0004\u001b\u0005ဈ\u0001\u0006ဂ\u0002\u0007᠌\u0003\bဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", zzqe.class, "zzg", zztx.class, "zzh", "zzi", "zzj", dti.o, "zzk"});
        }
        if (i2 == 3) {
            return new zzug();
        }
        if (i2 == 4) {
            return new zzuf(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }
}
