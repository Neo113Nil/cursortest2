package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzeo extends zzeq {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeo(zzfb zzfbVar, zzes zzesVar) {
        super(zzfbVar, true);
        this.zza = zzesVar;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        ((zzcr) AbstractC3191o.m(this.zzb.zzQ())).unregisterOnMeasurementEventListener(this.zza);
    }
}
