package com.google.android.gms.internal.cast;

import defpackage.tnf;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvg extends zzyd implements zzzj {
    private static final zzvg zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private zzpy zzf;

    static {
        zzvg zzvgVar = new zzvg();
        zzg = zzvgVar;
        zzyd.g(zzvg.class, zzvgVar);
    }

    private zzvg() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", tnf.o, "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzvg();
        }
        if (i2 == 4) {
            return new zzvf(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
