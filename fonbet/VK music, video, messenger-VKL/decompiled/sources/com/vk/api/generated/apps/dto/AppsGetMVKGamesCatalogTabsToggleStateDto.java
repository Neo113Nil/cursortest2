package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetMVKGamesCatalogTabsToggleStateDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetMVKGamesCatalogTabsToggleStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetMVKGamesCatalogTabsToggleStateDto[] $VALUES;

    @pmi0("categories_list")
    public static final AppsGetMVKGamesCatalogTabsToggleStateDto CATEGORIES_LIST;

    @pmi0("categories_screen")
    public static final AppsGetMVKGamesCatalogTabsToggleStateDto CATEGORIES_SCREEN;
    public static final Parcelable.Creator<AppsGetMVKGamesCatalogTabsToggleStateDto> CREATOR;

    @pmi0("tabs")
    public static final AppsGetMVKGamesCatalogTabsToggleStateDto TABS;

    @pmi0("2_tabs")
    public static final AppsGetMVKGamesCatalogTabsToggleStateDto TYPE_2_TABS;

    @pmi0("3_tabs")
    public static final AppsGetMVKGamesCatalogTabsToggleStateDto TYPE_3_TABS;
    private final String value;

    /* compiled from: AppsGetMVKGamesCatalogTabsToggleStateDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetMVKGamesCatalogTabsToggleStateDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetMVKGamesCatalogTabsToggleStateDto createFromParcel(Parcel parcel) {
            return AppsGetMVKGamesCatalogTabsToggleStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetMVKGamesCatalogTabsToggleStateDto[] newArray(int i) {
            return new AppsGetMVKGamesCatalogTabsToggleStateDto[i];
        }
    }

    static {
        AppsGetMVKGamesCatalogTabsToggleStateDto appsGetMVKGamesCatalogTabsToggleStateDto = new AppsGetMVKGamesCatalogTabsToggleStateDto("TYPE_2_TABS", 0, "2_tabs");
        TYPE_2_TABS = appsGetMVKGamesCatalogTabsToggleStateDto;
        AppsGetMVKGamesCatalogTabsToggleStateDto appsGetMVKGamesCatalogTabsToggleStateDto2 = new AppsGetMVKGamesCatalogTabsToggleStateDto("TYPE_3_TABS", 1, "3_tabs");
        TYPE_3_TABS = appsGetMVKGamesCatalogTabsToggleStateDto2;
        AppsGetMVKGamesCatalogTabsToggleStateDto appsGetMVKGamesCatalogTabsToggleStateDto3 = new AppsGetMVKGamesCatalogTabsToggleStateDto("CATEGORIES_LIST", 2, "categories_list");
        CATEGORIES_LIST = appsGetMVKGamesCatalogTabsToggleStateDto3;
        AppsGetMVKGamesCatalogTabsToggleStateDto appsGetMVKGamesCatalogTabsToggleStateDto4 = new AppsGetMVKGamesCatalogTabsToggleStateDto("CATEGORIES_SCREEN", 3, "categories_screen");
        CATEGORIES_SCREEN = appsGetMVKGamesCatalogTabsToggleStateDto4;
        AppsGetMVKGamesCatalogTabsToggleStateDto appsGetMVKGamesCatalogTabsToggleStateDto5 = new AppsGetMVKGamesCatalogTabsToggleStateDto("TABS", 4, "tabs");
        TABS = appsGetMVKGamesCatalogTabsToggleStateDto5;
        AppsGetMVKGamesCatalogTabsToggleStateDto[] appsGetMVKGamesCatalogTabsToggleStateDtoArr = {appsGetMVKGamesCatalogTabsToggleStateDto, appsGetMVKGamesCatalogTabsToggleStateDto2, appsGetMVKGamesCatalogTabsToggleStateDto3, appsGetMVKGamesCatalogTabsToggleStateDto4, appsGetMVKGamesCatalogTabsToggleStateDto5};
        $VALUES = appsGetMVKGamesCatalogTabsToggleStateDtoArr;
        $ENTRIES = new asp(appsGetMVKGamesCatalogTabsToggleStateDtoArr);
        CREATOR = new a();
    }

    private AppsGetMVKGamesCatalogTabsToggleStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetMVKGamesCatalogTabsToggleStateDto valueOf(String str) {
        return (AppsGetMVKGamesCatalogTabsToggleStateDto) Enum.valueOf(AppsGetMVKGamesCatalogTabsToggleStateDto.class, str);
    }

    public static AppsGetMVKGamesCatalogTabsToggleStateDto[] values() {
        return (AppsGetMVKGamesCatalogTabsToggleStateDto[]) $VALUES.clone();
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
