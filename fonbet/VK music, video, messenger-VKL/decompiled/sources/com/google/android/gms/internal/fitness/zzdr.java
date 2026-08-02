package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.request.DataUpdateRequest;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdr extends zzah {
    final /* synthetic */ DataUpdateRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzdz zzdzVar, c cVar, DataUpdateRequest dataUpdateRequest) {
        super(cVar);
        this.zza = dataUpdateRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzcg) ((zzaj) bVar).getService()).zzj(new DataUpdateRequest(this.zza, new zzfb(this)));
    }
}
