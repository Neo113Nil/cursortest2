package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a2 extends g5 {
    private static final a2 zzg;
    private int zzb;
    private String zzd = "";
    private m5 zze = f6.f5043e;
    private boolean zzf;

    static {
        a2 a2Var = new a2();
        zzg = a2Var;
        g5.m(a2.class, a2Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", h2.class, "zzf"});
        }
        if (i10 == 3) {
            return new a2();
        }
        if (i10 == 4) {
            return new q1(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
}
