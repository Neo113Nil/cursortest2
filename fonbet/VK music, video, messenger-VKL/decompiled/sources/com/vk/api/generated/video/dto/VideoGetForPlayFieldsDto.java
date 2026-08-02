package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetForPlayFieldsDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetForPlayFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetForPlayFieldsDto[] $VALUES;
    public static final Parcelable.Creator<VideoGetForPlayFieldsDto> CREATOR;

    @pmi0("is_serial")
    public static final VideoGetForPlayFieldsDto IS_SERIAL;

    @pmi0("skippable_parts")
    public static final VideoGetForPlayFieldsDto SKIPPABLE_PARTS;
    private final String value;

    /* compiled from: VideoGetForPlayFieldsDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetForPlayFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetForPlayFieldsDto createFromParcel(Parcel parcel) {
            return VideoGetForPlayFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetForPlayFieldsDto[] newArray(int i) {
            return new VideoGetForPlayFieldsDto[i];
        }
    }

    static {
        VideoGetForPlayFieldsDto videoGetForPlayFieldsDto = new VideoGetForPlayFieldsDto("IS_SERIAL", 0, "is_serial");
        IS_SERIAL = videoGetForPlayFieldsDto;
        VideoGetForPlayFieldsDto videoGetForPlayFieldsDto2 = new VideoGetForPlayFieldsDto("SKIPPABLE_PARTS", 1, "skippable_parts");
        SKIPPABLE_PARTS = videoGetForPlayFieldsDto2;
        VideoGetForPlayFieldsDto[] videoGetForPlayFieldsDtoArr = {videoGetForPlayFieldsDto, videoGetForPlayFieldsDto2};
        $VALUES = videoGetForPlayFieldsDtoArr;
        $ENTRIES = new asp(videoGetForPlayFieldsDtoArr);
        CREATOR = new a();
    }

    private VideoGetForPlayFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VideoGetForPlayFieldsDto valueOf(String str) {
        return (VideoGetForPlayFieldsDto) Enum.valueOf(VideoGetForPlayFieldsDto.class, str);
    }

    public static VideoGetForPlayFieldsDto[] values() {
        return (VideoGetForPlayFieldsDto[]) $VALUES.clone();
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
