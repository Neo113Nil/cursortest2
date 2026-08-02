package com.google.android.gms.internal.fitness;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import xsna.dki0;
import xsna.hr01;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzel extends zzbd {
    final /* synthetic */ dki0 zza;
    final /* synthetic */ hr01 zzb;
    final /* synthetic */ PendingIntent zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzen zzenVar, c cVar, dki0 dki0Var, hr01 hr01Var, PendingIntent pendingIntent) {
        super(cVar);
        this.zzb = hr01Var;
        this.zzc = pendingIntent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzcj) ((zzbf) bVar).getService()).zze(new com.google.android.gms.fitness.request.zzal(null, this.zzb, this.zzc, new zzfb(this)));
    }

    @Override // com.google.android.gms.internal.fitness.zzbd, com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qdg0 createFailedResult(Status status) {
        return status;
    }
}
