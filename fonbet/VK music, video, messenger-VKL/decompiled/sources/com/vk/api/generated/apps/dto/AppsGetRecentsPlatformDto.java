package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetRecentsPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetRecentsPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetRecentsPlatformDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetRecentsPlatformDto> CREATOR;

    @pmi0("html5")
    public static final AppsGetRecentsPlatformDto HTML5;

    @pmi0("vk_apps")
    public static final AppsGetRecentsPlatformDto VK_APPS;
    private final String value;

    /* compiled from: AppsGetRecentsPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetRecentsPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetRecentsPlatformDto createFromParcel(Parcel parcel) {
            return AppsGetRecentsPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetRecentsPlatformDto[] newArray(int i) {
            return new AppsGetRecentsPlatformDto[i];
        }
    }

    static {
        AppsGetRecentsPlatformDto appsGetRecentsPlatformDto = new AppsGetRecentsPlatformDto("HTML5", 0, "html5");
        HTML5 = appsGetRecentsPlatformDto;
        AppsGetRecentsPlatformDto appsGetRecentsPlatformDto2 = new AppsGetRecentsPlatformDto("VK_APPS", 1, "vk_apps");
        VK_APPS = appsGetRecentsPlatformDto2;
        AppsGetRecentsPlatformDto[] appsGetRecentsPlatformDtoArr = {appsGetRecentsPlatformDto, appsGetRecentsPlatformDto2};
        $VALUES = appsGetRecentsPlatformDtoArr;
        $ENTRIES = new asp(appsGetRecentsPlatformDtoArr);
        CREATOR = new a();
    }

    private AppsGetRecentsPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetRecentsPlatformDto valueOf(String str) {
        return (AppsGetRecentsPlatformDto) Enum.valueOf(AppsGetRecentsPlatformDto.class, str);
    }

    public static AppsGetRecentsPlatformDto[] values() {
        return (AppsGetRecentsPlatformDto[]) $VALUES.clone();
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
