package com.vk.ecomm.cart.impl.common.models.geo;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.vu5;

/* compiled from: City.kt */
/* loaded from: classes18.dex */
public final class City implements Parcelable {
    public static final Parcelable.Creator<City> CREATOR = new a();
    public final String b;
    public final int c;

    /* compiled from: City.kt */
    public static final class a implements Parcelable.Creator<City> {
        @Override // android.os.Parcelable.Creator
        public final City createFromParcel(Parcel parcel) {
            return new City(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final City[] newArray(int i) {
            return new City[i];
        }
    }

    public City(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof City)) {
            return false;
        }
        City city = (City) obj;
        return epx.f(this.b, city.b) && this.c == city.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("City(title=");
        sb.append(this.b);
        sb.append(", id=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
