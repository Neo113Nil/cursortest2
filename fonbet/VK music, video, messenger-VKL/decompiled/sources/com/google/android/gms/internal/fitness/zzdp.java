package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.DataSet;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdp extends zzah {
    final /* synthetic */ DataSet zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzdz zzdzVar, c cVar, DataSet dataSet, boolean z) {
        super(cVar);
        this.zza = dataSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzcg) ((zzaj) bVar).getService()).zze(new com.google.android.gms.fitness.request.zzk(this.zza, (zzcw) new zzfb(this), false));
    }
}
