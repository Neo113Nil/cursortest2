package com.google.android.gms.internal.cast;

import defpackage.f8h;
import defpackage.rik;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrj extends zzyd implements zzzj {
    private static final zzrj zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        zzrj zzrjVar = new zzrj();
        zzf = zzrjVar;
        zzyd.g(zzrj.class, zzrjVar);
    }

    private zzrj() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", rik.l, "zze", f8h.m});
        }
        if (i2 == 3) {
            return new zzrj();
        }
        if (i2 == 4) {
            return new zzri(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
