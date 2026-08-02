package com.google.android.gms.internal.pal;

import defpackage.a70;
import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzuv extends zzacz implements zzaeg {
    private static final zzuv zzb;
    private int zze;
    private int zzf;

    static {
        zzuv zzuvVar = new zzuv();
        zzb = zzuvVar;
        zzacz.e(zzuv.class, zzuvVar);
    }

    private zzuv() {
    }

    public static zzuu j() {
        return (zzuu) zzb.f();
    }

    public static void o(zzuv zzuvVar, int i) {
        if (i != 1) {
            zzuvVar.zze = i - 2;
        } else {
            a70.p("Can't get the number of an unknown enum value.");
        }
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzuv();
        }
        if (i2 == 4) {
            return new zzuu(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
