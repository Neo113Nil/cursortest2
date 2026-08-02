package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoLiveGetSpectatorsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoLiveGetSpectatorsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoLiveGetSpectatorsResponseDto> CREATOR = new a();

    @pmi0("live_status")
    private final VideoLiveStatusDto liveStatus;

    @pmi0("spectators")
    private final VideoLiveSpectatorsDto spectators;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoLiveGetSpectatorsResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("finished")
        public static final StatusDto FINISHED;

        @pmi0("live")
        public static final StatusDto LIVE;

        @pmi0("no_video")
        public static final StatusDto NO_VIDEO;
        private final String value;

        /* compiled from: VideoLiveGetSpectatorsResponseDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("LIVE", 0, "live");
            LIVE = statusDto;
            StatusDto statusDto2 = new StatusDto("FINISHED", 1, "finished");
            FINISHED = statusDto2;
            StatusDto statusDto3 = new StatusDto("NO_VIDEO", 2, "no_video");
            NO_VIDEO = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: VideoLiveGetSpectatorsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoLiveGetSpectatorsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoLiveGetSpectatorsResponseDto createFromParcel(Parcel parcel) {
            return new VideoLiveGetSpectatorsResponseDto(StatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VideoLiveSpectatorsDto.CREATOR.createFromParcel(parcel), (VideoLiveStatusDto) parcel.readParcelable(VideoLiveGetSpectatorsResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLiveGetSpectatorsResponseDto[] newArray(int i) {
            return new VideoLiveGetSpectatorsResponseDto[i];
        }
    }

    public VideoLiveGetSpectatorsResponseDto(StatusDto statusDto, VideoLiveSpectatorsDto videoLiveSpectatorsDto, VideoLiveStatusDto videoLiveStatusDto) {
        this.status = statusDto;
        this.spectators = videoLiveSpectatorsDto;
        this.liveStatus = videoLiveStatusDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveGetSpectatorsResponseDto)) {
            return false;
        }
        VideoLiveGetSpectatorsResponseDto videoLiveGetSpectatorsResponseDto = (VideoLiveGetSpectatorsResponseDto) obj;
        return this.status == videoLiveGetSpectatorsResponseDto.status && epx.f(this.spectators, videoLiveGetSpectatorsResponseDto.spectators) && this.liveStatus == videoLiveGetSpectatorsResponseDto.liveStatus;
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        VideoLiveSpectatorsDto videoLiveSpectatorsDto = this.spectators;
        int hashCode2 = (hashCode + (videoLiveSpectatorsDto == null ? 0 : videoLiveSpectatorsDto.hashCode())) * 31;
        VideoLiveStatusDto videoLiveStatusDto = this.liveStatus;
        return hashCode2 + (videoLiveStatusDto != null ? videoLiveStatusDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoLiveGetSpectatorsResponseDto(status=" + this.status + ", spectators=" + this.spectators + ", liveStatus=" + this.liveStatus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        VideoLiveSpectatorsDto videoLiveSpectatorsDto = this.spectators;
        if (videoLiveSpectatorsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoLiveSpectatorsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.liveStatus, i);
    }

    public /* synthetic */ VideoLiveGetSpectatorsResponseDto(StatusDto statusDto, VideoLiveSpectatorsDto videoLiveSpectatorsDto, VideoLiveStatusDto videoLiveStatusDto, int i, zcl zclVar) {
        this(statusDto, (i & 2) != 0 ? null : videoLiveSpectatorsDto, (i & 4) != 0 ? null : videoLiveStatusDto);
    }
}
