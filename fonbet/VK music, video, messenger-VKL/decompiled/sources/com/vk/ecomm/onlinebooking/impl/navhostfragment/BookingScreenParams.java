package com.vk.ecomm.onlinebooking.impl.navhostfragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.NotificationVariants;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.jgp;
import xsna.nr;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.v11;
import xsna.vu5;
import xsna.zcl;

/* compiled from: BookingScreenParams.kt */
/* loaded from: classes18.dex */
public final class BookingScreenParams implements Parcelable {
    public static final Parcelable.Creator<BookingScreenParams> CREATOR = new a();
    public final UserId b;
    public final int c;
    public final BookingSettings d;
    public final List<BookingServiceModel> e;
    public final BookingMaster f;
    public final boolean g;
    public final DateTime h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final String m;
    public final int n;
    public final BookingRecord o;
    public final Map<String, String> p;
    public final BookingServiceType q;
    public final BookingActionResult r;

    /* compiled from: BookingScreenParams.kt */
    public static final class DateTime implements Parcelable {
        public static final Parcelable.Creator<DateTime> CREATOR = new a();
        public final String b;
        public final String c;
        public final int d;
        public final Integer e;
        public final Integer f;
        public final int g;

        /* compiled from: BookingScreenParams.kt */
        public static final class a implements Parcelable.Creator<DateTime> {
            @Override // android.os.Parcelable.Creator
            public final DateTime createFromParcel(Parcel parcel) {
                return new DateTime(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final DateTime[] newArray(int i) {
                return new DateTime[i];
            }
        }

        public DateTime(String str, String str2, int i, Integer num, Integer num2, int i2) {
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = num;
            this.f = num2;
            this.g = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DateTime)) {
                return false;
            }
            DateTime dateTime = (DateTime) obj;
            return epx.f(this.b, dateTime.b) && epx.f(this.c, dateTime.c) && this.d == dateTime.d && epx.f(this.e, dateTime.e) && epx.f(this.f, dateTime.f) && this.g == dateTime.g;
        }

        public final int hashCode() {
            int a2 = shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31);
            Integer num = this.e;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f;
            return Integer.hashCode(this.g) + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DateTime(iso=");
            sb.append(this.b);
            sb.append(", timeString=");
            sb.append(this.c);
            sb.append(", duration=");
            sb.append(this.d);
            sb.append(", capacity=");
            sb.append(this.e);
            sb.append(", recordsCount=");
            sb.append(this.f);
            sb.append(", activityId=");
            return vu5.b(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
            Integer num = this.e;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Integer num2 = this.f;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            parcel.writeInt(this.g);
        }
    }

    /* compiled from: BookingScreenParams.kt */
    public static final class a implements Parcelable.Creator<BookingScreenParams> {
        @Override // android.os.Parcelable.Creator
        public final BookingScreenParams createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(BookingScreenParams.class.getClassLoader());
            int readInt = parcel.readInt();
            BookingSettings createFromParcel = BookingSettings.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (true) {
                if (i == readInt2) {
                    break;
                }
                i = en.a(BookingServiceModel.CREATOR, parcel, arrayList, i, 1);
            }
            BookingMaster createFromParcel2 = parcel.readInt() == 0 ? null : BookingMaster.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            DateTime createFromParcel3 = parcel.readInt() == 0 ? null : DateTime.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt3 = parcel.readInt();
            String readString4 = parcel.readString();
            int readInt4 = parcel.readInt();
            BookingRecord createFromParcel4 = parcel.readInt() == 0 ? null : BookingRecord.CREATOR.createFromParcel(parcel);
            int readInt5 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt5);
            int i2 = 0;
            while (i2 != readInt5) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                i2++;
                userId = userId;
            }
            return new BookingScreenParams(userId, readInt, createFromParcel, arrayList, createFromParcel2, z, createFromParcel3, readString, readString2, readString3, readInt3, readString4, readInt4, createFromParcel4, linkedHashMap, BookingServiceType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BookingActionResult.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BookingScreenParams[] newArray(int i) {
            return new BookingScreenParams[i];
        }
    }

    public BookingScreenParams(UserId userId, int i, BookingSettings bookingSettings, List<BookingServiceModel> list, BookingMaster bookingMaster, boolean z, DateTime dateTime, String str, String str2, String str3, int i2, String str4, int i3, BookingRecord bookingRecord, Map<String, String> map, BookingServiceType bookingServiceType, BookingActionResult bookingActionResult) {
        this.b = userId;
        this.c = i;
        this.d = bookingSettings;
        this.e = list;
        this.f = bookingMaster;
        this.g = z;
        this.h = dateTime;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = i2;
        this.m = str4;
        this.n = i3;
        this.o = bookingRecord;
        this.p = map;
        this.q = bookingServiceType;
        this.r = bookingActionResult;
    }

    public static BookingScreenParams a(BookingScreenParams bookingScreenParams, int i, BookingSettings bookingSettings, List list, BookingMaster bookingMaster, DateTime dateTime, int i2, String str, int i3, BookingRecord bookingRecord, int i4) {
        UserId userId = bookingScreenParams.b;
        int i5 = (i4 & 2) != 0 ? bookingScreenParams.c : i;
        BookingSettings bookingSettings2 = (i4 & 4) != 0 ? bookingScreenParams.d : bookingSettings;
        List list2 = (i4 & 8) != 0 ? bookingScreenParams.e : list;
        BookingMaster bookingMaster2 = (i4 & 16) != 0 ? bookingScreenParams.f : bookingMaster;
        boolean z = bookingScreenParams.g;
        DateTime dateTime2 = (i4 & 64) != 0 ? bookingScreenParams.h : dateTime;
        String str2 = bookingScreenParams.i;
        int i6 = i5;
        BookingSettings bookingSettings3 = bookingSettings2;
        List list3 = list2;
        BookingMaster bookingMaster3 = bookingMaster2;
        DateTime dateTime3 = dateTime2;
        String str3 = bookingScreenParams.j;
        String str4 = bookingScreenParams.k;
        int i7 = (i4 & 1024) != 0 ? bookingScreenParams.l : i2;
        String str5 = (i4 & 2048) != 0 ? bookingScreenParams.m : str;
        int i8 = (i4 & 4096) != 0 ? bookingScreenParams.n : i3;
        BookingRecord bookingRecord2 = (i4 & 8192) != 0 ? bookingScreenParams.o : bookingRecord;
        Map<String, String> map = bookingScreenParams.p;
        BookingRecord bookingRecord3 = bookingRecord2;
        BookingServiceType bookingServiceType = bookingScreenParams.q;
        BookingActionResult bookingActionResult = bookingScreenParams.r;
        bookingScreenParams.getClass();
        return new BookingScreenParams(userId, i6, bookingSettings3, list3, bookingMaster3, z, dateTime3, str2, str3, str4, i7, str5, i8, bookingRecord3, map, bookingServiceType, bookingActionResult);
    }

    public final Map<String, String> d() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BookingServiceModel> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingScreenParams)) {
            return false;
        }
        BookingScreenParams bookingScreenParams = (BookingScreenParams) obj;
        return epx.f(this.b, bookingScreenParams.b) && this.c == bookingScreenParams.c && epx.f(this.d, bookingScreenParams.d) && epx.f(this.e, bookingScreenParams.e) && epx.f(this.f, bookingScreenParams.f) && this.g == bookingScreenParams.g && epx.f(this.h, bookingScreenParams.h) && epx.f(this.i, bookingScreenParams.i) && epx.f(this.j, bookingScreenParams.j) && epx.f(this.k, bookingScreenParams.k) && this.l == bookingScreenParams.l && epx.f(this.m, bookingScreenParams.m) && this.n == bookingScreenParams.n && epx.f(this.o, bookingScreenParams.o) && epx.f(this.p, bookingScreenParams.p) && this.q == bookingScreenParams.q && this.r == bookingScreenParams.r;
    }

    public final BookingServiceType f() {
        return this.q;
    }

    public final int hashCode() {
        int a2 = fw3.a((this.d.hashCode() + shy.a(this.c, Long.hashCode(this.b.b) * 31, 31)) * 31, 31, this.e);
        BookingMaster bookingMaster = this.f;
        int b = qoy.b((a2 + (bookingMaster == null ? 0 : bookingMaster.hashCode())) * 31, 31, this.g);
        DateTime dateTime = this.h;
        int a3 = shy.a(this.n, urd0.a(shy.a(this.l, urd0.a(urd0.a(urd0.a((b + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m), 31);
        BookingRecord bookingRecord = this.o;
        int hashCode = (this.q.hashCode() + v11.a((a3 + (bookingRecord == null ? 0 : bookingRecord.hashCode())) * 31, 31, this.p)) * 31;
        BookingActionResult bookingActionResult = this.r;
        return hashCode + (bookingActionResult != null ? bookingActionResult.hashCode() : 0);
    }

    public final String toString() {
        return "BookingScreenParams(groupId=" + this.b + ", flowId=" + this.c + ", settings=" + this.d + ", services=" + this.e + ", master=" + this.f + ", isSingleMaster=" + this.g + ", dateTime=" + this.h + ", comment=" + this.i + ", name=" + this.j + ", phone=" + this.k + ", recordId=" + this.l + ", recordHash=" + this.m + ", notifyInHours=" + this.n + ", record=" + this.o + ", queryParams=" + this.p + ", type=" + this.q + ", actionResult=" + this.r + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        this.d.writeToParcel(parcel, i);
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
        parcel.writeInt(this.g ? 1 : 0);
        DateTime dateTime = this.h;
        if (dateTime == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dateTime.writeToParcel(parcel, i);
        }
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        BookingRecord bookingRecord = this.o;
        if (bookingRecord == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bookingRecord.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.p;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        this.q.writeToParcel(parcel, i);
        BookingActionResult bookingActionResult = this.r;
        if (bookingActionResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bookingActionResult.writeToParcel(parcel, i);
        }
    }

    public BookingScreenParams(UserId userId, int i, BookingSettings bookingSettings, List list, BookingMaster bookingMaster, boolean z, DateTime dateTime, String str, String str2, String str3, int i2, String str4, int i3, BookingRecord bookingRecord, Map map, BookingServiceType bookingServiceType, BookingActionResult bookingActionResult, int i4, zcl zclVar) {
        this(userId, (i4 & 2) != 0 ? a.f.d.a : i, (i4 & 4) != 0 ? BookingSettings.k : bookingSettings, (i4 & 8) != 0 ? EmptyList.b : list, (i4 & 16) != 0 ? null : bookingMaster, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? null : dateTime, (i4 & 128) != 0 ? "" : str, (i4 & 256) != 0 ? "" : str2, (i4 & 512) != 0 ? "" : str3, (i4 & 1024) == 0 ? i2 : 0, (i4 & 2048) == 0 ? str4 : "", (i4 & 4096) != 0 ? NotificationVariants.HOURS_24.j() : i3, (i4 & 8192) != 0 ? null : bookingRecord, (i4 & 16384) != 0 ? jgp.b : map, (i4 & 32768) != 0 ? BookingServiceType.INDIVIDUAL : bookingServiceType, (i4 & 65536) != 0 ? null : bookingActionResult);
    }
}
