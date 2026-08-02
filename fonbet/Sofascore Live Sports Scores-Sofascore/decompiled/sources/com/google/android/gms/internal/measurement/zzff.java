package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import defpackage.x5n;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzff extends zzadu implements zzafd {
    private static final zzff zzm;
    private static volatile zzafj zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private zzaef zzg = ldn.e;
    private boolean zzh;
    private zzfl zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzff zzffVar = new zzff();
        zzm = zzffVar;
        zzadu.t(zzff.class, zzffVar);
    }

    private zzff() {
    }

    public static zzfe K() {
        return (zzfe) zzm.p();
    }

    public final String A() {
        return this.zzf;
    }

    public final List B() {
        return this.zzg;
    }

    public final int C() {
        return this.zzg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfh D(int i) {
        return (zzfh) this.zzg.get(i);
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final zzfl F() {
        zzfl zzflVar = this.zzi;
        return zzflVar == null ? zzfl.H() : zzflVar;
    }

    public final boolean G() {
        return this.zzj;
    }

    public final boolean H() {
        return this.zzk;
    }

    public final boolean I() {
        return (this.zzb & 64) != 0;
    }

    public final boolean J() {
        return this.zzl;
    }

    public final /* synthetic */ void L(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void M(int i, zzfh zzfhVar) {
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = x5n.k(zzaefVar);
        }
        this.zzg.set(i, zzfhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", zzfh.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzff();
        }
        if (i2 == 4) {
            return new zzfe(zzm);
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
        synchronized (zzff.class) {
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

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final int z() {
        return this.zze;
    }
}
