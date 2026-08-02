package com.vk.api.generated.utils.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UtilsResolveScreenNameWithDataPlatformDto.kt */
/* loaded from: classes15.dex */
public final class UtilsResolveScreenNameWithDataPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UtilsResolveScreenNameWithDataPlatformDto[] $VALUES;

    @pmi0("android")
    public static final UtilsResolveScreenNameWithDataPlatformDto ANDROID;
    public static final Parcelable.Creator<UtilsResolveScreenNameWithDataPlatformDto> CREATOR;

    @pmi0("ios")
    public static final UtilsResolveScreenNameWithDataPlatformDto IOS;
    private final String value;

    /* compiled from: UtilsResolveScreenNameWithDataPlatformDto.kt */
    public static final class a implements Parcelable.Creator<UtilsResolveScreenNameWithDataPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final UtilsResolveScreenNameWithDataPlatformDto createFromParcel(Parcel parcel) {
            return UtilsResolveScreenNameWithDataPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UtilsResolveScreenNameWithDataPlatformDto[] newArray(int i) {
            return new UtilsResolveScreenNameWithDataPlatformDto[i];
        }
    }

    static {
        UtilsResolveScreenNameWithDataPlatformDto utilsResolveScreenNameWithDataPlatformDto = new UtilsResolveScreenNameWithDataPlatformDto("ANDROID", 0, "android");
        ANDROID = utilsResolveScreenNameWithDataPlatformDto;
        UtilsResolveScreenNameWithDataPlatformDto utilsResolveScreenNameWithDataPlatformDto2 = new UtilsResolveScreenNameWithDataPlatformDto("IOS", 1, "ios");
        IOS = utilsResolveScreenNameWithDataPlatformDto2;
        UtilsResolveScreenNameWithDataPlatformDto[] utilsResolveScreenNameWithDataPlatformDtoArr = {utilsResolveScreenNameWithDataPlatformDto, utilsResolveScreenNameWithDataPlatformDto2};
        $VALUES = utilsResolveScreenNameWithDataPlatformDtoArr;
        $ENTRIES = new asp(utilsResolveScreenNameWithDataPlatformDtoArr);
        CREATOR = new a();
    }

    private UtilsResolveScreenNameWithDataPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UtilsResolveScreenNameWithDataPlatformDto valueOf(String str) {
        return (UtilsResolveScreenNameWithDataPlatformDto) Enum.valueOf(UtilsResolveScreenNameWithDataPlatformDto.class, str);
    }

    public static UtilsResolveScreenNameWithDataPlatformDto[] values() {
        return (UtilsResolveScreenNameWithDataPlatformDto[]) $VALUES.clone();
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
