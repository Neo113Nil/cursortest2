package com.google.android.gms.internal.measurement;

import N9.d;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzec extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzfb zzfbVar, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(zzfbVar, false);
        this.zza = str;
        this.zzb = obj;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        ((zzcr) AbstractC3191o.m(this.zzc.zzQ())).logHealthData(5, this.zza, d.i(this.zzb), d.i(null), d.i(null));
    }
}
