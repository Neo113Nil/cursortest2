package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a5 extends g3 {
    private static final a5 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        a5 a5Var = new a5();
        zzb = a5Var;
        g3.k(a5.class, a5Var);
    }

    public static /* synthetic */ void n(a5 a5Var, int i5) {
        a5Var.zzd |= 4;
        a5Var.zzg = i5;
    }

    public static /* synthetic */ void o(a5 a5Var, long j) {
        a5Var.zzd |= 8;
        a5Var.zzh = j;
    }

    public static /* synthetic */ void p(a5 a5Var, String str) {
        str.getClass();
        a5Var.zzd |= 2;
        a5Var.zzf = str;
    }

    public static /* synthetic */ void q(a5 a5Var, String str) {
        str.getClass();
        a5Var.zzd |= 1;
        a5Var.zze = str;
    }

    public static z4 r() {
        return (z4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new a5();
        }
        if (i10 == 4) {
            return new z4(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
