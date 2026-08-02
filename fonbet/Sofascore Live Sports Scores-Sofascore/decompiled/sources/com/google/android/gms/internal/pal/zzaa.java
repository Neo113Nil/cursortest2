package com.google.android.gms.internal.pal;

import defpackage.chn;
import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaa extends zzacz implements zzaeg {
    private static final zzaa zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        zzaa zzaaVar = new zzaa();
        zzb = zzaaVar;
        zzacz.e(zzaa.class, zzaaVar);
    }

    private zzaa() {
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", chn.c});
        }
        if (i2 == 3) {
            return new zzaa();
        }
        if (i2 == 4) {
            return new zzz(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
