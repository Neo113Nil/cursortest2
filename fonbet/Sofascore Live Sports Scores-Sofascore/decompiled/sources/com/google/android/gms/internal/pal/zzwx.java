package com.google.android.gms.internal.pal;

import defpackage.ccn;
import defpackage.fcn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public final class zzwx extends zzacz implements zzaeg {
    public static final /* synthetic */ int a = 0;
    private static final zzwx zzb;
    private String zze = "";
    private zzadf zzf = ccn.d;

    static {
        zzwx zzwxVar = new zzwx();
        zzb = zzwxVar;
        zzacz.e(zzwx.class, zzwxVar);
    }

    private zzwx() {
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fcn(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzvw.class});
        }
        if (i2 == 3) {
            return new zzwx();
        }
        if (i2 == 4) {
            return new zzww(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
