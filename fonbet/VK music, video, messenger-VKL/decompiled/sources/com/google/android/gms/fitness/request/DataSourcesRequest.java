package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzbv;
import com.google.android.gms.internal.fitness.zzbw;
import java.util.ArrayList;
import java.util.List;
import xsna.dq70;
import xsna.ml01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class DataSourcesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DataSourcesRequest> CREATOR = new ml01();
    public final List b;
    public final List c;

    @Nullable
    public final zzbw d;

    public DataSourcesRequest(DataSourcesRequest dataSourcesRequest, zzbw zzbwVar) {
        this(dataSourcesRequest.b, dataSourcesRequest.c, zzbwVar);
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "dataTypes");
        aVar.a(this.c, "sourceTypes");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, this.b, false);
        ozg0.j(parcel, this.c, 2);
        zzbw zzbwVar = this.d;
        ozg0.h(parcel, 4, zzbwVar == null ? null : zzbwVar.asBinder());
        ozg0.x(w, parcel);
    }

    public DataSourcesRequest(ArrayList arrayList, ArrayList arrayList2, @Nullable IBinder iBinder) {
        this.b = arrayList;
        this.c = arrayList2;
        this.d = iBinder == null ? null : zzbv.zzc(iBinder);
    }

    public DataSourcesRequest(List list, List list2, @Nullable zzbw zzbwVar) {
        this.b = list;
        this.c = list2;
        this.d = zzbwVar;
    }
}
