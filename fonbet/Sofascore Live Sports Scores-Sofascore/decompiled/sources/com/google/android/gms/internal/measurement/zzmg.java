package com.google.android.gms.internal.measurement;

import defpackage.a9n;
import defpackage.ldn;
import defpackage.ndn;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzmg extends zzadu implements zzafd {
    private static final zzmg zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private String zze = "";
    private zzacr zzf = zzacr.b;
    private String zzg = "";
    private zzaef zzh;
    private zzaef zzi;
    private boolean zzj;
    private long zzk;

    static {
        zzmg zzmgVar = new zzmg();
        zzl = zzmgVar;
        zzadu.t(zzmg.class, zzmgVar);
    }

    private zzmg() {
        ldn ldnVar = ldn.e;
        this.zzh = ldnVar;
        this.zzi = ldnVar;
    }

    public static zzmf E() {
        return (zzmf) zzl.p();
    }

    public final zzacr A() {
        return this.zzf;
    }

    public final String B() {
        return this.zzg;
    }

    public final zzaef C() {
        return this.zzh;
    }

    public final long D() {
        return this.zzk;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(a9n a9nVar) {
        a9nVar.getClass();
        this.zzb |= 2;
        this.zzf = a9nVar;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void I(zzmi zzmiVar) {
        zzaef zzaefVar = this.zzh;
        if (!zzaefVar.zza()) {
            this.zzh = x5n.k(zzaefVar);
        }
        this.zzh.add(zzmiVar);
    }

    public final void J(String str) {
        str.getClass();
        zzaef zzaefVar = this.zzi;
        if (!zzaefVar.zza()) {
            this.zzi = x5n.k(zzaefVar);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void K(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    public final /* synthetic */ void L(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", zzmi.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzmg();
        }
        if (i2 == 4) {
            return new zzmf(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzm;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzmg.class) {
            try {
                zzafjVar = zzm;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzl);
                    zzm = zzafjVar;
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

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
