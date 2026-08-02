package com.vk.ecomm.cart.impl.search_address.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: SearchAddressResult.kt */
/* loaded from: classes18.dex */
public abstract class SearchAddressResult implements Parcelable {

    /* compiled from: SearchAddressResult.kt */
    public static final class Custom extends SearchAddressResult {
        public static final Parcelable.Creator<Custom> CREATOR = new a();
        public final String b;

        /* compiled from: SearchAddressResult.kt */
        public static final class a implements Parcelable.Creator<Custom> {
            @Override // android.os.Parcelable.Creator
            public final Custom createFromParcel(Parcel parcel) {
                return new Custom(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(String str) {
            super(str, null);
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Custom) && epx.f(this.b, ((Custom) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Custom(address="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: SearchAddressResult.kt */
    public static final class Found extends SearchAddressResult {
        public static final Parcelable.Creator<Found> CREATOR = new a();
        public final String b;
        public final Coordinates c;

        /* compiled from: SearchAddressResult.kt */
        public static final class a implements Parcelable.Creator<Found> {
            @Override // android.os.Parcelable.Creator
            public final Found createFromParcel(Parcel parcel) {
                return new Found(parcel.readString(), Coordinates.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Found[] newArray(int i) {
                return new Found[i];
            }
        }

        public Found(String str, Coordinates coordinates) {
            super(str, null);
            this.b = str;
            this.c = coordinates;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Found)) {
                return false;
            }
            Found found = (Found) obj;
            return epx.f(this.b, found.b) && epx.f(this.c, found.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Found(address=" + this.b + ", coordinates=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            this.c.writeToParcel(parcel, i);
        }
    }

    public SearchAddressResult(String str, zcl zclVar) {
    }
}
