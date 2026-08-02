package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzds extends zzah {
    final /* synthetic */ DataUpdateListenerRegistrationRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdz zzdzVar, c cVar, DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        super(cVar);
        this.zza = dataUpdateListenerRegistrationRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzcg) ((zzaj) bVar).getService()).zzh(new DataUpdateListenerRegistrationRequest(this.zza, new zzfb(this)));
    }
}
