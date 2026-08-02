package com.google.android.gms.internal.play_billing;

import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjf extends zzgp implements zzhs {
    private static final zzjf zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzjf zzjfVar = new zzjf();
        zzb = zzjfVar;
        zzgp.e(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    public static zzjd p() {
        return (zzjd) zzb.j();
    }

    public static zzjf q() {
        return zzb;
    }

    public static /* synthetic */ void r(zzjf zzjfVar, String str) {
        str.getClass();
        zzjfVar.zzd = 3;
        zzjfVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"zze", "zzd", zzim.class, zzhi.class});
        }
        if (i2 == 3) {
            return new zzjf();
        }
        if (i2 == 4) {
            return new zzjd(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
