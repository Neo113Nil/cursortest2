package com.vk.games.presentation.catalog.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SectionTypePrefixKey.kt */
/* loaded from: classes17.dex */
public final class SectionTypePrefixKey {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SectionTypePrefixKey[] $VALUES;
    public static final SectionTypePrefixKey ACHIEVEMENT_BANNER_SECTION;
    public static final SectionTypePrefixKey ACTIVITY_SECTION;
    public static final SectionTypePrefixKey CUSTOM_COLLECTION_GAMES_LIST_DATA;
    public static final SectionTypePrefixKey GAMES_ACHIEVEMENT_BLOCK_DATA;
    public static final SectionTypePrefixKey GAMES_CATEGORY_SECTION_DATA;
    public static final SectionTypePrefixKey GAMES_DETAIL_SECTION;
    public static final SectionTypePrefixKey GAMES_SELECTION_LIST_DATA;
    public static final SectionTypePrefixKey GAMES_VERTICAL_HALF_LIST_DATA;
    public static final SectionTypePrefixKey GAMES_VERTICAL_LIST_DATA;
    public static final SectionTypePrefixKey GAME_FOR_YOU_LIST_DATA;
    public static final SectionTypePrefixKey HEADER;
    public static final SectionTypePrefixKey HORIZONAL_BANNER_SECTION;
    public static final SectionTypePrefixKey HORIZONTAL_GAMES_LIST_DATA;
    public static final SectionTypePrefixKey MY_GAME_SECTION;
    public static final SectionTypePrefixKey NOTIFICATION_SECTION;
    public static final SectionTypePrefixKey PROMO_BANNER_SECTION;
    private final String key;

    static {
        SectionTypePrefixKey sectionTypePrefixKey = new SectionTypePrefixKey("HEADER", 0, "header");
        HEADER = sectionTypePrefixKey;
        SectionTypePrefixKey sectionTypePrefixKey2 = new SectionTypePrefixKey("HORIZONAL_BANNER_SECTION", 1, "horizontal_banner_section");
        HORIZONAL_BANNER_SECTION = sectionTypePrefixKey2;
        SectionTypePrefixKey sectionTypePrefixKey3 = new SectionTypePrefixKey("PROMO_BANNER_SECTION", 2, "promo_banner_section");
        PROMO_BANNER_SECTION = sectionTypePrefixKey3;
        SectionTypePrefixKey sectionTypePrefixKey4 = new SectionTypePrefixKey("ACHIEVEMENT_BANNER_SECTION", 3, "achievement_banner_section");
        ACHIEVEMENT_BANNER_SECTION = sectionTypePrefixKey4;
        SectionTypePrefixKey sectionTypePrefixKey5 = new SectionTypePrefixKey("HORIZONTAL_GAMES_LIST_DATA", 4, "horizontal_games_list_data");
        HORIZONTAL_GAMES_LIST_DATA = sectionTypePrefixKey5;
        SectionTypePrefixKey sectionTypePrefixKey6 = new SectionTypePrefixKey("GAMES_CATEGORY_SECTION_DATA", 5, "games_category_section_data");
        GAMES_CATEGORY_SECTION_DATA = sectionTypePrefixKey6;
        SectionTypePrefixKey sectionTypePrefixKey7 = new SectionTypePrefixKey("CUSTOM_COLLECTION_GAMES_LIST_DATA", 6, "custom_collection_games_list_data");
        CUSTOM_COLLECTION_GAMES_LIST_DATA = sectionTypePrefixKey7;
        SectionTypePrefixKey sectionTypePrefixKey8 = new SectionTypePrefixKey("GAMES_VERTICAL_LIST_DATA", 7, "games_vertical_list_data");
        GAMES_VERTICAL_LIST_DATA = sectionTypePrefixKey8;
        SectionTypePrefixKey sectionTypePrefixKey9 = new SectionTypePrefixKey("GAMES_ACHIEVEMENT_BLOCK_DATA", 8, "games_achievement_block_data");
        GAMES_ACHIEVEMENT_BLOCK_DATA = sectionTypePrefixKey9;
        SectionTypePrefixKey sectionTypePrefixKey10 = new SectionTypePrefixKey("GAMES_SELECTION_LIST_DATA", 9, "games_selection_list_data");
        GAMES_SELECTION_LIST_DATA = sectionTypePrefixKey10;
        SectionTypePrefixKey sectionTypePrefixKey11 = new SectionTypePrefixKey("ACTIVITY_SECTION", 10, "activity_section");
        ACTIVITY_SECTION = sectionTypePrefixKey11;
        SectionTypePrefixKey sectionTypePrefixKey12 = new SectionTypePrefixKey("NOTIFICATION_SECTION", 11, "notification_section");
        NOTIFICATION_SECTION = sectionTypePrefixKey12;
        SectionTypePrefixKey sectionTypePrefixKey13 = new SectionTypePrefixKey("MY_GAME_SECTION", 12, "my_game_section");
        MY_GAME_SECTION = sectionTypePrefixKey13;
        SectionTypePrefixKey sectionTypePrefixKey14 = new SectionTypePrefixKey("GAME_FOR_YOU_LIST_DATA", 13, "game_for_you_list_data");
        GAME_FOR_YOU_LIST_DATA = sectionTypePrefixKey14;
        SectionTypePrefixKey sectionTypePrefixKey15 = new SectionTypePrefixKey("GAMES_VERTICAL_HALF_LIST_DATA", 14, "games_half_vertical_list_data");
        GAMES_VERTICAL_HALF_LIST_DATA = sectionTypePrefixKey15;
        SectionTypePrefixKey sectionTypePrefixKey16 = new SectionTypePrefixKey("GAMES_DETAIL_SECTION", 15, "games_detail_section");
        GAMES_DETAIL_SECTION = sectionTypePrefixKey16;
        SectionTypePrefixKey[] sectionTypePrefixKeyArr = {sectionTypePrefixKey, sectionTypePrefixKey2, sectionTypePrefixKey3, sectionTypePrefixKey4, sectionTypePrefixKey5, sectionTypePrefixKey6, sectionTypePrefixKey7, sectionTypePrefixKey8, sectionTypePrefixKey9, sectionTypePrefixKey10, sectionTypePrefixKey11, sectionTypePrefixKey12, sectionTypePrefixKey13, sectionTypePrefixKey14, sectionTypePrefixKey15, sectionTypePrefixKey16};
        $VALUES = sectionTypePrefixKeyArr;
        $ENTRIES = new asp(sectionTypePrefixKeyArr);
    }

    public SectionTypePrefixKey(String str, int i, String str2) {
        this.key = str2;
    }

    public static SectionTypePrefixKey valueOf(String str) {
        return (SectionTypePrefixKey) Enum.valueOf(SectionTypePrefixKey.class, str);
    }

    public static SectionTypePrefixKey[] values() {
        return (SectionTypePrefixKey[]) $VALUES.clone();
    }

    public final String h() {
        return this.key;
    }
}
