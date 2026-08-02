package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.ndn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzmd extends zzadu implements zzafd {
    private static final zzmd zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzmd zzmdVar = new zzmd();
        zzg = zzmdVar;
        zzadu.t(zzmd.class, zzmdVar);
    }

    private zzmd() {
    }

    public static zzmc y() {
        return (zzmc) zzg.p();
    }

    public final /* synthetic */ void A(int i) {
        if (i == 1) {
            a70.p("Can't get the number of an unknown enum value.");
        } else {
            this.zzf = i - 2;
            this.zzb |= 2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzmd();
        }
        if (i2 == 4) {
            return new zzmc(zzg);
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
        synchronized (zzmd.class) {
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

    public final /* synthetic */ void z(int i) {
        this.zze = i - 2;
        this.zzb |= 1;
    }
}
