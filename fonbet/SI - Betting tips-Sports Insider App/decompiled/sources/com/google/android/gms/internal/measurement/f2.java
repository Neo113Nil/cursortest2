package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f2 extends g5 {
    private static final f2 zzd;
    private m5 zzb = f6.f5043e;

    static {
        f2 f2Var = new f2();
        zzd = f2Var;
        g5.m(f2.class, f2Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i10 == 3) {
            return new f2();
        }
        if (i10 == 4) {
            return new q1(zzd);
        }
        if (i10 == 5) {
            return zzd;
        }
        throw null;
    }
}
