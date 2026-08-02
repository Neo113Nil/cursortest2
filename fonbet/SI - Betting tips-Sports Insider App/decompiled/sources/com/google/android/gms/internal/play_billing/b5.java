package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b5 extends g3 {
    private static final b5 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        b5 b5Var = new b5();
        zzb = b5Var;
        g3.k(b5.class, b5Var);
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new b5();
        }
        if (i10 == 4) {
            return new v4(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
