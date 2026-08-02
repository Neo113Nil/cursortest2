package com.google.android.gms.internal.measurement;

import defpackage.hcn;
import defpackage.ndn;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzik extends zzadu implements zzafd {
    private static final zzik zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private zzaee zzf = hcn.e;

    static {
        zzik zzikVar = new zzik();
        zzg = zzikVar;
        zzadu.t(zzik.class, zzikVar);
    }

    private zzik() {
    }

    public static zzij D() {
        return (zzij) zzg.p();
    }

    public final List A() {
        return this.zzf;
    }

    public final int B() {
        return this.zzf.size();
    }

    public final long C(int i) {
        return this.zzf.k(i);
    }

    public final /* synthetic */ void E(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final void F(List list) {
        zzaee zzaeeVar = this.zzf;
        if (!zzaeeVar.zza()) {
            int size = zzaeeVar.size();
            this.zzf = zzaeeVar.f(size + size);
        }
        zzaca.j(list, this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzik();
        }
        if (i2 == 4) {
            return new zzij(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzh;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzik.class) {
            try {
                zzafjVar = zzh;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzg);
                    zzh = zzafjVar;
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
