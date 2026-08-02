package com.vk.newsfeed.posting.impl.domain.model;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.shy;

/* compiled from: NearbyPlaces.kt */
/* loaded from: classes4.dex */
public final class NearbyPlaces implements Parcelable {
    public static final Parcelable.Creator<NearbyPlaces> CREATOR = new a();
    public final List<PostingPlaceDto> b;
    public final int c;
    public final int d;
    public final PlacesLoadingState e;
    public final GeoPermissionStatus f;
    public final Location g;
    public final Location h;

    /* compiled from: NearbyPlaces.kt */
    public static final class a implements Parcelable.Creator<NearbyPlaces> {
        @Override // android.os.Parcelable.Creator
        public final NearbyPlaces createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(PostingPlaceDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new NearbyPlaces(arrayList, parcel.readInt(), parcel.readInt(), PlacesLoadingState.valueOf(parcel.readString()), GeoPermissionStatus.valueOf(parcel.readString()), (Location) parcel.readParcelable(NearbyPlaces.class.getClassLoader()), (Location) parcel.readParcelable(NearbyPlaces.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NearbyPlaces[] newArray(int i) {
            return new NearbyPlaces[i];
        }
    }

    public NearbyPlaces(List<PostingPlaceDto> list, int i, int i2, PlacesLoadingState placesLoadingState, GeoPermissionStatus geoPermissionStatus, Location location, Location location2) {
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = placesLoadingState;
        this.f = geoPermissionStatus;
        this.g = location;
        this.h = location2;
    }

    public static NearbyPlaces a(NearbyPlaces nearbyPlaces, List list, int i, PlacesLoadingState placesLoadingState, GeoPermissionStatus geoPermissionStatus, Location location, int i2) {
        if ((i2 & 1) != 0) {
            list = nearbyPlaces.b;
        }
        List list2 = list;
        int i3 = (i2 & 2) != 0 ? nearbyPlaces.c : 5;
        if ((i2 & 4) != 0) {
            i = nearbyPlaces.d;
        }
        int i4 = i;
        if ((i2 & 8) != 0) {
            placesLoadingState = nearbyPlaces.e;
        }
        PlacesLoadingState placesLoadingState2 = placesLoadingState;
        if ((i2 & 16) != 0) {
            geoPermissionStatus = nearbyPlaces.f;
        }
        GeoPermissionStatus geoPermissionStatus2 = geoPermissionStatus;
        Location location2 = nearbyPlaces.g;
        if ((i2 & 64) != 0) {
            location = nearbyPlaces.h;
        }
        nearbyPlaces.getClass();
        return new NearbyPlaces(list2, i3, i4, placesLoadingState2, geoPermissionStatus2, location2, location);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPlaces)) {
            return false;
        }
        NearbyPlaces nearbyPlaces = (NearbyPlaces) obj;
        return epx.f(this.b, nearbyPlaces.b) && this.c == nearbyPlaces.c && this.d == nearbyPlaces.d && this.e == nearbyPlaces.e && this.f == nearbyPlaces.f && epx.f(this.g, nearbyPlaces.g) && epx.f(this.h, nearbyPlaces.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NearbyPlaces(places=" + this.b + ", offset=" + this.c + ", total=" + this.d + ", loadingState=" + this.e + ", geoAccessStatus=" + this.f + ", currentLocation=" + this.g + ", lastKnownLocation=" + this.h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((PostingPlaceDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e.name());
        parcel.writeString(this.f.name());
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
    }
}
