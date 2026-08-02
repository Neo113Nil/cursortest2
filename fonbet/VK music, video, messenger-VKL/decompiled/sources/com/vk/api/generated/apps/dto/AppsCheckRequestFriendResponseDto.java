package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsCheckRequestFriendResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsCheckRequestFriendResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsCheckRequestFriendResponseDto> CREATOR = new a();

    @pmi0("photo")
    private final BaseImageDto photo;

    @pmi0("text")
    private final String text;

    /* compiled from: AppsCheckRequestFriendResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsCheckRequestFriendResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCheckRequestFriendResponseDto createFromParcel(Parcel parcel) {
            return new AppsCheckRequestFriendResponseDto(parcel.readString(), (BaseImageDto) parcel.readParcelable(AppsCheckRequestFriendResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCheckRequestFriendResponseDto[] newArray(int i) {
            return new AppsCheckRequestFriendResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppsCheckRequestFriendResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCheckRequestFriendResponseDto)) {
            return false;
        }
        AppsCheckRequestFriendResponseDto appsCheckRequestFriendResponseDto = (AppsCheckRequestFriendResponseDto) obj;
        return epx.f(this.text, appsCheckRequestFriendResponseDto.text) && epx.f(this.photo, appsCheckRequestFriendResponseDto.photo);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BaseImageDto baseImageDto = this.photo;
        return hashCode + (baseImageDto != null ? baseImageDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsCheckRequestFriendResponseDto(text=" + this.text + ", photo=" + this.photo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.photo, i);
    }

    public AppsCheckRequestFriendResponseDto(String str, BaseImageDto baseImageDto) {
        this.text = str;
        this.photo = baseImageDto;
    }

    public /* synthetic */ AppsCheckRequestFriendResponseDto(String str, BaseImageDto baseImageDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : baseImageDto);
    }
}
