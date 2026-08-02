package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.DataType;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzef extends zzav {
    final /* synthetic */ DataType zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzef(zzej zzejVar, c cVar, DataType dataType) {
        super(cVar);
        this.zza = dataType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzci) ((zzax) bVar).getService()).zzf(new com.google.android.gms.fitness.request.zzbi(this.zza, null, new zzfb(this)));
    }
}
