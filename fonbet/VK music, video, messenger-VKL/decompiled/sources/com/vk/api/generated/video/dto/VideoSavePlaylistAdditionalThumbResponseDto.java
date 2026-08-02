package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: VideoSavePlaylistAdditionalThumbResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoSavePlaylistAdditionalThumbResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoSavePlaylistAdditionalThumbResponseDto> CREATOR = new a();

    @pmi0("thumb_url")
    private final String thumbUrl;

    @pmi0("vertical_photo_hash")
    private final String verticalPhotoHash;

    @pmi0("vertical_photo_tag")
    private final String verticalPhotoTag;

    /* compiled from: VideoSavePlaylistAdditionalThumbResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoSavePlaylistAdditionalThumbResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSavePlaylistAdditionalThumbResponseDto createFromParcel(Parcel parcel) {
            return new VideoSavePlaylistAdditionalThumbResponseDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSavePlaylistAdditionalThumbResponseDto[] newArray(int i) {
            return new VideoSavePlaylistAdditionalThumbResponseDto[i];
        }
    }

    public VideoSavePlaylistAdditionalThumbResponseDto(String str, String str2, String str3) {
        this.thumbUrl = str;
        this.verticalPhotoTag = str2;
        this.verticalPhotoHash = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSavePlaylistAdditionalThumbResponseDto)) {
            return false;
        }
        VideoSavePlaylistAdditionalThumbResponseDto videoSavePlaylistAdditionalThumbResponseDto = (VideoSavePlaylistAdditionalThumbResponseDto) obj;
        return epx.f(this.thumbUrl, videoSavePlaylistAdditionalThumbResponseDto.thumbUrl) && epx.f(this.verticalPhotoTag, videoSavePlaylistAdditionalThumbResponseDto.verticalPhotoTag) && epx.f(this.verticalPhotoHash, videoSavePlaylistAdditionalThumbResponseDto.verticalPhotoHash);
    }

    public final int hashCode() {
        return this.verticalPhotoHash.hashCode() + urd0.a(this.thumbUrl.hashCode() * 31, 31, this.verticalPhotoTag);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSavePlaylistAdditionalThumbResponseDto(thumbUrl=");
        sb.append(this.thumbUrl);
        sb.append(", verticalPhotoTag=");
        sb.append(this.verticalPhotoTag);
        sb.append(", verticalPhotoHash=");
        return ho8.a(sb, this.verticalPhotoHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.thumbUrl);
        parcel.writeString(this.verticalPhotoTag);
        parcel.writeString(this.verticalPhotoHash);
    }
}
