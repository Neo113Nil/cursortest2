package com.google.android.gms.internal.fitness;

import com.google.android.gms.fitness.result.DataSourcesResult;
import xsna.ue6;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzf extends zzbv {
    private final ue6 zza;

    public zzf(ue6 ue6Var) {
        this.zza = ue6Var;
    }

    @Override // com.google.android.gms.internal.fitness.zzbw
    public final void zzb(DataSourcesResult dataSourcesResult) {
        this.zza.setResult(dataSourcesResult);
    }
}
