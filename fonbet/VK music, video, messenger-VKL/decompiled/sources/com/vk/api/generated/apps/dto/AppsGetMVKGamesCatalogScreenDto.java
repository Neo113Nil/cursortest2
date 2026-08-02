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
/* compiled from: AppsGetMVKGamesCatalogScreenDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetMVKGamesCatalogScreenDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetMVKGamesCatalogScreenDto[] $VALUES;

    @pmi0("catalog_tab")
    public static final AppsGetMVKGamesCatalogScreenDto CATALOG_TAB;

    @pmi0(HintCategories.PARAM_NAME)
    public static final AppsGetMVKGamesCatalogScreenDto CATEGORIES;
    public static final Parcelable.Creator<AppsGetMVKGamesCatalogScreenDto> CREATOR;

    @pmi0("ios_main")
    public static final AppsGetMVKGamesCatalogScreenDto IOS_MAIN;

    @pmi0(X3.i.Z)
    public static final AppsGetMVKGamesCatalogScreenDto MAIN;

    @pmi0("main_tab")
    public static final AppsGetMVKGamesCatalogScreenDto MAIN_TAB;

    @pmi0("mvk_main")
    public static final AppsGetMVKGamesCatalogScreenDto MVK_MAIN;

    @pmi0("tags_list")
    public static final AppsGetMVKGamesCatalogScreenDto TAGS_LIST;

    @pmi0("web_achievements")
    public static final AppsGetMVKGamesCatalogScreenDto WEB_ACHIEVEMENTS;

    @pmi0("web_main")
    public static final AppsGetMVKGamesCatalogScreenDto WEB_MAIN;

    @pmi0("web_my")
    public static final AppsGetMVKGamesCatalogScreenDto WEB_MY;

    @pmi0("web_profile")
    public static final AppsGetMVKGamesCatalogScreenDto WEB_PROFILE;

    @pmi0("web_search")
    public static final AppsGetMVKGamesCatalogScreenDto WEB_SEARCH;
    private final String value;

    /* compiled from: AppsGetMVKGamesCatalogScreenDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetMVKGamesCatalogScreenDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetMVKGamesCatalogScreenDto createFromParcel(Parcel parcel) {
            return AppsGetMVKGamesCatalogScreenDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetMVKGamesCatalogScreenDto[] newArray(int i) {
            return new AppsGetMVKGamesCatalogScreenDto[i];
        }
    }

    static {
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto = new AppsGetMVKGamesCatalogScreenDto("CATALOG_TAB", 0, "catalog_tab");
        CATALOG_TAB = appsGetMVKGamesCatalogScreenDto;
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto2 = new AppsGetMVKGamesCatalogScreenDto("CATEGORIES", 1, HintCategories.PARAM_NAME);
        CATEGORIES = appsGetMVKGamesCatalogScreenDto2;
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto3 = new AppsGetMVKGamesCatalogScreenDto("IOS_MAIN", 2, "ios_main");
        IOS_MAIN = appsGetMVKGamesCatalogScreenDto3;
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto4 = new AppsGetMVKGamesCatalogScreenDto("MAIN", 3, X3.i.Z);
        MAIN = appsGetMVKGamesCatalogScreenDto4;
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto5 = new AppsGetMVKGamesCatalogScreenDto("MAIN_TAB", 4, "main_tab");
        MAIN_TAB = appsGetMVKGamesCatalogScreenDto5;
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto6 = new AppsGetMVKGamesCatalogScreenDto("MVK_MAIN", 5, "mvk_main");
        MVK_MAIN = appsGetMVKGamesCatalogScreenDto6;
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto7 = new AppsGetMVKGamesCatalogScreenDto("TAGS_LIST", 6, "tags_list");
        TAGS_LIST = appsGetMVKGamesCatalogScreenDto7;
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto8 = new AppsGetMVKGamesCatalogScreenDto("WEB_ACHIEVEMENTS", 7, "web_achievements");
        WEB_ACHIEVEMENTS = appsGetMVKGamesCatalogScreenDto8;
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto9 = new AppsGetMVKGamesCatalogScreenDto("WEB_MAIN", 8, "web_main");
        WEB_MAIN = appsGetMVKGamesCatalogScreenDto9;
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto10 = new AppsGetMVKGamesCatalogScreenDto("WEB_MY", 9, "web_my");
        WEB_MY = appsGetMVKGamesCatalogScreenDto10;
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto11 = new AppsGetMVKGamesCatalogScreenDto("WEB_PROFILE", 10, "web_profile");
        WEB_PROFILE = appsGetMVKGamesCatalogScreenDto11;
        AppsGetMVKGamesCatalogScreenDto appsGetMVKGamesCatalogScreenDto12 = new AppsGetMVKGamesCatalogScreenDto("WEB_SEARCH", 11, "web_search");
        WEB_SEARCH = appsGetMVKGamesCatalogScreenDto12;
        AppsGetMVKGamesCatalogScreenDto[] appsGetMVKGamesCatalogScreenDtoArr = {appsGetMVKGamesCatalogScreenDto, appsGetMVKGamesCatalogScreenDto2, appsGetMVKGamesCatalogScreenDto3, appsGetMVKGamesCatalogScreenDto4, appsGetMVKGamesCatalogScreenDto5, appsGetMVKGamesCatalogScreenDto6, appsGetMVKGamesCatalogScreenDto7, appsGetMVKGamesCatalogScreenDto8, appsGetMVKGamesCatalogScreenDto9, appsGetMVKGamesCatalogScreenDto10, appsGetMVKGamesCatalogScreenDto11, appsGetMVKGamesCatalogScreenDto12};
        $VALUES = appsGetMVKGamesCatalogScreenDtoArr;
        $ENTRIES = new asp(appsGetMVKGamesCatalogScreenDtoArr);
        CREATOR = new a();
    }

    private AppsGetMVKGamesCatalogScreenDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetMVKGamesCatalogScreenDto valueOf(String str) {
        return (AppsGetMVKGamesCatalogScreenDto) Enum.valueOf(AppsGetMVKGamesCatalogScreenDto.class, str);
    }

    public static AppsGetMVKGamesCatalogScreenDto[] values() {
        return (AppsGetMVKGamesCatalogScreenDto[]) $VALUES.clone();
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
