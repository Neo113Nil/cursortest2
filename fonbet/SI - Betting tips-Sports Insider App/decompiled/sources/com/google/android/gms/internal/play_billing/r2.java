package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r2 extends g3 {
    private static final r2 zzb;
    private int zzd;
    private String zze = "";

    static {
        r2 r2Var = new r2();
        zzb = r2Var;
        g3.k(r2.class, r2Var);
    }

    public static q2 n() {
        return (q2) zzb.f();
    }

    public static /* synthetic */ void o(r2 r2Var, String str) {
        r2Var.zzd |= 1;
        r2Var.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new r2();
        }
        if (i10 == 4) {
            return new q2(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
