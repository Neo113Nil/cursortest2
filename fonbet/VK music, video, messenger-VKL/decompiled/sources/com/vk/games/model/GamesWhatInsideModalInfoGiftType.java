package com.vk.games.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamesWhatInsideModalInfoModels.kt */
/* loaded from: classes17.dex */
public final class GamesWhatInsideModalInfoGiftType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GamesWhatInsideModalInfoGiftType[] $VALUES;
    public static final GamesWhatInsideModalInfoGiftType VOTES_COUPON;
    public static final GamesWhatInsideModalInfoGiftType WISH;

    static {
        GamesWhatInsideModalInfoGiftType gamesWhatInsideModalInfoGiftType = new GamesWhatInsideModalInfoGiftType("VOTES_COUPON", 0);
        VOTES_COUPON = gamesWhatInsideModalInfoGiftType;
        GamesWhatInsideModalInfoGiftType gamesWhatInsideModalInfoGiftType2 = new GamesWhatInsideModalInfoGiftType("WISH", 1);
        WISH = gamesWhatInsideModalInfoGiftType2;
        GamesWhatInsideModalInfoGiftType[] gamesWhatInsideModalInfoGiftTypeArr = {gamesWhatInsideModalInfoGiftType, gamesWhatInsideModalInfoGiftType2};
        $VALUES = gamesWhatInsideModalInfoGiftTypeArr;
        $ENTRIES = new asp(gamesWhatInsideModalInfoGiftTypeArr);
    }

    public GamesWhatInsideModalInfoGiftType() {
        throw null;
    }

    public static GamesWhatInsideModalInfoGiftType valueOf(String str) {
        return (GamesWhatInsideModalInfoGiftType) Enum.valueOf(GamesWhatInsideModalInfoGiftType.class, str);
    }

    public static GamesWhatInsideModalInfoGiftType[] values() {
        return (GamesWhatInsideModalInfoGiftType[]) $VALUES.clone();
    }
}
