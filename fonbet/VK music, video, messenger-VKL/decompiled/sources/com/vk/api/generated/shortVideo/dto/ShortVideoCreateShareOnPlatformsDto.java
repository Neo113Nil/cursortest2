package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoCreateShareOnPlatformsDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoCreateShareOnPlatformsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoCreateShareOnPlatformsDto[] $VALUES;
    public static final Parcelable.Creator<ShortVideoCreateShareOnPlatformsDto> CREATOR;

    @pmi0("odkl")
    public static final ShortVideoCreateShareOnPlatformsDto ODKL;

    @pmi0("vk")
    public static final ShortVideoCreateShareOnPlatformsDto VK;
    private final String value;

    /* compiled from: ShortVideoCreateShareOnPlatformsDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoCreateShareOnPlatformsDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoCreateShareOnPlatformsDto createFromParcel(Parcel parcel) {
            return ShortVideoCreateShareOnPlatformsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoCreateShareOnPlatformsDto[] newArray(int i) {
            return new ShortVideoCreateShareOnPlatformsDto[i];
        }
    }

    static {
        ShortVideoCreateShareOnPlatformsDto shortVideoCreateShareOnPlatformsDto = new ShortVideoCreateShareOnPlatformsDto("ODKL", 0, "odkl");
        ODKL = shortVideoCreateShareOnPlatformsDto;
        ShortVideoCreateShareOnPlatformsDto shortVideoCreateShareOnPlatformsDto2 = new ShortVideoCreateShareOnPlatformsDto("VK", 1, "vk");
        VK = shortVideoCreateShareOnPlatformsDto2;
        ShortVideoCreateShareOnPlatformsDto[] shortVideoCreateShareOnPlatformsDtoArr = {shortVideoCreateShareOnPlatformsDto, shortVideoCreateShareOnPlatformsDto2};
        $VALUES = shortVideoCreateShareOnPlatformsDtoArr;
        $ENTRIES = new asp(shortVideoCreateShareOnPlatformsDtoArr);
        CREATOR = new a();
    }

    private ShortVideoCreateShareOnPlatformsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoCreateShareOnPlatformsDto valueOf(String str) {
        return (ShortVideoCreateShareOnPlatformsDto) Enum.valueOf(ShortVideoCreateShareOnPlatformsDto.class, str);
    }

    public static ShortVideoCreateShareOnPlatformsDto[] values() {
        return (ShortVideoCreateShareOnPlatformsDto[]) $VALUES.clone();
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
