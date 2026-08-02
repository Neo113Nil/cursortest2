package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i5 extends g3 {
    private static final i5 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private a5 zzg;
    private b5 zzh;

    static {
        i5 i5Var = new i5();
        zzb = i5Var;
        g3.k(i5.class, i5Var);
    }

    public static /* synthetic */ void n(i5 i5Var, q4 q4Var) {
        i5Var.zzf = q4Var;
        i5Var.zze = 2;
    }

    public static /* synthetic */ void o(i5 i5Var, s4 s4Var) {
        i5Var.zzf = s4Var;
        i5Var.zze = 3;
    }

    public static /* synthetic */ void p(i5 i5Var, w4 w4Var) {
        w4Var.getClass();
        i5Var.zzf = w4Var;
        i5Var.zze = 7;
    }

    public static /* synthetic */ void q(i5 i5Var, a5 a5Var) {
        a5Var.getClass();
        i5Var.zzg = a5Var;
        i5Var.zzd |= 1;
    }

    public static /* synthetic */ void r(i5 i5Var, l5 l5Var) {
        i5Var.zzf = l5Var;
        i5Var.zze = 8;
    }

    public static /* synthetic */ void s(i5 i5Var, m5 m5Var) {
        i5Var.zzf = m5Var;
        i5Var.zze = 4;
    }

    public static h5 t() {
        return (h5) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", q4.class, s4.class, m5.class, y4.class, "zzh", w4.class, l5.class});
        }
        if (i10 == 3) {
            return new i5();
        }
        if (i10 == 4) {
            return new h5(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
