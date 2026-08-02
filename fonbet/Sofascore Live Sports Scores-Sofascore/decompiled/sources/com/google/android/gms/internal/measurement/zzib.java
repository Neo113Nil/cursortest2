package com.google.android.gms.internal.measurement;

import defpackage.ldn;
import defpackage.ndn;
import defpackage.w7n;
import defpackage.x5n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzib extends zzadu implements zzafd {
    private static final zzib zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzaef zze = ldn.e;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzib zzibVar = new zzib();
        zzi = zzibVar;
        zzadu.t(zzib.class, zzibVar);
    }

    private zzib() {
    }

    public static zzhz F() {
        return (zzhz) zzi.p();
    }

    public static zzhz G(zzib zzibVar) {
        zzadp p = zzi.p();
        p.n(zzibVar);
        return (zzhz) p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzid A(int i) {
        return (zzid) this.zze.get(i);
    }

    public final boolean B() {
        return (this.zzb & 1) != 0;
    }

    public final String C() {
        return this.zzf;
    }

    public final boolean D() {
        return (this.zzb & 2) != 0;
    }

    public final String E() {
        return this.zzg;
    }

    public final /* synthetic */ void H(int i, zzid zzidVar) {
        N();
        this.zze.set(i, zzidVar);
    }

    public final /* synthetic */ void I(zzid zzidVar) {
        N();
        this.zze.add(zzidVar);
    }

    public final void J(ArrayList arrayList) {
        N();
        zzaca.j(arrayList, this.zze);
    }

    public final void K() {
        this.zze = ldn.e;
    }

    public final /* synthetic */ void L(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void N() {
        zzaef zzaefVar = this.zze;
        if (zzaefVar.zza()) {
            return;
        }
        this.zze = x5n.k(zzaefVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", zzid.class, "zzf", "zzg", "zzh", w7n.k});
        }
        if (i2 == 3) {
            return new zzib();
        }
        if (i2 == 4) {
            return new zzhz(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzj;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzib.class) {
            try {
                zzafjVar = zzj;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzi);
                    zzj = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final List y() {
        return this.zze;
    }

    public final int z() {
        return this.zze.size();
    }
}
