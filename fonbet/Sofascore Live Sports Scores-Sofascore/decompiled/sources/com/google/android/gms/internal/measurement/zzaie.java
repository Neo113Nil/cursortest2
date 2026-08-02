package com.google.android.gms.internal.measurement;

import defpackage.nzo;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaie implements zzaid {
    public static final zzpo a = new zzpo(zzagr.c, 6);

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final boolean zza() {
        return ((Boolean) a.a(0, "measurement.test.boolean_flag", false).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final long zzb() {
        return ((Long) a.b(1, -1L, "measurement.test.cached_long_flag").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final double zzc() {
        zzpo zzpoVar = a;
        AtomicReferenceArray atomicReferenceArray = zzpoVar.a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(2);
        if (zzomVar == null) {
            nzo nzoVar = new nzo("measurement.test.double_flag", zzpoVar.b.a);
            while (true) {
                if (atomicReferenceArray.compareAndSet(2, null, nzoVar)) {
                    zzomVar = nzoVar;
                    break;
                }
                if (atomicReferenceArray.get(2) != null) {
                    zzomVar = (zzom) atomicReferenceArray.get(2);
                    zzomVar.getClass();
                    break;
                }
            }
        }
        return ((Double) zzomVar.get()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final long zzd() {
        return ((Long) a.b(3, -2L, "measurement.test.int_flag").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final long zze() {
        return ((Long) a.b(4, -1L, "measurement.test.long_flag").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final String zzf() {
        return (String) a.c(5, "measurement.test.string_flag", "---").get();
    }
}
