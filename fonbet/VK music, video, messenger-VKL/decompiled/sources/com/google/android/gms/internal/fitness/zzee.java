package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.Subscription;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzee extends zzav {
    final /* synthetic */ Subscription zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzej zzejVar, c cVar, Subscription subscription) {
        super(cVar);
        this.zza = subscription;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzci) ((zzax) bVar).getService()).zze(new com.google.android.gms.fitness.request.zzbe(this.zza, false, (zzcw) new zzfb(this)));
    }
}
