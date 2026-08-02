package com.google.android.gms.internal.cast;

import defpackage.wfp;
import defpackage.zfp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqk extends zzyd implements zzzj {
    private static final zzqk zzd;
    private zzyl zzb = wfp.e;

    static {
        zzqk zzqkVar = new zzqk();
        zzd = zzqkVar;
        zzyd.g(zzqk.class, zzqkVar);
    }

    private zzqk() {
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new zzqk();
        }
        if (i2 == 4) {
            return new zzqj(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
