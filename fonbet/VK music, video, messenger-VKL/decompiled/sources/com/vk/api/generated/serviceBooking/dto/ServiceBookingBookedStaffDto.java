package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ServiceBookingBookedStaffDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingBookedStaffDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingBookedStaffDto> CREATOR = new a();

    @pmi0("avatar")
    private final String avatar;

    @pmi0("avatar_big")
    private final String avatarBig;

    @pmi0("comments_count")
    private final int commentsCount;

    @pmi0("id")
    private final int id;

    @pmi0("is_deleted")
    private final boolean isDeleted;

    @pmi0("name")
    private final String name;

    @pmi0(X3.i.L)
    private final ServiceBookingStaffPositionDto position;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final ServiceBookingStaffRatingDto rating;

    @pmi0("show_rating")
    private final int showRating;

    @pmi0("specialization")
    private final String specialization;

    @pmi0("votes_count")
    private final int votesCount;

    /* compiled from: ServiceBookingBookedStaffDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingBookedStaffDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBookedStaffDto createFromParcel(Parcel parcel) {
            return new ServiceBookingBookedStaffDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), ServiceBookingStaffRatingDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : ServiceBookingStaffPositionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBookedStaffDto[] newArray(int i) {
            return new ServiceBookingBookedStaffDto[i];
        }
    }

    public ServiceBookingBookedStaffDto(int i, String str, String str2, int i2, ServiceBookingStaffRatingDto serviceBookingStaffRatingDto, int i3, String str3, String str4, int i4, boolean z, ServiceBookingStaffPositionDto serviceBookingStaffPositionDto) {
        this.id = i;
        this.name = str;
        this.specialization = str2;
        this.showRating = i2;
        this.rating = serviceBookingStaffRatingDto;
        this.votesCount = i3;
        this.avatar = str3;
        this.avatarBig = str4;
        this.commentsCount = i4;
        this.isDeleted = z;
        this.position = serviceBookingStaffPositionDto;
    }

    public final String d() {
        return this.avatar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingBookedStaffDto)) {
            return false;
        }
        ServiceBookingBookedStaffDto serviceBookingBookedStaffDto = (ServiceBookingBookedStaffDto) obj;
        return this.id == serviceBookingBookedStaffDto.id && epx.f(this.name, serviceBookingBookedStaffDto.name) && epx.f(this.specialization, serviceBookingBookedStaffDto.specialization) && this.showRating == serviceBookingBookedStaffDto.showRating && epx.f(this.rating, serviceBookingBookedStaffDto.rating) && this.votesCount == serviceBookingBookedStaffDto.votesCount && epx.f(this.avatar, serviceBookingBookedStaffDto.avatar) && epx.f(this.avatarBig, serviceBookingBookedStaffDto.avatarBig) && this.commentsCount == serviceBookingBookedStaffDto.commentsCount && this.isDeleted == serviceBookingBookedStaffDto.isDeleted && epx.f(this.position, serviceBookingBookedStaffDto.position);
    }

    public final ServiceBookingStaffRatingDto f() {
        return this.rating;
    }

    public final int g() {
        return this.showRating;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.commentsCount, urd0.a(urd0.a(shy.a(this.votesCount, (this.rating.hashCode() + shy.a(this.showRating, urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.specialization), 31)) * 31, 31), 31, this.avatar), 31, this.avatarBig), 31), 31, this.isDeleted);
        ServiceBookingStaffPositionDto serviceBookingStaffPositionDto = this.position;
        return b + (serviceBookingStaffPositionDto == null ? 0 : serviceBookingStaffPositionDto.hashCode());
    }

    public final String i() {
        return this.specialization;
    }

    public final int j() {
        return this.votesCount;
    }

    public final String toString() {
        return "ServiceBookingBookedStaffDto(id=" + this.id + ", name=" + this.name + ", specialization=" + this.specialization + ", showRating=" + this.showRating + ", rating=" + this.rating + ", votesCount=" + this.votesCount + ", avatar=" + this.avatar + ", avatarBig=" + this.avatarBig + ", commentsCount=" + this.commentsCount + ", isDeleted=" + this.isDeleted + ", position=" + this.position + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.specialization);
        parcel.writeInt(this.showRating);
        this.rating.writeToParcel(parcel, i);
        parcel.writeInt(this.votesCount);
        parcel.writeString(this.avatar);
        parcel.writeString(this.avatarBig);
        parcel.writeInt(this.commentsCount);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        ServiceBookingStaffPositionDto serviceBookingStaffPositionDto = this.position;
        if (serviceBookingStaffPositionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingStaffPositionDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ServiceBookingBookedStaffDto(int i, String str, String str2, int i2, ServiceBookingStaffRatingDto serviceBookingStaffRatingDto, int i3, String str3, String str4, int i4, boolean z, ServiceBookingStaffPositionDto serviceBookingStaffPositionDto, int i5, zcl zclVar) {
        this(i, str, str2, i2, serviceBookingStaffRatingDto, i3, str3, str4, i4, z, (i5 & 1024) != 0 ? null : serviceBookingStaffPositionDto);
    }
}
