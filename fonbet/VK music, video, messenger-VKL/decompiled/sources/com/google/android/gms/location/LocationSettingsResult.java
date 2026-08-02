package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.duz0;
import xsna.ozg0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements qdg0 {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new duz0();
    public final Status b;

    @Nullable
    public final LocationSettingsStates c;

    public LocationSettingsResult(@NonNull Status status, @Nullable LocationSettingsStates locationSettingsStates) {
        this.b = status;
        this.c = locationSettingsStates;
    }

    @Override // xsna.qdg0
    @NonNull
    public final Status getStatus() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.x(w, parcel);
    }
}
