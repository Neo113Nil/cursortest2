package com.vk.dto.stories.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NarrativePublishEventType.kt */
/* loaded from: classes18.dex */
public final class NarrativePublishEventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NarrativePublishEventType[] $VALUES;
    public static final NarrativePublishEventType ADD_STORY_TO_NARRATIVE;
    public static final NarrativePublishEventType ADD_STORY_TO_NARRATIVE_FROM_DOTS;
    public static final NarrativePublishEventType ADD_STORY_TO_NARRATIVE_LONGTAP;
    public static final NarrativePublishEventType ADD_TO_BOOKMARKS;
    public static final NarrativePublishEventType CHANGE_COVER;
    public static final NarrativePublishEventType CHANGE_LIST;
    public static final NarrativePublishEventType CHANGE_SORT;
    public static final NarrativePublishEventType CLICK_TO_ADD_TO_NARRATIVE;
    public static final NarrativePublishEventType CLICK_TO_ADD_TO_NARRATIVE_FROM_DOTS;
    public static final NarrativePublishEventType CLICK_TO_ADD_TO_NARRATIVE_LONGTAP;
    public static final NarrativePublishEventType CLICK_TO_EDIT_NARRATIVE;
    public static final NarrativePublishEventType CLOSE;
    public static final NarrativePublishEventType CREATE_FIRST_NARRATIVE;
    public static final NarrativePublishEventType CREATE_NARRATIVE;
    public static final NarrativePublishEventType CREATE_NARRATIVE_DRAFT;
    public static final NarrativePublishEventType DELETE_NARRATIVE;
    public static final NarrativePublishEventType EDIT_NARRATIVE;
    public static final NarrativePublishEventType OPEN_NARRATIVE_LIST;
    public static final NarrativePublishEventType PUBLISH_NARRATIVE;
    public static final NarrativePublishEventType SHARE_NARRATIVE;
    private final String stringValue;

    static {
        NarrativePublishEventType narrativePublishEventType = new NarrativePublishEventType("CLICK_TO_ADD_TO_NARRATIVE", 0, "click_to_add_to_narrative");
        CLICK_TO_ADD_TO_NARRATIVE = narrativePublishEventType;
        NarrativePublishEventType narrativePublishEventType2 = new NarrativePublishEventType("CREATE_NARRATIVE", 1, "create_narrative");
        CREATE_NARRATIVE = narrativePublishEventType2;
        NarrativePublishEventType narrativePublishEventType3 = new NarrativePublishEventType("PUBLISH_NARRATIVE", 2, "publish_narrative");
        PUBLISH_NARRATIVE = narrativePublishEventType3;
        NarrativePublishEventType narrativePublishEventType4 = new NarrativePublishEventType("CHANGE_COVER", 3, "change_cover");
        CHANGE_COVER = narrativePublishEventType4;
        NarrativePublishEventType narrativePublishEventType5 = new NarrativePublishEventType("ADD_STORY_TO_NARRATIVE", 4, "add_story_to_narrative");
        ADD_STORY_TO_NARRATIVE = narrativePublishEventType5;
        NarrativePublishEventType narrativePublishEventType6 = new NarrativePublishEventType("CLOSE", 5, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        CLOSE = narrativePublishEventType6;
        NarrativePublishEventType narrativePublishEventType7 = new NarrativePublishEventType("OPEN_NARRATIVE_LIST", 6, "open_narrative_list");
        OPEN_NARRATIVE_LIST = narrativePublishEventType7;
        NarrativePublishEventType narrativePublishEventType8 = new NarrativePublishEventType("CHANGE_LIST", 7, "change_list");
        CHANGE_LIST = narrativePublishEventType8;
        NarrativePublishEventType narrativePublishEventType9 = new NarrativePublishEventType("DELETE_NARRATIVE", 8, "delete_narrative");
        DELETE_NARRATIVE = narrativePublishEventType9;
        NarrativePublishEventType narrativePublishEventType10 = new NarrativePublishEventType("CHANGE_SORT", 9, "change_sort");
        CHANGE_SORT = narrativePublishEventType10;
        NarrativePublishEventType narrativePublishEventType11 = new NarrativePublishEventType("CLICK_TO_EDIT_NARRATIVE", 10, "click_to_edit_narrative");
        CLICK_TO_EDIT_NARRATIVE = narrativePublishEventType11;
        NarrativePublishEventType narrativePublishEventType12 = new NarrativePublishEventType("EDIT_NARRATIVE", 11, "edit_narrative");
        EDIT_NARRATIVE = narrativePublishEventType12;
        NarrativePublishEventType narrativePublishEventType13 = new NarrativePublishEventType("ADD_TO_BOOKMARKS", 12, "add_to_bookmarks");
        ADD_TO_BOOKMARKS = narrativePublishEventType13;
        NarrativePublishEventType narrativePublishEventType14 = new NarrativePublishEventType("SHARE_NARRATIVE", 13, "share_narrative");
        SHARE_NARRATIVE = narrativePublishEventType14;
        NarrativePublishEventType narrativePublishEventType15 = new NarrativePublishEventType("CREATE_FIRST_NARRATIVE", 14, "create_first_narrative");
        CREATE_FIRST_NARRATIVE = narrativePublishEventType15;
        NarrativePublishEventType narrativePublishEventType16 = new NarrativePublishEventType("CREATE_NARRATIVE_DRAFT", 15, "create_narrative_draft");
        CREATE_NARRATIVE_DRAFT = narrativePublishEventType16;
        NarrativePublishEventType narrativePublishEventType17 = new NarrativePublishEventType("ADD_STORY_TO_NARRATIVE_FROM_DOTS", 16, "add_story_to_narrative_from_dots");
        ADD_STORY_TO_NARRATIVE_FROM_DOTS = narrativePublishEventType17;
        NarrativePublishEventType narrativePublishEventType18 = new NarrativePublishEventType("ADD_STORY_TO_NARRATIVE_LONGTAP", 17, "add_story_to_narrative_longtap");
        ADD_STORY_TO_NARRATIVE_LONGTAP = narrativePublishEventType18;
        NarrativePublishEventType narrativePublishEventType19 = new NarrativePublishEventType("CLICK_TO_ADD_TO_NARRATIVE_FROM_DOTS", 18, "click_to_add_to_narrative_from_dots");
        CLICK_TO_ADD_TO_NARRATIVE_FROM_DOTS = narrativePublishEventType19;
        NarrativePublishEventType narrativePublishEventType20 = new NarrativePublishEventType("CLICK_TO_ADD_TO_NARRATIVE_LONGTAP", 19, "click_to_add_to_narrative_longtap");
        CLICK_TO_ADD_TO_NARRATIVE_LONGTAP = narrativePublishEventType20;
        NarrativePublishEventType[] narrativePublishEventTypeArr = {narrativePublishEventType, narrativePublishEventType2, narrativePublishEventType3, narrativePublishEventType4, narrativePublishEventType5, narrativePublishEventType6, narrativePublishEventType7, narrativePublishEventType8, narrativePublishEventType9, narrativePublishEventType10, narrativePublishEventType11, narrativePublishEventType12, narrativePublishEventType13, narrativePublishEventType14, narrativePublishEventType15, narrativePublishEventType16, narrativePublishEventType17, narrativePublishEventType18, narrativePublishEventType19, narrativePublishEventType20};
        $VALUES = narrativePublishEventTypeArr;
        $ENTRIES = new asp(narrativePublishEventTypeArr);
    }

    public NarrativePublishEventType(String str, int i, String str2) {
        this.stringValue = str2;
    }

    public static NarrativePublishEventType valueOf(String str) {
        return (NarrativePublishEventType) Enum.valueOf(NarrativePublishEventType.class, str);
    }

    public static NarrativePublishEventType[] values() {
        return (NarrativePublishEventType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.stringValue;
    }
}
