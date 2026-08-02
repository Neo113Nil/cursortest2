package com.google.android.gms.internal.pal;

import defpackage.fcn;
import defpackage.r7n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzuf extends zzacz implements zzaeg {
    private static final zzuf zzb;
    private int zze;
    private zztz zzf;
    private zzaby zzg;
    private zzaby zzh;

    static {
        zzuf zzufVar = new zzuf();
        zzb = zzufVar;
        zzacz.e(zzuf.class, zzufVar);
    }

    private zzuf() {
        r7n r7nVar = zzaby.b;
        this.zzg = r7nVar;
        this.zzh = r7nVar;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzuf();
        }
        if (i2 == 4) {
            return new zzue(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
