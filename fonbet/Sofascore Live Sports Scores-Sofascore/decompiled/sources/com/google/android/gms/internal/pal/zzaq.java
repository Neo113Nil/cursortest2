package com.google.android.gms.internal.pal;

import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaq extends zzacz implements zzaeg {
    private static final zzaq zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private zzaby zzh = zzaby.b;

    static {
        zzaq zzaqVar = new zzaq();
        zzb = zzaqVar;
        zzacz.e(zzaq.class, zzaqVar);
    }

    private zzaq() {
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzaq();
        }
        if (i2 == 4) {
            return new zzap(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
