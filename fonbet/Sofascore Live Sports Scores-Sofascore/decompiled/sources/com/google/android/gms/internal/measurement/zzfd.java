package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import defpackage.x5n;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfd extends zzadu implements zzafd {
    private static final zzfd zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze;
    private zzaef zzf;
    private zzaef zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzfd zzfdVar = new zzfd();
        zzj = zzfdVar;
        zzadu.t(zzfd.class, zzfdVar);
    }

    private zzfd() {
        ldn ldnVar = ldn.e;
        this.zzf = ldnVar;
        this.zzg = ldnVar;
    }

    public final List A() {
        return this.zzf;
    }

    public final int B() {
        return this.zzf.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfn C(int i) {
        return (zzfn) this.zzf.get(i);
    }

    public final zzaef D() {
        return this.zzg;
    }

    public final int E() {
        return this.zzg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzff F(int i) {
        return (zzff) this.zzg.get(i);
    }

    public final void G(int i, zzfn zzfnVar) {
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = x5n.k(zzaefVar);
        }
        this.zzf.set(i, zzfnVar);
    }

    public final void H(int i, zzff zzffVar) {
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = x5n.k(zzaefVar);
        }
        this.zzg.set(i, zzffVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", zzfn.class, "zzg", zzff.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzfd();
        }
        if (i2 == 4) {
            return new zzfc(zzj);
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
        synchronized (zzfd.class) {
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

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final int z() {
        return this.zze;
    }
}
