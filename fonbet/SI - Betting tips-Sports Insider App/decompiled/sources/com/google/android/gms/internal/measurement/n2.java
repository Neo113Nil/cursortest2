package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n2 extends g5 {
    private static final n2 zzn;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private w5 zzl;
    private w5 zzm;

    static {
        n2 n2Var = new n2();
        zzn = n2Var;
        g5.m(n2.class, n2Var);
    }

    public n2() {
        w5 w5Var = w5.f5337b;
        this.zzl = w5Var;
        this.zzm = w5Var;
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    public static k2 O() {
        return (k2) zzn.h();
    }

    public static n2 P() {
        return zzn;
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final String B() {
        return this.zze;
    }

    public final boolean C() {
        return (this.zzb & 4) != 0;
    }

    public final String D() {
        return this.zzf;
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final long F() {
        return this.zzg;
    }

    public final boolean G() {
        return (this.zzb & 16) != 0;
    }

    public final String H() {
        return this.zzh;
    }

    public final boolean I() {
        return (this.zzb & 32) != 0;
    }

    public final String J() {
        return this.zzi;
    }

    public final boolean K() {
        return (this.zzb & 64) != 0;
    }

    public final String L() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zzb & 128) != 0;
    }

    public final long N() {
        return this.zzk;
    }

    public final /* synthetic */ void Q(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void R() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    public final /* synthetic */ void S(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void T() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    public final /* synthetic */ void U(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void V() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    public final /* synthetic */ void W(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", l2.f5116a, "zzm", m2.f5138a});
        }
        if (i10 == 3) {
            return new n2();
        }
        if (i10 == 4) {
            return new k2(zzn);
        }
        if (i10 == 5) {
            return zzn;
        }
        throw null;
    }

    public final /* synthetic */ void p(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void q() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    public final /* synthetic */ void r(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void s() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    public final /* synthetic */ void t(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void u() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 128;
        this.zzk = j;
    }

    public final w5 w() {
        w5 w5Var = this.zzl;
        if (!w5Var.f5338a) {
            this.zzl = w5Var.a();
        }
        return this.zzl;
    }

    public final w5 x() {
        w5 w5Var = this.zzm;
        if (!w5Var.f5338a) {
            this.zzm = w5Var.a();
        }
        return this.zzm;
    }

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final String z() {
        return this.zzd;
    }
}
