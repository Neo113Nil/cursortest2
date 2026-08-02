package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import java.util.Collections;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzek extends zzba {
    final /* synthetic */ DataSourcesRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzek(zzen zzenVar, c cVar, DataSourcesRequest dataSourcesRequest) {
        super(cVar);
        this.zza = dataSourcesRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ qdg0 createFailedResult(Status status) {
        return new DataSourcesResult(Collections.EMPTY_LIST, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzcj) ((zzbf) bVar).getService()).zzd(new DataSourcesRequest(this.zza, new zzf(this)));
    }
}
