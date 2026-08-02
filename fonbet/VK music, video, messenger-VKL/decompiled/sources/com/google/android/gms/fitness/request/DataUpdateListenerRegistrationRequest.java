package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.rd6;
import xsna.xo01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class DataUpdateListenerRegistrationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DataUpdateListenerRegistrationRequest> CREATOR = new xo01();

    @Nullable
    public final DataSource b;

    @Nullable
    public final DataType c;

    @Nullable
    public final PendingIntent d;

    @Nullable
    public final zzcw e;

    public DataUpdateListenerRegistrationRequest(@Nullable DataSource dataSource, @Nullable DataType dataType, @Nullable PendingIntent pendingIntent, @Nullable IBinder iBinder) {
        this.b = dataSource;
        this.c = dataType;
        this.d = pendingIntent;
        this.e = iBinder == null ? null : zzcv.zzc(iBinder);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataUpdateListenerRegistrationRequest)) {
            return false;
        }
        DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest = (DataUpdateListenerRegistrationRequest) obj;
        return dq70.b(this.b, dataUpdateListenerRegistrationRequest.b) && dq70.b(this.c, dataUpdateListenerRegistrationRequest.c) && dq70.b(this.d, dataUpdateListenerRegistrationRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "dataSource");
        aVar.a(this.c, "dataType");
        aVar.a(this.d, rd6.KEY_PENDING_INTENT);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.p(parcel, 3, this.d, i, false);
        zzcw zzcwVar = this.e;
        ozg0.h(parcel, 4, zzcwVar == null ? null : zzcwVar.asBinder());
        ozg0.x(w, parcel);
    }

    public DataUpdateListenerRegistrationRequest(@NonNull DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest, @Nullable IBinder iBinder) {
        this(dataUpdateListenerRegistrationRequest.b, dataUpdateListenerRegistrationRequest.c, dataUpdateListenerRegistrationRequest.d, iBinder);
    }
}
