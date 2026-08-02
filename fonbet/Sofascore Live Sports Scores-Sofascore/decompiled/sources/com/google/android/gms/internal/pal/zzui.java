package com.google.android.gms.internal.pal;

import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzui extends zzacz implements zzaeg {
    private static final zzui zzb;
    private int zze;
    private int zzf;
    private zzaby zzg = zzaby.b;

    static {
        zzui zzuiVar = new zzui();
        zzb = zzuiVar;
        zzacz.e(zzui.class, zzuiVar);
    }

    private zzui() {
    }

    public static zzuh j() {
        return (zzuh) zzb.f();
    }

    public static void o(zzui zzuiVar) {
        zzuiVar.zze = 2;
    }

    public static void p(zzui zzuiVar) {
        zzuiVar.zzf = 3;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzui();
        }
        if (i2 == 4) {
            return new zzuh(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
