package com.google.android.gms.internal.pal;

import defpackage.ccn;
import defpackage.chn;
import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzau extends zzacz implements zzaeg {
    private static final zzau zzb;
    private int zze;
    private zzadf zzf = ccn.d;
    private zzaby zzg = zzaby.b;
    private int zzh = 1;
    private int zzi = 1;

    static {
        zzau zzauVar = new zzau();
        zzb = zzauVar;
        zzacz.e(zzau.class, zzauVar);
    }

    private zzau() {
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", chn.d, "zzi", chn.b});
        }
        if (i2 == 3) {
            return new zzau();
        }
        if (i2 == 4) {
            return new zzat(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
