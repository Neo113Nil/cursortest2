package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u4 extends g3 {
    private static final u4 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        u4 u4Var = new u4();
        zzb = u4Var;
        g3.k(u4.class, u4Var);
    }

    public static /* synthetic */ void n(u4 u4Var, String str) {
        u4Var.zzd |= 8;
        u4Var.zzh = str;
    }

    public static /* synthetic */ void o(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzd |= 2;
        u4Var.zzf = str;
    }

    public static /* synthetic */ void p(u4 u4Var, int i5) {
        u4Var.zzd |= 1;
        u4Var.zze = i5;
    }

    public static /* synthetic */ void q(u4 u4Var, int i5) {
        u4Var.zzg = i5 - 1;
        u4Var.zzd |= 4;
    }

    public static t4 r() {
        return (t4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", s2.f5574d, "zzh"});
        }
        if (i10 == 3) {
            return new u4();
        }
        if (i10 == 4) {
            return new t4(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
