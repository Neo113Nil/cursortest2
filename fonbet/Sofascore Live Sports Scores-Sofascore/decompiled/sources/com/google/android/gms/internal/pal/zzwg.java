package com.google.android.gms.internal.pal;

import defpackage.ccn;
import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzwg extends zzacz implements zzaeg {
    private static final zzwg zzb;
    private int zze;
    private zzadf zzf = ccn.d;

    static {
        zzwg zzwgVar = new zzwg();
        zzb = zzwgVar;
        zzacz.e(zzwg.class, zzwgVar);
    }

    private zzwg() {
    }

    public static zzwd j() {
        return (zzwd) zzb.f();
    }

    public static void o(zzwg zzwgVar, zzwf zzwfVar) {
        zzadf zzadfVar = zzwgVar.zzf;
        if (!zzadfVar.zzc()) {
            int size = zzadfVar.size();
            zzwgVar.zzf = zzadfVar.i(size == 0 ? 10 : size + size);
        }
        zzwgVar.zzf.add(zzwfVar);
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzwf.class});
        }
        if (i2 == 3) {
            return new zzwg();
        }
        if (i2 == 4) {
            return new zzwd(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
