package com.vk.ecomm.cart.impl.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: CourierAddress.kt */
/* loaded from: classes18.dex */
public final class CourierAddress implements Parcelable {
    public static final Parcelable.Creator<CourierAddress> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final Coordinates d;

    /* compiled from: CourierAddress.kt */
    public static final class a implements Parcelable.Creator<CourierAddress> {
        @Override // android.os.Parcelable.Creator
        public final CourierAddress createFromParcel(Parcel parcel) {
            return new CourierAddress(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Coordinates.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CourierAddress[] newArray(int i) {
            return new CourierAddress[i];
        }
    }

    public CourierAddress(String str, boolean z, Coordinates coordinates) {
        this.b = str;
        this.c = z;
        this.d = coordinates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourierAddress)) {
            return false;
        }
        CourierAddress courierAddress = (CourierAddress) obj;
        return epx.f(this.b, courierAddress.b) && this.c == courierAddress.c && epx.f(this.d, courierAddress.d);
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        Coordinates coordinates = this.d;
        return b + (coordinates == null ? 0 : coordinates.hashCode());
    }

    public final String toString() {
        return "CourierAddress(address=" + this.b + ", isCustom=" + this.c + ", coordinates=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        Coordinates coordinates = this.d;
        if (coordinates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coordinates.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CourierAddress(String str, boolean z, Coordinates coordinates, int i, zcl zclVar) {
        this(str, z, (i & 4) != 0 ? null : coordinates);
    }
}
