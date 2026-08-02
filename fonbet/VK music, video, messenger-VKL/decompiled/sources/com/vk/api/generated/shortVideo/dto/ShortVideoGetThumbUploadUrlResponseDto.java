package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ShortVideoGetThumbUploadUrlResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetThumbUploadUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetThumbUploadUrlResponseDto> CREATOR = new a();

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    /* compiled from: ShortVideoGetThumbUploadUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetThumbUploadUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetThumbUploadUrlResponseDto createFromParcel(Parcel parcel) {
            return new ShortVideoGetThumbUploadUrlResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetThumbUploadUrlResponseDto[] newArray(int i) {
            return new ShortVideoGetThumbUploadUrlResponseDto[i];
        }
    }

    public ShortVideoGetThumbUploadUrlResponseDto(String str) {
        this.uploadUrl = str;
    }

    public final String d() {
        return this.uploadUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoGetThumbUploadUrlResponseDto) && epx.f(this.uploadUrl, ((ShortVideoGetThumbUploadUrlResponseDto) obj).uploadUrl);
    }

    public final int hashCode() {
        return this.uploadUrl.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ShortVideoGetThumbUploadUrlResponseDto(uploadUrl="), this.uploadUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadUrl);
    }
}
