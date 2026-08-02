package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: ServiceBookingCompanyDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingCompanyDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingCompanyDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("allow_change_prepaid_record")
    private final boolean allowChangePrepaidRecord;

    @pmi0("allow_change_record")
    private final boolean allowChangeRecord;

    @pmi0("allow_change_record_delay_step")
    private final int allowChangeRecordDelayStep;

    @pmi0("allow_delete_prepaid_record")
    private final boolean allowDeletePrepaidRecord;

    @pmi0("allow_delete_record")
    private final boolean allowDeleteRecord;

    @pmi0("allow_delete_record_delay_step")
    private final int allowDeleteRecordDelayStep;

    @pmi0("city")
    private final String city;

    @pmi0("city_id")
    private final int cityId;

    @pmi0("coordinate_lat")
    private final float coordinateLat;

    @pmi0("coordinate_lon")
    private final float coordinateLon;

    @pmi0("country")
    private final String country;

    @pmi0(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)
    private final int countryId;

    @pmi0("currency_short_title")
    private final String currencyShortTitle;

    @pmi0("id")
    private final int id;

    @pmi0("logo")
    private final String logo;

    @pmi0("phone")
    private final String phone;

    @pmi0("phones")
    private final List<String> phones;

    @pmi0("public_title")
    private final String publicTitle;

    @pmi0("site")
    private final String site;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    private final int timezone;

    @pmi0("title")
    private final String title;

    /* compiled from: ServiceBookingCompanyDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingCompanyDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCompanyDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString3 = parcel.readString();
            int readInt3 = parcel.readInt();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt4 = parcel.readInt();
            String readString6 = parcel.readString();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z = z2;
            }
            return new ServiceBookingCompanyDto(readInt, readString, readString2, readInt2, readString3, readInt3, readString4, readString5, createStringArrayList, readInt4, readString6, readFloat, readFloat2, z5, z3, z4, z, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCompanyDto[] newArray(int i) {
            return new ServiceBookingCompanyDto[i];
        }
    }

    public ServiceBookingCompanyDto(int i, String str, String str2, int i2, String str3, int i3, String str4, String str5, List<String> list, int i4, String str6, float f, float f2, boolean z, boolean z2, boolean z3, boolean z4, String str7, String str8, int i5, int i6, String str9) {
        this.id = i;
        this.title = str;
        this.publicTitle = str2;
        this.countryId = i2;
        this.country = str3;
        this.cityId = i3;
        this.city = str4;
        this.phone = str5;
        this.phones = list;
        this.timezone = i4;
        this.address = str6;
        this.coordinateLat = f;
        this.coordinateLon = f2;
        this.allowDeleteRecord = z;
        this.allowChangeRecord = z2;
        this.allowChangePrepaidRecord = z3;
        this.allowDeletePrepaidRecord = z4;
        this.site = str7;
        this.currencyShortTitle = str8;
        this.allowChangeRecordDelayStep = i5;
        this.allowDeleteRecordDelayStep = i6;
        this.logo = str9;
    }

    public final String d() {
        return this.logo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.publicTitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingCompanyDto)) {
            return false;
        }
        ServiceBookingCompanyDto serviceBookingCompanyDto = (ServiceBookingCompanyDto) obj;
        return this.id == serviceBookingCompanyDto.id && epx.f(this.title, serviceBookingCompanyDto.title) && epx.f(this.publicTitle, serviceBookingCompanyDto.publicTitle) && this.countryId == serviceBookingCompanyDto.countryId && epx.f(this.country, serviceBookingCompanyDto.country) && this.cityId == serviceBookingCompanyDto.cityId && epx.f(this.city, serviceBookingCompanyDto.city) && epx.f(this.phone, serviceBookingCompanyDto.phone) && epx.f(this.phones, serviceBookingCompanyDto.phones) && this.timezone == serviceBookingCompanyDto.timezone && epx.f(this.address, serviceBookingCompanyDto.address) && Float.compare(this.coordinateLat, serviceBookingCompanyDto.coordinateLat) == 0 && Float.compare(this.coordinateLon, serviceBookingCompanyDto.coordinateLon) == 0 && this.allowDeleteRecord == serviceBookingCompanyDto.allowDeleteRecord && this.allowChangeRecord == serviceBookingCompanyDto.allowChangeRecord && this.allowChangePrepaidRecord == serviceBookingCompanyDto.allowChangePrepaidRecord && this.allowDeletePrepaidRecord == serviceBookingCompanyDto.allowDeletePrepaidRecord && epx.f(this.site, serviceBookingCompanyDto.site) && epx.f(this.currencyShortTitle, serviceBookingCompanyDto.currencyShortTitle) && this.allowChangeRecordDelayStep == serviceBookingCompanyDto.allowChangeRecordDelayStep && this.allowDeleteRecordDelayStep == serviceBookingCompanyDto.allowDeleteRecordDelayStep && epx.f(this.logo, serviceBookingCompanyDto.logo);
    }

    public final int hashCode() {
        return this.logo.hashCode() + shy.a(this.allowDeleteRecordDelayStep, shy.a(this.allowChangeRecordDelayStep, urd0.a(urd0.a(qoy.b(qoy.b(qoy.b(qoy.b(b.a(this.coordinateLon, b.a(this.coordinateLat, urd0.a(shy.a(this.timezone, fw3.a(urd0.a(urd0.a(shy.a(this.cityId, urd0.a(shy.a(this.countryId, urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.publicTitle), 31), 31, this.country), 31), 31, this.city), 31, this.phone), 31, this.phones), 31), 31, this.address), 31), 31), 31, this.allowDeleteRecord), 31, this.allowChangeRecord), 31, this.allowChangePrepaidRecord), 31, this.allowDeletePrepaidRecord), 31, this.site), 31, this.currencyShortTitle), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingCompanyDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", publicTitle=");
        sb.append(this.publicTitle);
        sb.append(", countryId=");
        sb.append(this.countryId);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", cityId=");
        sb.append(this.cityId);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", phones=");
        sb.append(this.phones);
        sb.append(", timezone=");
        sb.append(this.timezone);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", coordinateLat=");
        sb.append(this.coordinateLat);
        sb.append(", coordinateLon=");
        sb.append(this.coordinateLon);
        sb.append(", allowDeleteRecord=");
        sb.append(this.allowDeleteRecord);
        sb.append(", allowChangeRecord=");
        sb.append(this.allowChangeRecord);
        sb.append(", allowChangePrepaidRecord=");
        sb.append(this.allowChangePrepaidRecord);
        sb.append(", allowDeletePrepaidRecord=");
        sb.append(this.allowDeletePrepaidRecord);
        sb.append(", site=");
        sb.append(this.site);
        sb.append(", currencyShortTitle=");
        sb.append(this.currencyShortTitle);
        sb.append(", allowChangeRecordDelayStep=");
        sb.append(this.allowChangeRecordDelayStep);
        sb.append(", allowDeleteRecordDelayStep=");
        sb.append(this.allowDeleteRecordDelayStep);
        sb.append(", logo=");
        return ho8.a(sb, this.logo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.publicTitle);
        parcel.writeInt(this.countryId);
        parcel.writeString(this.country);
        parcel.writeInt(this.cityId);
        parcel.writeString(this.city);
        parcel.writeString(this.phone);
        parcel.writeStringList(this.phones);
        parcel.writeInt(this.timezone);
        parcel.writeString(this.address);
        parcel.writeFloat(this.coordinateLat);
        parcel.writeFloat(this.coordinateLon);
        parcel.writeInt(this.allowDeleteRecord ? 1 : 0);
        parcel.writeInt(this.allowChangeRecord ? 1 : 0);
        parcel.writeInt(this.allowChangePrepaidRecord ? 1 : 0);
        parcel.writeInt(this.allowDeletePrepaidRecord ? 1 : 0);
        parcel.writeString(this.site);
        parcel.writeString(this.currencyShortTitle);
        parcel.writeInt(this.allowChangeRecordDelayStep);
        parcel.writeInt(this.allowDeleteRecordDelayStep);
        parcel.writeString(this.logo);
    }
}
