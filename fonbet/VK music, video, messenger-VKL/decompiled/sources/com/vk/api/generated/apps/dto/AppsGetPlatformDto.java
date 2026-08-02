package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetPlatformDto[] $VALUES;

    @pmi0("android")
    public static final AppsGetPlatformDto ANDROID;
    public static final Parcelable.Creator<AppsGetPlatformDto> CREATOR;

    @pmi0("ios")
    public static final AppsGetPlatformDto IOS;

    @pmi0("web")
    public static final AppsGetPlatformDto WEB;
    private final String value;

    /* compiled from: AppsGetPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetPlatformDto createFromParcel(Parcel parcel) {
            return AppsGetPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetPlatformDto[] newArray(int i) {
            return new AppsGetPlatformDto[i];
        }
    }

    static {
        AppsGetPlatformDto appsGetPlatformDto = new AppsGetPlatformDto("ANDROID", 0, "android");
        ANDROID = appsGetPlatformDto;
        AppsGetPlatformDto appsGetPlatformDto2 = new AppsGetPlatformDto("IOS", 1, "ios");
        IOS = appsGetPlatformDto2;
        AppsGetPlatformDto appsGetPlatformDto3 = new AppsGetPlatformDto("WEB", 2, "web");
        WEB = appsGetPlatformDto3;
        AppsGetPlatformDto[] appsGetPlatformDtoArr = {appsGetPlatformDto, appsGetPlatformDto2, appsGetPlatformDto3};
        $VALUES = appsGetPlatformDtoArr;
        $ENTRIES = new asp(appsGetPlatformDtoArr);
        CREATOR = new a();
    }

    private AppsGetPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetPlatformDto valueOf(String str) {
        return (AppsGetPlatformDto) Enum.valueOf(AppsGetPlatformDto.class, str);
    }

    public static AppsGetPlatformDto[] values() {
        return (AppsGetPlatformDto[]) $VALUES.clone();
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
