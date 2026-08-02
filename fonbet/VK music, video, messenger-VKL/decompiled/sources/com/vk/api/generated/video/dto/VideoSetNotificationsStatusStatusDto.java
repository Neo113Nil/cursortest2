package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSetNotificationsStatusStatusDto.kt */
/* loaded from: classes15.dex */
public final class VideoSetNotificationsStatusStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSetNotificationsStatusStatusDto[] $VALUES;

    @pmi0("all")
    public static final VideoSetNotificationsStatusStatusDto ALL;
    public static final Parcelable.Creator<VideoSetNotificationsStatusStatusDto> CREATOR;

    @pmi0("none")
    public static final VideoSetNotificationsStatusStatusDto NONE;

    @pmi0("preferred")
    public static final VideoSetNotificationsStatusStatusDto PREFERRED;
    private final String value;

    /* compiled from: VideoSetNotificationsStatusStatusDto.kt */
    public static final class a implements Parcelable.Creator<VideoSetNotificationsStatusStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSetNotificationsStatusStatusDto createFromParcel(Parcel parcel) {
            return VideoSetNotificationsStatusStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSetNotificationsStatusStatusDto[] newArray(int i) {
            return new VideoSetNotificationsStatusStatusDto[i];
        }
    }

    static {
        VideoSetNotificationsStatusStatusDto videoSetNotificationsStatusStatusDto = new VideoSetNotificationsStatusStatusDto("ALL", 0, "all");
        ALL = videoSetNotificationsStatusStatusDto;
        VideoSetNotificationsStatusStatusDto videoSetNotificationsStatusStatusDto2 = new VideoSetNotificationsStatusStatusDto("NONE", 1, "none");
        NONE = videoSetNotificationsStatusStatusDto2;
        VideoSetNotificationsStatusStatusDto videoSetNotificationsStatusStatusDto3 = new VideoSetNotificationsStatusStatusDto("PREFERRED", 2, "preferred");
        PREFERRED = videoSetNotificationsStatusStatusDto3;
        VideoSetNotificationsStatusStatusDto[] videoSetNotificationsStatusStatusDtoArr = {videoSetNotificationsStatusStatusDto, videoSetNotificationsStatusStatusDto2, videoSetNotificationsStatusStatusDto3};
        $VALUES = videoSetNotificationsStatusStatusDtoArr;
        $ENTRIES = new asp(videoSetNotificationsStatusStatusDtoArr);
        CREATOR = new a();
    }

    private VideoSetNotificationsStatusStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoSetNotificationsStatusStatusDto valueOf(String str) {
        return (VideoSetNotificationsStatusStatusDto) Enum.valueOf(VideoSetNotificationsStatusStatusDto.class, str);
    }

    public static VideoSetNotificationsStatusStatusDto[] values() {
        return (VideoSetNotificationsStatusStatusDto[]) $VALUES.clone();
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
