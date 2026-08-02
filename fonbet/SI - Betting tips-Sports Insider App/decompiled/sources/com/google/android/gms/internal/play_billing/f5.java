package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f5 extends g3 {
    private static final f5 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        f5 f5Var = new f5();
        zzb = f5Var;
        g3.k(f5.class, f5Var);
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new c4(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", s2.f5578h, "zzf"});
        }
        if (i10 == 3) {
            return new f5();
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
