package com.google.android.gms.internal.pal;

import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzxd extends zzacz implements zzaeg {
    private static final zzxd zzb;
    private int zze;

    static {
        zzxd zzxdVar = new zzxd();
        zzb = zzxdVar;
        zzacz.e(zzxd.class, zzxdVar);
    }

    private zzxd() {
    }

    public static zzxd l() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzxd();
        }
        if (i2 == 4) {
            return new zzxc(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
