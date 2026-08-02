package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetRecommendationsPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetRecommendationsPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetRecommendationsPlatformDto[] $VALUES;
    public static final Parcelable.Creator<AppsGetRecommendationsPlatformDto> CREATOR;

    @pmi0("html5")
    public static final AppsGetRecommendationsPlatformDto HTML5;

    @pmi0("vk_apps")
    public static final AppsGetRecommendationsPlatformDto VK_APPS;
    private final String value;

    /* compiled from: AppsGetRecommendationsPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetRecommendationsPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetRecommendationsPlatformDto createFromParcel(Parcel parcel) {
            return AppsGetRecommendationsPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetRecommendationsPlatformDto[] newArray(int i) {
            return new AppsGetRecommendationsPlatformDto[i];
        }
    }

    static {
        AppsGetRecommendationsPlatformDto appsGetRecommendationsPlatformDto = new AppsGetRecommendationsPlatformDto("HTML5", 0, "html5");
        HTML5 = appsGetRecommendationsPlatformDto;
        AppsGetRecommendationsPlatformDto appsGetRecommendationsPlatformDto2 = new AppsGetRecommendationsPlatformDto("VK_APPS", 1, "vk_apps");
        VK_APPS = appsGetRecommendationsPlatformDto2;
        AppsGetRecommendationsPlatformDto[] appsGetRecommendationsPlatformDtoArr = {appsGetRecommendationsPlatformDto, appsGetRecommendationsPlatformDto2};
        $VALUES = appsGetRecommendationsPlatformDtoArr;
        $ENTRIES = new asp(appsGetRecommendationsPlatformDtoArr);
        CREATOR = new a();
    }

    private AppsGetRecommendationsPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetRecommendationsPlatformDto valueOf(String str) {
        return (AppsGetRecommendationsPlatformDto) Enum.valueOf(AppsGetRecommendationsPlatformDto.class, str);
    }

    public static AppsGetRecommendationsPlatformDto[] values() {
        return (AppsGetRecommendationsPlatformDto[]) $VALUES.clone();
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
