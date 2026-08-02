package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.location.LocationSettingsRequest;

/* loaded from: classes2.dex */
final class zzca extends zzcb {
    final /* synthetic */ LocationSettingsRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(zzcc zzccVar, f fVar, LocationSettingsRequest locationSettingsRequest, String str) {
        super(fVar);
        this.zza = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3124d
    public final /* synthetic */ void doExecute(C3117a.b bVar) {
        zzda zzdaVar = (zzda) bVar;
        LocationSettingsRequest locationSettingsRequest = this.zza;
        AbstractC3191o.b(locationSettingsRequest != null, "locationSettingsRequest can't be null");
        ((zzo) zzdaVar.getService()).zzh(locationSettingsRequest, new zzcr(this), null);
    }
}
