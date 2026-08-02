package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoGetDownloadUrlQualityDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetDownloadUrlQualityDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoGetDownloadUrlQualityDto[] $VALUES;
    public static final Parcelable.Creator<ShortVideoGetDownloadUrlQualityDto> CREATOR;

    @pmi0("1080p")
    public static final ShortVideoGetDownloadUrlQualityDto TYPE_1080P;

    @pmi0("1440p")
    public static final ShortVideoGetDownloadUrlQualityDto TYPE_1440P;

    @pmi0("144p")
    public static final ShortVideoGetDownloadUrlQualityDto TYPE_144P;

    @pmi0("2160p")
    public static final ShortVideoGetDownloadUrlQualityDto TYPE_2160P;

    @pmi0("240p")
    public static final ShortVideoGetDownloadUrlQualityDto TYPE_240P;

    @pmi0("360p")
    public static final ShortVideoGetDownloadUrlQualityDto TYPE_360P;

    @pmi0("480p")
    public static final ShortVideoGetDownloadUrlQualityDto TYPE_480P;

    @pmi0("720p")
    public static final ShortVideoGetDownloadUrlQualityDto TYPE_720P;
    private final String value;

    /* compiled from: ShortVideoGetDownloadUrlQualityDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetDownloadUrlQualityDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetDownloadUrlQualityDto createFromParcel(Parcel parcel) {
            return ShortVideoGetDownloadUrlQualityDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetDownloadUrlQualityDto[] newArray(int i) {
            return new ShortVideoGetDownloadUrlQualityDto[i];
        }
    }

    static {
        ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto = new ShortVideoGetDownloadUrlQualityDto("TYPE_1080P", 0, "1080p");
        TYPE_1080P = shortVideoGetDownloadUrlQualityDto;
        ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto2 = new ShortVideoGetDownloadUrlQualityDto("TYPE_1440P", 1, "1440p");
        TYPE_1440P = shortVideoGetDownloadUrlQualityDto2;
        ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto3 = new ShortVideoGetDownloadUrlQualityDto("TYPE_144P", 2, "144p");
        TYPE_144P = shortVideoGetDownloadUrlQualityDto3;
        ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto4 = new ShortVideoGetDownloadUrlQualityDto("TYPE_2160P", 3, "2160p");
        TYPE_2160P = shortVideoGetDownloadUrlQualityDto4;
        ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto5 = new ShortVideoGetDownloadUrlQualityDto("TYPE_240P", 4, "240p");
        TYPE_240P = shortVideoGetDownloadUrlQualityDto5;
        ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto6 = new ShortVideoGetDownloadUrlQualityDto("TYPE_360P", 5, "360p");
        TYPE_360P = shortVideoGetDownloadUrlQualityDto6;
        ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto7 = new ShortVideoGetDownloadUrlQualityDto("TYPE_480P", 6, "480p");
        TYPE_480P = shortVideoGetDownloadUrlQualityDto7;
        ShortVideoGetDownloadUrlQualityDto shortVideoGetDownloadUrlQualityDto8 = new ShortVideoGetDownloadUrlQualityDto("TYPE_720P", 7, "720p");
        TYPE_720P = shortVideoGetDownloadUrlQualityDto8;
        ShortVideoGetDownloadUrlQualityDto[] shortVideoGetDownloadUrlQualityDtoArr = {shortVideoGetDownloadUrlQualityDto, shortVideoGetDownloadUrlQualityDto2, shortVideoGetDownloadUrlQualityDto3, shortVideoGetDownloadUrlQualityDto4, shortVideoGetDownloadUrlQualityDto5, shortVideoGetDownloadUrlQualityDto6, shortVideoGetDownloadUrlQualityDto7, shortVideoGetDownloadUrlQualityDto8};
        $VALUES = shortVideoGetDownloadUrlQualityDtoArr;
        $ENTRIES = new asp(shortVideoGetDownloadUrlQualityDtoArr);
        CREATOR = new a();
    }

    private ShortVideoGetDownloadUrlQualityDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoGetDownloadUrlQualityDto valueOf(String str) {
        return (ShortVideoGetDownloadUrlQualityDto) Enum.valueOf(ShortVideoGetDownloadUrlQualityDto.class, str);
    }

    public static ShortVideoGetDownloadUrlQualityDto[] values() {
        return (ShortVideoGetDownloadUrlQualityDto[]) $VALUES.clone();
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
