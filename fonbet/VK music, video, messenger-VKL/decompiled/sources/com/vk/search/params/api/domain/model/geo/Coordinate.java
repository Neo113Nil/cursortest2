package com.vk.search.params.api.domain.model.geo;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.ojp0;

/* compiled from: Coordinate.kt */
/* loaded from: classes5.dex */
public final class Coordinate implements Parcelable {
    public static final Parcelable.Creator<Coordinate> CREATOR = new a();
    public final double b;
    public final double c;

    /* compiled from: Coordinate.kt */
    public static final class a implements Parcelable.Creator<Coordinate> {
        @Override // android.os.Parcelable.Creator
        public final Coordinate createFromParcel(Parcel parcel) {
            return new Coordinate(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Coordinate[] newArray(int i) {
            return new Coordinate[i];
        }
    }

    public Coordinate(double d, double d2) {
        this.b = d;
        this.c = d2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinate)) {
            return false;
        }
        Coordinate coordinate = (Coordinate) obj;
        return Double.compare(this.b, coordinate.b) == 0 && Double.compare(this.c, coordinate.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + (Double.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Coordinate(latitude=");
        sb.append(this.b);
        sb.append(", longitude=");
        return ojp0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
    }
}
