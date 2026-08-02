package com.google.android.gms.internal.cast;

import defpackage.f7a;
import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsf extends zzyd implements zzzj {
    private static final zzsf zzi;
    private int zzb;
    private Object zze;
    private int zzf;
    private int zzd = 0;
    private String zzg = "";
    private zzyl zzh = wfp.e;

    static {
        zzsf zzsfVar = new zzsf();
        zzi = zzsfVar;
        zzyd.g(zzsf.class, zzsfVar);
    }

    private zzsf() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzi, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001b\u0004<\u0000\u0005<\u0000", new Object[]{"zze", "zzd", "zzb", "zzf", f7a.t, "zzg", "zzh", zztd.class, zzvp.class, zzvn.class});
        }
        if (i2 == 3) {
            return new zzsf();
        }
        if (i2 == 4) {
            return new zzse(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
