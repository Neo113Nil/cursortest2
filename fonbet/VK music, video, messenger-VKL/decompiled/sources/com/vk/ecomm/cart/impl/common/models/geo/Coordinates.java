package com.vk.ecomm.cart.impl.common.models.geo;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ojp0;

/* compiled from: Coordinates.kt */
/* loaded from: classes18.dex */
public final class Coordinates implements Parcelable {
    public static final Parcelable.Creator<Coordinates> CREATOR = new a();
    public static final Coordinates d = new Coordinates(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    public static final Coordinates e = new Coordinates(66.25d, 94.15d);
    public final double b;
    public final double c;

    /* compiled from: Coordinates.kt */
    public static final class a implements Parcelable.Creator<Coordinates> {
        @Override // android.os.Parcelable.Creator
        public final Coordinates createFromParcel(Parcel parcel) {
            return new Coordinates(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Coordinates[] newArray(int i) {
            return new Coordinates[i];
        }
    }

    public Coordinates(double d2, double d3) {
        this.b = d2;
        this.c = d3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinates)) {
            return false;
        }
        Coordinates coordinates = (Coordinates) obj;
        return Double.compare(this.b, coordinates.b) == 0 && Double.compare(this.c, coordinates.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + (Double.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Coordinates(lat=");
        sb.append(this.b);
        sb.append(", lng=");
        return ojp0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
    }
}
