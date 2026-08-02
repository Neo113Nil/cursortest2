package com.vk.games.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamesAchievementModels.kt */
/* loaded from: classes17.dex */
public final class GamesAchievementState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GamesAchievementState[] $VALUES;
    public static final GamesAchievementState IN_PROGRESS;
    public static final GamesAchievementState OPEN;
    public static final GamesAchievementState READY_TO_OPEN;

    static {
        GamesAchievementState gamesAchievementState = new GamesAchievementState("IN_PROGRESS", 0);
        IN_PROGRESS = gamesAchievementState;
        GamesAchievementState gamesAchievementState2 = new GamesAchievementState("READY_TO_OPEN", 1);
        READY_TO_OPEN = gamesAchievementState2;
        GamesAchievementState gamesAchievementState3 = new GamesAchievementState("OPEN", 2);
        OPEN = gamesAchievementState3;
        GamesAchievementState[] gamesAchievementStateArr = {gamesAchievementState, gamesAchievementState2, gamesAchievementState3};
        $VALUES = gamesAchievementStateArr;
        $ENTRIES = new asp(gamesAchievementStateArr);
    }

    public GamesAchievementState() {
        throw null;
    }

    public static GamesAchievementState valueOf(String str) {
        return (GamesAchievementState) Enum.valueOf(GamesAchievementState.class, str);
    }

    public static GamesAchievementState[] values() {
        return (GamesAchievementState[]) $VALUES.clone();
    }
}
