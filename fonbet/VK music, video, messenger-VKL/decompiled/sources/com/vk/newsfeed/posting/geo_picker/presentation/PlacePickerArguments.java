package com.vk.newsfeed.posting.geo_picker.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.NearbyPlaces;
import xsna.epx;

/* compiled from: PlacePickerArguments.kt */
/* loaded from: classes4.dex */
public final class PlacePickerArguments implements Parcelable {
    public static final Parcelable.Creator<PlacePickerArguments> CREATOR = new a();
    public final long b;
    public final NearbyPlaces c;

    /* compiled from: PlacePickerArguments.kt */
    public static final class a implements Parcelable.Creator<PlacePickerArguments> {
        @Override // android.os.Parcelable.Creator
        public final PlacePickerArguments createFromParcel(Parcel parcel) {
            return new PlacePickerArguments(parcel.readLong(), NearbyPlaces.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PlacePickerArguments[] newArray(int i) {
            return new PlacePickerArguments[i];
        }
    }

    public PlacePickerArguments(long j, NearbyPlaces nearbyPlaces) {
        this.b = j;
        this.c = nearbyPlaces;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacePickerArguments)) {
            return false;
        }
        PlacePickerArguments placePickerArguments = (PlacePickerArguments) obj;
        return this.b == placePickerArguments.b && epx.f(this.c, placePickerArguments.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "PlacePickerArguments(startScreenElapsedTime=" + this.b + ", nearbyPlaces=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        this.c.writeToParcel(parcel, i);
    }
}
