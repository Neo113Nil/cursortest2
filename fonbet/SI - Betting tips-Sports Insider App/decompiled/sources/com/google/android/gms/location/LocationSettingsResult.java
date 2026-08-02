package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d6.l;
import h8.b;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements l {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new a(12);

    /* renamed from: a, reason: collision with root package name */
    public final Status f5732a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationSettingsStates f5733b;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f5732a = status;
        this.f5733b = locationSettingsStates;
    }

    @Override // d6.l
    public final Status getStatus() {
        return this.f5732a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.N(parcel, 1, this.f5732a, i5, false);
        b.N(parcel, 2, this.f5733b, i5, false);
        b.W(parcel, V);
    }
}
