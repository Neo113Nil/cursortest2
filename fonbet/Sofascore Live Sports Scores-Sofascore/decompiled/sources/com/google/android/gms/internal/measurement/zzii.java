package com.google.android.gms.internal.measurement;

import defpackage.hcn;
import defpackage.ldn;
import defpackage.ndn;
import defpackage.x5n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzii extends zzadu implements zzafd {
    private static final zzii zzh;
    private static volatile zzafj zzi;
    private zzaee zzb;
    private zzaee zze;
    private zzaef zzf;
    private zzaef zzg;

    static {
        zzii zziiVar = new zzii();
        zzh = zziiVar;
        zzadu.t(zzii.class, zziiVar);
    }

    private zzii() {
        hcn hcnVar = hcn.e;
        this.zzb = hcnVar;
        this.zze = hcnVar;
        ldn ldnVar = ldn.e;
        this.zzf = ldnVar;
        this.zzg = ldnVar;
    }

    public static zzih G() {
        return (zzih) zzh.p();
    }

    public static zzii H() {
        return zzh;
    }

    public final List A() {
        return this.zze;
    }

    public final int B() {
        return this.zze.size();
    }

    public final zzaef C() {
        return this.zzf;
    }

    public final int D() {
        return this.zzf.size();
    }

    public final zzaef E() {
        return this.zzg;
    }

    public final int F() {
        return this.zzg.size();
    }

    public final void I(Iterable iterable) {
        zzaee zzaeeVar = this.zzb;
        if (!zzaeeVar.zza()) {
            int size = zzaeeVar.size();
            this.zzb = zzaeeVar.f(size + size);
        }
        zzaca.j(iterable, this.zzb);
    }

    public final void J() {
        this.zzb = hcn.e;
    }

    public final void K(List list) {
        zzaee zzaeeVar = this.zze;
        if (!zzaeeVar.zza()) {
            int size = zzaeeVar.size();
            this.zze = zzaeeVar.f(size + size);
        }
        zzaca.j(list, this.zze);
    }

    public final void L() {
        this.zze = hcn.e;
    }

    public final void M(ArrayList arrayList) {
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = x5n.k(zzaefVar);
        }
        zzaca.j(arrayList, this.zzf);
    }

    public final void N() {
        this.zzf = ldn.e;
    }

    public final void O(Iterable iterable) {
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = x5n.k(zzaefVar);
        }
        zzaca.j(iterable, this.zzg);
    }

    public final void P() {
        this.zzg = ldn.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", zzhq.class, "zzg", zzik.class});
        }
        if (i2 == 3) {
            return new zzii();
        }
        if (i2 == 4) {
            return new zzih(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzi;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzii.class) {
            try {
                zzafjVar = zzi;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzh);
                    zzi = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final List y() {
        return this.zzb;
    }

    public final int z() {
        return this.zzb.size();
    }
}
