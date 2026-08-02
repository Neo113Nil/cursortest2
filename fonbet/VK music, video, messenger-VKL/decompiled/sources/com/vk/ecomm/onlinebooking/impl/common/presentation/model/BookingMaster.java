package com.vk.ecomm.onlinebooking.impl.common.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: BookingMaster.kt */
/* loaded from: classes18.dex */
public final class BookingMaster implements Parcelable {
    public static final Parcelable.Creator<BookingMaster> CREATOR = new a();
    public static final BookingMaster k = new BookingMaster(0, "", false, null, false, "", 0, "", null);
    public final int b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;

    /* compiled from: BookingMaster.kt */
    public static final class a implements Parcelable.Creator<BookingMaster> {
        @Override // android.os.Parcelable.Creator
        public final BookingMaster createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            return new BookingMaster(readInt, readString, z, parcel.readString(), parcel.readInt() == 0 ? z2 : true, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BookingMaster[] newArray(int i) {
            return new BookingMaster[i];
        }
    }

    public BookingMaster(int i, String str, boolean z, String str2, boolean z2, String str3, int i2, String str4, String str5) {
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = z2;
        this.g = str3;
        this.h = i2;
        this.i = str4;
        this.j = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingMaster)) {
            return false;
        }
        BookingMaster bookingMaster = (BookingMaster) obj;
        return this.b == bookingMaster.b && epx.f(this.c, bookingMaster.c) && this.d == bookingMaster.d && epx.f(this.e, bookingMaster.e) && this.f == bookingMaster.f && epx.f(this.g, bookingMaster.g) && this.h == bookingMaster.h && epx.f(this.i, bookingMaster.i) && epx.f(this.j, bookingMaster.j);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int a2 = urd0.a(shy.a(this.h, urd0.a(qoy.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31), 31, this.i);
        String str2 = this.j;
        return a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingMaster(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", bookable=");
        sb.append(this.d);
        sb.append(", specialization=");
        sb.append(this.e);
        sb.append(", showRating=");
        sb.append(this.f);
        sb.append(", rating=");
        sb.append(this.g);
        sb.append(", votesCount=");
        sb.append(this.h);
        sb.append(", avatar=");
        sb.append(this.i);
        sb.append(", address=");
        return ho8.a(sb, this.j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }
}
