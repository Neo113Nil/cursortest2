package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e3 extends g5 {
    private static final e3 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private o2 zzf;

    static {
        e3 e3Var = new e3();
        zzg = e3Var;
        g5.m(e3.class, e3Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new e3();
        }
        if (i10 == 4) {
            return new q1(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }
}
