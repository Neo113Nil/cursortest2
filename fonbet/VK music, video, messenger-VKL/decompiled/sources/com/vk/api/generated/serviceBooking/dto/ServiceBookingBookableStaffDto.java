package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ServiceBookingBookableStaffDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingBookableStaffDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingBookableStaffDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final ServiceBookingAddressDto address;

    @pmi0("avatar")
    private final String avatar;

    @pmi0("avatar_big")
    private final String avatarBig;

    @pmi0("comments_count")
    private final int commentsCount;

    @pmi0("id")
    private final int id;

    @pmi0("information")
    private final String information;

    @pmi0("is_bookable")
    private final boolean isBookable;

    @pmi0("name")
    private final String name;

    @pmi0(X3.i.L)
    private final ServiceBookingStaffPositionDto position;

    @pmi0("prepaid")
    private final String prepaid;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final ServiceBookingStaffRatingDto rating;

    @pmi0("seance_date")
    private final String seanceDate;

    @pmi0("show_rating")
    private final int showRating;

    @pmi0("specialization")
    private final String specialization;

    @pmi0("votes_count")
    private final int votesCount;

    @pmi0("weight")
    private final int weight;

    /* compiled from: ServiceBookingBookableStaffDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingBookableStaffDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBookableStaffDto createFromParcel(Parcel parcel) {
            boolean z;
            ServiceBookingStaffPositionDto createFromParcel;
            ServiceBookingStaffPositionDto serviceBookingStaffPositionDto;
            ServiceBookingAddressDto createFromParcel2;
            boolean z2 = parcel.readInt() != 0;
            String readString = parcel.readString();
            boolean z3 = z2;
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ServiceBookingStaffRatingDto createFromParcel3 = ServiceBookingStaffRatingDto.CREATOR.createFromParcel(parcel);
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                z = z3;
                createFromParcel = null;
            } else {
                z = z3;
                createFromParcel = ServiceBookingStaffPositionDto.CREATOR.createFromParcel(parcel);
            }
            ServiceBookingStaffPositionDto serviceBookingStaffPositionDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
                serviceBookingStaffPositionDto = serviceBookingStaffPositionDto2;
            } else {
                serviceBookingStaffPositionDto = serviceBookingStaffPositionDto2;
                createFromParcel2 = ServiceBookingAddressDto.CREATOR.createFromParcel(parcel);
            }
            return new ServiceBookingBookableStaffDto(z, readString, readString2, readInt, readString3, readString4, readInt2, readInt3, createFromParcel3, readInt4, readInt5, readString5, readString6, readString7, serviceBookingStaffPositionDto, createFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBookableStaffDto[] newArray(int i) {
            return new ServiceBookingBookableStaffDto[i];
        }
    }

    public ServiceBookingBookableStaffDto(boolean z, String str, String str2, int i, String str3, String str4, int i2, int i3, ServiceBookingStaffRatingDto serviceBookingStaffRatingDto, int i4, int i5, String str5, String str6, String str7, ServiceBookingStaffPositionDto serviceBookingStaffPositionDto, ServiceBookingAddressDto serviceBookingAddressDto) {
        this.isBookable = z;
        this.information = str;
        this.prepaid = str2;
        this.id = i;
        this.name = str3;
        this.specialization = str4;
        this.weight = i2;
        this.showRating = i3;
        this.rating = serviceBookingStaffRatingDto;
        this.votesCount = i4;
        this.commentsCount = i5;
        this.avatar = str5;
        this.seanceDate = str6;
        this.avatarBig = str7;
        this.position = serviceBookingStaffPositionDto;
        this.address = serviceBookingAddressDto;
    }

    public final ServiceBookingAddressDto d() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.avatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingBookableStaffDto)) {
            return false;
        }
        ServiceBookingBookableStaffDto serviceBookingBookableStaffDto = (ServiceBookingBookableStaffDto) obj;
        return this.isBookable == serviceBookingBookableStaffDto.isBookable && epx.f(this.information, serviceBookingBookableStaffDto.information) && epx.f(this.prepaid, serviceBookingBookableStaffDto.prepaid) && this.id == serviceBookingBookableStaffDto.id && epx.f(this.name, serviceBookingBookableStaffDto.name) && epx.f(this.specialization, serviceBookingBookableStaffDto.specialization) && this.weight == serviceBookingBookableStaffDto.weight && this.showRating == serviceBookingBookableStaffDto.showRating && epx.f(this.rating, serviceBookingBookableStaffDto.rating) && this.votesCount == serviceBookingBookableStaffDto.votesCount && this.commentsCount == serviceBookingBookableStaffDto.commentsCount && epx.f(this.avatar, serviceBookingBookableStaffDto.avatar) && epx.f(this.seanceDate, serviceBookingBookableStaffDto.seanceDate) && epx.f(this.avatarBig, serviceBookingBookableStaffDto.avatarBig) && epx.f(this.position, serviceBookingBookableStaffDto.position) && epx.f(this.address, serviceBookingBookableStaffDto.address);
    }

    public final int f() {
        return this.commentsCount;
    }

    public final String g() {
        return this.name;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(shy.a(this.commentsCount, shy.a(this.votesCount, (this.rating.hashCode() + shy.a(this.showRating, shy.a(this.weight, urd0.a(urd0.a(shy.a(this.id, urd0.a(urd0.a(Boolean.hashCode(this.isBookable) * 31, 31, this.information), 31, this.prepaid), 31), 31, this.name), 31, this.specialization), 31), 31)) * 31, 31), 31), 31, this.avatar), 31, this.seanceDate), 31, this.avatarBig);
        ServiceBookingStaffPositionDto serviceBookingStaffPositionDto = this.position;
        int hashCode = (a2 + (serviceBookingStaffPositionDto == null ? 0 : serviceBookingStaffPositionDto.hashCode())) * 31;
        ServiceBookingAddressDto serviceBookingAddressDto = this.address;
        return hashCode + (serviceBookingAddressDto != null ? serviceBookingAddressDto.hashCode() : 0);
    }

    public final ServiceBookingStaffRatingDto i() {
        return this.rating;
    }

    public final int j() {
        return this.showRating;
    }

    public final String k() {
        return this.specialization;
    }

    public final boolean l() {
        return this.isBookable;
    }

    public final String toString() {
        return "ServiceBookingBookableStaffDto(isBookable=" + this.isBookable + ", information=" + this.information + ", prepaid=" + this.prepaid + ", id=" + this.id + ", name=" + this.name + ", specialization=" + this.specialization + ", weight=" + this.weight + ", showRating=" + this.showRating + ", rating=" + this.rating + ", votesCount=" + this.votesCount + ", commentsCount=" + this.commentsCount + ", avatar=" + this.avatar + ", seanceDate=" + this.seanceDate + ", avatarBig=" + this.avatarBig + ", position=" + this.position + ", address=" + this.address + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isBookable ? 1 : 0);
        parcel.writeString(this.information);
        parcel.writeString(this.prepaid);
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.specialization);
        parcel.writeInt(this.weight);
        parcel.writeInt(this.showRating);
        this.rating.writeToParcel(parcel, i);
        parcel.writeInt(this.votesCount);
        parcel.writeInt(this.commentsCount);
        parcel.writeString(this.avatar);
        parcel.writeString(this.seanceDate);
        parcel.writeString(this.avatarBig);
        ServiceBookingStaffPositionDto serviceBookingStaffPositionDto = this.position;
        if (serviceBookingStaffPositionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingStaffPositionDto.writeToParcel(parcel, i);
        }
        ServiceBookingAddressDto serviceBookingAddressDto = this.address;
        if (serviceBookingAddressDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingAddressDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ServiceBookingBookableStaffDto(boolean z, String str, String str2, int i, String str3, String str4, int i2, int i3, ServiceBookingStaffRatingDto serviceBookingStaffRatingDto, int i4, int i5, String str5, String str6, String str7, ServiceBookingStaffPositionDto serviceBookingStaffPositionDto, ServiceBookingAddressDto serviceBookingAddressDto, int i6, zcl zclVar) {
        this(z, str, str2, i, str3, str4, i2, i3, serviceBookingStaffRatingDto, i4, i5, str5, str6, str7, (i6 & 16384) != 0 ? null : serviceBookingStaffPositionDto, (i6 & 32768) != 0 ? null : serviceBookingAddressDto);
    }
}
