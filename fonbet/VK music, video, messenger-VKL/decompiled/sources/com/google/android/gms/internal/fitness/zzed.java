package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;
import java.util.Collections;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzed extends zzas {
    final /* synthetic */ DataType zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzej zzejVar, c cVar, DataType dataType) {
        super(cVar);
        this.zza = dataType;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final qdg0 createFailedResult(Status status) {
        return new ListSubscriptionsResult(Collections.EMPTY_LIST, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzci) ((zzax) bVar).getService()).zzd(new com.google.android.gms.fitness.request.zzae(this.zza, (zzcn) new zzei(this, null)));
    }
}
