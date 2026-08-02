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
/* compiled from: AppsGetGamesCatalogScreenDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetGamesCatalogScreenDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetGamesCatalogScreenDto[] $VALUES;

    @pmi0("catalog_tab")
    public static final AppsGetGamesCatalogScreenDto CATALOG_TAB;

    @pmi0(HintCategories.PARAM_NAME)
    public static final AppsGetGamesCatalogScreenDto CATEGORIES;
    public static final Parcelable.Creator<AppsGetGamesCatalogScreenDto> CREATOR;

    @pmi0("ios_main")
    public static final AppsGetGamesCatalogScreenDto IOS_MAIN;

    @pmi0(X3.i.Z)
    public static final AppsGetGamesCatalogScreenDto MAIN;

    @pmi0("main_tab")
    public static final AppsGetGamesCatalogScreenDto MAIN_TAB;

    @pmi0("mvk_main")
    public static final AppsGetGamesCatalogScreenDto MVK_MAIN;

    @pmi0("tags_list")
    public static final AppsGetGamesCatalogScreenDto TAGS_LIST;

    @pmi0("web_achievements")
    public static final AppsGetGamesCatalogScreenDto WEB_ACHIEVEMENTS;

    @pmi0("web_main")
    public static final AppsGetGamesCatalogScreenDto WEB_MAIN;

    @pmi0("web_my")
    public static final AppsGetGamesCatalogScreenDto WEB_MY;

    @pmi0("web_profile")
    public static final AppsGetGamesCatalogScreenDto WEB_PROFILE;

    @pmi0("web_search")
    public static final AppsGetGamesCatalogScreenDto WEB_SEARCH;
    private final String value;

    /* compiled from: AppsGetGamesCatalogScreenDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetGamesCatalogScreenDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetGamesCatalogScreenDto createFromParcel(Parcel parcel) {
            return AppsGetGamesCatalogScreenDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetGamesCatalogScreenDto[] newArray(int i) {
            return new AppsGetGamesCatalogScreenDto[i];
        }
    }

    static {
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto = new AppsGetGamesCatalogScreenDto("CATALOG_TAB", 0, "catalog_tab");
        CATALOG_TAB = appsGetGamesCatalogScreenDto;
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto2 = new AppsGetGamesCatalogScreenDto("CATEGORIES", 1, HintCategories.PARAM_NAME);
        CATEGORIES = appsGetGamesCatalogScreenDto2;
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto3 = new AppsGetGamesCatalogScreenDto("IOS_MAIN", 2, "ios_main");
        IOS_MAIN = appsGetGamesCatalogScreenDto3;
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto4 = new AppsGetGamesCatalogScreenDto("MAIN", 3, X3.i.Z);
        MAIN = appsGetGamesCatalogScreenDto4;
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto5 = new AppsGetGamesCatalogScreenDto("MAIN_TAB", 4, "main_tab");
        MAIN_TAB = appsGetGamesCatalogScreenDto5;
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto6 = new AppsGetGamesCatalogScreenDto("MVK_MAIN", 5, "mvk_main");
        MVK_MAIN = appsGetGamesCatalogScreenDto6;
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto7 = new AppsGetGamesCatalogScreenDto("TAGS_LIST", 6, "tags_list");
        TAGS_LIST = appsGetGamesCatalogScreenDto7;
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto8 = new AppsGetGamesCatalogScreenDto("WEB_ACHIEVEMENTS", 7, "web_achievements");
        WEB_ACHIEVEMENTS = appsGetGamesCatalogScreenDto8;
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto9 = new AppsGetGamesCatalogScreenDto("WEB_MAIN", 8, "web_main");
        WEB_MAIN = appsGetGamesCatalogScreenDto9;
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto10 = new AppsGetGamesCatalogScreenDto("WEB_MY", 9, "web_my");
        WEB_MY = appsGetGamesCatalogScreenDto10;
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto11 = new AppsGetGamesCatalogScreenDto("WEB_PROFILE", 10, "web_profile");
        WEB_PROFILE = appsGetGamesCatalogScreenDto11;
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto12 = new AppsGetGamesCatalogScreenDto("WEB_SEARCH", 11, "web_search");
        WEB_SEARCH = appsGetGamesCatalogScreenDto12;
        AppsGetGamesCatalogScreenDto[] appsGetGamesCatalogScreenDtoArr = {appsGetGamesCatalogScreenDto, appsGetGamesCatalogScreenDto2, appsGetGamesCatalogScreenDto3, appsGetGamesCatalogScreenDto4, appsGetGamesCatalogScreenDto5, appsGetGamesCatalogScreenDto6, appsGetGamesCatalogScreenDto7, appsGetGamesCatalogScreenDto8, appsGetGamesCatalogScreenDto9, appsGetGamesCatalogScreenDto10, appsGetGamesCatalogScreenDto11, appsGetGamesCatalogScreenDto12};
        $VALUES = appsGetGamesCatalogScreenDtoArr;
        $ENTRIES = new asp(appsGetGamesCatalogScreenDtoArr);
        CREATOR = new a();
    }

    private AppsGetGamesCatalogScreenDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetGamesCatalogScreenDto valueOf(String str) {
        return (AppsGetGamesCatalogScreenDto) Enum.valueOf(AppsGetGamesCatalogScreenDto.class, str);
    }

    public static AppsGetGamesCatalogScreenDto[] values() {
        return (AppsGetGamesCatalogScreenDto[]) $VALUES.clone();
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
