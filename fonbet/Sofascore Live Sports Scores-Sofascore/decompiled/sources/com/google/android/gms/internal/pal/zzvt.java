package com.google.android.gms.internal.pal;

import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvt extends zzacz implements zzaeg {
    private static final zzvt zzb;
    private String zze = "";
    private zzaby zzf = zzaby.b;
    private int zzg;

    static {
        zzvt zzvtVar = new zzvt();
        zzb = zzvtVar;
        zzacz.e(zzvt.class, zzvtVar);
    }

    private zzvt() {
    }

    public static zzvs j() {
        return (zzvs) zzb.f();
    }

    public static /* synthetic */ void p(zzvt zzvtVar, String str) {
        str.getClass();
        zzvtVar.zze = str;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzvt();
        }
        if (i2 == 4) {
            return new zzvs(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaby m() {
        return this.zzf;
    }

    public final String o() {
        return this.zze;
    }

    public final int r() {
        int i = this.zzg;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
