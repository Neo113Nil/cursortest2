package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.rq01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class DataUpdateRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DataUpdateRequest> CREATOR = new rq01();
    public final long b;
    public final long c;
    public final DataSet d;

    @Nullable
    public final zzcw e;

    public DataUpdateRequest(long j, long j2, @NonNull DataSet dataSet, @Nullable IBinder iBinder) {
        this.b = j;
        this.c = j2;
        this.d = dataSet;
        this.e = iBinder == null ? null : zzcv.zzc(iBinder);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataUpdateRequest)) {
            return false;
        }
        DataUpdateRequest dataUpdateRequest = (DataUpdateRequest) obj;
        return this.b == dataUpdateRequest.b && this.c == dataUpdateRequest.c && dq70.b(this.d, dataUpdateRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), this.d});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Long.valueOf(this.b), "startTimeMillis");
        aVar.a(Long.valueOf(this.c), "endTimeMillis");
        aVar.a(this.d, "dataSet");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.c);
        ozg0.p(parcel, 3, this.d, i, false);
        zzcw zzcwVar = this.e;
        ozg0.h(parcel, 4, zzcwVar == null ? null : zzcwVar.asBinder());
        ozg0.x(w, parcel);
    }

    public DataUpdateRequest(@NonNull DataUpdateRequest dataUpdateRequest, @NonNull IBinder iBinder) {
        this(dataUpdateRequest.b, dataUpdateRequest.c, dataUpdateRequest.d, iBinder);
    }
}
