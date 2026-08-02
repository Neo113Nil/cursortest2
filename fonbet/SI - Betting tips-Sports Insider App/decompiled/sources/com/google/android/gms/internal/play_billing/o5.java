package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o5 extends g3 {
    private static final o5 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        o5 o5Var = new o5();
        zzb = o5Var;
        g3.k(o5.class, o5Var);
    }

    public static /* synthetic */ void n(o5 o5Var) {
        o5Var.zzd |= 2;
        o5Var.zzf = true;
    }

    public static n5 o() {
        return (n5) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new o5();
        }
        if (i10 == 4) {
            return new n5(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
