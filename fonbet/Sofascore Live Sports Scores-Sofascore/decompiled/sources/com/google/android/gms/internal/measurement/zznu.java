package com.google.android.gms.internal.measurement;

import defpackage.gzo;
import defpackage.ndn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznu extends zzadu implements zzafd {
    private static final zznu zze;
    private static volatile zzafj zzf;
    private zzaew zzb = zzaew.b;

    static {
        zznu zznuVar = new zznu();
        zze = zznuVar;
        zzadu.t(zznu.class, zznuVar);
    }

    private zznu() {
    }

    public static zznu y() {
        return zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", gzo.a});
        }
        if (i2 == 3) {
            return new zznu();
        }
        if (i2 == 4) {
            return new zznt(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzf;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zznu.class) {
            try {
                zzafjVar = zzf;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zze);
                    zzf = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}
