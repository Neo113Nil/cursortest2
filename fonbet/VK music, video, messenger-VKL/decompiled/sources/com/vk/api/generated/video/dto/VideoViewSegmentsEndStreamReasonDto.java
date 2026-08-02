package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoViewSegmentsEndStreamReasonDto.kt */
/* loaded from: classes15.dex */
public final class VideoViewSegmentsEndStreamReasonDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoViewSegmentsEndStreamReasonDto[] $VALUES;

    @pmi0("change_source")
    public static final VideoViewSegmentsEndStreamReasonDto CHANGE_SOURCE;
    public static final Parcelable.Creator<VideoViewSegmentsEndStreamReasonDto> CREATOR;

    @pmi0("link_click")
    public static final VideoViewSegmentsEndStreamReasonDto LINK_CLICK;

    @pmi0("next_btn")
    public static final VideoViewSegmentsEndStreamReasonDto NEXT_BTN;

    @pmi0("next_source")
    public static final VideoViewSegmentsEndStreamReasonDto NEXT_SOURCE;

    @pmi0("session_end")
    public static final VideoViewSegmentsEndStreamReasonDto SESSION_END;

    @pmi0("unknown")
    public static final VideoViewSegmentsEndStreamReasonDto UNKNOWN;
    private final String value;

    /* compiled from: VideoViewSegmentsEndStreamReasonDto.kt */
    public static final class a implements Parcelable.Creator<VideoViewSegmentsEndStreamReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoViewSegmentsEndStreamReasonDto createFromParcel(Parcel parcel) {
            return VideoViewSegmentsEndStreamReasonDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoViewSegmentsEndStreamReasonDto[] newArray(int i) {
            return new VideoViewSegmentsEndStreamReasonDto[i];
        }
    }

    static {
        VideoViewSegmentsEndStreamReasonDto videoViewSegmentsEndStreamReasonDto = new VideoViewSegmentsEndStreamReasonDto("CHANGE_SOURCE", 0, "change_source");
        CHANGE_SOURCE = videoViewSegmentsEndStreamReasonDto;
        VideoViewSegmentsEndStreamReasonDto videoViewSegmentsEndStreamReasonDto2 = new VideoViewSegmentsEndStreamReasonDto("LINK_CLICK", 1, "link_click");
        LINK_CLICK = videoViewSegmentsEndStreamReasonDto2;
        VideoViewSegmentsEndStreamReasonDto videoViewSegmentsEndStreamReasonDto3 = new VideoViewSegmentsEndStreamReasonDto("NEXT_BTN", 2, "next_btn");
        NEXT_BTN = videoViewSegmentsEndStreamReasonDto3;
        VideoViewSegmentsEndStreamReasonDto videoViewSegmentsEndStreamReasonDto4 = new VideoViewSegmentsEndStreamReasonDto("NEXT_SOURCE", 3, "next_source");
        NEXT_SOURCE = videoViewSegmentsEndStreamReasonDto4;
        VideoViewSegmentsEndStreamReasonDto videoViewSegmentsEndStreamReasonDto5 = new VideoViewSegmentsEndStreamReasonDto("SESSION_END", 4, "session_end");
        SESSION_END = videoViewSegmentsEndStreamReasonDto5;
        VideoViewSegmentsEndStreamReasonDto videoViewSegmentsEndStreamReasonDto6 = new VideoViewSegmentsEndStreamReasonDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, "unknown");
        UNKNOWN = videoViewSegmentsEndStreamReasonDto6;
        VideoViewSegmentsEndStreamReasonDto[] videoViewSegmentsEndStreamReasonDtoArr = {videoViewSegmentsEndStreamReasonDto, videoViewSegmentsEndStreamReasonDto2, videoViewSegmentsEndStreamReasonDto3, videoViewSegmentsEndStreamReasonDto4, videoViewSegmentsEndStreamReasonDto5, videoViewSegmentsEndStreamReasonDto6};
        $VALUES = videoViewSegmentsEndStreamReasonDtoArr;
        $ENTRIES = new asp(videoViewSegmentsEndStreamReasonDtoArr);
        CREATOR = new a();
    }

    private VideoViewSegmentsEndStreamReasonDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoViewSegmentsEndStreamReasonDto valueOf(String str) {
        return (VideoViewSegmentsEndStreamReasonDto) Enum.valueOf(VideoViewSegmentsEndStreamReasonDto.class, str);
    }

    public static VideoViewSegmentsEndStreamReasonDto[] values() {
        return (VideoViewSegmentsEndStreamReasonDto[]) $VALUES.clone();
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
