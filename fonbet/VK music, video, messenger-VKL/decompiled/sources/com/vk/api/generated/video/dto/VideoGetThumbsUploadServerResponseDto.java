package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoGetThumbsUploadServerResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetThumbsUploadServerResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetThumbsUploadServerResponseDto> CREATOR = new a();

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    /* compiled from: VideoGetThumbsUploadServerResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetThumbsUploadServerResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetThumbsUploadServerResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetThumbsUploadServerResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetThumbsUploadServerResponseDto[] newArray(int i) {
            return new VideoGetThumbsUploadServerResponseDto[i];
        }
    }

    public VideoGetThumbsUploadServerResponseDto(String str) {
        this.uploadUrl = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGetThumbsUploadServerResponseDto) && epx.f(this.uploadUrl, ((VideoGetThumbsUploadServerResponseDto) obj).uploadUrl);
    }

    public final int hashCode() {
        return this.uploadUrl.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoGetThumbsUploadServerResponseDto(uploadUrl="), this.uploadUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadUrl);
    }
}
