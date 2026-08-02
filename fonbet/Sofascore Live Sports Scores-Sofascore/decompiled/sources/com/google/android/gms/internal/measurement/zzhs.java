package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import defpackage.x5n;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhs extends zzadu implements zzafd {
    private static final zzhs zzm;
    private static volatile zzafj zzn;
    private int zzb;
    private zzaef zze = ldn.e;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        zzhs zzhsVar = new zzhs();
        zzm = zzhsVar;
        zzadu.t(zzhs.class, zzhsVar);
    }

    private zzhs() {
    }

    public static zzhr O() {
        return (zzhr) zzm.p();
    }

    public final List A() {
        return this.zze;
    }

    public final int B() {
        return this.zze.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhw C(int i) {
        return (zzhw) this.zze.get(i);
    }

    public final String D() {
        return this.zzf;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final long F() {
        return this.zzg;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final long H() {
        return this.zzh;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final int J() {
        return this.zzi;
    }

    public final boolean K() {
        return (this.zzb & 32) != 0;
    }

    public final long L() {
        return this.zzk;
    }

    public final boolean M() {
        return (this.zzb & 64) != 0;
    }

    public final long N() {
        return this.zzl;
    }

    public final /* synthetic */ void P(int i, zzhw zzhwVar) {
        z();
        this.zze.set(i, zzhwVar);
    }

    public final /* synthetic */ void Q(zzhw zzhwVar) {
        zzhwVar.getClass();
        z();
        this.zze.add(zzhwVar);
    }

    public final void R(Iterable iterable) {
        z();
        zzaca.j(iterable, this.zze);
    }

    public final void S() {
        this.zze = ldn.e;
    }

    public final /* synthetic */ void T(int i) {
        z();
        this.zze.remove(i);
    }

    public final /* synthetic */ void U(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void V(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void W(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void X(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void Y(long j) {
        this.zzb |= 32;
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
            return new ndn(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", zzhw.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzhs();
        }
        if (i2 == 4) {
            return new zzhr(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzn;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzhs.class) {
            try {
                zzafjVar = zzn;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzm);
                    zzn = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final /* synthetic */ void y(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void z() {
        zzaef zzaefVar = this.zze;
        if (zzaefVar.zza()) {
            return;
        }
        this.zze = x5n.k(zzaefVar);
    }
}
