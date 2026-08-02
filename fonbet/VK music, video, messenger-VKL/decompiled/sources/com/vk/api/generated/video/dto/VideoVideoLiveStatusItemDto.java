package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;

/* compiled from: VideoVideoLiveStatusItemDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoLiveStatusItemDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoLiveStatusItemDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("live_status")
    private final VideoLiveStatusDto liveStatus;

    @pmi0("owner_id")
    private final UserId ownerId;

    /* compiled from: VideoVideoLiveStatusItemDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoLiveStatusItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoLiveStatusItemDto createFromParcel(Parcel parcel) {
            return new VideoVideoLiveStatusItemDto((UserId) parcel.readParcelable(VideoVideoLiveStatusItemDto.class.getClassLoader()), parcel.readInt(), (VideoLiveStatusDto) parcel.readParcelable(VideoVideoLiveStatusItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoLiveStatusItemDto[] newArray(int i) {
            return new VideoVideoLiveStatusItemDto[i];
        }
    }

    public VideoVideoLiveStatusItemDto(UserId userId, int i, VideoLiveStatusDto videoLiveStatusDto) {
        this.ownerId = userId;
        this.id = i;
        this.liveStatus = videoLiveStatusDto;
    }

    public final VideoLiveStatusDto d() {
        return this.liveStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoLiveStatusItemDto)) {
            return false;
        }
        VideoVideoLiveStatusItemDto videoVideoLiveStatusItemDto = (VideoVideoLiveStatusItemDto) obj;
        return epx.f(this.ownerId, videoVideoLiveStatusItemDto.ownerId) && this.id == videoVideoLiveStatusItemDto.id && this.liveStatus == videoVideoLiveStatusItemDto.liveStatus;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.liveStatus.hashCode() + shy.a(this.id, Long.hashCode(this.ownerId.b) * 31, 31);
    }

    public final String toString() {
        return "VideoVideoLiveStatusItemDto(ownerId=" + this.ownerId + ", id=" + this.id + ", liveStatus=" + this.liveStatus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.liveStatus, i);
    }
}
