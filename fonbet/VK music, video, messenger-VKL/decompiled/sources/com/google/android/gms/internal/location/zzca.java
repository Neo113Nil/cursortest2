package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.location.LocationSettingsRequest;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzca extends zzcb {
    final /* synthetic */ LocationSettingsRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(zzcc zzccVar, c cVar, LocationSettingsRequest locationSettingsRequest, String str) {
        super(cVar);
        this.zza = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        zzda zzdaVar = (zzda) bVar;
        LocationSettingsRequest locationSettingsRequest = this.zza;
        exc0.a("locationSettingsRequest can't be null", locationSettingsRequest != null);
        ((zzo) zzdaVar.getService()).zzh(locationSettingsRequest, new zzcr(this), null);
    }
}
