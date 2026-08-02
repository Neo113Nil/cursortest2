package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoLiveStatusDto.kt */
/* loaded from: classes15.dex */
public final class VideoLiveStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoLiveStatusDto[] $VALUES;
    public static final Parcelable.Creator<VideoLiveStatusDto> CREATOR;

    @pmi0("deleted")
    public static final VideoLiveStatusDto DELETED;

    @pmi0("failed")
    public static final VideoLiveStatusDto FAILED;

    @pmi0("finished")
    public static final VideoLiveStatusDto FINISHED;

    @pmi0("no_video")
    public static final VideoLiveStatusDto NO_VIDEO;

    @pmi0("postlive")
    public static final VideoLiveStatusDto POSTLIVE;

    @pmi0(X3.i.d0)
    public static final VideoLiveStatusDto STARTED;

    @pmi0("upcoming")
    public static final VideoLiveStatusDto UPCOMING;

    @pmi0("waiting")
    public static final VideoLiveStatusDto WAITING;
    private final String value;

    /* compiled from: VideoLiveStatusDto.kt */
    public static final class a implements Parcelable.Creator<VideoLiveStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoLiveStatusDto createFromParcel(Parcel parcel) {
            return VideoLiveStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLiveStatusDto[] newArray(int i) {
            return new VideoLiveStatusDto[i];
        }
    }

    static {
        VideoLiveStatusDto videoLiveStatusDto = new VideoLiveStatusDto("NO_VIDEO", 0, "no_video");
        NO_VIDEO = videoLiveStatusDto;
        VideoLiveStatusDto videoLiveStatusDto2 = new VideoLiveStatusDto("DELETED", 1, "deleted");
        DELETED = videoLiveStatusDto2;
        VideoLiveStatusDto videoLiveStatusDto3 = new VideoLiveStatusDto("WAITING", 2, "waiting");
        WAITING = videoLiveStatusDto3;
        VideoLiveStatusDto videoLiveStatusDto4 = new VideoLiveStatusDto(SignalingProtocol.STATE_STARTED, 3, X3.i.d0);
        STARTED = videoLiveStatusDto4;
        VideoLiveStatusDto videoLiveStatusDto5 = new VideoLiveStatusDto("FINISHED", 4, "finished");
        FINISHED = videoLiveStatusDto5;
        VideoLiveStatusDto videoLiveStatusDto6 = new VideoLiveStatusDto("UPCOMING", 5, "upcoming");
        UPCOMING = videoLiveStatusDto6;
        VideoLiveStatusDto videoLiveStatusDto7 = new VideoLiveStatusDto(SignalingProtocol.HUNGUP_REASON_FAILED, 6, "failed");
        FAILED = videoLiveStatusDto7;
        VideoLiveStatusDto videoLiveStatusDto8 = new VideoLiveStatusDto("POSTLIVE", 7, "postlive");
        POSTLIVE = videoLiveStatusDto8;
        VideoLiveStatusDto[] videoLiveStatusDtoArr = {videoLiveStatusDto, videoLiveStatusDto2, videoLiveStatusDto3, videoLiveStatusDto4, videoLiveStatusDto5, videoLiveStatusDto6, videoLiveStatusDto7, videoLiveStatusDto8};
        $VALUES = videoLiveStatusDtoArr;
        $ENTRIES = new asp(videoLiveStatusDtoArr);
        CREATOR = new a();
    }

    private VideoLiveStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoLiveStatusDto valueOf(String str) {
        return (VideoLiveStatusDto) Enum.valueOf(VideoLiveStatusDto.class, str);
    }

    public static VideoLiveStatusDto[] values() {
        return (VideoLiveStatusDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
