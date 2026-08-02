package com.vk.ecomm.cart.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.asp;
import xsna.cjl0;
import xsna.epx;
import xsna.er;
import xsna.ho8;
import xsna.urd0;
import xsna.zjh0;
import xsna.zrp;

/* compiled from: DeliveryPoint.kt */
/* loaded from: classes18.dex */
public final class DeliveryPoint implements Parcelable {
    public static final Parcelable.Creator<DeliveryPoint> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final String d;
    public final Service e;
    public final String f;
    public final Address g;
    public final WorkingInfo h;
    public final PlaceMark i;

    /* compiled from: DeliveryPoint.kt */
    public static final class Address implements Parcelable {
        public static final Parcelable.Creator<Address> CREATOR = new a();
        public final String b;
        public final double c;
        public final double d;
        public final String e;

        /* compiled from: DeliveryPoint.kt */
        public static final class a implements Parcelable.Creator<Address> {
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                return new Address(parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i) {
                return new Address[i];
            }
        }

        public Address(String str, double d, double d2, String str2) {
            this.b = str;
            this.c = d;
            this.d = d2;
            this.e = str2;
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
            return epx.f(this.b, address.b) && Double.compare(this.c, address.c) == 0 && Double.compare(this.d, address.d) == 0 && epx.f(this.e, address.e);
        }

        public final int hashCode() {
            int b = zjh0.b(this.d, zjh0.b(this.c, this.b.hashCode() * 31, 31), 31);
            String str = this.e;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Address(address=");
            sb.append(this.b);
            sb.append(", lat=");
            sb.append(this.c);
            sb.append(", lng=");
            sb.append(this.d);
            sb.append(", additionalInfo=");
            return ho8.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeDouble(this.c);
            parcel.writeDouble(this.d);
            parcel.writeString(this.e);
        }
    }

    /* compiled from: DeliveryPoint.kt */
    public static final class OpenStatus implements Parcelable {
        public static final Parcelable.Creator<OpenStatus> CREATOR = new a();
        public final Status b;
        public final String c;
        public final String d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DeliveryPoint.kt */
        public static final class Status {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status BREAK;
            public static final Status CLOSE;
            public static final a Companion;
            public static final Status OPEN;
            public static final Status UNKNOWN;

            /* compiled from: DeliveryPoint.kt */
            public static final class a {
            }

            static {
                Status status = new Status("OPEN", 0);
                OPEN = status;
                Status status2 = new Status("CLOSE", 1);
                CLOSE = status2;
                Status status3 = new Status(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
                UNKNOWN = status3;
                Status status4 = new Status("BREAK", 3);
                BREAK = status4;
                Status[] statusArr = {status, status2, status3, status4};
                $VALUES = statusArr;
                $ENTRIES = new asp(statusArr);
                Companion = new a();
            }

            public Status() {
                throw null;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        /* compiled from: DeliveryPoint.kt */
        public static final class a implements Parcelable.Creator<OpenStatus> {
            @Override // android.os.Parcelable.Creator
            public final OpenStatus createFromParcel(Parcel parcel) {
                return new OpenStatus(Status.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenStatus[] newArray(int i) {
                return new OpenStatus[i];
            }
        }

        public OpenStatus(Status status, String str, String str2) {
            this.b = status;
            this.c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenStatus)) {
                return false;
            }
            OpenStatus openStatus = (OpenStatus) obj;
            return this.b == openStatus.b && epx.f(this.c, openStatus.c) && epx.f(this.d, openStatus.d);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenStatus(status=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", subtitle=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    /* compiled from: DeliveryPoint.kt */
    public static final class PlaceMark implements Parcelable {
        public static final Parcelable.Creator<PlaceMark> CREATOR = new a();
        public final String b;
        public final String c;
        public final Image d;

        /* compiled from: DeliveryPoint.kt */
        public static final class a implements Parcelable.Creator<PlaceMark> {
            @Override // android.os.Parcelable.Creator
            public final PlaceMark createFromParcel(Parcel parcel) {
                return new PlaceMark(parcel.readString(), parcel.readString(), (Image) parcel.readValue(PlaceMark.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PlaceMark[] newArray(int i) {
                return new PlaceMark[i];
            }
        }

        public PlaceMark(String str, String str2, Image image) {
            this.b = str;
            this.c = str2;
            this.d = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaceMark)) {
                return false;
            }
            PlaceMark placeMark = (PlaceMark) obj;
            return epx.f(this.b, placeMark.b) && epx.f(this.c, placeMark.c) && epx.f(this.d, placeMark.d);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Image image = this.d;
            return hashCode2 + (image != null ? image.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaceMark(title=");
            sb.append(this.b);
            sb.append(", color=");
            sb.append(this.c);
            sb.append(", groupAvatars=");
            return er.d(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeValue(this.d);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeliveryPoint.kt */
    public static final class Service {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Service[] $VALUES;
        public static final Service BOXBERRY;
        public static final a Companion;
        public static final Service OTHER;
        public static final Service RUSSIAN_POST;
        public static final Service SDEK;
        public static final Service SELF;
        private final Integer id;

        /* compiled from: DeliveryPoint.kt */
        public static final class a {
            public static Service a(int i) {
                Object obj;
                Iterator<E> it = Service.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Integer num = ((Service) obj).id;
                    if (num != null && num.intValue() == i) {
                        break;
                    }
                }
                Service service = (Service) obj;
                return service == null ? Service.OTHER : service;
            }
        }

        static {
            Service service = new Service("BOXBERRY", 0, 2);
            BOXBERRY = service;
            Service service2 = new Service("SDEK", 1, 3);
            SDEK = service2;
            Service service3 = new Service("RUSSIAN_POST", 2, 4);
            RUSSIAN_POST = service3;
            Service service4 = new Service("SELF", 3, 6);
            SELF = service4;
            Service service5 = new Service(NativeAdContent.ViewTag.OTHER, 4, null);
            OTHER = service5;
            Service[] serviceArr = {service, service2, service3, service4, service5};
            $VALUES = serviceArr;
            $ENTRIES = new asp(serviceArr);
            Companion = new a();
        }

        public Service(String str, int i, Integer num) {
            this.id = num;
        }

        public static zrp<Service> h() {
            return $ENTRIES;
        }

        public static Service valueOf(String str) {
            return (Service) Enum.valueOf(Service.class, str);
        }

        public static Service[] values() {
            return (Service[]) $VALUES.clone();
        }
    }

    /* compiled from: DeliveryPoint.kt */
    public static final class TimetableBreak implements Parcelable {
        public static final Parcelable.Creator<TimetableBreak> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: DeliveryPoint.kt */
        public static final class a implements Parcelable.Creator<TimetableBreak> {
            @Override // android.os.Parcelable.Creator
            public final TimetableBreak createFromParcel(Parcel parcel) {
                return new TimetableBreak(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TimetableBreak[] newArray(int i) {
                return new TimetableBreak[i];
            }
        }

        public TimetableBreak(String str, String str2) {
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
            if (!(obj instanceof TimetableBreak)) {
                return false;
            }
            TimetableBreak timetableBreak = (TimetableBreak) obj;
            return epx.f(this.b, timetableBreak.b) && epx.f(this.c, timetableBreak.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TimetableBreak(startTime=");
            sb.append(this.b);
            sb.append(", endTime=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeliveryPoint.kt */
    public static final class WeekDay {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WeekDay[] $VALUES;
        public static final WeekDay FRIDAY;
        public static final WeekDay MONDAY;
        public static final WeekDay SATURDAY;
        public static final WeekDay SUNDAY;
        public static final WeekDay THURSDAY;
        public static final WeekDay TUESDAY;
        public static final WeekDay WEDNESDAY;

        static {
            WeekDay weekDay = new WeekDay("MONDAY", 0);
            MONDAY = weekDay;
            WeekDay weekDay2 = new WeekDay("TUESDAY", 1);
            TUESDAY = weekDay2;
            WeekDay weekDay3 = new WeekDay("WEDNESDAY", 2);
            WEDNESDAY = weekDay3;
            WeekDay weekDay4 = new WeekDay("THURSDAY", 3);
            THURSDAY = weekDay4;
            WeekDay weekDay5 = new WeekDay("FRIDAY", 4);
            FRIDAY = weekDay5;
            WeekDay weekDay6 = new WeekDay("SATURDAY", 5);
            SATURDAY = weekDay6;
            WeekDay weekDay7 = new WeekDay("SUNDAY", 6);
            SUNDAY = weekDay7;
            WeekDay[] weekDayArr = {weekDay, weekDay2, weekDay3, weekDay4, weekDay5, weekDay6, weekDay7};
            $VALUES = weekDayArr;
            $ENTRIES = new asp(weekDayArr);
        }

        public WeekDay() {
            throw null;
        }

        public static WeekDay valueOf(String str) {
            return (WeekDay) Enum.valueOf(WeekDay.class, str);
        }

        public static WeekDay[] values() {
            return (WeekDay[]) $VALUES.clone();
        }
    }

    /* compiled from: DeliveryPoint.kt */
    public static final class WeekDayTimetable implements Parcelable {
        public static final Parcelable.Creator<WeekDayTimetable> CREATOR = new a();
        public final String b;
        public final String c;
        public final TimetableBreak d;

        /* compiled from: DeliveryPoint.kt */
        public static final class a implements Parcelable.Creator<WeekDayTimetable> {
            @Override // android.os.Parcelable.Creator
            public final WeekDayTimetable createFromParcel(Parcel parcel) {
                return new WeekDayTimetable(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TimetableBreak.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final WeekDayTimetable[] newArray(int i) {
                return new WeekDayTimetable[i];
            }
        }

        public WeekDayTimetable(String str, String str2, TimetableBreak timetableBreak) {
            this.b = str;
            this.c = str2;
            this.d = timetableBreak;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WeekDayTimetable)) {
                return false;
            }
            WeekDayTimetable weekDayTimetable = (WeekDayTimetable) obj;
            return epx.f(this.b, weekDayTimetable.b) && epx.f(this.c, weekDayTimetable.c) && epx.f(this.d, weekDayTimetable.d);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
            TimetableBreak timetableBreak = this.d;
            return a2 + (timetableBreak == null ? 0 : timetableBreak.hashCode());
        }

        public final String toString() {
            return "WeekDayTimetable(openTime=" + this.b + ", closeTime=" + this.c + ", timetableBreak=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            TimetableBreak timetableBreak = this.d;
            if (timetableBreak == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                timetableBreak.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeliveryPoint.kt */
    public static final class WorkInfoStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WorkInfoStatus[] $VALUES;
        public static final WorkInfoStatus ALWAYS_OPENED;
        public static final a Companion;
        public static final WorkInfoStatus FOREVER_CLOSED;
        public static final WorkInfoStatus NO_INFO;
        public static final WorkInfoStatus TEMPORARILY_CLOSED;
        public static final WorkInfoStatus TIMETABLE;

        /* compiled from: DeliveryPoint.kt */
        public static final class a {
        }

        static {
            WorkInfoStatus workInfoStatus = new WorkInfoStatus("NO_INFO", 0);
            NO_INFO = workInfoStatus;
            WorkInfoStatus workInfoStatus2 = new WorkInfoStatus("TEMPORARILY_CLOSED", 1);
            TEMPORARILY_CLOSED = workInfoStatus2;
            WorkInfoStatus workInfoStatus3 = new WorkInfoStatus("ALWAYS_OPENED", 2);
            ALWAYS_OPENED = workInfoStatus3;
            WorkInfoStatus workInfoStatus4 = new WorkInfoStatus("TIMETABLE", 3);
            TIMETABLE = workInfoStatus4;
            WorkInfoStatus workInfoStatus5 = new WorkInfoStatus("FOREVER_CLOSED", 4);
            FOREVER_CLOSED = workInfoStatus5;
            WorkInfoStatus[] workInfoStatusArr = {workInfoStatus, workInfoStatus2, workInfoStatus3, workInfoStatus4, workInfoStatus5};
            $VALUES = workInfoStatusArr;
            $ENTRIES = new asp(workInfoStatusArr);
            Companion = new a();
        }

        public WorkInfoStatus() {
            throw null;
        }

        public static WorkInfoStatus valueOf(String str) {
            return (WorkInfoStatus) Enum.valueOf(WorkInfoStatus.class, str);
        }

        public static WorkInfoStatus[] values() {
            return (WorkInfoStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: DeliveryPoint.kt */
    public static final class WorkingInfo implements Parcelable {
        public static final Parcelable.Creator<WorkingInfo> CREATOR = new a();
        public final OpenStatus b;
        public final WorkInfoStatus c;
        public final Map<WeekDay, WeekDayTimetable> d;

        /* compiled from: DeliveryPoint.kt */
        public static final class a implements Parcelable.Creator<WorkingInfo> {
            @Override // android.os.Parcelable.Creator
            public final WorkingInfo createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap = null;
                OpenStatus createFromParcel = parcel.readInt() == 0 ? null : OpenStatus.CREATOR.createFromParcel(parcel);
                WorkInfoStatus valueOf = parcel.readInt() == 0 ? null : WorkInfoStatus.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashMap2.put(WeekDay.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : WeekDayTimetable.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new WorkingInfo(createFromParcel, valueOf, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final WorkingInfo[] newArray(int i) {
                return new WorkingInfo[i];
            }
        }

        public WorkingInfo(OpenStatus openStatus, WorkInfoStatus workInfoStatus, Map<WeekDay, WeekDayTimetable> map) {
            this.b = openStatus;
            this.c = workInfoStatus;
            this.d = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkingInfo)) {
                return false;
            }
            WorkingInfo workingInfo = (WorkingInfo) obj;
            return epx.f(this.b, workingInfo.b) && this.c == workingInfo.c && epx.f(this.d, workingInfo.d);
        }

        public final int hashCode() {
            OpenStatus openStatus = this.b;
            int hashCode = (openStatus == null ? 0 : openStatus.hashCode()) * 31;
            WorkInfoStatus workInfoStatus = this.c;
            int hashCode2 = (hashCode + (workInfoStatus == null ? 0 : workInfoStatus.hashCode())) * 31;
            Map<WeekDay, WeekDayTimetable> map = this.d;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WorkingInfo(openStatus=");
            sb.append(this.b);
            sb.append(", workInfoStatus=");
            sb.append(this.c);
            sb.append(", timetable=");
            return cjl0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            OpenStatus openStatus = this.b;
            if (openStatus == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                openStatus.writeToParcel(parcel, i);
            }
            WorkInfoStatus workInfoStatus = this.c;
            if (workInfoStatus == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(workInfoStatus.name());
            }
            Map<WeekDay, WeekDayTimetable> map = this.d;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<WeekDay, WeekDayTimetable> entry : map.entrySet()) {
                parcel.writeString(entry.getKey().name());
                WeekDayTimetable value = entry.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value.writeToParcel(parcel, i);
                }
            }
        }
    }

    /* compiled from: DeliveryPoint.kt */
    public static final class a implements Parcelable.Creator<DeliveryPoint> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryPoint createFromParcel(Parcel parcel) {
            return new DeliveryPoint(parcel.readInt(), (UserId) parcel.readParcelable(DeliveryPoint.class.getClassLoader()), parcel.readString(), Service.valueOf(parcel.readString()), parcel.readString(), Address.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WorkingInfo.CREATOR.createFromParcel(parcel), PlaceMark.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryPoint[] newArray(int i) {
            return new DeliveryPoint[i];
        }
    }

    public DeliveryPoint(int i, UserId userId, String str, Service service, String str2, Address address, WorkingInfo workingInfo, PlaceMark placeMark) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = service;
        this.f = str2;
        this.g = address;
        this.h = workingInfo;
        this.i = placeMark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPoint)) {
            return false;
        }
        DeliveryPoint deliveryPoint = (DeliveryPoint) obj;
        return this.b == deliveryPoint.b && epx.f(this.c, deliveryPoint.c) && epx.f(this.d, deliveryPoint.d) && this.e == deliveryPoint.e && epx.f(this.f, deliveryPoint.f) && epx.f(this.g, deliveryPoint.g) && epx.f(this.h, deliveryPoint.h) && epx.f(this.i, deliveryPoint.i);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        UserId userId = this.c;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.d;
        int hashCode3 = (this.g.hashCode() + urd0.a((this.e.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f)) * 31;
        WorkingInfo workingInfo = this.h;
        return this.i.hashCode() + ((hashCode3 + (workingInfo != null ? workingInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f + "; " + this.g.b + "; id = " + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
        parcel.writeString(this.f);
        this.g.writeToParcel(parcel, i);
        WorkingInfo workingInfo = this.h;
        if (workingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            workingInfo.writeToParcel(parcel, i);
        }
        this.i.writeToParcel(parcel, i);
    }
}
