package com.google.android.gms.internal.cast;

import defpackage.uxf;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzui extends zzyd implements zzzj {
    private static final zzui zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        zzui zzuiVar = new zzui();
        zzf = zzuiVar;
        zzyd.g(zzui.class, zzuiVar);
    }

    private zzui() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            uxf uxfVar = uxf.B;
            return new zfp(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", uxfVar, "zze", uxfVar});
        }
        if (i2 == 3) {
            return new zzui();
        }
        if (i2 == 4) {
            return new zzuh(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
