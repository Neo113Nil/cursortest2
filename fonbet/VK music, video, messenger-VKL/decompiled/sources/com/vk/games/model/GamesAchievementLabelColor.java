package com.vk.games.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamesAchievementModels.kt */
/* loaded from: classes17.dex */
public final class GamesAchievementLabelColor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GamesAchievementLabelColor[] $VALUES;
    public static final GamesAchievementLabelColor ACCENT;
    public static final GamesAchievementLabelColor GREEN;
    public static final GamesAchievementLabelColor RED;
    public static final GamesAchievementLabelColor YELLOW;

    static {
        GamesAchievementLabelColor gamesAchievementLabelColor = new GamesAchievementLabelColor("GREEN", 0);
        GREEN = gamesAchievementLabelColor;
        GamesAchievementLabelColor gamesAchievementLabelColor2 = new GamesAchievementLabelColor("YELLOW", 1);
        YELLOW = gamesAchievementLabelColor2;
        GamesAchievementLabelColor gamesAchievementLabelColor3 = new GamesAchievementLabelColor("RED", 2);
        RED = gamesAchievementLabelColor3;
        GamesAchievementLabelColor gamesAchievementLabelColor4 = new GamesAchievementLabelColor("ACCENT", 3);
        ACCENT = gamesAchievementLabelColor4;
        GamesAchievementLabelColor[] gamesAchievementLabelColorArr = {gamesAchievementLabelColor, gamesAchievementLabelColor2, gamesAchievementLabelColor3, gamesAchievementLabelColor4};
        $VALUES = gamesAchievementLabelColorArr;
        $ENTRIES = new asp(gamesAchievementLabelColorArr);
    }

    public GamesAchievementLabelColor() {
        throw null;
    }

    public static GamesAchievementLabelColor valueOf(String str) {
        return (GamesAchievementLabelColor) Enum.valueOf(GamesAchievementLabelColor.class, str);
    }

    public static GamesAchievementLabelColor[] values() {
        return (GamesAchievementLabelColor[]) $VALUES.clone();
    }
}
