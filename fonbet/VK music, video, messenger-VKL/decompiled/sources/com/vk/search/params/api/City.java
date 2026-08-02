package com.vk.search.params.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SearchParamsWithCity.kt */
/* loaded from: classes5.dex */
public final class City implements Parcelable {
    public static final Parcelable.Creator<City> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: SearchParamsWithCity.kt */
    public static final class a implements Parcelable.Creator<City> {
        @Override // android.os.Parcelable.Creator
        public final City createFromParcel(Parcel parcel) {
            return new City(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final City[] newArray(int i) {
            return new City[i];
        }
    }

    public City(int i, String str, String str2, String str3) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
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
        return this.b == city.b && epx.f(this.c, city.c) && epx.f(this.d, city.d) && epx.f(this.e, city.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public /* synthetic */ City(int i, String str, String str2, String str3, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
