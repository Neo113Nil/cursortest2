package com.google.android.gms.internal.pal;

import defpackage.a70;
import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztz extends zzacz implements zzaeg {
    private static final zztz zzb;
    private zzui zze;
    private zztt zzf;
    private int zzg;

    static {
        zztz zztzVar = new zztz();
        zzb = zztzVar;
        zzacz.e(zztz.class, zztzVar);
    }

    private zztz() {
    }

    public static zzty j() {
        return (zzty) zzb.f();
    }

    public static void p(zztz zztzVar, int i) {
        if (i != 1) {
            zztzVar.zzg = i - 2;
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
            return new fcn(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zztz();
        }
        if (i2 == 4) {
            return new zzty(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
