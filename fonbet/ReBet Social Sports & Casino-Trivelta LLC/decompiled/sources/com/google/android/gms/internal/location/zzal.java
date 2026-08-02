package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes2.dex */
final class zzal extends zzat {
    final /* synthetic */ C3140l zza;
    final /* synthetic */ LocationRequest zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzau zzauVar, f fVar, C3140l c3140l, LocationRequest locationRequest) {
        super(fVar);
        this.zza = c3140l;
        this.zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3124d
    public final /* bridge */ /* synthetic */ void doExecute(C3117a.b bVar) {
        ((zzda) bVar).zzu(new zzas(this.zza), this.zzb, zzau.zza(this));
    }
}
