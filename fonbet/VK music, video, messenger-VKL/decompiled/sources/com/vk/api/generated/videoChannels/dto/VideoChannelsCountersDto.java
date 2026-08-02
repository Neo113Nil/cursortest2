package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.bh10;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: VideoChannelsCountersDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsCountersDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsCountersDto> CREATOR = new a();

    @pmi0("members")
    private final long members;

    @pmi0("video_views")
    private final long videoViews;

    @pmi0("videos")
    private final long videos;

    /* compiled from: VideoChannelsCountersDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsCountersDto createFromParcel(Parcel parcel) {
            return new VideoChannelsCountersDto(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsCountersDto[] newArray(int i) {
            return new VideoChannelsCountersDto[i];
        }
    }

    public VideoChannelsCountersDto(long j, long j2, long j3) {
        this.members = j;
        this.videos = j2;
        this.videoViews = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsCountersDto)) {
            return false;
        }
        VideoChannelsCountersDto videoChannelsCountersDto = (VideoChannelsCountersDto) obj;
        return this.members == videoChannelsCountersDto.members && this.videos == videoChannelsCountersDto.videos && this.videoViews == videoChannelsCountersDto.videoViews;
    }

    public final int hashCode() {
        return Long.hashCode(this.videoViews) + bh10.a(Long.hashCode(this.members) * 31, 31, this.videos);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsCountersDto(members=");
        sb.append(this.members);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", videoViews=");
        return vu5.a(')', this.videoViews, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.members);
        parcel.writeLong(this.videos);
        parcel.writeLong(this.videoViews);
    }
}
