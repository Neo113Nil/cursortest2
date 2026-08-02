package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l5 extends g3 {
    private static final l5 zzb;
    private int zzd;
    private u4 zze;

    static {
        l5 l5Var = new l5();
        zzb = l5Var;
        g3.k(l5.class, l5Var);
    }

    public static /* synthetic */ void n(l5 l5Var, u4 u4Var) {
        l5Var.zze = u4Var;
        l5Var.zzd |= 1;
    }

    public static k5 o() {
        return (k5) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new l5();
        }
        if (i10 == 4) {
            return new k5(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
