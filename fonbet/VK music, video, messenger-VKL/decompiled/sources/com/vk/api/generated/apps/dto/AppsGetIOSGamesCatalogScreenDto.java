package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.dto.hints.HintCategories;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetIOSGamesCatalogScreenDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetIOSGamesCatalogScreenDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetIOSGamesCatalogScreenDto[] $VALUES;

    @pmi0("catalog_tab")
    public static final AppsGetIOSGamesCatalogScreenDto CATALOG_TAB;

    @pmi0(HintCategories.PARAM_NAME)
    public static final AppsGetIOSGamesCatalogScreenDto CATEGORIES;
    public static final Parcelable.Creator<AppsGetIOSGamesCatalogScreenDto> CREATOR;

    @pmi0("ios_main")
    public static final AppsGetIOSGamesCatalogScreenDto IOS_MAIN;

    @pmi0(X3.i.Z)
    public static final AppsGetIOSGamesCatalogScreenDto MAIN;

    @pmi0("main_tab")
    public static final AppsGetIOSGamesCatalogScreenDto MAIN_TAB;

    @pmi0("mvk_main")
    public static final AppsGetIOSGamesCatalogScreenDto MVK_MAIN;

    @pmi0("tags_list")
    public static final AppsGetIOSGamesCatalogScreenDto TAGS_LIST;

    @pmi0("web_achievements")
    public static final AppsGetIOSGamesCatalogScreenDto WEB_ACHIEVEMENTS;

    @pmi0("web_main")
    public static final AppsGetIOSGamesCatalogScreenDto WEB_MAIN;

    @pmi0("web_my")
    public static final AppsGetIOSGamesCatalogScreenDto WEB_MY;

    @pmi0("web_profile")
    public static final AppsGetIOSGamesCatalogScreenDto WEB_PROFILE;

    @pmi0("web_search")
    public static final AppsGetIOSGamesCatalogScreenDto WEB_SEARCH;
    private final String value;

    /* compiled from: AppsGetIOSGamesCatalogScreenDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetIOSGamesCatalogScreenDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetIOSGamesCatalogScreenDto createFromParcel(Parcel parcel) {
            return AppsGetIOSGamesCatalogScreenDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetIOSGamesCatalogScreenDto[] newArray(int i) {
            return new AppsGetIOSGamesCatalogScreenDto[i];
        }
    }

    static {
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto = new AppsGetIOSGamesCatalogScreenDto("CATALOG_TAB", 0, "catalog_tab");
        CATALOG_TAB = appsGetIOSGamesCatalogScreenDto;
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto2 = new AppsGetIOSGamesCatalogScreenDto("CATEGORIES", 1, HintCategories.PARAM_NAME);
        CATEGORIES = appsGetIOSGamesCatalogScreenDto2;
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto3 = new AppsGetIOSGamesCatalogScreenDto("IOS_MAIN", 2, "ios_main");
        IOS_MAIN = appsGetIOSGamesCatalogScreenDto3;
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto4 = new AppsGetIOSGamesCatalogScreenDto("MAIN", 3, X3.i.Z);
        MAIN = appsGetIOSGamesCatalogScreenDto4;
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto5 = new AppsGetIOSGamesCatalogScreenDto("MAIN_TAB", 4, "main_tab");
        MAIN_TAB = appsGetIOSGamesCatalogScreenDto5;
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto6 = new AppsGetIOSGamesCatalogScreenDto("MVK_MAIN", 5, "mvk_main");
        MVK_MAIN = appsGetIOSGamesCatalogScreenDto6;
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto7 = new AppsGetIOSGamesCatalogScreenDto("TAGS_LIST", 6, "tags_list");
        TAGS_LIST = appsGetIOSGamesCatalogScreenDto7;
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto8 = new AppsGetIOSGamesCatalogScreenDto("WEB_ACHIEVEMENTS", 7, "web_achievements");
        WEB_ACHIEVEMENTS = appsGetIOSGamesCatalogScreenDto8;
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto9 = new AppsGetIOSGamesCatalogScreenDto("WEB_MAIN", 8, "web_main");
        WEB_MAIN = appsGetIOSGamesCatalogScreenDto9;
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto10 = new AppsGetIOSGamesCatalogScreenDto("WEB_MY", 9, "web_my");
        WEB_MY = appsGetIOSGamesCatalogScreenDto10;
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto11 = new AppsGetIOSGamesCatalogScreenDto("WEB_PROFILE", 10, "web_profile");
        WEB_PROFILE = appsGetIOSGamesCatalogScreenDto11;
        AppsGetIOSGamesCatalogScreenDto appsGetIOSGamesCatalogScreenDto12 = new AppsGetIOSGamesCatalogScreenDto("WEB_SEARCH", 11, "web_search");
        WEB_SEARCH = appsGetIOSGamesCatalogScreenDto12;
        AppsGetIOSGamesCatalogScreenDto[] appsGetIOSGamesCatalogScreenDtoArr = {appsGetIOSGamesCatalogScreenDto, appsGetIOSGamesCatalogScreenDto2, appsGetIOSGamesCatalogScreenDto3, appsGetIOSGamesCatalogScreenDto4, appsGetIOSGamesCatalogScreenDto5, appsGetIOSGamesCatalogScreenDto6, appsGetIOSGamesCatalogScreenDto7, appsGetIOSGamesCatalogScreenDto8, appsGetIOSGamesCatalogScreenDto9, appsGetIOSGamesCatalogScreenDto10, appsGetIOSGamesCatalogScreenDto11, appsGetIOSGamesCatalogScreenDto12};
        $VALUES = appsGetIOSGamesCatalogScreenDtoArr;
        $ENTRIES = new asp(appsGetIOSGamesCatalogScreenDtoArr);
        CREATOR = new a();
    }

    private AppsGetIOSGamesCatalogScreenDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetIOSGamesCatalogScreenDto valueOf(String str) {
        return (AppsGetIOSGamesCatalogScreenDto) Enum.valueOf(AppsGetIOSGamesCatalogScreenDto.class, str);
    }

    public static AppsGetIOSGamesCatalogScreenDto[] values() {
        return (AppsGetIOSGamesCatalogScreenDto[]) $VALUES.clone();
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
