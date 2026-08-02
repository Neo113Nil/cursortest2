package com.google.android.gms.internal.play_billing;

import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzed extends zzgp implements zzhs {
    private static final zzed zzb;
    private int zzd;
    private String zze = "";

    static {
        zzed zzedVar = new zzed();
        zzb = zzedVar;
        zzgp.e(zzed.class, zzedVar);
    }

    private zzed() {
    }

    public static zzed p(byte[] bArr) {
        return (zzed) zzgp.m(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzed();
        }
        if (i2 == 4) {
            return new zzeb(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String q() {
        return this.zze;
    }
}
