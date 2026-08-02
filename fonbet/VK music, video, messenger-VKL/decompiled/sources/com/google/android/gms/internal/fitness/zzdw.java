package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.result.DailyTotalResult;
import xsna.exc0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdw extends zzae {
    final /* synthetic */ DataType zza;
    final /* synthetic */ boolean zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzdz zzdzVar, c cVar, DataType dataType, boolean z) {
        super(cVar);
        this.zza = dataType;
        this.zzb = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final qdg0 createFailedResult(Status status) {
        DataType dataType = this.zza;
        exc0.k("Must set data type", dataType != null);
        DataSet dataSet = new DataSet(new DataSource(dataType, 1, null, null, ""));
        exc0.k("DataSet#build() should only be called once.", !false);
        return new DailyTotalResult(status, dataSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzcg) ((zzaj) bVar).getService()).zzf(new com.google.android.gms.fitness.request.zzh((zzbq) new zzdv(this), this.zza, this.zzb));
    }
}
