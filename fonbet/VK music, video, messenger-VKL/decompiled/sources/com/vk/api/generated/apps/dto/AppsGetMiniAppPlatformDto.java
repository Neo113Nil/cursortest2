package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetMiniAppPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetMiniAppPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetMiniAppPlatformDto[] $VALUES;

    @pmi0("android")
    public static final AppsGetMiniAppPlatformDto ANDROID;
    public static final Parcelable.Creator<AppsGetMiniAppPlatformDto> CREATOR;

    @pmi0("ios")
    public static final AppsGetMiniAppPlatformDto IOS;

    @pmi0("web")
    public static final AppsGetMiniAppPlatformDto WEB;
    private final String value;

    /* compiled from: AppsGetMiniAppPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetMiniAppPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetMiniAppPlatformDto createFromParcel(Parcel parcel) {
            return AppsGetMiniAppPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetMiniAppPlatformDto[] newArray(int i) {
            return new AppsGetMiniAppPlatformDto[i];
        }
    }

    static {
        AppsGetMiniAppPlatformDto appsGetMiniAppPlatformDto = new AppsGetMiniAppPlatformDto("ANDROID", 0, "android");
        ANDROID = appsGetMiniAppPlatformDto;
        AppsGetMiniAppPlatformDto appsGetMiniAppPlatformDto2 = new AppsGetMiniAppPlatformDto("IOS", 1, "ios");
        IOS = appsGetMiniAppPlatformDto2;
        AppsGetMiniAppPlatformDto appsGetMiniAppPlatformDto3 = new AppsGetMiniAppPlatformDto("WEB", 2, "web");
        WEB = appsGetMiniAppPlatformDto3;
        AppsGetMiniAppPlatformDto[] appsGetMiniAppPlatformDtoArr = {appsGetMiniAppPlatformDto, appsGetMiniAppPlatformDto2, appsGetMiniAppPlatformDto3};
        $VALUES = appsGetMiniAppPlatformDtoArr;
        $ENTRIES = new asp(appsGetMiniAppPlatformDtoArr);
        CREATOR = new a();
    }

    private AppsGetMiniAppPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetMiniAppPlatformDto valueOf(String str) {
        return (AppsGetMiniAppPlatformDto) Enum.valueOf(AppsGetMiniAppPlatformDto.class, str);
    }

    public static AppsGetMiniAppPlatformDto[] values() {
        return (AppsGetMiniAppPlatformDto[]) $VALUES.clone();
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
