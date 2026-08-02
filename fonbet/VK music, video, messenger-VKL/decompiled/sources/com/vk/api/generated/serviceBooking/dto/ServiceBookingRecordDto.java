package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ao;
import xsna.en;
import xsna.eok;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ServiceBookingRecordDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingRecordDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingRecordDto> CREATOR = new a();

    @pmi0("activity_id")
    private final int activityId;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final ServiceBookingAddressDto address;

    @pmi0("allow_change_record")
    private final boolean allowChangeRecord;

    @pmi0("allow_delete_record")
    private final boolean allowDeleteRecord;

    @pmi0("allow_repeat_record")
    private final Boolean allowRepeatRecord;

    @pmi0("api_id")
    private final String apiId;

    @pmi0("attendance")
    private final int attendance;

    @pmi0("clients_count")
    private final int clientsCount;

    @pmi0("comment")
    private final String comment;

    @pmi0("company")
    private final ServiceBookingCompanyDto company;

    @pmi0("create_date")
    private final String createDate;

    @pmi0("date")
    private final String date;

    @pmi0("datetime")
    private final String datetime;

    @pmi0("deleted")
    private final boolean deleted;

    @pmi0("id")
    private final int id;

    @pmi0("is_confirmation_needed")
    private final boolean isConfirmationNeeded;

    @pmi0("last_change_date")
    private final String lastChangeDate;

    @pmi0("length")
    private final int length;

    @pmi0("master_requested")
    private final boolean masterRequested;

    @pmi0("name")
    private final String name;

    @pmi0("notify_by_email")
    private final int notifyByEmail;

    @pmi0("notify_by_sms")
    private final int notifyBySms;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    private final boolean online;

    @pmi0("paid_amount")
    private final int paidAmount;

    @pmi0("phone")
    private final String phone;

    @pmi0("prepaid")
    private final boolean prepaid;

    @pmi0("prepaid_confirmed")
    private final boolean prepaidConfirmed;

    @pmi0("record_hash")
    private final String recordHash;

    @pmi0("review_enabled")
    private final boolean reviewEnabled;

    @pmi0("services")
    private final List<ServiceBookingBookedServiceDto> services;

    @pmi0("staff")
    private final ServiceBookingBookedStaffDto staff;

    @pmi0("token")
    private final String token;

    /* compiled from: ServiceBookingRecordDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingRecordDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingRecordDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            Boolean valueOf;
            int i;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(ServiceBookingBookedServiceDto.CREATOR, parcel, arrayList, i2, 1);
            }
            ServiceBookingCompanyDto createFromParcel = ServiceBookingCompanyDto.CREATOR.createFromParcel(parcel);
            ServiceBookingBookedStaffDto createFromParcel2 = ServiceBookingBookedStaffDto.CREATOR.createFromParcel(parcel);
            int readInt3 = parcel.readInt();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z14 = true;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
                z2 = false;
            } else {
                z = true;
                z14 = false;
                z2 = false;
            }
            int readInt4 = parcel.readInt();
            boolean z15 = z;
            int readInt5 = parcel.readInt();
            boolean z16 = z2;
            int readInt6 = parcel.readInt();
            boolean z17 = z15;
            int readInt7 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z3 = z16;
                z16 = z17;
            } else {
                z3 = z16;
            }
            if (parcel.readInt() != 0) {
                z4 = z17;
                z5 = z3;
            } else {
                z4 = z17;
                z17 = z3;
                z5 = z17;
            }
            String readString8 = parcel.readString();
            boolean z18 = z4;
            String readString9 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = z5;
                z5 = z18;
            } else {
                z6 = z5;
            }
            if (parcel.readInt() != 0) {
                z7 = z18;
                z8 = z6;
            } else {
                z7 = z18;
                z18 = z6;
                z8 = z18;
            }
            int readInt8 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z9 = z7;
                z10 = z8;
            } else {
                z9 = z7;
                z7 = z8;
                z10 = z7;
            }
            String readString10 = parcel.readString();
            boolean z19 = z9;
            int readInt9 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z11 = z10;
                z10 = z19;
            } else {
                z11 = z10;
            }
            if (parcel.readInt() != 0) {
                z12 = z19;
            } else {
                z12 = z19;
                z19 = z11;
            }
            if (parcel.readInt() != 0) {
                z13 = z11;
                z11 = z12;
            } else {
                z13 = z11;
            }
            ServiceBookingAddressDto serviceBookingAddressDto = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() == 0) {
                    z12 = z13;
                }
                valueOf = Boolean.valueOf(z12);
            }
            if (parcel.readInt() == 0) {
                i = readInt;
            } else {
                i = readInt;
                serviceBookingAddressDto = ServiceBookingAddressDto.CREATOR.createFromParcel(parcel);
            }
            return new ServiceBookingRecordDto(i, readString, readString2, readString3, arrayList, createFromParcel, createFromParcel2, readInt3, readString4, readString5, readString6, readString7, z14, readInt4, readInt5, readInt6, readInt7, z16, z17, readString8, readString9, z5, z18, readInt8, z7, readString10, readInt9, z10, z19, z11, valueOf, serviceBookingAddressDto);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingRecordDto[] newArray(int i) {
            return new ServiceBookingRecordDto[i];
        }
    }

    public ServiceBookingRecordDto(int i, String str, String str2, String str3, List<ServiceBookingBookedServiceDto> list, ServiceBookingCompanyDto serviceBookingCompanyDto, ServiceBookingBookedStaffDto serviceBookingBookedStaffDto, int i2, String str4, String str5, String str6, String str7, boolean z, int i3, int i4, int i5, int i6, boolean z2, boolean z3, String str8, String str9, boolean z4, boolean z5, int i7, boolean z6, String str10, int i8, boolean z7, boolean z8, boolean z9, Boolean bool, ServiceBookingAddressDto serviceBookingAddressDto) {
        this.id = i;
        this.recordHash = str;
        this.name = str2;
        this.phone = str3;
        this.services = list;
        this.company = serviceBookingCompanyDto;
        this.staff = serviceBookingBookedStaffDto;
        this.clientsCount = i2;
        this.date = str4;
        this.datetime = str5;
        this.createDate = str6;
        this.comment = str7;
        this.deleted = z;
        this.attendance = i3;
        this.length = i4;
        this.notifyBySms = i5;
        this.notifyByEmail = i6;
        this.masterRequested = z2;
        this.online = z3;
        this.apiId = str8;
        this.lastChangeDate = str9;
        this.prepaid = z4;
        this.prepaidConfirmed = z5;
        this.activityId = i7;
        this.reviewEnabled = z6;
        this.token = str10;
        this.paidAmount = i8;
        this.allowDeleteRecord = z7;
        this.allowChangeRecord = z8;
        this.isConfirmationNeeded = z9;
        this.allowRepeatRecord = bool;
        this.address = serviceBookingAddressDto;
    }

    public final ServiceBookingBookedStaffDto B() {
        return this.staff;
    }

    public final int d() {
        return this.activityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ServiceBookingAddressDto e() {
        return this.address;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingRecordDto)) {
            return false;
        }
        ServiceBookingRecordDto serviceBookingRecordDto = (ServiceBookingRecordDto) obj;
        return this.id == serviceBookingRecordDto.id && epx.f(this.recordHash, serviceBookingRecordDto.recordHash) && epx.f(this.name, serviceBookingRecordDto.name) && epx.f(this.phone, serviceBookingRecordDto.phone) && epx.f(this.services, serviceBookingRecordDto.services) && epx.f(this.company, serviceBookingRecordDto.company) && epx.f(this.staff, serviceBookingRecordDto.staff) && this.clientsCount == serviceBookingRecordDto.clientsCount && epx.f(this.date, serviceBookingRecordDto.date) && epx.f(this.datetime, serviceBookingRecordDto.datetime) && epx.f(this.createDate, serviceBookingRecordDto.createDate) && epx.f(this.comment, serviceBookingRecordDto.comment) && this.deleted == serviceBookingRecordDto.deleted && this.attendance == serviceBookingRecordDto.attendance && this.length == serviceBookingRecordDto.length && this.notifyBySms == serviceBookingRecordDto.notifyBySms && this.notifyByEmail == serviceBookingRecordDto.notifyByEmail && this.masterRequested == serviceBookingRecordDto.masterRequested && this.online == serviceBookingRecordDto.online && epx.f(this.apiId, serviceBookingRecordDto.apiId) && epx.f(this.lastChangeDate, serviceBookingRecordDto.lastChangeDate) && this.prepaid == serviceBookingRecordDto.prepaid && this.prepaidConfirmed == serviceBookingRecordDto.prepaidConfirmed && this.activityId == serviceBookingRecordDto.activityId && this.reviewEnabled == serviceBookingRecordDto.reviewEnabled && epx.f(this.token, serviceBookingRecordDto.token) && this.paidAmount == serviceBookingRecordDto.paidAmount && this.allowDeleteRecord == serviceBookingRecordDto.allowDeleteRecord && this.allowChangeRecord == serviceBookingRecordDto.allowChangeRecord && this.isConfirmationNeeded == serviceBookingRecordDto.isConfirmationNeeded && epx.f(this.allowRepeatRecord, serviceBookingRecordDto.allowRepeatRecord) && epx.f(this.address, serviceBookingRecordDto.address);
    }

    public final boolean f() {
        return this.allowChangeRecord;
    }

    public final boolean g() {
        return this.allowDeleteRecord;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(shy.a(this.paidAmount, urd0.a(qoy.b(shy.a(this.activityId, qoy.b(qoy.b(urd0.a(urd0.a(qoy.b(qoy.b(shy.a(this.notifyByEmail, shy.a(this.notifyBySms, shy.a(this.length, shy.a(this.attendance, qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(shy.a(this.clientsCount, (this.staff.hashCode() + ((this.company.hashCode() + fw3.a(urd0.a(urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.recordHash), 31, this.name), 31, this.phone), 31, this.services)) * 31)) * 31, 31), 31, this.date), 31, this.datetime), 31, this.createDate), 31, this.comment), 31, this.deleted), 31), 31), 31), 31), 31, this.masterRequested), 31, this.online), 31, this.apiId), 31, this.lastChangeDate), 31, this.prepaid), 31, this.prepaidConfirmed), 31), 31, this.reviewEnabled), 31, this.token), 31), 31, this.allowDeleteRecord), 31, this.allowChangeRecord), 31, this.isConfirmationNeeded);
        Boolean bool = this.allowRepeatRecord;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        ServiceBookingAddressDto serviceBookingAddressDto = this.address;
        return hashCode + (serviceBookingAddressDto != null ? serviceBookingAddressDto.hashCode() : 0);
    }

    public final Boolean i() {
        return this.allowRepeatRecord;
    }

    public final String j() {
        return this.comment;
    }

    public final ServiceBookingCompanyDto k() {
        return this.company;
    }

    public final String l() {
        return this.datetime;
    }

    public final String n() {
        return this.name;
    }

    public final String o() {
        return this.phone;
    }

    public final String p() {
        return this.recordHash;
    }

    public final String toString() {
        return "ServiceBookingRecordDto(id=" + this.id + ", recordHash=" + this.recordHash + ", name=" + this.name + ", phone=" + this.phone + ", services=" + this.services + ", company=" + this.company + ", staff=" + this.staff + ", clientsCount=" + this.clientsCount + ", date=" + this.date + ", datetime=" + this.datetime + ", createDate=" + this.createDate + ", comment=" + this.comment + ", deleted=" + this.deleted + ", attendance=" + this.attendance + ", length=" + this.length + ", notifyBySms=" + this.notifyBySms + ", notifyByEmail=" + this.notifyByEmail + ", masterRequested=" + this.masterRequested + ", online=" + this.online + ", apiId=" + this.apiId + ", lastChangeDate=" + this.lastChangeDate + ", prepaid=" + this.prepaid + ", prepaidConfirmed=" + this.prepaidConfirmed + ", activityId=" + this.activityId + ", reviewEnabled=" + this.reviewEnabled + ", token=" + this.token + ", paidAmount=" + this.paidAmount + ", allowDeleteRecord=" + this.allowDeleteRecord + ", allowChangeRecord=" + this.allowChangeRecord + ", isConfirmationNeeded=" + this.isConfirmationNeeded + ", allowRepeatRecord=" + this.allowRepeatRecord + ", address=" + this.address + ')';
    }

    public final List<ServiceBookingBookedServiceDto> u() {
        return this.services;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.recordHash);
        parcel.writeString(this.name);
        parcel.writeString(this.phone);
        Iterator a2 = ao.a(parcel, this.services);
        while (a2.hasNext()) {
            ((ServiceBookingBookedServiceDto) a2.next()).writeToParcel(parcel, i);
        }
        this.company.writeToParcel(parcel, i);
        this.staff.writeToParcel(parcel, i);
        parcel.writeInt(this.clientsCount);
        parcel.writeString(this.date);
        parcel.writeString(this.datetime);
        parcel.writeString(this.createDate);
        parcel.writeString(this.comment);
        parcel.writeInt(this.deleted ? 1 : 0);
        parcel.writeInt(this.attendance);
        parcel.writeInt(this.length);
        parcel.writeInt(this.notifyBySms);
        parcel.writeInt(this.notifyByEmail);
        parcel.writeInt(this.masterRequested ? 1 : 0);
        parcel.writeInt(this.online ? 1 : 0);
        parcel.writeString(this.apiId);
        parcel.writeString(this.lastChangeDate);
        parcel.writeInt(this.prepaid ? 1 : 0);
        parcel.writeInt(this.prepaidConfirmed ? 1 : 0);
        parcel.writeInt(this.activityId);
        parcel.writeInt(this.reviewEnabled ? 1 : 0);
        parcel.writeString(this.token);
        parcel.writeInt(this.paidAmount);
        parcel.writeInt(this.allowDeleteRecord ? 1 : 0);
        parcel.writeInt(this.allowChangeRecord ? 1 : 0);
        parcel.writeInt(this.isConfirmationNeeded ? 1 : 0);
        Boolean bool = this.allowRepeatRecord;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        ServiceBookingAddressDto serviceBookingAddressDto = this.address;
        if (serviceBookingAddressDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingAddressDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ServiceBookingRecordDto(int i, String str, String str2, String str3, List list, ServiceBookingCompanyDto serviceBookingCompanyDto, ServiceBookingBookedStaffDto serviceBookingBookedStaffDto, int i2, String str4, String str5, String str6, String str7, boolean z, int i3, int i4, int i5, int i6, boolean z2, boolean z3, String str8, String str9, boolean z4, boolean z5, int i7, boolean z6, String str10, int i8, boolean z7, boolean z8, boolean z9, Boolean bool, ServiceBookingAddressDto serviceBookingAddressDto, int i9, zcl zclVar) {
        this(i, str, str2, str3, list, serviceBookingCompanyDto, serviceBookingBookedStaffDto, i2, str4, str5, str6, str7, z, i3, i4, i5, i6, z2, z3, str8, str9, z4, z5, i7, z6, str10, i8, z7, z8, z9, (i9 & 1073741824) != 0 ? null : bool, (i9 & Integer.MIN_VALUE) != 0 ? null : serviceBookingAddressDto);
    }
}
