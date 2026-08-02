package com.vk.api.generated.places.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: PlacesPlaceWithDistanceDto.kt */
/* loaded from: classes15.dex */
public final class PlacesPlaceWithDistanceDto implements Parcelable {
    public static final Parcelable.Creator<PlacesPlaceWithDistanceDto> CREATOR = new a();

    @pmi0("distance")
    private final int distance;

    @pmi0("place")
    private final PlacesPlaceDto place;

    /* compiled from: PlacesPlaceWithDistanceDto.kt */
    public static final class a implements Parcelable.Creator<PlacesPlaceWithDistanceDto> {
        @Override // android.os.Parcelable.Creator
        public final PlacesPlaceWithDistanceDto createFromParcel(Parcel parcel) {
            return new PlacesPlaceWithDistanceDto(parcel.readInt(), (PlacesPlaceDto) parcel.readParcelable(PlacesPlaceWithDistanceDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PlacesPlaceWithDistanceDto[] newArray(int i) {
            return new PlacesPlaceWithDistanceDto[i];
        }
    }

    public PlacesPlaceWithDistanceDto(int i, PlacesPlaceDto placesPlaceDto) {
        this.distance = i;
        this.place = placesPlaceDto;
    }

    public final int d() {
        return this.distance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PlacesPlaceDto e() {
        return this.place;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesPlaceWithDistanceDto)) {
            return false;
        }
        PlacesPlaceWithDistanceDto placesPlaceWithDistanceDto = (PlacesPlaceWithDistanceDto) obj;
        return this.distance == placesPlaceWithDistanceDto.distance && epx.f(this.place, placesPlaceWithDistanceDto.place);
    }

    public final int hashCode() {
        return this.place.hashCode() + (Integer.hashCode(this.distance) * 31);
    }

    public final String toString() {
        return "PlacesPlaceWithDistanceDto(distance=" + this.distance + ", place=" + this.place + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.distance);
        parcel.writeParcelable(this.place, i);
    }
}
