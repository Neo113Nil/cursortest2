package com.vk.ecomm.onlinebooking.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: BookingServiceModel.kt */
/* loaded from: classes18.dex */
public final class BookingServiceModel implements Parcelable {
    public static final Parcelable.Creator<BookingServiceModel> CREATOR = new a();
    public final int b;
    public final String c;
    public final Integer d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final boolean j;
    public final int k;
    public final Integer l;
    public final int m;

    /* compiled from: BookingServiceModel.kt */
    public static final class a implements Parcelable.Creator<BookingServiceModel> {
        @Override // android.os.Parcelable.Creator
        public final BookingServiceModel createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer num;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            int readInt2 = parcel.readInt();
            Integer num2 = num;
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            String readString2 = parcel.readString();
            Integer num3 = num2;
            String readString3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int readInt5 = parcel.readInt();
            if (parcel.readInt() != 0) {
                num3 = Integer.valueOf(parcel.readInt());
            }
            return new BookingServiceModel(readInt, readString, valueOf, readInt2, readInt3, readInt4, readString2, readString3, z, readInt5, num3, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final BookingServiceModel[] newArray(int i) {
            return new BookingServiceModel[i];
        }
    }

    public BookingServiceModel(int i, String str, Integer num, int i2, int i3, int i4, String str2, String str3, boolean z, int i5, Integer num2, int i6) {
        this.b = i;
        this.c = str;
        this.d = num;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = str2;
        this.i = str3;
        this.j = z;
        this.k = i5;
        this.l = num2;
        this.m = i6;
    }

    public static BookingServiceModel a(BookingServiceModel bookingServiceModel, int i, int i2, int i3, int i4, int i5) {
        int i6 = bookingServiceModel.b;
        String str = bookingServiceModel.c;
        Integer num = (i5 & 4) != 0 ? bookingServiceModel.d : -1;
        int i7 = (i5 & 8) != 0 ? bookingServiceModel.e : i;
        int i8 = (i5 & 16) != 0 ? bookingServiceModel.f : i2;
        int i9 = bookingServiceModel.g;
        String str2 = bookingServiceModel.h;
        String str3 = bookingServiceModel.i;
        boolean z = bookingServiceModel.j;
        int i10 = (i5 & 512) != 0 ? bookingServiceModel.k : i3;
        Integer num2 = bookingServiceModel.l;
        int i11 = (i5 & 2048) != 0 ? bookingServiceModel.m : i4;
        bookingServiceModel.getClass();
        return new BookingServiceModel(i6, str, num, i7, i8, i9, str2, str3, z, i10, num2, i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingServiceModel)) {
            return false;
        }
        BookingServiceModel bookingServiceModel = (BookingServiceModel) obj;
        return this.b == bookingServiceModel.b && epx.f(this.c, bookingServiceModel.c) && epx.f(this.d, bookingServiceModel.d) && this.e == bookingServiceModel.e && this.f == bookingServiceModel.f && this.g == bookingServiceModel.g && epx.f(this.h, bookingServiceModel.h) && epx.f(this.i, bookingServiceModel.i) && this.j == bookingServiceModel.j && this.k == bookingServiceModel.k && epx.f(this.l, bookingServiceModel.l) && this.m == bookingServiceModel.m;
    }

    public final int getId() {
        return this.b;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        Integer num = this.d;
        int a3 = shy.a(this.g, shy.a(this.f, shy.a(this.e, (a2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
        String str = this.h;
        int hashCode = (a3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int a4 = shy.a(this.k, qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31);
        Integer num2 = this.l;
        return Integer.hashCode(this.m) + ((a4 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingServiceModel(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", categoryId=");
        sb.append(this.d);
        sb.append(", minPrice=");
        sb.append(this.e);
        sb.append(", maxPrice=");
        sb.append(this.f);
        sb.append(", discount=");
        sb.append(this.g);
        sb.append(", comment=");
        sb.append(this.h);
        sb.append(", image=");
        sb.append(this.i);
        sb.append(", isActive=");
        sb.append(this.j);
        sb.append(", seanceLength=");
        sb.append(this.k);
        sb.append(", weight=");
        sb.append(this.l);
        sb.append(", listKey=");
        return vu5.b(sb, this.m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k);
        Integer num2 = this.l;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeInt(this.m);
    }
}
