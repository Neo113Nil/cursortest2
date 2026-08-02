package com.vk.search.params.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.search.params.api.domain.model.geo.Coordinate;
import xsna.epx;

/* compiled from: SearchLocation.kt */
/* loaded from: classes5.dex */
public interface SearchLocation extends Parcelable {

    /* compiled from: SearchLocation.kt */
    public static final class City implements SearchLocation {
        public static final Parcelable.Creator<City> CREATOR = new a();
        public final com.vk.search.params.api.City b;

        /* compiled from: SearchLocation.kt */
        public static final class a implements Parcelable.Creator<City> {
            @Override // android.os.Parcelable.Creator
            public final City createFromParcel(Parcel parcel) {
                return new City(com.vk.search.params.api.City.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final City[] newArray(int i) {
                return new City[i];
            }
        }

        public City(com.vk.search.params.api.City city) {
            this.b = city;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof City) && epx.f(this.b, ((City) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "City(city=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }

    /* compiled from: SearchLocation.kt */
    public static final class CurrentLocation implements SearchLocation {
        public static final Parcelable.Creator<CurrentLocation> CREATOR = new a();
        public final String b;
        public final Coordinate c;

        /* compiled from: SearchLocation.kt */
        public static final class a implements Parcelable.Creator<CurrentLocation> {
            @Override // android.os.Parcelable.Creator
            public final CurrentLocation createFromParcel(Parcel parcel) {
                return new CurrentLocation(parcel.readString(), Coordinate.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final CurrentLocation[] newArray(int i) {
                return new CurrentLocation[i];
            }
        }

        public CurrentLocation(String str, Coordinate coordinate) {
            this.b = str;
            this.c = coordinate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurrentLocation)) {
                return false;
            }
            CurrentLocation currentLocation = (CurrentLocation) obj;
            return epx.f(this.b, currentLocation.b) && epx.f(this.c, currentLocation.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "CurrentLocation(address=" + this.b + ", coordinate=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            this.c.writeToParcel(parcel, i);
        }
    }
}
