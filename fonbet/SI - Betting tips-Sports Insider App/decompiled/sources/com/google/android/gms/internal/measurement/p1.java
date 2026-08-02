package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p1 extends g5 {
    private static final p1 zzh;
    private int zzb;
    private v1 zzd;
    private s1 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        p1 p1Var = new p1();
        zzh = p1Var;
        g5.m(p1.class, p1Var);
    }

    public static p1 x() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new p1();
        }
        if (i10 == 4) {
            return new o1(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final v1 q() {
        v1 v1Var = this.zzd;
        return v1Var == null ? v1.w() : v1Var;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final s1 s() {
        s1 s1Var = this.zze;
        return s1Var == null ? s1.y() : s1Var;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final String w() {
        return this.zzg;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
