package com.google.android.gms.internal.pal;

import defpackage.fcn;
import defpackage.v9n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzah extends zzacz implements zzaeg {
    private static final zzah zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private zzade zzi = v9n.d;
    private long zzj;

    static {
        zzah zzahVar = new zzah();
        zzb = zzahVar;
        zzacz.e(zzah.class, zzahVar);
    }

    private zzah() {
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzah();
        }
        if (i2 == 4) {
            return new zzag(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
