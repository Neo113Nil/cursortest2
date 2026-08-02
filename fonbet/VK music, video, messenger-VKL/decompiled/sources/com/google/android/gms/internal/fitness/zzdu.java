package com.google.android.gms.internal.fitness;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.exc0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
final class zzdu extends zzae {
    final /* synthetic */ DataReadRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzdz zzdzVar, c cVar, DataReadRequest dataReadRequest) {
        super(cVar);
        this.zza = dataReadRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final qdg0 createFailedResult(Status status) {
        DataReadRequest dataReadRequest = this.zza;
        List<DataType> list = dataReadRequest.b;
        List<DataSource> list2 = dataReadRequest.c;
        ArrayList arrayList = new ArrayList();
        for (DataSource dataSource : list2) {
            exc0.j(dataSource, "DataSource should be specified");
            DataSet dataSet = new DataSet(dataSource);
            exc0.k("DataSet#build() should only be called once.", !false);
            arrayList.add(dataSet);
        }
        for (DataType dataType : list) {
            exc0.k("Must set data type", dataType != null);
            DataSet dataSet2 = new DataSet(new DataSource(dataType, 1, null, null, "Default"));
            exc0.k("DataSet#build() should only be called once.", !false);
            arrayList.add(dataSet2);
        }
        return new DataReadResult(arrayList, Collections.EMPTY_LIST, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzcg) ((zzaj) bVar).getService()).zzg(new DataReadRequest(this.zza, new zzdy(this, null)));
    }
}
