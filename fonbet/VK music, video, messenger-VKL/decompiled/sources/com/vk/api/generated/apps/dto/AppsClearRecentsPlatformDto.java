package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsClearRecentsPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AppsClearRecentsPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsClearRecentsPlatformDto[] $VALUES;
    public static final Parcelable.Creator<AppsClearRecentsPlatformDto> CREATOR;

    @pmi0("html5")
    public static final AppsClearRecentsPlatformDto HTML5;

    @pmi0("vk_apps")
    public static final AppsClearRecentsPlatformDto VK_APPS;
    private final String value;

    /* compiled from: AppsClearRecentsPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AppsClearRecentsPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsClearRecentsPlatformDto createFromParcel(Parcel parcel) {
            return AppsClearRecentsPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsClearRecentsPlatformDto[] newArray(int i) {
            return new AppsClearRecentsPlatformDto[i];
        }
    }

    static {
        AppsClearRecentsPlatformDto appsClearRecentsPlatformDto = new AppsClearRecentsPlatformDto("HTML5", 0, "html5");
        HTML5 = appsClearRecentsPlatformDto;
        AppsClearRecentsPlatformDto appsClearRecentsPlatformDto2 = new AppsClearRecentsPlatformDto("VK_APPS", 1, "vk_apps");
        VK_APPS = appsClearRecentsPlatformDto2;
        AppsClearRecentsPlatformDto[] appsClearRecentsPlatformDtoArr = {appsClearRecentsPlatformDto, appsClearRecentsPlatformDto2};
        $VALUES = appsClearRecentsPlatformDtoArr;
        $ENTRIES = new asp(appsClearRecentsPlatformDtoArr);
        CREATOR = new a();
    }

    private AppsClearRecentsPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsClearRecentsPlatformDto valueOf(String str) {
        return (AppsClearRecentsPlatformDto) Enum.valueOf(AppsClearRecentsPlatformDto.class, str);
    }

    public static AppsClearRecentsPlatformDto[] values() {
        return (AppsClearRecentsPlatformDto[]) $VALUES.clone();
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
