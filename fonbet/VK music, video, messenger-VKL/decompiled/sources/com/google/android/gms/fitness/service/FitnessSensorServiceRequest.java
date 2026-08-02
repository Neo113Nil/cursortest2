package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import java.util.Arrays;
import xsna.dq70;
import xsna.e501;
import xsna.hr01;
import xsna.ozg0;
import xsna.qq01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class FitnessSensorServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FitnessSensorServiceRequest> CREATOR = new e501();
    public final DataSource b;
    public final hr01 c;
    public final long d;
    public final long e;

    public FitnessSensorServiceRequest(DataSource dataSource, IBinder iBinder, long j, long j2) {
        this.b = dataSource;
        this.c = qq01.f(iBinder);
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FitnessSensorServiceRequest)) {
            return false;
        }
        FitnessSensorServiceRequest fitnessSensorServiceRequest = (FitnessSensorServiceRequest) obj;
        return dq70.b(this.b, fitnessSensorServiceRequest.b) && this.d == fitnessSensorServiceRequest.d && this.e == fitnessSensorServiceRequest.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Long.valueOf(this.d), Long.valueOf(this.e)});
    }

    @NonNull
    public final String toString() {
        return String.format("FitnessSensorServiceRequest{%s}", this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.h(parcel, 2, this.c.asBinder());
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.d);
        ozg0.v(parcel, 4, 8);
        parcel.writeLong(this.e);
        ozg0.x(w, parcel);
    }
}
