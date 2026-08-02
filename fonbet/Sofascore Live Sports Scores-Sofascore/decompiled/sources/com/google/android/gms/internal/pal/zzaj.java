package com.google.android.gms.internal.pal;

import defpackage.fcn;
import defpackage.r7n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaj extends zzacz implements zzaeg {
    private static final zzaj zzb;
    private int zze;
    private zzaby zzf;
    private zzaby zzg;

    static {
        zzaj zzajVar = new zzaj();
        zzb = zzajVar;
        zzacz.e(zzaj.class, zzajVar);
    }

    private zzaj() {
        r7n r7nVar = zzaby.b;
        this.zzf = r7nVar;
        this.zzg = r7nVar;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaj();
        }
        if (i2 == 4) {
            return new zzai(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
