package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoTvChannelDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvChannelDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvChannelDto> CREATOR = new a();

    @pmi0("video")
    private final VideoVideoFullDto video;

    @pmi0("video_tv_channel_settings")
    private final VideoTvChannelSettingsDto videoTvChannelSettings;

    /* compiled from: VideoTvChannelDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvChannelDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelDto createFromParcel(Parcel parcel) {
            return new VideoTvChannelDto(parcel.readInt() == 0 ? null : VideoTvChannelSettingsDto.CREATOR.createFromParcel(parcel), (VideoVideoFullDto) parcel.readParcelable(VideoTvChannelDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelDto[] newArray(int i) {
            return new VideoTvChannelDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoTvChannelDto() {
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
        if (!(obj instanceof VideoTvChannelDto)) {
            return false;
        }
        VideoTvChannelDto videoTvChannelDto = (VideoTvChannelDto) obj;
        return epx.f(this.videoTvChannelSettings, videoTvChannelDto.videoTvChannelSettings) && epx.f(this.video, videoTvChannelDto.video);
    }

    public final int hashCode() {
        VideoTvChannelSettingsDto videoTvChannelSettingsDto = this.videoTvChannelSettings;
        int hashCode = (videoTvChannelSettingsDto == null ? 0 : videoTvChannelSettingsDto.hashCode()) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        return hashCode + (videoVideoFullDto != null ? videoVideoFullDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoTvChannelDto(videoTvChannelSettings=" + this.videoTvChannelSettings + ", video=" + this.video + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VideoTvChannelSettingsDto videoTvChannelSettingsDto = this.videoTvChannelSettings;
        if (videoTvChannelSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoTvChannelSettingsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.video, i);
    }

    public VideoTvChannelDto(VideoTvChannelSettingsDto videoTvChannelSettingsDto, VideoVideoFullDto videoVideoFullDto) {
        this.videoTvChannelSettings = videoTvChannelSettingsDto;
        this.video = videoVideoFullDto;
    }

    public /* synthetic */ VideoTvChannelDto(VideoTvChannelSettingsDto videoTvChannelSettingsDto, VideoVideoFullDto videoVideoFullDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoTvChannelSettingsDto, (i & 2) != 0 ? null : videoVideoFullDto);
    }
}
