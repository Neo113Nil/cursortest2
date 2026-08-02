package com.google.android.gms.internal.pal;

import defpackage.chn;
import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzy extends zzacz implements zzaeg {
    private static final zzy zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        zzy zzyVar = new zzy();
        zzb = zzyVar;
        zzacz.e(zzy.class, zzyVar);
    }

    private zzy() {
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", chn.h, "zzg"});
        }
        if (i2 == 3) {
            return new zzy();
        }
        if (i2 == 4) {
            return new zzx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
