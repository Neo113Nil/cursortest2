package com.google.android.gms.internal.pal;

import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvj extends zzacz implements zzaeg {
    private static final zzvj zzb;
    private int zze;
    private zzvd zzf;
    private zzaby zzg = zzaby.b;

    static {
        zzvj zzvjVar = new zzvj();
        zzb = zzvjVar;
        zzacz.e(zzvj.class, zzvjVar);
    }

    private zzvj() {
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzvj();
        }
        if (i2 == 4) {
            return new zzvi(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
