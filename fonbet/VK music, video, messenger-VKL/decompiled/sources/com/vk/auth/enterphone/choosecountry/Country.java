package com.vk.auth.enterphone.choosecountry;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: Country.kt */
/* loaded from: classes15.dex */
public final class Country implements Parcelable {
    public static final Parcelable.Creator<Country> CREATOR = new a();
    public static final Country f = new Country(1, Gc.e, "RU", "Russia");
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: Country.kt */
    public static final class a implements Parcelable.Creator<Country> {
        @Override // android.os.Parcelable.Creator
        public final Country createFromParcel(Parcel parcel) {
            return new Country(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Country[] newArray(int i) {
            return new Country[i];
        }
    }

    /* compiled from: Country.kt */
    public static final class b {
        public static Country a() {
            return Country.f;
        }
    }

    public Country(int i, String str, String str2, String str3) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Country)) {
            return false;
        }
        Country country = (Country) obj;
        return this.b == country.b && epx.f(this.c, country.c) && epx.f(this.d, country.d) && epx.f(this.e, country.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country(id=");
        sb.append(this.b);
        sb.append(", phoneCode=");
        sb.append(this.c);
        sb.append(", isoCode=");
        sb.append(this.d);
        sb.append(", name=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
