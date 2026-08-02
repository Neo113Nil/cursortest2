package com.vk.search.communities.map.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.xq;

/* compiled from: LocationCoordinate.kt */
/* loaded from: classes5.dex */
public final class LocationCoordinate implements Parcelable {
    public static final Parcelable.Creator<LocationCoordinate> CREATOR = new a();
    public final float b;
    public final float c;

    /* compiled from: LocationCoordinate.kt */
    public static final class a implements Parcelable.Creator<LocationCoordinate> {
        @Override // android.os.Parcelable.Creator
        public final LocationCoordinate createFromParcel(Parcel parcel) {
            return new LocationCoordinate(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final LocationCoordinate[] newArray(int i) {
            return new LocationCoordinate[i];
        }
    }

    public LocationCoordinate(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationCoordinate)) {
            return false;
        }
        LocationCoordinate locationCoordinate = (LocationCoordinate) obj;
        return Float.compare(this.b, locationCoordinate.b) == 0 && Float.compare(this.c, locationCoordinate.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationCoordinate(latitude=");
        sb.append(this.b);
        sb.append(", longitude=");
        return xq.c(')', this.c, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }
}
