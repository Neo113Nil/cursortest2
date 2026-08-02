package com.google.android.gms.internal.play_billing;

import defpackage.loo;
import defpackage.p6o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjp extends zzgp implements zzhs {
    private static final zzjp zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        zzjp zzjpVar = new zzjp();
        zzb = zzjpVar;
        zzgp.e(zzjp.class, zzjpVar);
    }

    private zzjp() {
    }

    public static /* synthetic */ void p(zzjp zzjpVar, int i) {
        zzjpVar.zzg = i - 1;
        zzjpVar.zzd |= 1;
    }

    public static zzjn q() {
        return (zzjn) zzb.j();
    }

    public static void s(zzjp zzjpVar, zzjz zzjzVar) {
        zzjpVar.zzh = zzjzVar.a;
        zzjpVar.zzd |= 2;
    }

    public static /* synthetic */ void t(zzjp zzjpVar, zzkn zzknVar) {
        zzjpVar.zzf = zzknVar;
        zzjpVar.zze = 2;
    }

    public static /* synthetic */ void u(zzjp zzjpVar, zzkt zzktVar) {
        zzjpVar.zzf = zzktVar;
        zzjpVar.zze = 4;
    }

    public static /* synthetic */ void v(zzjp zzjpVar, zzln zzlnVar) {
        zzjpVar.zzf = zzlnVar;
        zzjpVar.zze = 3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", p6o.c, zzkn.class, zzln.class, zzkt.class, "zzh", p6o.e});
        }
        if (i2 == 3) {
            return new zzjp();
        }
        if (i2 == 4) {
            return new zzjn(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzkt r() {
        return this.zze == 4 ? (zzkt) this.zzf : zzkt.p();
    }
}
