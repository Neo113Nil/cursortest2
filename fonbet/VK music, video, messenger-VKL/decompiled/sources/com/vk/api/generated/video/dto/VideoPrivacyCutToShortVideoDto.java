package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoPrivacyCutToShortVideoDto.kt */
/* loaded from: classes15.dex */
public final class VideoPrivacyCutToShortVideoDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoPrivacyCutToShortVideoDto[] $VALUES;

    @pmi0("all")
    public static final VideoPrivacyCutToShortVideoDto ALL;
    public static final Parcelable.Creator<VideoPrivacyCutToShortVideoDto> CREATOR;

    @pmi0("nobody")
    public static final VideoPrivacyCutToShortVideoDto NOBODY;
    private final String value;

    /* compiled from: VideoPrivacyCutToShortVideoDto.kt */
    public static final class a implements Parcelable.Creator<VideoPrivacyCutToShortVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoPrivacyCutToShortVideoDto createFromParcel(Parcel parcel) {
            return VideoPrivacyCutToShortVideoDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPrivacyCutToShortVideoDto[] newArray(int i) {
            return new VideoPrivacyCutToShortVideoDto[i];
        }
    }

    static {
        VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto = new VideoPrivacyCutToShortVideoDto("NOBODY", 0, "nobody");
        NOBODY = videoPrivacyCutToShortVideoDto;
        VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto2 = new VideoPrivacyCutToShortVideoDto("ALL", 1, "all");
        ALL = videoPrivacyCutToShortVideoDto2;
        VideoPrivacyCutToShortVideoDto[] videoPrivacyCutToShortVideoDtoArr = {videoPrivacyCutToShortVideoDto, videoPrivacyCutToShortVideoDto2};
        $VALUES = videoPrivacyCutToShortVideoDtoArr;
        $ENTRIES = new asp(videoPrivacyCutToShortVideoDtoArr);
        CREATOR = new a();
    }

    private VideoPrivacyCutToShortVideoDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoPrivacyCutToShortVideoDto valueOf(String str) {
        return (VideoPrivacyCutToShortVideoDto) Enum.valueOf(VideoPrivacyCutToShortVideoDto.class, str);
    }

    public static VideoPrivacyCutToShortVideoDto[] values() {
        return (VideoPrivacyCutToShortVideoDto[]) $VALUES.clone();
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
