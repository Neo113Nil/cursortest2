package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e2 extends g5 {
    private static final e2 zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private m5 zzg;
    private m5 zzh;
    private m5 zzi;
    private String zzj;
    private boolean zzk;
    private m5 zzl;
    private m5 zzm;
    private String zzn;
    private String zzo;
    private z1 zzp;
    private g2 zzq;
    private j2 zzr;
    private h2 zzs;
    private f2 zzt;

    static {
        e2 e2Var = new e2();
        zzu = e2Var;
        g5.m(e2.class, e2Var);
    }

    public e2() {
        f6 f6Var = f6.f5043e;
        this.zzg = f6Var;
        this.zzh = f6Var;
        this.zzi = f6Var;
        this.zzj = "";
        this.zzl = f6Var;
        this.zzm = f6Var;
        this.zzn = "";
        this.zzo = "";
    }

    public static d2 F() {
        return (d2) zzu.h();
    }

    public static e2 G() {
        return zzu;
    }

    public final String A() {
        return this.zzn;
    }

    public final boolean B() {
        return (this.zzb & 128) != 0;
    }

    public final z1 C() {
        z1 z1Var = this.zzp;
        return z1Var == null ? z1.v() : z1Var;
    }

    public final boolean D() {
        return (this.zzb & 512) != 0;
    }

    public final j2 E() {
        j2 j2Var = this.zzr;
        return j2Var == null ? j2.r() : j2Var;
    }

    public final void H(int i5, c2 c2Var) {
        m5 m5Var = this.zzh;
        if (!((r4) m5Var).f5228a) {
            int size = m5Var.size();
            this.zzh = m5Var.i0(size + size);
        }
        this.zzh.set(i5, c2Var);
    }

    public final void I() {
        this.zzi = f6.f5043e;
    }

    public final void J() {
        this.zzl = f6.f5043e;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i5) {
        int i10 = i5 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new g6(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", i2.class, "zzh", c2.class, "zzi", l1.class, "zzj", "zzk", "zzl", u3.class, "zzm", a2.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i10 == 3) {
            return new e2();
        }
        if (i10 == 4) {
            return new d2(zzu);
        }
        if (i10 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final long q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final String s() {
        return this.zze;
    }

    public final m5 t() {
        return this.zzg;
    }

    public final int u() {
        return this.zzh.size();
    }

    public final c2 v(int i5) {
        return (c2) this.zzh.get(i5);
    }

    public final m5 w() {
        return this.zzi;
    }

    public final m5 x() {
        return this.zzl;
    }

    public final int y() {
        return this.zzl.size();
    }

    public final List z() {
        return this.zzm;
    }
}
