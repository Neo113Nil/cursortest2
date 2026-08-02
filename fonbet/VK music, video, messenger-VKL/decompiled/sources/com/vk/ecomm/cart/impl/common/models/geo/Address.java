package com.vk.ecomm.cart.impl.common.models.geo;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: Address.kt */
/* loaded from: classes18.dex */
public final class Address implements Parcelable {
    public static final Parcelable.Creator<Address> CREATOR = new a();
    public final City b;
    public final String c;
    public final boolean d;
    public final Coordinates e;

    /* compiled from: Address.kt */
    public static final class a implements Parcelable.Creator<Address> {
        @Override // android.os.Parcelable.Creator
        public final Address createFromParcel(Parcel parcel) {
            return new Address(City.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Coordinates.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Address[] newArray(int i) {
            return new Address[i];
        }
    }

    public Address(City city, String str, boolean z, Coordinates coordinates) {
        this.b = city;
        this.c = str;
        this.d = z;
        this.e = coordinates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return epx.f(this.b, address.b) && epx.f(this.c, address.c) && this.d == address.d && epx.f(this.e, address.e);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Coordinates coordinates = this.e;
        return b + (coordinates == null ? 0 : coordinates.hashCode());
    }

    public final String toString() {
        return "Address(city=" + this.b + ", title=" + this.c + ", isFull=" + this.d + ", coordinates=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Coordinates coordinates = this.e;
        if (coordinates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coordinates.writeToParcel(parcel, i);
        }
    }
}
