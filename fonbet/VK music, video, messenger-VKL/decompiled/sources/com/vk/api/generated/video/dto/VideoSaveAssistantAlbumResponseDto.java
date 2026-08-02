package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: VideoSaveAssistantAlbumResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoSaveAssistantAlbumResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoSaveAssistantAlbumResponseDto> CREATOR = new a();

    @pmi0("album_id")
    private final int albumId;

    @pmi0("owner_id")
    private final UserId ownerId;

    /* compiled from: VideoSaveAssistantAlbumResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoSaveAssistantAlbumResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSaveAssistantAlbumResponseDto createFromParcel(Parcel parcel) {
            return new VideoSaveAssistantAlbumResponseDto((UserId) parcel.readParcelable(VideoSaveAssistantAlbumResponseDto.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSaveAssistantAlbumResponseDto[] newArray(int i) {
            return new VideoSaveAssistantAlbumResponseDto[i];
        }
    }

    public VideoSaveAssistantAlbumResponseDto(UserId userId, int i) {
        this.ownerId = userId;
        this.albumId = i;
    }

    public final int d() {
        return this.albumId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSaveAssistantAlbumResponseDto)) {
            return false;
        }
        VideoSaveAssistantAlbumResponseDto videoSaveAssistantAlbumResponseDto = (VideoSaveAssistantAlbumResponseDto) obj;
        return epx.f(this.ownerId, videoSaveAssistantAlbumResponseDto.ownerId) && this.albumId == videoSaveAssistantAlbumResponseDto.albumId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.albumId) + (Long.hashCode(this.ownerId.b) * 31);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSaveAssistantAlbumResponseDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", albumId=");
        return vu5.b(sb, this.albumId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.albumId);
    }
}
