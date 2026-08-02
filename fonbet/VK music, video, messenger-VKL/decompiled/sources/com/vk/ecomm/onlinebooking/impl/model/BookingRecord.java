package com.vk.ecomm.onlinebooking.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BookingRecord.kt */
/* loaded from: classes18.dex */
public final class BookingRecord implements Parcelable {
    public static final Parcelable.Creator<BookingRecord> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final List<BookingServiceModel> e;
    public final BookingMaster f;
    public final int g;
    public final String h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Company m;
    public final String n;
    public final int o;
    public final String p;

    /* compiled from: BookingRecord.kt */
    public static final class Company implements Parcelable {
        public static final Parcelable.Creator<Company> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: BookingRecord.kt */
        public static final class a implements Parcelable.Creator<Company> {
            @Override // android.os.Parcelable.Creator
            public final Company createFromParcel(Parcel parcel) {
                return new Company(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Company[] newArray(int i) {
                return new Company[i];
            }
        }

        public Company(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Company)) {
                return false;
            }
            Company company = (Company) obj;
            return epx.f(this.b, company.b) && epx.f(this.c, company.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Company(name=");
            sb.append(this.b);
            sb.append(", logo=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: BookingRecord.kt */
    public static final class a implements Parcelable.Creator<BookingRecord> {
        @Override // android.os.Parcelable.Creator
        public final BookingRecord createFromParcel(Parcel parcel) {
            boolean z;
            Company company;
            boolean z2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(BookingServiceModel.CREATOR, parcel, arrayList, i, 1);
            }
            BookingMaster createFromParcel = parcel.readInt() == 0 ? null : BookingMaster.CREATOR.createFromParcel(parcel);
            boolean z3 = false;
            int readInt3 = parcel.readInt();
            String readString3 = parcel.readString();
            boolean z4 = true;
            int readInt4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                company = null;
                z2 = true;
            } else {
                company = null;
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new BookingRecord(readInt, readString, readString2, arrayList, createFromParcel, readInt3, readString3, readInt4, z3, z2, z4, parcel.readInt() == 0 ? company : Company.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BookingRecord[] newArray(int i) {
            return new BookingRecord[i];
        }
    }

    public BookingRecord() {
        this(0, null, null, null, null, 0, null, 0, false, false, false, null, null, 0, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingRecord)) {
            return false;
        }
        BookingRecord bookingRecord = (BookingRecord) obj;
        return this.b == bookingRecord.b && epx.f(this.c, bookingRecord.c) && epx.f(this.d, bookingRecord.d) && epx.f(this.e, bookingRecord.e) && epx.f(this.f, bookingRecord.f) && this.g == bookingRecord.g && epx.f(this.h, bookingRecord.h) && this.i == bookingRecord.i && this.j == bookingRecord.j && this.k == bookingRecord.k && this.l == bookingRecord.l && epx.f(this.m, bookingRecord.m) && epx.f(this.n, bookingRecord.n) && this.o == bookingRecord.o && epx.f(this.p, bookingRecord.p);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        BookingMaster bookingMaster = this.f;
        int b = qoy.b(qoy.b(qoy.b(shy.a(this.i, urd0.a(shy.a(this.g, (a2 + (bookingMaster == null ? 0 : bookingMaster.hashCode())) * 31, 31), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l);
        Company company = this.m;
        return this.p.hashCode() + shy.a(this.o, urd0.a((b + (company != null ? company.hashCode() : 0)) * 31, 31, this.n), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingRecord(id=");
        sb.append(this.b);
        sb.append(", phone=");
        sb.append(this.c);
        sb.append(", fullName=");
        sb.append(this.d);
        sb.append(", services=");
        sb.append(this.e);
        sb.append(", master=");
        sb.append(this.f);
        sb.append(", timestamp=");
        sb.append(this.g);
        sb.append(", dateTime=");
        sb.append(this.h);
        sb.append(", length=");
        sb.append(this.i);
        sb.append(", allowDeleteRecord=");
        sb.append(this.j);
        sb.append(", allowChangeRecord=");
        sb.append(this.k);
        sb.append(", allowRepeatRecord=");
        sb.append(this.l);
        sb.append(", company=");
        sb.append(this.m);
        sb.append(", comment=");
        sb.append(this.n);
        sb.append(", activityId=");
        sb.append(this.o);
        sb.append(", recordHash=");
        return ho8.a(sb, this.p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            ((BookingServiceModel) a2.next()).writeToParcel(parcel, i);
        }
        BookingMaster bookingMaster = this.f;
        if (bookingMaster == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bookingMaster.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        Company company = this.m;
        if (company == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            company.writeToParcel(parcel, i);
        }
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
    }

    public BookingRecord(int i, String str, String str2, List<BookingServiceModel> list, BookingMaster bookingMaster, int i2, String str3, int i3, boolean z, boolean z2, boolean z3, Company company, String str4, int i4, String str5) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = bookingMaster;
        this.g = i2;
        this.h = str3;
        this.i = i3;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = company;
        this.n = str4;
        this.o = i4;
        this.p = str5;
    }

    public BookingRecord(int i, String str, String str2, List list, BookingMaster bookingMaster, int i2, String str3, int i3, boolean z, boolean z2, boolean z3, Company company, String str4, int i4, String str5, int i5, zcl zclVar) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? EmptyList.b : list, (i5 & 16) != 0 ? null : bookingMaster, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? "" : str3, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? false : z, (i5 & 512) != 0 ? false : z2, (i5 & 1024) != 0 ? false : z3, (i5 & 2048) == 0 ? company : null, (i5 & 4096) != 0 ? "" : str4, (i5 & 8192) != 0 ? 0 : i4, (i5 & 16384) != 0 ? "" : str5);
    }
}
