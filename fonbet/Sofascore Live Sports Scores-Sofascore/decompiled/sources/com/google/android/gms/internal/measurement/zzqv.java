package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqv extends zzadu implements zzafd {
    private static final zzqv zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private zzacr zzf = zzacr.b;
    private String zzg = "";
    private zzaef zzi = ldn.e;

    static {
        zzqv zzqvVar = new zzqv();
        zzj = zzqvVar;
        zzadu.t(zzqv.class, zzqvVar);
    }

    private zzqv() {
    }

    public static zzqu E() {
        return (zzqu) zzj.p();
    }

    public static zzqv F() {
        return zzj;
    }

    public final String A() {
        return this.zzg;
    }

    public final long B() {
        return this.zzh;
    }

    public final zzaef C() {
        return this.zzi;
    }

    public final int D() {
        return this.zzi.size();
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void H(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zzb |= 2;
        this.zzf = zzacrVar;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final void K(zzqx zzqxVar) {
        zzaef zzaefVar = this.zzi;
        if (!zzaefVar.zza()) {
            this.zzi = x5n.k(zzaefVar);
        }
        this.zzi.add(zzqxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzqx.class});
        }
        if (i2 == 3) {
            return new zzqv();
        }
        if (i2 == 4) {
            return new zzqu(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzk;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzqv.class) {
            try {
                zzafjVar = zzk;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzj);
                    zzk = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final String y() {
        return this.zze;
    }

    public final zzacr z() {
        return this.zzf;
    }
}
