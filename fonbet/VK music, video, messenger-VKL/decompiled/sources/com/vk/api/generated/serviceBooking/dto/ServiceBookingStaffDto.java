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

/* compiled from: ServiceBookingStaffDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingStaffDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingStaffDto> CREATOR = new a();

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

    @pmi0("name")
    private final String name;

    @pmi0(X3.i.L)
    private final ServiceBookingStaffPositionDto position;

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

    /* compiled from: ServiceBookingStaffDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingStaffDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingStaffDto createFromParcel(Parcel parcel) {
            return new ServiceBookingStaffDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), ServiceBookingStaffRatingDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ServiceBookingStaffPositionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ServiceBookingAddressDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingStaffDto[] newArray(int i) {
            return new ServiceBookingStaffDto[i];
        }
    }

    public ServiceBookingStaffDto(int i, String str, String str2, int i2, int i3, ServiceBookingStaffRatingDto serviceBookingStaffRatingDto, int i4, int i5, String str3, String str4, String str5, ServiceBookingStaffPositionDto serviceBookingStaffPositionDto, ServiceBookingAddressDto serviceBookingAddressDto) {
        this.id = i;
        this.name = str;
        this.specialization = str2;
        this.weight = i2;
        this.showRating = i3;
        this.rating = serviceBookingStaffRatingDto;
        this.votesCount = i4;
        this.commentsCount = i5;
        this.avatar = str3;
        this.seanceDate = str4;
        this.avatarBig = str5;
        this.position = serviceBookingStaffPositionDto;
        this.address = serviceBookingAddressDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingStaffDto)) {
            return false;
        }
        ServiceBookingStaffDto serviceBookingStaffDto = (ServiceBookingStaffDto) obj;
        return this.id == serviceBookingStaffDto.id && epx.f(this.name, serviceBookingStaffDto.name) && epx.f(this.specialization, serviceBookingStaffDto.specialization) && this.weight == serviceBookingStaffDto.weight && this.showRating == serviceBookingStaffDto.showRating && epx.f(this.rating, serviceBookingStaffDto.rating) && this.votesCount == serviceBookingStaffDto.votesCount && this.commentsCount == serviceBookingStaffDto.commentsCount && epx.f(this.avatar, serviceBookingStaffDto.avatar) && epx.f(this.seanceDate, serviceBookingStaffDto.seanceDate) && epx.f(this.avatarBig, serviceBookingStaffDto.avatarBig) && epx.f(this.position, serviceBookingStaffDto.position) && epx.f(this.address, serviceBookingStaffDto.address);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(shy.a(this.commentsCount, shy.a(this.votesCount, (this.rating.hashCode() + shy.a(this.showRating, shy.a(this.weight, urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.specialization), 31), 31)) * 31, 31), 31), 31, this.avatar), 31, this.seanceDate), 31, this.avatarBig);
        ServiceBookingStaffPositionDto serviceBookingStaffPositionDto = this.position;
        int hashCode = (a2 + (serviceBookingStaffPositionDto == null ? 0 : serviceBookingStaffPositionDto.hashCode())) * 31;
        ServiceBookingAddressDto serviceBookingAddressDto = this.address;
        return hashCode + (serviceBookingAddressDto != null ? serviceBookingAddressDto.hashCode() : 0);
    }

    public final String toString() {
        return "ServiceBookingStaffDto(id=" + this.id + ", name=" + this.name + ", specialization=" + this.specialization + ", weight=" + this.weight + ", showRating=" + this.showRating + ", rating=" + this.rating + ", votesCount=" + this.votesCount + ", commentsCount=" + this.commentsCount + ", avatar=" + this.avatar + ", seanceDate=" + this.seanceDate + ", avatarBig=" + this.avatarBig + ", position=" + this.position + ", address=" + this.address + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
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

    public /* synthetic */ ServiceBookingStaffDto(int i, String str, String str2, int i2, int i3, ServiceBookingStaffRatingDto serviceBookingStaffRatingDto, int i4, int i5, String str3, String str4, String str5, ServiceBookingStaffPositionDto serviceBookingStaffPositionDto, ServiceBookingAddressDto serviceBookingAddressDto, int i6, zcl zclVar) {
        this(i, str, str2, i2, i3, serviceBookingStaffRatingDto, i4, i5, str3, str4, str5, (i6 & 2048) != 0 ? null : serviceBookingStaffPositionDto, (i6 & 4096) != 0 ? null : serviceBookingAddressDto);
    }
}
