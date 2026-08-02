package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e5 extends g3 {
    private static final e5 zzb;
    private int zzd;
    private int zze;

    static {
        e5 e5Var = new e5();
        zzb = e5Var;
        g3.k(e5.class, e5Var);
    }

    public static /* synthetic */ void n(e5 e5Var, int i5) {
        e5Var.zze = i5 - 1;
        e5Var.zzd |= 1;
    }

    public static c5 o() {
        return (c5) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", s2.f5577g});
        }
        if (i10 == 3) {
            return new e5();
        }
        if (i10 == 4) {
            return new c5(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
