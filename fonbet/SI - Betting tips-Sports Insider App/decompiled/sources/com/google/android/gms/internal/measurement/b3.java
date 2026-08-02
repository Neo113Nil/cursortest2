package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b3 extends g5 {
    private static final b3 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        b3 b3Var = new b3();
        zzf = b3Var;
        g5.m(b3.class, b3Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i10 == 3) {
            return new b3();
        }
        if (i10 == 4) {
            return new q1(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }
}
