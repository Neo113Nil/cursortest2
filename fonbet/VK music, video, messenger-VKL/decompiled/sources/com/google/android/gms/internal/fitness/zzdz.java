package com.google.android.gms.internal.fitness;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.Collections;
import xsna.cv90;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class zzdz {
    private final cv90 zza(c cVar, DataType dataType, boolean z) {
        return cVar.a(new zzdw(this, cVar, dataType, z));
    }

    public final cv90<Status> deleteData(c cVar, DataDeleteRequest dataDeleteRequest) {
        return cVar.a(new zzdq(this, cVar, dataDeleteRequest));
    }

    public final cv90<Status> insertData(c cVar, DataSet dataSet) {
        exc0.j(dataSet, "Must set the data set");
        exc0.k("Cannot use an empty data set", !Collections.unmodifiableList(dataSet.d).isEmpty());
        exc0.j(dataSet.c.e, "Must set the app package name for the data source");
        return cVar.a(new zzdp(this, cVar, dataSet, false));
    }

    public final cv90<DailyTotalResult> readDailyTotal(c cVar, DataType dataType) {
        return zza(cVar, dataType, false);
    }

    public final cv90<DailyTotalResult> readDailyTotalFromLocalDevice(c cVar, DataType dataType) {
        return zza(cVar, dataType, true);
    }

    public final cv90<DataReadResult> readData(c cVar, DataReadRequest dataReadRequest) {
        return cVar.a(new zzdu(this, cVar, dataReadRequest));
    }

    public final cv90<Status> registerDataUpdateListener(c cVar, DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        return cVar.a(new zzds(this, cVar, dataUpdateListenerRegistrationRequest));
    }

    public final cv90<Status> unregisterDataUpdateListener(c cVar, PendingIntent pendingIntent) {
        return cVar.b(new zzdt(this, cVar, pendingIntent));
    }

    public final cv90<Status> updateData(c cVar, DataUpdateRequest dataUpdateRequest) {
        exc0.j(dataUpdateRequest.d, "Must set the data set");
        if (dataUpdateRequest.b == 0) {
            throw new IllegalArgumentException("Must set a non-zero value for startTimeMillis/startTime");
        }
        if (dataUpdateRequest.c != 0) {
            return cVar.a(new zzdr(this, cVar, dataUpdateRequest));
        }
        throw new IllegalArgumentException("Must set a non-zero value for endTimeMillis/endTime");
    }
}
