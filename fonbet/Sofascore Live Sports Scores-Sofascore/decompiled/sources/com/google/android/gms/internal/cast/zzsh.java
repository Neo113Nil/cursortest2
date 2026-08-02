package com.google.android.gms.internal.cast;

import defpackage.mx9;
import defpackage.uxf;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsh extends zzyd implements zzzj {
    private static final zzsh zzl;
    private int zzb;
    private zzsf zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzvp zzh;
    private zzvn zzi;
    private int zzj;
    private zzvl zzk;

    static {
        zzsh zzshVar = new zzsh();
        zzl = zzshVar;
        zzyd.g(zzsh.class, zzshVar);
    }

    private zzsh() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007᠌\u0006\bဉ\u0007", new Object[]{"zzb", "zzd", "zze", uxf.D, "zzf", "zzg", "zzh", "zzi", "zzj", mx9.o, "zzk"});
        }
        if (i2 == 3) {
            return new zzsh();
        }
        if (i2 == 4) {
            return new zzsg(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }
}
