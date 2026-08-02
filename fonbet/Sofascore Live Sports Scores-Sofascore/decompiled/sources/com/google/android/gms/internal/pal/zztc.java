package com.google.android.gms.internal.pal;

import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztc extends zzacz implements zzaeg {
    private static final zztc zzb;
    private int zze;
    private int zzf;

    static {
        zztc zztcVar = new zztc();
        zzb = zztcVar;
        zzacz.e(zztc.class, zztcVar);
    }

    private zztc() {
    }

    public static zztb j() {
        return (zztb) zzb.f();
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        if (i2 == 3) {
            return new zztc();
        }
        if (i2 == 4) {
            return new zztb(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
