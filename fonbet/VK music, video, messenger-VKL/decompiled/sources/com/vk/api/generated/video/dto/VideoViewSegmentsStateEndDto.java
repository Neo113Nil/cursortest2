package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.appmetrica.analytics.impl.L2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoViewSegmentsStateEndDto.kt */
/* loaded from: classes15.dex */
public final class VideoViewSegmentsStateEndDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoViewSegmentsStateEndDto[] $VALUES;

    @pmi0(L2.g)
    public static final VideoViewSegmentsStateEndDto BACKGROUND;
    public static final Parcelable.Creator<VideoViewSegmentsStateEndDto> CREATOR;

    @pmi0("floating_player")
    public static final VideoViewSegmentsStateEndDto FLOATING_PLAYER;

    @pmi0("fullscreen")
    public static final VideoViewSegmentsStateEndDto FULLSCREEN;

    @pmi0("inline_player")
    public static final VideoViewSegmentsStateEndDto INLINE_PLAYER;

    @pmi0("unknown")
    public static final VideoViewSegmentsStateEndDto UNKNOWN;
    private final String value;

    /* compiled from: VideoViewSegmentsStateEndDto.kt */
    public static final class a implements Parcelable.Creator<VideoViewSegmentsStateEndDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoViewSegmentsStateEndDto createFromParcel(Parcel parcel) {
            return VideoViewSegmentsStateEndDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoViewSegmentsStateEndDto[] newArray(int i) {
            return new VideoViewSegmentsStateEndDto[i];
        }
    }

    static {
        VideoViewSegmentsStateEndDto videoViewSegmentsStateEndDto = new VideoViewSegmentsStateEndDto("BACKGROUND", 0, L2.g);
        BACKGROUND = videoViewSegmentsStateEndDto;
        VideoViewSegmentsStateEndDto videoViewSegmentsStateEndDto2 = new VideoViewSegmentsStateEndDto("FLOATING_PLAYER", 1, "floating_player");
        FLOATING_PLAYER = videoViewSegmentsStateEndDto2;
        VideoViewSegmentsStateEndDto videoViewSegmentsStateEndDto3 = new VideoViewSegmentsStateEndDto("FULLSCREEN", 2, "fullscreen");
        FULLSCREEN = videoViewSegmentsStateEndDto3;
        VideoViewSegmentsStateEndDto videoViewSegmentsStateEndDto4 = new VideoViewSegmentsStateEndDto("INLINE_PLAYER", 3, "inline_player");
        INLINE_PLAYER = videoViewSegmentsStateEndDto4;
        VideoViewSegmentsStateEndDto videoViewSegmentsStateEndDto5 = new VideoViewSegmentsStateEndDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4, "unknown");
        UNKNOWN = videoViewSegmentsStateEndDto5;
        VideoViewSegmentsStateEndDto[] videoViewSegmentsStateEndDtoArr = {videoViewSegmentsStateEndDto, videoViewSegmentsStateEndDto2, videoViewSegmentsStateEndDto3, videoViewSegmentsStateEndDto4, videoViewSegmentsStateEndDto5};
        $VALUES = videoViewSegmentsStateEndDtoArr;
        $ENTRIES = new asp(videoViewSegmentsStateEndDtoArr);
        CREATOR = new a();
    }

    private VideoViewSegmentsStateEndDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoViewSegmentsStateEndDto valueOf(String str) {
        return (VideoViewSegmentsStateEndDto) Enum.valueOf(VideoViewSegmentsStateEndDto.class, str);
    }

    public static VideoViewSegmentsStateEndDto[] values() {
        return (VideoViewSegmentsStateEndDto[]) $VALUES.clone();
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
