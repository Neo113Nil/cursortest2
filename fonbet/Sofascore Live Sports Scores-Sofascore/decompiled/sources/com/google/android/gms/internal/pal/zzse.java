package com.google.android.gms.internal.pal;

import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzse extends zzacz implements zzaeg {
    private static final zzse zzb;
    private zzsh zze;
    private int zzf;

    static {
        zzse zzseVar = new zzse();
        zzb = zzseVar;
        zzacz.e(zzse.class, zzseVar);
    }

    private zzse() {
    }

    public static zzsd j() {
        return (zzsd) zzb.f();
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzse();
        }
        if (i2 == 4) {
            return new zzsd(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
