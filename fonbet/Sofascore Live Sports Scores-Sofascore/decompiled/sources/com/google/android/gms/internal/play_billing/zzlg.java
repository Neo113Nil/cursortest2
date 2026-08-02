package com.google.android.gms.internal.play_billing;

import defpackage.loo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlg extends zzgp implements zzhs {
    private static final zzlg zzb;
    private int zzd;
    private zzju zze;
    private long zzf;

    static {
        zzlg zzlgVar = new zzlg();
        zzb = zzlgVar;
        zzgp.e(zzlg.class, zzlgVar);
    }

    private zzlg() {
    }

    public static zzle p() {
        return (zzle) zzb.j();
    }

    public static /* synthetic */ void q(zzlg zzlgVar, zzju zzjuVar) {
        zzlgVar.zze = zzjuVar;
        zzlgVar.zzd |= 1;
    }

    public static /* synthetic */ void r(zzlg zzlgVar, long j) {
        zzlgVar.zzd |= 2;
        zzlgVar.zzf = j;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzlg();
        }
        if (i2 == 4) {
            return new zzle(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
