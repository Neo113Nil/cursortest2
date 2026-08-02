package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsResolveMiniAppScreenNamePlatformDto.kt */
/* loaded from: classes14.dex */
public final class AppsResolveMiniAppScreenNamePlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsResolveMiniAppScreenNamePlatformDto[] $VALUES;

    @pmi0("android")
    public static final AppsResolveMiniAppScreenNamePlatformDto ANDROID;
    public static final Parcelable.Creator<AppsResolveMiniAppScreenNamePlatformDto> CREATOR;

    @pmi0("ios")
    public static final AppsResolveMiniAppScreenNamePlatformDto IOS;

    @pmi0("web")
    public static final AppsResolveMiniAppScreenNamePlatformDto WEB;
    private final String value;

    /* compiled from: AppsResolveMiniAppScreenNamePlatformDto.kt */
    public static final class a implements Parcelable.Creator<AppsResolveMiniAppScreenNamePlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsResolveMiniAppScreenNamePlatformDto createFromParcel(Parcel parcel) {
            return AppsResolveMiniAppScreenNamePlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsResolveMiniAppScreenNamePlatformDto[] newArray(int i) {
            return new AppsResolveMiniAppScreenNamePlatformDto[i];
        }
    }

    static {
        AppsResolveMiniAppScreenNamePlatformDto appsResolveMiniAppScreenNamePlatformDto = new AppsResolveMiniAppScreenNamePlatformDto("ANDROID", 0, "android");
        ANDROID = appsResolveMiniAppScreenNamePlatformDto;
        AppsResolveMiniAppScreenNamePlatformDto appsResolveMiniAppScreenNamePlatformDto2 = new AppsResolveMiniAppScreenNamePlatformDto("IOS", 1, "ios");
        IOS = appsResolveMiniAppScreenNamePlatformDto2;
        AppsResolveMiniAppScreenNamePlatformDto appsResolveMiniAppScreenNamePlatformDto3 = new AppsResolveMiniAppScreenNamePlatformDto("WEB", 2, "web");
        WEB = appsResolveMiniAppScreenNamePlatformDto3;
        AppsResolveMiniAppScreenNamePlatformDto[] appsResolveMiniAppScreenNamePlatformDtoArr = {appsResolveMiniAppScreenNamePlatformDto, appsResolveMiniAppScreenNamePlatformDto2, appsResolveMiniAppScreenNamePlatformDto3};
        $VALUES = appsResolveMiniAppScreenNamePlatformDtoArr;
        $ENTRIES = new asp(appsResolveMiniAppScreenNamePlatformDtoArr);
        CREATOR = new a();
    }

    private AppsResolveMiniAppScreenNamePlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsResolveMiniAppScreenNamePlatformDto valueOf(String str) {
        return (AppsResolveMiniAppScreenNamePlatformDto) Enum.valueOf(AppsResolveMiniAppScreenNamePlatformDto.class, str);
    }

    public static AppsResolveMiniAppScreenNamePlatformDto[] values() {
        return (AppsResolveMiniAppScreenNamePlatformDto[]) $VALUES.clone();
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
