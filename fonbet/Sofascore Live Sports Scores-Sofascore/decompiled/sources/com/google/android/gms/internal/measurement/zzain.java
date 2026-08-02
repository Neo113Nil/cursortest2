package com.google.android.gms.internal.measurement;

import defpackage.lzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzain implements zzaim {
    public static final lzo a;
    public static final lzo b;

    static {
        zzog zzogVar = zzagr.c;
        a = zzogVar.a("measurement.experiment.enable_passthrough_experiment_reporting", true);
        b = zzogVar.a("measurement.experiment.enable_phenotype_experiment_reporting", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzaim
    public final boolean zza() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaim
    public final boolean zzb() {
        return ((Boolean) b.get()).booleanValue();
    }
}
