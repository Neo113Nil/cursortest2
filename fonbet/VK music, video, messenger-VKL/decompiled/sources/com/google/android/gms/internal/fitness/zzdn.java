package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.request.GoalsReadRequest;
import com.google.android.gms.fitness.result.GoalsResult;
import java.util.Collections;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdn extends zzx {
    final /* synthetic */ GoalsReadRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdn(zzdo zzdoVar, c cVar, GoalsReadRequest goalsReadRequest) {
        super(cVar);
        this.zza = goalsReadRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ qdg0 createFailedResult(Status status) {
        return new GoalsResult(status, Collections.EMPTY_LIST);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzcf) ((zzab) bVar).getService()).zzd(new GoalsReadRequest(this.zza, new zzdm(this)));
    }
}
