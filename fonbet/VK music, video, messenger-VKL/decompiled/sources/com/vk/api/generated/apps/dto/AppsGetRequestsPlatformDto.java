package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetRequestsPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetRequestsPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetRequestsPlatformDto[] $VALUES;

    @pmi0("android")
    public static final AppsGetRequestsPlatformDto ANDROID;
    public static final Parcelable.Creator<AppsGetRequestsPlatformDto> CREATOR;

    @pmi0("html5")
    public static final AppsGetRequestsPlatformDto HTML5;

    @pmi0("ios")
    public static final AppsGetRequestsPlatformDto IOS;

    @pmi0("web")
    public static final AppsGetRequestsPlatformDto WEB;
    private final String value;

    /* compiled from: AppsGetRequestsPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetRequestsPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetRequestsPlatformDto createFromParcel(Parcel parcel) {
            return AppsGetRequestsPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetRequestsPlatformDto[] newArray(int i) {
            return new AppsGetRequestsPlatformDto[i];
        }
    }

    static {
        AppsGetRequestsPlatformDto appsGetRequestsPlatformDto = new AppsGetRequestsPlatformDto("ANDROID", 0, "android");
        ANDROID = appsGetRequestsPlatformDto;
        AppsGetRequestsPlatformDto appsGetRequestsPlatformDto2 = new AppsGetRequestsPlatformDto("HTML5", 1, "html5");
        HTML5 = appsGetRequestsPlatformDto2;
        AppsGetRequestsPlatformDto appsGetRequestsPlatformDto3 = new AppsGetRequestsPlatformDto("IOS", 2, "ios");
        IOS = appsGetRequestsPlatformDto3;
        AppsGetRequestsPlatformDto appsGetRequestsPlatformDto4 = new AppsGetRequestsPlatformDto("WEB", 3, "web");
        WEB = appsGetRequestsPlatformDto4;
        AppsGetRequestsPlatformDto[] appsGetRequestsPlatformDtoArr = {appsGetRequestsPlatformDto, appsGetRequestsPlatformDto2, appsGetRequestsPlatformDto3, appsGetRequestsPlatformDto4};
        $VALUES = appsGetRequestsPlatformDtoArr;
        $ENTRIES = new asp(appsGetRequestsPlatformDtoArr);
        CREATOR = new a();
    }

    private AppsGetRequestsPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetRequestsPlatformDto valueOf(String str) {
        return (AppsGetRequestsPlatformDto) Enum.valueOf(AppsGetRequestsPlatformDto.class, str);
    }

    public static AppsGetRequestsPlatformDto[] values() {
        return (AppsGetRequestsPlatformDto[]) $VALUES.clone();
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
