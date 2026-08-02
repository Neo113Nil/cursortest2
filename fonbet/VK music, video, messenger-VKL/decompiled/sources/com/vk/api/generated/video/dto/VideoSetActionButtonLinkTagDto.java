package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSetActionButtonLinkTagDto.kt */
/* loaded from: classes15.dex */
public final class VideoSetActionButtonLinkTagDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSetActionButtonLinkTagDto[] $VALUES;
    public static final Parcelable.Creator<VideoSetActionButtonLinkTagDto> CREATOR;

    @pmi0("live")
    public static final VideoSetActionButtonLinkTagDto LIVE;
    private final String value;

    /* compiled from: VideoSetActionButtonLinkTagDto.kt */
    public static final class a implements Parcelable.Creator<VideoSetActionButtonLinkTagDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSetActionButtonLinkTagDto createFromParcel(Parcel parcel) {
            return VideoSetActionButtonLinkTagDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSetActionButtonLinkTagDto[] newArray(int i) {
            return new VideoSetActionButtonLinkTagDto[i];
        }
    }

    static {
        VideoSetActionButtonLinkTagDto videoSetActionButtonLinkTagDto = new VideoSetActionButtonLinkTagDto("LIVE", 0, "live");
        LIVE = videoSetActionButtonLinkTagDto;
        VideoSetActionButtonLinkTagDto[] videoSetActionButtonLinkTagDtoArr = {videoSetActionButtonLinkTagDto};
        $VALUES = videoSetActionButtonLinkTagDtoArr;
        $ENTRIES = new asp(videoSetActionButtonLinkTagDtoArr);
        CREATOR = new a();
    }

    private VideoSetActionButtonLinkTagDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoSetActionButtonLinkTagDto valueOf(String str) {
        return (VideoSetActionButtonLinkTagDto) Enum.valueOf(VideoSetActionButtonLinkTagDto.class, str);
    }

    public static VideoSetActionButtonLinkTagDto[] values() {
        return (VideoSetActionButtonLinkTagDto[]) $VALUES.clone();
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
