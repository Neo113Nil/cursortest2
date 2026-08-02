package com.google.android.gms.internal.play_billing;

import defpackage.loo;
import defpackage.p6o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzju extends zzgp implements zzhs {
    private static final zzju zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        zzju zzjuVar = new zzju();
        zzb = zzjuVar;
        zzgp.e(zzju.class, zzjuVar);
    }

    private zzju() {
    }

    public static /* synthetic */ void p(zzju zzjuVar, int i) {
        zzjuVar.zzd |= 1;
        zzjuVar.zze = i;
    }

    public static zzjq q() {
        return (zzjq) zzb.j();
    }

    public static /* synthetic */ void r(zzju zzjuVar, String str) {
        zzjuVar.zzd |= 8;
        zzjuVar.zzh = str;
    }

    public static /* synthetic */ void s(zzju zzjuVar, String str) {
        str.getClass();
        zzjuVar.zzd |= 2;
        zzjuVar.zzf = str;
    }

    public static /* synthetic */ void t(zzju zzjuVar, int i) {
        zzjuVar.zzd |= 32;
        zzjuVar.zzj = i;
    }

    public static /* synthetic */ void u(zzju zzjuVar, int i) {
        zzjuVar.zzd |= 16;
        zzjuVar.zzi = i;
    }

    public static void v(zzju zzjuVar, zzjs zzjsVar) {
        zzjuVar.zzg = zzjsVar.a;
        zzjuVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", p6o.d, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzju();
        }
        if (i2 == 4) {
            return new zzjq(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
