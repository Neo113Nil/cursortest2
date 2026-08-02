package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import defpackage.tan;
import defpackage.x5n;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgl extends zzadu implements zzafd {
    private static final zzgl zzw;
    private static volatile zzafj zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private zzaef zzh;
    private zzaef zzi;
    private zzaef zzj;
    private String zzk;
    private boolean zzl;
    private zzaef zzm;
    private zzaef zzn;
    private String zzo;
    private String zzp;
    private zzgf zzq;
    private zzgp zzr;
    private zzgv zzs;
    private zzgr zzt;
    private zzgn zzu;
    private zzaeb zzv;

    static {
        zzgl zzglVar = new zzgl();
        zzw = zzglVar;
        zzadu.t(zzgl.class, zzglVar);
    }

    private zzgl() {
        ldn ldnVar = ldn.e;
        this.zzh = ldnVar;
        this.zzi = ldnVar;
        this.zzj = ldnVar;
        this.zzk = "";
        this.zzm = ldnVar;
        this.zzn = ldnVar;
        this.zzo = "";
        this.zzp = "";
        this.zzv = tan.e;
    }

    public static zzgk P() {
        return (zzgk) zzw.p();
    }

    public static zzgl Q() {
        return zzw;
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final String B() {
        return this.zzf;
    }

    public final zzaef C() {
        return this.zzh;
    }

    public final int D() {
        return this.zzi.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzgj E(int i) {
        return (zzgj) this.zzi.get(i);
    }

    public final List F() {
        return this.zzj;
    }

    public final zzaef G() {
        return this.zzm;
    }

    public final int H() {
        return this.zzm.size();
    }

    public final zzaef I() {
        return this.zzn;
    }

    public final String J() {
        return this.zzo;
    }

    public final boolean K() {
        return (this.zzb & 128) != 0;
    }

    public final zzgf L() {
        zzgf zzgfVar = this.zzq;
        return zzgfVar == null ? zzgf.E() : zzgfVar;
    }

    public final boolean M() {
        return (this.zzb & 512) != 0;
    }

    public final zzgv N() {
        zzgv zzgvVar = this.zzs;
        return zzgvVar == null ? zzgv.A() : zzgvVar;
    }

    public final zzaeb O() {
        return this.zzv;
    }

    public final void R(int i, zzgj zzgjVar) {
        zzaef zzaefVar = this.zzi;
        if (!zzaefVar.zza()) {
            this.zzi = x5n.k(zzaefVar);
        }
        this.zzi.set(i, zzgjVar);
    }

    public final void S() {
        this.zzj = ldn.e;
    }

    public final void T() {
        this.zzm = ldn.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzgt.class, "zzi", zzgj.class, "zzj", zzfd.class, "zzk", "zzl", "zzm", zzja.class, "zzn", zzgh.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new zzgl();
        }
        if (i2 == 4) {
            return new zzgk(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzx;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzgl.class) {
            try {
                zzafjVar = zzx;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzw);
                    zzx = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final long z() {
        return this.zze;
    }
}
