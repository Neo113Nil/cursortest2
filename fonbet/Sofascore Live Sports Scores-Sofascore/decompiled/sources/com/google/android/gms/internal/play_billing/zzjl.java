package com.google.android.gms.internal.play_billing;

import defpackage.loo;
import defpackage.p6o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjl extends zzgp implements zzhs {
    private static final zzjl zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private zzju zzh;
    private int zzi;

    static {
        zzjl zzjlVar = new zzjl();
        zzb = zzjlVar;
        zzgp.e(zzjl.class, zzjlVar);
    }

    private zzjl() {
    }

    public static /* synthetic */ void p(zzjl zzjlVar, zzkt zzktVar) {
        zzjlVar.zzf = zzktVar;
        zzjlVar.zze = 7;
    }

    public static /* synthetic */ void q(zzjl zzjlVar, zzln zzlnVar) {
        zzjlVar.zzf = zzlnVar;
        zzjlVar.zze = 6;
    }

    public static /* synthetic */ void r(zzjl zzjlVar, int i) {
        zzjlVar.zzg = i - 1;
        zzjlVar.zzd |= 1;
    }

    public static zzjj s() {
        return (zzjj) zzb.j();
    }

    public static zzjl t(byte[] bArr) {
        return (zzjl) zzgp.m(zzb, bArr);
    }

    public static void v(zzjl zzjlVar, zzjz zzjzVar) {
        zzjlVar.zzi = zzjzVar.a;
        zzjlVar.zzd |= 4;
    }

    public static /* synthetic */ void w(zzjl zzjlVar, zzju zzjuVar) {
        zzjlVar.zzh = zzjuVar;
        zzjlVar.zzd |= 2;
    }

    public static /* synthetic */ void x(zzjl zzjlVar, zzkn zzknVar) {
        zzjlVar.zzf = zzknVar;
        zzjlVar.zze = 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new loo(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", p6o.c, "zzh", zzkn.class, "zzi", p6o.e, zzln.class, zzkt.class});
        }
        if (i2 == 3) {
            return new zzjl();
        }
        if (i2 == 4) {
            return new zzjj(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzkt u() {
        return this.zze == 7 ? (zzkt) this.zzf : zzkt.p();
    }
}
