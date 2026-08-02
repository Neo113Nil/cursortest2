package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto> CREATOR;

    @pmi0("games_achievements")
    public static final AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto GAMES_ACHIEVEMENTS;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto appsMiniappsCatalogItemPayloadGamesAchievementsTypeDto = new AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto("GAMES_ACHIEVEMENTS", 0, "games_achievements");
        GAMES_ACHIEVEMENTS = appsMiniappsCatalogItemPayloadGamesAchievementsTypeDto;
        AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto[] appsMiniappsCatalogItemPayloadGamesAchievementsTypeDtoArr = {appsMiniappsCatalogItemPayloadGamesAchievementsTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadGamesAchievementsTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadGamesAchievementsTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadGamesAchievementsTypeDto[]) $VALUES.clone();
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
