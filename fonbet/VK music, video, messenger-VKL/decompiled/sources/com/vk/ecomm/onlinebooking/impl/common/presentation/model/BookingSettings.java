package com.vk.ecomm.onlinebooking.impl.common.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.urd0;

/* compiled from: BookingSettings.kt */
/* loaded from: classes18.dex */
public final class BookingSettings implements Parcelable {
    public static final Parcelable.Creator<BookingSettings> CREATOR = new a();
    public static final BookingSettings k = new BookingSettings(0, "", "", "", "", null, null, EmptyList.b, "");
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List<BookingServiceType> i;
    public final String j;

    /* compiled from: BookingSettings.kt */
    public static final class a implements Parcelable.Creator<BookingSettings> {
        @Override // android.os.Parcelable.Creator
        public final BookingSettings createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(BookingServiceType.CREATOR, parcel, arrayList, i, 1);
            }
            return new BookingSettings(readInt, readString, readString2, readString3, readString4, readString5, readString6, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BookingSettings[] newArray(int i) {
            return new BookingSettings[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BookingSettings(int i, String str, String str2, String str3, String str4, String str5, String str6, List<? extends BookingServiceType> list, String str7) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = list;
        this.j = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingSettings)) {
            return false;
        }
        BookingSettings bookingSettings = (BookingSettings) obj;
        return this.b == bookingSettings.b && epx.f(this.c, bookingSettings.c) && epx.f(this.d, bookingSettings.d) && epx.f(this.e, bookingSettings.e) && epx.f(this.f, bookingSettings.f) && epx.f(this.g, bookingSettings.g) && epx.f(this.h, bookingSettings.h) && epx.f(this.i, bookingSettings.i) && epx.f(this.j, bookingSettings.j);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int a3 = fw3.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        String str3 = this.j;
        return a3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingSettings(maxServiceCount=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(", groupName=");
        sb.append(this.d);
        sb.append(", groupLogo=");
        sb.append(this.e);
        sb.append(", legalText=");
        sb.append(this.f);
        sb.append(", privacyPolicyUrl=");
        sb.append(this.g);
        sb.append(", termsOfServiceUrl=");
        sb.append(this.h);
        sb.append(", menuItems=");
        sb.append(this.i);
        sb.append(", newsletterConsentUrl=");
        return ho8.a(sb, this.j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        Iterator a2 = ao.a(parcel, this.i);
        while (a2.hasNext()) {
            ((BookingServiceType) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.j);
    }
}
