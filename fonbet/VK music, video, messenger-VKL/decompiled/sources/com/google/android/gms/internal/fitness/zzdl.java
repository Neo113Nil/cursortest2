package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.result.DataTypeResult;
import xsna.cv90;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzdl {
    public final cv90<DataTypeResult> createCustomDataType(c cVar, DataTypeCreateRequest dataTypeCreateRequest) {
        return cVar.b(new zzdg(this, cVar, dataTypeCreateRequest));
    }

    public final cv90<Status> disableFit(c cVar) {
        return cVar.b(new zzdi(this, cVar));
    }

    public final cv90<DataTypeResult> readDataType(c cVar, String str) {
        return cVar.a(new zzdh(this, cVar, str));
    }
}
