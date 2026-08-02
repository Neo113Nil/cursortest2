package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetActivityPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetActivityPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetActivityPlatformDto[] $VALUES;

    @pmi0("android")
    public static final AppsGetActivityPlatformDto ANDROID;
    public static final Parcelable.Creator<AppsGetActivityPlatformDto> CREATOR;

    @pmi0("html5")
    public static final AppsGetActivityPlatformDto HTML5;

    @pmi0("ios")
    public static final AppsGetActivityPlatformDto IOS;

    @pmi0("web")
    public static final AppsGetActivityPlatformDto WEB;
    private final String value;

    /* compiled from: AppsGetActivityPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetActivityPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetActivityPlatformDto createFromParcel(Parcel parcel) {
            return AppsGetActivityPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetActivityPlatformDto[] newArray(int i) {
            return new AppsGetActivityPlatformDto[i];
        }
    }

    static {
        AppsGetActivityPlatformDto appsGetActivityPlatformDto = new AppsGetActivityPlatformDto("ANDROID", 0, "android");
        ANDROID = appsGetActivityPlatformDto;
        AppsGetActivityPlatformDto appsGetActivityPlatformDto2 = new AppsGetActivityPlatformDto("HTML5", 1, "html5");
        HTML5 = appsGetActivityPlatformDto2;
        AppsGetActivityPlatformDto appsGetActivityPlatformDto3 = new AppsGetActivityPlatformDto("IOS", 2, "ios");
        IOS = appsGetActivityPlatformDto3;
        AppsGetActivityPlatformDto appsGetActivityPlatformDto4 = new AppsGetActivityPlatformDto("WEB", 3, "web");
        WEB = appsGetActivityPlatformDto4;
        AppsGetActivityPlatformDto[] appsGetActivityPlatformDtoArr = {appsGetActivityPlatformDto, appsGetActivityPlatformDto2, appsGetActivityPlatformDto3, appsGetActivityPlatformDto4};
        $VALUES = appsGetActivityPlatformDtoArr;
        $ENTRIES = new asp(appsGetActivityPlatformDtoArr);
        CREATOR = new a();
    }

    private AppsGetActivityPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetActivityPlatformDto valueOf(String str) {
        return (AppsGetActivityPlatformDto) Enum.valueOf(AppsGetActivityPlatformDto.class, str);
    }

    public static AppsGetActivityPlatformDto[] values() {
        return (AppsGetActivityPlatformDto[]) $VALUES.clone();
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
