package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsCheckInviteFriendResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsCheckInviteFriendResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsCheckInviteFriendResponseDto> CREATOR = new a();

    @pmi0("photo")
    private final BaseImageDto photo;

    @pmi0("text")
    private final String text;

    /* compiled from: AppsCheckInviteFriendResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsCheckInviteFriendResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCheckInviteFriendResponseDto createFromParcel(Parcel parcel) {
            return new AppsCheckInviteFriendResponseDto(parcel.readString(), (BaseImageDto) parcel.readParcelable(AppsCheckInviteFriendResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCheckInviteFriendResponseDto[] newArray(int i) {
            return new AppsCheckInviteFriendResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsCheckInviteFriendResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final BaseImageDto d() {
        return this.photo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCheckInviteFriendResponseDto)) {
            return false;
        }
        AppsCheckInviteFriendResponseDto appsCheckInviteFriendResponseDto = (AppsCheckInviteFriendResponseDto) obj;
        return epx.f(this.text, appsCheckInviteFriendResponseDto.text) && epx.f(this.photo, appsCheckInviteFriendResponseDto.photo);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BaseImageDto baseImageDto = this.photo;
        return hashCode + (baseImageDto != null ? baseImageDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsCheckInviteFriendResponseDto(text=" + this.text + ", photo=" + this.photo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.photo, i);
    }

    public AppsCheckInviteFriendResponseDto(String str, BaseImageDto baseImageDto) {
        this.text = str;
        this.photo = baseImageDto;
    }

    public /* synthetic */ AppsCheckInviteFriendResponseDto(String str, BaseImageDto baseImageDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : baseImageDto);
    }
}
