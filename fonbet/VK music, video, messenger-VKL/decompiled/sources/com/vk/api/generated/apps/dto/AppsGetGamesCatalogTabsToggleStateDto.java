package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetGamesCatalogTabsToggleStateDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetGamesCatalogTabsToggleStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetGamesCatalogTabsToggleStateDto[] $VALUES;

    @pmi0("categories_list")
    public static final AppsGetGamesCatalogTabsToggleStateDto CATEGORIES_LIST;

    @pmi0("categories_screen")
    public static final AppsGetGamesCatalogTabsToggleStateDto CATEGORIES_SCREEN;
    public static final Parcelable.Creator<AppsGetGamesCatalogTabsToggleStateDto> CREATOR;

    @pmi0("tabs")
    public static final AppsGetGamesCatalogTabsToggleStateDto TABS;

    @pmi0("2_tabs")
    public static final AppsGetGamesCatalogTabsToggleStateDto TYPE_2_TABS;

    @pmi0("3_tabs")
    public static final AppsGetGamesCatalogTabsToggleStateDto TYPE_3_TABS;
    private final String value;

    /* compiled from: AppsGetGamesCatalogTabsToggleStateDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetGamesCatalogTabsToggleStateDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetGamesCatalogTabsToggleStateDto createFromParcel(Parcel parcel) {
            return AppsGetGamesCatalogTabsToggleStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetGamesCatalogTabsToggleStateDto[] newArray(int i) {
            return new AppsGetGamesCatalogTabsToggleStateDto[i];
        }
    }

    static {
        AppsGetGamesCatalogTabsToggleStateDto appsGetGamesCatalogTabsToggleStateDto = new AppsGetGamesCatalogTabsToggleStateDto("TYPE_2_TABS", 0, "2_tabs");
        TYPE_2_TABS = appsGetGamesCatalogTabsToggleStateDto;
        AppsGetGamesCatalogTabsToggleStateDto appsGetGamesCatalogTabsToggleStateDto2 = new AppsGetGamesCatalogTabsToggleStateDto("TYPE_3_TABS", 1, "3_tabs");
        TYPE_3_TABS = appsGetGamesCatalogTabsToggleStateDto2;
        AppsGetGamesCatalogTabsToggleStateDto appsGetGamesCatalogTabsToggleStateDto3 = new AppsGetGamesCatalogTabsToggleStateDto("CATEGORIES_LIST", 2, "categories_list");
        CATEGORIES_LIST = appsGetGamesCatalogTabsToggleStateDto3;
        AppsGetGamesCatalogTabsToggleStateDto appsGetGamesCatalogTabsToggleStateDto4 = new AppsGetGamesCatalogTabsToggleStateDto("CATEGORIES_SCREEN", 3, "categories_screen");
        CATEGORIES_SCREEN = appsGetGamesCatalogTabsToggleStateDto4;
        AppsGetGamesCatalogTabsToggleStateDto appsGetGamesCatalogTabsToggleStateDto5 = new AppsGetGamesCatalogTabsToggleStateDto("TABS", 4, "tabs");
        TABS = appsGetGamesCatalogTabsToggleStateDto5;
        AppsGetGamesCatalogTabsToggleStateDto[] appsGetGamesCatalogTabsToggleStateDtoArr = {appsGetGamesCatalogTabsToggleStateDto, appsGetGamesCatalogTabsToggleStateDto2, appsGetGamesCatalogTabsToggleStateDto3, appsGetGamesCatalogTabsToggleStateDto4, appsGetGamesCatalogTabsToggleStateDto5};
        $VALUES = appsGetGamesCatalogTabsToggleStateDtoArr;
        $ENTRIES = new asp(appsGetGamesCatalogTabsToggleStateDtoArr);
        CREATOR = new a();
    }

    private AppsGetGamesCatalogTabsToggleStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetGamesCatalogTabsToggleStateDto valueOf(String str) {
        return (AppsGetGamesCatalogTabsToggleStateDto) Enum.valueOf(AppsGetGamesCatalogTabsToggleStateDto.class, str);
    }

    public static AppsGetGamesCatalogTabsToggleStateDto[] values() {
        return (AppsGetGamesCatalogTabsToggleStateDto[]) $VALUES.clone();
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
