package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsResolveScreenNamePlatformDto.kt */
/* loaded from: classes14.dex */
public final class AppsResolveScreenNamePlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsResolveScreenNamePlatformDto[] $VALUES;

    @pmi0("android")
    public static final AppsResolveScreenNamePlatformDto ANDROID;
    public static final Parcelable.Creator<AppsResolveScreenNamePlatformDto> CREATOR;

    @pmi0("ios")
    public static final AppsResolveScreenNamePlatformDto IOS;

    @pmi0("web")
    public static final AppsResolveScreenNamePlatformDto WEB;
    private final String value;

    /* compiled from: AppsResolveScreenNamePlatformDto.kt */
    public static final class a implements Parcelable.Creator<AppsResolveScreenNamePlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsResolveScreenNamePlatformDto createFromParcel(Parcel parcel) {
            return AppsResolveScreenNamePlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsResolveScreenNamePlatformDto[] newArray(int i) {
            return new AppsResolveScreenNamePlatformDto[i];
        }
    }

    static {
        AppsResolveScreenNamePlatformDto appsResolveScreenNamePlatformDto = new AppsResolveScreenNamePlatformDto("ANDROID", 0, "android");
        ANDROID = appsResolveScreenNamePlatformDto;
        AppsResolveScreenNamePlatformDto appsResolveScreenNamePlatformDto2 = new AppsResolveScreenNamePlatformDto("IOS", 1, "ios");
        IOS = appsResolveScreenNamePlatformDto2;
        AppsResolveScreenNamePlatformDto appsResolveScreenNamePlatformDto3 = new AppsResolveScreenNamePlatformDto("WEB", 2, "web");
        WEB = appsResolveScreenNamePlatformDto3;
        AppsResolveScreenNamePlatformDto[] appsResolveScreenNamePlatformDtoArr = {appsResolveScreenNamePlatformDto, appsResolveScreenNamePlatformDto2, appsResolveScreenNamePlatformDto3};
        $VALUES = appsResolveScreenNamePlatformDtoArr;
        $ENTRIES = new asp(appsResolveScreenNamePlatformDtoArr);
        CREATOR = new a();
    }

    private AppsResolveScreenNamePlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsResolveScreenNamePlatformDto valueOf(String str) {
        return (AppsResolveScreenNamePlatformDto) Enum.valueOf(AppsResolveScreenNamePlatformDto.class, str);
    }

    public static AppsResolveScreenNamePlatformDto[] values() {
        return (AppsResolveScreenNamePlatformDto[]) $VALUES.clone();
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
