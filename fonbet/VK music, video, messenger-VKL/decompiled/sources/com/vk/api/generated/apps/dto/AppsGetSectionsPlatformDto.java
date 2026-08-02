package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetSectionsPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetSectionsPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetSectionsPlatformDto[] $VALUES;

    @pmi0("android")
    public static final AppsGetSectionsPlatformDto ANDROID;
    public static final Parcelable.Creator<AppsGetSectionsPlatformDto> CREATOR;

    @pmi0("html5")
    public static final AppsGetSectionsPlatformDto HTML5;

    @pmi0("ios")
    public static final AppsGetSectionsPlatformDto IOS;
    private final String value;

    /* compiled from: AppsGetSectionsPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetSectionsPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetSectionsPlatformDto createFromParcel(Parcel parcel) {
            return AppsGetSectionsPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetSectionsPlatformDto[] newArray(int i) {
            return new AppsGetSectionsPlatformDto[i];
        }
    }

    static {
        AppsGetSectionsPlatformDto appsGetSectionsPlatformDto = new AppsGetSectionsPlatformDto("ANDROID", 0, "android");
        ANDROID = appsGetSectionsPlatformDto;
        AppsGetSectionsPlatformDto appsGetSectionsPlatformDto2 = new AppsGetSectionsPlatformDto("HTML5", 1, "html5");
        HTML5 = appsGetSectionsPlatformDto2;
        AppsGetSectionsPlatformDto appsGetSectionsPlatformDto3 = new AppsGetSectionsPlatformDto("IOS", 2, "ios");
        IOS = appsGetSectionsPlatformDto3;
        AppsGetSectionsPlatformDto[] appsGetSectionsPlatformDtoArr = {appsGetSectionsPlatformDto, appsGetSectionsPlatformDto2, appsGetSectionsPlatformDto3};
        $VALUES = appsGetSectionsPlatformDtoArr;
        $ENTRIES = new asp(appsGetSectionsPlatformDtoArr);
        CREATOR = new a();
    }

    private AppsGetSectionsPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetSectionsPlatformDto valueOf(String str) {
        return (AppsGetSectionsPlatformDto) Enum.valueOf(AppsGetSectionsPlatformDto.class, str);
    }

    public static AppsGetSectionsPlatformDto[] values() {
        return (AppsGetSectionsPlatformDto[]) $VALUES.clone();
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
