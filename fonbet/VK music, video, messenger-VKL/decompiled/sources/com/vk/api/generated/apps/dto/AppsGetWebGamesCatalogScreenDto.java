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
/* compiled from: AppsGetWebGamesCatalogScreenDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetWebGamesCatalogScreenDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetWebGamesCatalogScreenDto[] $VALUES;

    @pmi0("catalog_tab")
    public static final AppsGetWebGamesCatalogScreenDto CATALOG_TAB;

    @pmi0(HintCategories.PARAM_NAME)
    public static final AppsGetWebGamesCatalogScreenDto CATEGORIES;
    public static final Parcelable.Creator<AppsGetWebGamesCatalogScreenDto> CREATOR;

    @pmi0("ios_main")
    public static final AppsGetWebGamesCatalogScreenDto IOS_MAIN;

    @pmi0(X3.i.Z)
    public static final AppsGetWebGamesCatalogScreenDto MAIN;

    @pmi0("main_tab")
    public static final AppsGetWebGamesCatalogScreenDto MAIN_TAB;

    @pmi0("mvk_main")
    public static final AppsGetWebGamesCatalogScreenDto MVK_MAIN;

    @pmi0("tags_list")
    public static final AppsGetWebGamesCatalogScreenDto TAGS_LIST;

    @pmi0("web_achievements")
    public static final AppsGetWebGamesCatalogScreenDto WEB_ACHIEVEMENTS;

    @pmi0("web_main")
    public static final AppsGetWebGamesCatalogScreenDto WEB_MAIN;

    @pmi0("web_my")
    public static final AppsGetWebGamesCatalogScreenDto WEB_MY;

    @pmi0("web_profile")
    public static final AppsGetWebGamesCatalogScreenDto WEB_PROFILE;

    @pmi0("web_search")
    public static final AppsGetWebGamesCatalogScreenDto WEB_SEARCH;
    private final String value;

    /* compiled from: AppsGetWebGamesCatalogScreenDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetWebGamesCatalogScreenDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetWebGamesCatalogScreenDto createFromParcel(Parcel parcel) {
            return AppsGetWebGamesCatalogScreenDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetWebGamesCatalogScreenDto[] newArray(int i) {
            return new AppsGetWebGamesCatalogScreenDto[i];
        }
    }

    static {
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto = new AppsGetWebGamesCatalogScreenDto("CATALOG_TAB", 0, "catalog_tab");
        CATALOG_TAB = appsGetWebGamesCatalogScreenDto;
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto2 = new AppsGetWebGamesCatalogScreenDto("CATEGORIES", 1, HintCategories.PARAM_NAME);
        CATEGORIES = appsGetWebGamesCatalogScreenDto2;
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto3 = new AppsGetWebGamesCatalogScreenDto("IOS_MAIN", 2, "ios_main");
        IOS_MAIN = appsGetWebGamesCatalogScreenDto3;
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto4 = new AppsGetWebGamesCatalogScreenDto("MAIN", 3, X3.i.Z);
        MAIN = appsGetWebGamesCatalogScreenDto4;
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto5 = new AppsGetWebGamesCatalogScreenDto("MAIN_TAB", 4, "main_tab");
        MAIN_TAB = appsGetWebGamesCatalogScreenDto5;
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto6 = new AppsGetWebGamesCatalogScreenDto("MVK_MAIN", 5, "mvk_main");
        MVK_MAIN = appsGetWebGamesCatalogScreenDto6;
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto7 = new AppsGetWebGamesCatalogScreenDto("TAGS_LIST", 6, "tags_list");
        TAGS_LIST = appsGetWebGamesCatalogScreenDto7;
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto8 = new AppsGetWebGamesCatalogScreenDto("WEB_ACHIEVEMENTS", 7, "web_achievements");
        WEB_ACHIEVEMENTS = appsGetWebGamesCatalogScreenDto8;
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto9 = new AppsGetWebGamesCatalogScreenDto("WEB_MAIN", 8, "web_main");
        WEB_MAIN = appsGetWebGamesCatalogScreenDto9;
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto10 = new AppsGetWebGamesCatalogScreenDto("WEB_MY", 9, "web_my");
        WEB_MY = appsGetWebGamesCatalogScreenDto10;
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto11 = new AppsGetWebGamesCatalogScreenDto("WEB_PROFILE", 10, "web_profile");
        WEB_PROFILE = appsGetWebGamesCatalogScreenDto11;
        AppsGetWebGamesCatalogScreenDto appsGetWebGamesCatalogScreenDto12 = new AppsGetWebGamesCatalogScreenDto("WEB_SEARCH", 11, "web_search");
        WEB_SEARCH = appsGetWebGamesCatalogScreenDto12;
        AppsGetWebGamesCatalogScreenDto[] appsGetWebGamesCatalogScreenDtoArr = {appsGetWebGamesCatalogScreenDto, appsGetWebGamesCatalogScreenDto2, appsGetWebGamesCatalogScreenDto3, appsGetWebGamesCatalogScreenDto4, appsGetWebGamesCatalogScreenDto5, appsGetWebGamesCatalogScreenDto6, appsGetWebGamesCatalogScreenDto7, appsGetWebGamesCatalogScreenDto8, appsGetWebGamesCatalogScreenDto9, appsGetWebGamesCatalogScreenDto10, appsGetWebGamesCatalogScreenDto11, appsGetWebGamesCatalogScreenDto12};
        $VALUES = appsGetWebGamesCatalogScreenDtoArr;
        $ENTRIES = new asp(appsGetWebGamesCatalogScreenDtoArr);
        CREATOR = new a();
    }

    private AppsGetWebGamesCatalogScreenDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetWebGamesCatalogScreenDto valueOf(String str) {
        return (AppsGetWebGamesCatalogScreenDto) Enum.valueOf(AppsGetWebGamesCatalogScreenDto.class, str);
    }

    public static AppsGetWebGamesCatalogScreenDto[] values() {
        return (AppsGetWebGamesCatalogScreenDto[]) $VALUES.clone();
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
