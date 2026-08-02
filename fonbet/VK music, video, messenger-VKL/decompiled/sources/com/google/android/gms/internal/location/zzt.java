package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
final class zzt extends zzv {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzw zzwVar, c cVar, long j, PendingIntent pendingIntent) {
        super(cVar);
        this.zza = j;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        zzf zzfVar = (zzf) bVar;
        long j = this.zza;
        PendingIntent pendingIntent = this.zzb;
        exc0.i(pendingIntent);
        exc0.a("detectionIntervalMillis must be >= 0", j >= 0);
        ((zzo) zzfVar.getService()).zzr(j, true, pendingIntent);
        setResult((zzt) Status.f);
    }
}
