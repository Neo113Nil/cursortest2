package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoGetThumbUploadUrlResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetThumbUploadUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetThumbUploadUrlResponseDto> CREATOR = new a();

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    /* compiled from: VideoGetThumbUploadUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetThumbUploadUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetThumbUploadUrlResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetThumbUploadUrlResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetThumbUploadUrlResponseDto[] newArray(int i) {
            return new VideoGetThumbUploadUrlResponseDto[i];
        }
    }

    public VideoGetThumbUploadUrlResponseDto(String str) {
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
        return (obj instanceof VideoGetThumbUploadUrlResponseDto) && epx.f(this.uploadUrl, ((VideoGetThumbUploadUrlResponseDto) obj).uploadUrl);
    }

    public final int hashCode() {
        return this.uploadUrl.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoGetThumbUploadUrlResponseDto(uploadUrl="), this.uploadUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadUrl);
    }
}
