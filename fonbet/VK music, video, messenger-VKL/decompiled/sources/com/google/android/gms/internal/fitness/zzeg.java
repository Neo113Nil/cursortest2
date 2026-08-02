package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.DataSource;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzeg extends zzav {
    final /* synthetic */ DataSource zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzej zzejVar, c cVar, DataSource dataSource) {
        super(cVar);
        this.zza = dataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzci) ((zzax) bVar).getService()).zzf(new com.google.android.gms.fitness.request.zzbi(null, this.zza, new zzfb(this)));
    }
}
