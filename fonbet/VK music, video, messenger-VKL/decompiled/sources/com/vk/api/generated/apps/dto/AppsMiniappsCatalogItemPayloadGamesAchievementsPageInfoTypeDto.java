package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto> CREATOR;

    @pmi0("games_achievements_page_info")
    public static final AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto GAMES_ACHIEVEMENTS_PAGE_INFO;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto = new AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto("GAMES_ACHIEVEMENTS_PAGE_INFO", 0, "games_achievements_page_info");
        GAMES_ACHIEVEMENTS_PAGE_INFO = appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto;
        AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto[] appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDtoArr = {appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadGamesAchievementsPageInfoTypeDto[]) $VALUES.clone();
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
