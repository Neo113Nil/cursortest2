package com.google.android.gms.internal.pal;

import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztt extends zzacz implements zzaeg {
    private static final zztt zzb;
    private zzvt zze;

    static {
        zztt zzttVar = new zztt();
        zzb = zzttVar;
        zzacz.e(zztt.class, zzttVar);
    }

    private zztt() {
    }

    public static zzts j() {
        return (zzts) zzb.f();
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zztt();
        }
        if (i2 == 4) {
            return new zzts(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
