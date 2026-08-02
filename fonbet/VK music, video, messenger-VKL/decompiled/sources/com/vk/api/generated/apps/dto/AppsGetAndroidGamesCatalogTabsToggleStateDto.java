package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetAndroidGamesCatalogTabsToggleStateDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAndroidGamesCatalogTabsToggleStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetAndroidGamesCatalogTabsToggleStateDto[] $VALUES;

    @pmi0("categories_list")
    public static final AppsGetAndroidGamesCatalogTabsToggleStateDto CATEGORIES_LIST;

    @pmi0("categories_screen")
    public static final AppsGetAndroidGamesCatalogTabsToggleStateDto CATEGORIES_SCREEN;
    public static final Parcelable.Creator<AppsGetAndroidGamesCatalogTabsToggleStateDto> CREATOR;

    @pmi0("tabs")
    public static final AppsGetAndroidGamesCatalogTabsToggleStateDto TABS;

    @pmi0("2_tabs")
    public static final AppsGetAndroidGamesCatalogTabsToggleStateDto TYPE_2_TABS;

    @pmi0("3_tabs")
    public static final AppsGetAndroidGamesCatalogTabsToggleStateDto TYPE_3_TABS;
    private final String value;

    /* compiled from: AppsGetAndroidGamesCatalogTabsToggleStateDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAndroidGamesCatalogTabsToggleStateDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAndroidGamesCatalogTabsToggleStateDto createFromParcel(Parcel parcel) {
            return AppsGetAndroidGamesCatalogTabsToggleStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAndroidGamesCatalogTabsToggleStateDto[] newArray(int i) {
            return new AppsGetAndroidGamesCatalogTabsToggleStateDto[i];
        }
    }

    static {
        AppsGetAndroidGamesCatalogTabsToggleStateDto appsGetAndroidGamesCatalogTabsToggleStateDto = new AppsGetAndroidGamesCatalogTabsToggleStateDto("TYPE_2_TABS", 0, "2_tabs");
        TYPE_2_TABS = appsGetAndroidGamesCatalogTabsToggleStateDto;
        AppsGetAndroidGamesCatalogTabsToggleStateDto appsGetAndroidGamesCatalogTabsToggleStateDto2 = new AppsGetAndroidGamesCatalogTabsToggleStateDto("TYPE_3_TABS", 1, "3_tabs");
        TYPE_3_TABS = appsGetAndroidGamesCatalogTabsToggleStateDto2;
        AppsGetAndroidGamesCatalogTabsToggleStateDto appsGetAndroidGamesCatalogTabsToggleStateDto3 = new AppsGetAndroidGamesCatalogTabsToggleStateDto("CATEGORIES_LIST", 2, "categories_list");
        CATEGORIES_LIST = appsGetAndroidGamesCatalogTabsToggleStateDto3;
        AppsGetAndroidGamesCatalogTabsToggleStateDto appsGetAndroidGamesCatalogTabsToggleStateDto4 = new AppsGetAndroidGamesCatalogTabsToggleStateDto("CATEGORIES_SCREEN", 3, "categories_screen");
        CATEGORIES_SCREEN = appsGetAndroidGamesCatalogTabsToggleStateDto4;
        AppsGetAndroidGamesCatalogTabsToggleStateDto appsGetAndroidGamesCatalogTabsToggleStateDto5 = new AppsGetAndroidGamesCatalogTabsToggleStateDto("TABS", 4, "tabs");
        TABS = appsGetAndroidGamesCatalogTabsToggleStateDto5;
        AppsGetAndroidGamesCatalogTabsToggleStateDto[] appsGetAndroidGamesCatalogTabsToggleStateDtoArr = {appsGetAndroidGamesCatalogTabsToggleStateDto, appsGetAndroidGamesCatalogTabsToggleStateDto2, appsGetAndroidGamesCatalogTabsToggleStateDto3, appsGetAndroidGamesCatalogTabsToggleStateDto4, appsGetAndroidGamesCatalogTabsToggleStateDto5};
        $VALUES = appsGetAndroidGamesCatalogTabsToggleStateDtoArr;
        $ENTRIES = new asp(appsGetAndroidGamesCatalogTabsToggleStateDtoArr);
        CREATOR = new a();
    }

    private AppsGetAndroidGamesCatalogTabsToggleStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetAndroidGamesCatalogTabsToggleStateDto valueOf(String str) {
        return (AppsGetAndroidGamesCatalogTabsToggleStateDto) Enum.valueOf(AppsGetAndroidGamesCatalogTabsToggleStateDto.class, str);
    }

    public static AppsGetAndroidGamesCatalogTabsToggleStateDto[] values() {
        return (AppsGetAndroidGamesCatalogTabsToggleStateDto[]) $VALUES.clone();
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
