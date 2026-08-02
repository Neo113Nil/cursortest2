package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetIOSGamesCatalogTabsToggleStateDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetIOSGamesCatalogTabsToggleStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetIOSGamesCatalogTabsToggleStateDto[] $VALUES;

    @pmi0("categories_list")
    public static final AppsGetIOSGamesCatalogTabsToggleStateDto CATEGORIES_LIST;

    @pmi0("categories_screen")
    public static final AppsGetIOSGamesCatalogTabsToggleStateDto CATEGORIES_SCREEN;
    public static final Parcelable.Creator<AppsGetIOSGamesCatalogTabsToggleStateDto> CREATOR;

    @pmi0("tabs")
    public static final AppsGetIOSGamesCatalogTabsToggleStateDto TABS;

    @pmi0("2_tabs")
    public static final AppsGetIOSGamesCatalogTabsToggleStateDto TYPE_2_TABS;

    @pmi0("3_tabs")
    public static final AppsGetIOSGamesCatalogTabsToggleStateDto TYPE_3_TABS;
    private final String value;

    /* compiled from: AppsGetIOSGamesCatalogTabsToggleStateDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetIOSGamesCatalogTabsToggleStateDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetIOSGamesCatalogTabsToggleStateDto createFromParcel(Parcel parcel) {
            return AppsGetIOSGamesCatalogTabsToggleStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetIOSGamesCatalogTabsToggleStateDto[] newArray(int i) {
            return new AppsGetIOSGamesCatalogTabsToggleStateDto[i];
        }
    }

    static {
        AppsGetIOSGamesCatalogTabsToggleStateDto appsGetIOSGamesCatalogTabsToggleStateDto = new AppsGetIOSGamesCatalogTabsToggleStateDto("TYPE_2_TABS", 0, "2_tabs");
        TYPE_2_TABS = appsGetIOSGamesCatalogTabsToggleStateDto;
        AppsGetIOSGamesCatalogTabsToggleStateDto appsGetIOSGamesCatalogTabsToggleStateDto2 = new AppsGetIOSGamesCatalogTabsToggleStateDto("TYPE_3_TABS", 1, "3_tabs");
        TYPE_3_TABS = appsGetIOSGamesCatalogTabsToggleStateDto2;
        AppsGetIOSGamesCatalogTabsToggleStateDto appsGetIOSGamesCatalogTabsToggleStateDto3 = new AppsGetIOSGamesCatalogTabsToggleStateDto("CATEGORIES_LIST", 2, "categories_list");
        CATEGORIES_LIST = appsGetIOSGamesCatalogTabsToggleStateDto3;
        AppsGetIOSGamesCatalogTabsToggleStateDto appsGetIOSGamesCatalogTabsToggleStateDto4 = new AppsGetIOSGamesCatalogTabsToggleStateDto("CATEGORIES_SCREEN", 3, "categories_screen");
        CATEGORIES_SCREEN = appsGetIOSGamesCatalogTabsToggleStateDto4;
        AppsGetIOSGamesCatalogTabsToggleStateDto appsGetIOSGamesCatalogTabsToggleStateDto5 = new AppsGetIOSGamesCatalogTabsToggleStateDto("TABS", 4, "tabs");
        TABS = appsGetIOSGamesCatalogTabsToggleStateDto5;
        AppsGetIOSGamesCatalogTabsToggleStateDto[] appsGetIOSGamesCatalogTabsToggleStateDtoArr = {appsGetIOSGamesCatalogTabsToggleStateDto, appsGetIOSGamesCatalogTabsToggleStateDto2, appsGetIOSGamesCatalogTabsToggleStateDto3, appsGetIOSGamesCatalogTabsToggleStateDto4, appsGetIOSGamesCatalogTabsToggleStateDto5};
        $VALUES = appsGetIOSGamesCatalogTabsToggleStateDtoArr;
        $ENTRIES = new asp(appsGetIOSGamesCatalogTabsToggleStateDtoArr);
        CREATOR = new a();
    }

    private AppsGetIOSGamesCatalogTabsToggleStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetIOSGamesCatalogTabsToggleStateDto valueOf(String str) {
        return (AppsGetIOSGamesCatalogTabsToggleStateDto) Enum.valueOf(AppsGetIOSGamesCatalogTabsToggleStateDto.class, str);
    }

    public static AppsGetIOSGamesCatalogTabsToggleStateDto[] values() {
        return (AppsGetIOSGamesCatalogTabsToggleStateDto[]) $VALUES.clone();
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
