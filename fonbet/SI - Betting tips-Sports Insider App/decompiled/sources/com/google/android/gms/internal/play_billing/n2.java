package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n2 extends g3 {
    private static final n2 zzb;
    private int zzd;
    private r2 zze;
    private r2 zzf;
    private int zzg;

    static {
        n2 n2Var = new n2();
        zzb = n2Var;
        g3.k(n2.class, n2Var);
    }

    public static m2 n() {
        return (m2) zzb.f();
    }

    public static /* synthetic */ void o(n2 n2Var, r2 r2Var) {
        n2Var.zze = r2Var;
        n2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", s2.f5572b});
        }
        if (i10 == 3) {
            return new n2();
        }
        if (i10 == 4) {
            return new m2(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
