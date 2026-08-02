package com.google.android.gms.internal.pal;

import defpackage.ccn;
import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzwb extends zzacz implements zzaeg {
    private static final zzwb zzb;
    private int zze;
    private zzadf zzf = ccn.d;

    static {
        zzwb zzwbVar = new zzwb();
        zzb = zzwbVar;
        zzacz.e(zzwb.class, zzwbVar);
    }

    private zzwb() {
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzwa.class});
        }
        if (i2 == 3) {
            return new zzwb();
        }
        if (i2 == 4) {
            return new zzvy(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int j() {
        return this.zze;
    }

    public final zzadf m() {
        return this.zzf;
    }
}
