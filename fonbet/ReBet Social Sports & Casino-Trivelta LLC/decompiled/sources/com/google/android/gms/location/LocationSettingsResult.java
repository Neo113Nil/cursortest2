package com.google.android.gms.location;

import E9.b;
import V9.C1761q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements l {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new C1761q();

    /* renamed from: a, reason: collision with root package name */
    public final Status f33138a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationSettingsStates f33139b;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f33138a = status;
        this.f33139b = locationSettingsStates;
    }

    public LocationSettingsStates g() {
        return this.f33139b;
    }

    @Override // com.google.android.gms.common.api.l
    public Status getStatus() {
        return this.f33138a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.D(parcel, 1, getStatus(), i10, false);
        b.D(parcel, 2, g(), i10, false);
        b.b(parcel, a10);
    }
}
