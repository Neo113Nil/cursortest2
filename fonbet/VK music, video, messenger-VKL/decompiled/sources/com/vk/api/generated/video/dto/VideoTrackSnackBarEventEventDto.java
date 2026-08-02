package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoTrackSnackBarEventEventDto.kt */
/* loaded from: classes15.dex */
public final class VideoTrackSnackBarEventEventDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoTrackSnackBarEventEventDto[] $VALUES;

    @pmi0("closed")
    public static final VideoTrackSnackBarEventEventDto CLOSED;
    public static final Parcelable.Creator<VideoTrackSnackBarEventEventDto> CREATOR;

    @pmi0("subscribed")
    public static final VideoTrackSnackBarEventEventDto SUBSCRIBED;
    private final String value;

    /* compiled from: VideoTrackSnackBarEventEventDto.kt */
    public static final class a implements Parcelable.Creator<VideoTrackSnackBarEventEventDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTrackSnackBarEventEventDto createFromParcel(Parcel parcel) {
            return VideoTrackSnackBarEventEventDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTrackSnackBarEventEventDto[] newArray(int i) {
            return new VideoTrackSnackBarEventEventDto[i];
        }
    }

    static {
        VideoTrackSnackBarEventEventDto videoTrackSnackBarEventEventDto = new VideoTrackSnackBarEventEventDto("CLOSED", 0, "closed");
        CLOSED = videoTrackSnackBarEventEventDto;
        VideoTrackSnackBarEventEventDto videoTrackSnackBarEventEventDto2 = new VideoTrackSnackBarEventEventDto("SUBSCRIBED", 1, "subscribed");
        SUBSCRIBED = videoTrackSnackBarEventEventDto2;
        VideoTrackSnackBarEventEventDto[] videoTrackSnackBarEventEventDtoArr = {videoTrackSnackBarEventEventDto, videoTrackSnackBarEventEventDto2};
        $VALUES = videoTrackSnackBarEventEventDtoArr;
        $ENTRIES = new asp(videoTrackSnackBarEventEventDtoArr);
        CREATOR = new a();
    }

    private VideoTrackSnackBarEventEventDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoTrackSnackBarEventEventDto valueOf(String str) {
        return (VideoTrackSnackBarEventEventDto) Enum.valueOf(VideoTrackSnackBarEventEventDto.class, str);
    }

    public static VideoTrackSnackBarEventEventDto[] values() {
        return (VideoTrackSnackBarEventEventDto[]) $VALUES.clone();
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
