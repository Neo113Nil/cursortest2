package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetWebGamesCatalogTabsToggleStateDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetWebGamesCatalogTabsToggleStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetWebGamesCatalogTabsToggleStateDto[] $VALUES;

    @pmi0("categories_list")
    public static final AppsGetWebGamesCatalogTabsToggleStateDto CATEGORIES_LIST;

    @pmi0("categories_screen")
    public static final AppsGetWebGamesCatalogTabsToggleStateDto CATEGORIES_SCREEN;
    public static final Parcelable.Creator<AppsGetWebGamesCatalogTabsToggleStateDto> CREATOR;

    @pmi0("tabs")
    public static final AppsGetWebGamesCatalogTabsToggleStateDto TABS;

    @pmi0("2_tabs")
    public static final AppsGetWebGamesCatalogTabsToggleStateDto TYPE_2_TABS;

    @pmi0("3_tabs")
    public static final AppsGetWebGamesCatalogTabsToggleStateDto TYPE_3_TABS;
    private final String value;

    /* compiled from: AppsGetWebGamesCatalogTabsToggleStateDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetWebGamesCatalogTabsToggleStateDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetWebGamesCatalogTabsToggleStateDto createFromParcel(Parcel parcel) {
            return AppsGetWebGamesCatalogTabsToggleStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetWebGamesCatalogTabsToggleStateDto[] newArray(int i) {
            return new AppsGetWebGamesCatalogTabsToggleStateDto[i];
        }
    }

    static {
        AppsGetWebGamesCatalogTabsToggleStateDto appsGetWebGamesCatalogTabsToggleStateDto = new AppsGetWebGamesCatalogTabsToggleStateDto("TYPE_2_TABS", 0, "2_tabs");
        TYPE_2_TABS = appsGetWebGamesCatalogTabsToggleStateDto;
        AppsGetWebGamesCatalogTabsToggleStateDto appsGetWebGamesCatalogTabsToggleStateDto2 = new AppsGetWebGamesCatalogTabsToggleStateDto("TYPE_3_TABS", 1, "3_tabs");
        TYPE_3_TABS = appsGetWebGamesCatalogTabsToggleStateDto2;
        AppsGetWebGamesCatalogTabsToggleStateDto appsGetWebGamesCatalogTabsToggleStateDto3 = new AppsGetWebGamesCatalogTabsToggleStateDto("CATEGORIES_LIST", 2, "categories_list");
        CATEGORIES_LIST = appsGetWebGamesCatalogTabsToggleStateDto3;
        AppsGetWebGamesCatalogTabsToggleStateDto appsGetWebGamesCatalogTabsToggleStateDto4 = new AppsGetWebGamesCatalogTabsToggleStateDto("CATEGORIES_SCREEN", 3, "categories_screen");
        CATEGORIES_SCREEN = appsGetWebGamesCatalogTabsToggleStateDto4;
        AppsGetWebGamesCatalogTabsToggleStateDto appsGetWebGamesCatalogTabsToggleStateDto5 = new AppsGetWebGamesCatalogTabsToggleStateDto("TABS", 4, "tabs");
        TABS = appsGetWebGamesCatalogTabsToggleStateDto5;
        AppsGetWebGamesCatalogTabsToggleStateDto[] appsGetWebGamesCatalogTabsToggleStateDtoArr = {appsGetWebGamesCatalogTabsToggleStateDto, appsGetWebGamesCatalogTabsToggleStateDto2, appsGetWebGamesCatalogTabsToggleStateDto3, appsGetWebGamesCatalogTabsToggleStateDto4, appsGetWebGamesCatalogTabsToggleStateDto5};
        $VALUES = appsGetWebGamesCatalogTabsToggleStateDtoArr;
        $ENTRIES = new asp(appsGetWebGamesCatalogTabsToggleStateDtoArr);
        CREATOR = new a();
    }

    private AppsGetWebGamesCatalogTabsToggleStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetWebGamesCatalogTabsToggleStateDto valueOf(String str) {
        return (AppsGetWebGamesCatalogTabsToggleStateDto) Enum.valueOf(AppsGetWebGamesCatalogTabsToggleStateDto.class, str);
    }

    public static AppsGetWebGamesCatalogTabsToggleStateDto[] values() {
        return (AppsGetWebGamesCatalogTabsToggleStateDto[]) $VALUES.clone();
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
