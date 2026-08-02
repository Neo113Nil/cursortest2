package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s4 extends g3 {
    private static final s4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        s4 s4Var = new s4();
        zzb = s4Var;
        g3.k(s4.class, s4Var);
    }

    public static /* synthetic */ void n(s4 s4Var, e5 e5Var) {
        s4Var.zzf = e5Var;
        s4Var.zze = 2;
    }

    public static /* synthetic */ void o(s4 s4Var, o5 o5Var) {
        s4Var.zzf = o5Var;
        s4Var.zze = 3;
    }

    public static /* synthetic */ void p(s4 s4Var, int i5) {
        s4Var.zzg = i5 - 1;
        s4Var.zzd |= 1;
    }

    public static r4 q() {
        return (r4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", s2.f5573c, e5.class, o5.class, g5.class});
        }
        if (i10 == 3) {
            return new s4();
        }
        if (i10 == 4) {
            return new r4(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
