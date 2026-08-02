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
/* compiled from: VideoViewSegmentsStateStartDto.kt */
/* loaded from: classes15.dex */
public final class VideoViewSegmentsStateStartDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoViewSegmentsStateStartDto[] $VALUES;

    @pmi0(L2.g)
    public static final VideoViewSegmentsStateStartDto BACKGROUND;
    public static final Parcelable.Creator<VideoViewSegmentsStateStartDto> CREATOR;

    @pmi0("floating_player")
    public static final VideoViewSegmentsStateStartDto FLOATING_PLAYER;

    @pmi0("fullscreen")
    public static final VideoViewSegmentsStateStartDto FULLSCREEN;

    @pmi0("inline_player")
    public static final VideoViewSegmentsStateStartDto INLINE_PLAYER;

    @pmi0("unknown")
    public static final VideoViewSegmentsStateStartDto UNKNOWN;
    private final String value;

    /* compiled from: VideoViewSegmentsStateStartDto.kt */
    public static final class a implements Parcelable.Creator<VideoViewSegmentsStateStartDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoViewSegmentsStateStartDto createFromParcel(Parcel parcel) {
            return VideoViewSegmentsStateStartDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoViewSegmentsStateStartDto[] newArray(int i) {
            return new VideoViewSegmentsStateStartDto[i];
        }
    }

    static {
        VideoViewSegmentsStateStartDto videoViewSegmentsStateStartDto = new VideoViewSegmentsStateStartDto("BACKGROUND", 0, L2.g);
        BACKGROUND = videoViewSegmentsStateStartDto;
        VideoViewSegmentsStateStartDto videoViewSegmentsStateStartDto2 = new VideoViewSegmentsStateStartDto("FLOATING_PLAYER", 1, "floating_player");
        FLOATING_PLAYER = videoViewSegmentsStateStartDto2;
        VideoViewSegmentsStateStartDto videoViewSegmentsStateStartDto3 = new VideoViewSegmentsStateStartDto("FULLSCREEN", 2, "fullscreen");
        FULLSCREEN = videoViewSegmentsStateStartDto3;
        VideoViewSegmentsStateStartDto videoViewSegmentsStateStartDto4 = new VideoViewSegmentsStateStartDto("INLINE_PLAYER", 3, "inline_player");
        INLINE_PLAYER = videoViewSegmentsStateStartDto4;
        VideoViewSegmentsStateStartDto videoViewSegmentsStateStartDto5 = new VideoViewSegmentsStateStartDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4, "unknown");
        UNKNOWN = videoViewSegmentsStateStartDto5;
        VideoViewSegmentsStateStartDto[] videoViewSegmentsStateStartDtoArr = {videoViewSegmentsStateStartDto, videoViewSegmentsStateStartDto2, videoViewSegmentsStateStartDto3, videoViewSegmentsStateStartDto4, videoViewSegmentsStateStartDto5};
        $VALUES = videoViewSegmentsStateStartDtoArr;
        $ENTRIES = new asp(videoViewSegmentsStateStartDtoArr);
        CREATOR = new a();
    }

    private VideoViewSegmentsStateStartDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoViewSegmentsStateStartDto valueOf(String str) {
        return (VideoViewSegmentsStateStartDto) Enum.valueOf(VideoViewSegmentsStateStartDto.class, str);
    }

    public static VideoViewSegmentsStateStartDto[] values() {
        return (VideoViewSegmentsStateStartDto[]) $VALUES.clone();
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
