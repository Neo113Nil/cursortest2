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
/* compiled from: AppsGetAndroidGamesCatalogScreenDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAndroidGamesCatalogScreenDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetAndroidGamesCatalogScreenDto[] $VALUES;

    @pmi0("catalog_tab")
    public static final AppsGetAndroidGamesCatalogScreenDto CATALOG_TAB;

    @pmi0(HintCategories.PARAM_NAME)
    public static final AppsGetAndroidGamesCatalogScreenDto CATEGORIES;
    public static final Parcelable.Creator<AppsGetAndroidGamesCatalogScreenDto> CREATOR;

    @pmi0("ios_main")
    public static final AppsGetAndroidGamesCatalogScreenDto IOS_MAIN;

    @pmi0(X3.i.Z)
    public static final AppsGetAndroidGamesCatalogScreenDto MAIN;

    @pmi0("main_tab")
    public static final AppsGetAndroidGamesCatalogScreenDto MAIN_TAB;

    @pmi0("mvk_main")
    public static final AppsGetAndroidGamesCatalogScreenDto MVK_MAIN;

    @pmi0("tags_list")
    public static final AppsGetAndroidGamesCatalogScreenDto TAGS_LIST;

    @pmi0("web_achievements")
    public static final AppsGetAndroidGamesCatalogScreenDto WEB_ACHIEVEMENTS;

    @pmi0("web_main")
    public static final AppsGetAndroidGamesCatalogScreenDto WEB_MAIN;

    @pmi0("web_my")
    public static final AppsGetAndroidGamesCatalogScreenDto WEB_MY;

    @pmi0("web_profile")
    public static final AppsGetAndroidGamesCatalogScreenDto WEB_PROFILE;

    @pmi0("web_search")
    public static final AppsGetAndroidGamesCatalogScreenDto WEB_SEARCH;
    private final String value;

    /* compiled from: AppsGetAndroidGamesCatalogScreenDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAndroidGamesCatalogScreenDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAndroidGamesCatalogScreenDto createFromParcel(Parcel parcel) {
            return AppsGetAndroidGamesCatalogScreenDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAndroidGamesCatalogScreenDto[] newArray(int i) {
            return new AppsGetAndroidGamesCatalogScreenDto[i];
        }
    }

    static {
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto = new AppsGetAndroidGamesCatalogScreenDto("CATALOG_TAB", 0, "catalog_tab");
        CATALOG_TAB = appsGetAndroidGamesCatalogScreenDto;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto2 = new AppsGetAndroidGamesCatalogScreenDto("CATEGORIES", 1, HintCategories.PARAM_NAME);
        CATEGORIES = appsGetAndroidGamesCatalogScreenDto2;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto3 = new AppsGetAndroidGamesCatalogScreenDto("IOS_MAIN", 2, "ios_main");
        IOS_MAIN = appsGetAndroidGamesCatalogScreenDto3;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto4 = new AppsGetAndroidGamesCatalogScreenDto("MAIN", 3, X3.i.Z);
        MAIN = appsGetAndroidGamesCatalogScreenDto4;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto5 = new AppsGetAndroidGamesCatalogScreenDto("MAIN_TAB", 4, "main_tab");
        MAIN_TAB = appsGetAndroidGamesCatalogScreenDto5;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto6 = new AppsGetAndroidGamesCatalogScreenDto("MVK_MAIN", 5, "mvk_main");
        MVK_MAIN = appsGetAndroidGamesCatalogScreenDto6;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto7 = new AppsGetAndroidGamesCatalogScreenDto("TAGS_LIST", 6, "tags_list");
        TAGS_LIST = appsGetAndroidGamesCatalogScreenDto7;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto8 = new AppsGetAndroidGamesCatalogScreenDto("WEB_ACHIEVEMENTS", 7, "web_achievements");
        WEB_ACHIEVEMENTS = appsGetAndroidGamesCatalogScreenDto8;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto9 = new AppsGetAndroidGamesCatalogScreenDto("WEB_MAIN", 8, "web_main");
        WEB_MAIN = appsGetAndroidGamesCatalogScreenDto9;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto10 = new AppsGetAndroidGamesCatalogScreenDto("WEB_MY", 9, "web_my");
        WEB_MY = appsGetAndroidGamesCatalogScreenDto10;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto11 = new AppsGetAndroidGamesCatalogScreenDto("WEB_PROFILE", 10, "web_profile");
        WEB_PROFILE = appsGetAndroidGamesCatalogScreenDto11;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto12 = new AppsGetAndroidGamesCatalogScreenDto("WEB_SEARCH", 11, "web_search");
        WEB_SEARCH = appsGetAndroidGamesCatalogScreenDto12;
        AppsGetAndroidGamesCatalogScreenDto[] appsGetAndroidGamesCatalogScreenDtoArr = {appsGetAndroidGamesCatalogScreenDto, appsGetAndroidGamesCatalogScreenDto2, appsGetAndroidGamesCatalogScreenDto3, appsGetAndroidGamesCatalogScreenDto4, appsGetAndroidGamesCatalogScreenDto5, appsGetAndroidGamesCatalogScreenDto6, appsGetAndroidGamesCatalogScreenDto7, appsGetAndroidGamesCatalogScreenDto8, appsGetAndroidGamesCatalogScreenDto9, appsGetAndroidGamesCatalogScreenDto10, appsGetAndroidGamesCatalogScreenDto11, appsGetAndroidGamesCatalogScreenDto12};
        $VALUES = appsGetAndroidGamesCatalogScreenDtoArr;
        $ENTRIES = new asp(appsGetAndroidGamesCatalogScreenDtoArr);
        CREATOR = new a();
    }

    private AppsGetAndroidGamesCatalogScreenDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetAndroidGamesCatalogScreenDto valueOf(String str) {
        return (AppsGetAndroidGamesCatalogScreenDto) Enum.valueOf(AppsGetAndroidGamesCatalogScreenDto.class, str);
    }

    public static AppsGetAndroidGamesCatalogScreenDto[] values() {
        return (AppsGetAndroidGamesCatalogScreenDto[]) $VALUES.clone();
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
