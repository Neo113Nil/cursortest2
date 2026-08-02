package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto> CREATOR;

    @pmi0("games_achievements_leaderboard")
    public static final AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto GAMES_ACHIEVEMENTS_LEADERBOARD;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto appsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto = new AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto("GAMES_ACHIEVEMENTS_LEADERBOARD", 0, "games_achievements_leaderboard");
        GAMES_ACHIEVEMENTS_LEADERBOARD = appsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto;
        AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto[] appsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDtoArr = {appsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadGamesAchievementsLeaderboardTypeDto[]) $VALUES.clone();
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
