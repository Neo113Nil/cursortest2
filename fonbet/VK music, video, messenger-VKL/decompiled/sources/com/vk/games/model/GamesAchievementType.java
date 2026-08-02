package com.vk.games.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamesAchievementModels.kt */
/* loaded from: classes17.dex */
public final class GamesAchievementType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GamesAchievementType[] $VALUES;
    public static final GamesAchievementType TIMESPENT;
    public static final GamesAchievementType VOTES;

    static {
        GamesAchievementType gamesAchievementType = new GamesAchievementType("TIMESPENT", 0);
        TIMESPENT = gamesAchievementType;
        GamesAchievementType gamesAchievementType2 = new GamesAchievementType("VOTES", 1);
        VOTES = gamesAchievementType2;
        GamesAchievementType[] gamesAchievementTypeArr = {gamesAchievementType, gamesAchievementType2};
        $VALUES = gamesAchievementTypeArr;
        $ENTRIES = new asp(gamesAchievementTypeArr);
    }

    public GamesAchievementType() {
        throw null;
    }

    public static GamesAchievementType valueOf(String str) {
        return (GamesAchievementType) Enum.valueOf(GamesAchievementType.class, str);
    }

    public static GamesAchievementType[] values() {
        return (GamesAchievementType[]) $VALUES.clone();
    }
}
