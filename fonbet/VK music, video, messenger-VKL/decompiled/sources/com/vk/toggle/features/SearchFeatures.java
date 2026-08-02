package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchFeatures.kt */
/* loaded from: classes11.dex */
public final class SearchFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchFeatures[] $VALUES;
    public static final SearchFeatures FIX_RECYCLER_BIND_ON_LAYOUT;
    public static final SearchFeatures GLOBAL_FEED_FILTERS;
    public static final SearchFeatures GLOBAL_SEARCH_GROUPS_SUGGESTER;
    public static final SearchFeatures HUB_CLIPS_SUGGESTER;
    public static final SearchFeatures SEARCH_APP_DS;
    public static final SearchFeatures SEARCH_COMMUNITY_DS;
    public static final SearchFeatures SEARCH_FILTERS_DS;
    public static final SearchFeatures SEARCH_INSIDE_COMMUNITY;
    public static final SearchFeatures SEARCH_SHOU_ENTITY;
    public static final SearchFeatures SEARCH_VIDEO_CATEGORY;
    public static final SearchFeatures SEARCH_VIDEO_HISTORY;
    public static final SearchFeatures SEARCH_VIDEO_NEW_SPELLCHECKER;
    public static final SearchFeatures VIDEO_HASHTAG;
    private final String key;

    static {
        SearchFeatures searchFeatures = new SearchFeatures("HUB_CLIPS_SUGGESTER", 0, "search_hub_clips_suggester");
        HUB_CLIPS_SUGGESTER = searchFeatures;
        SearchFeatures searchFeatures2 = new SearchFeatures("GLOBAL_SEARCH_GROUPS_SUGGESTER", 1, "search_groups_suggest");
        GLOBAL_SEARCH_GROUPS_SUGGESTER = searchFeatures2;
        SearchFeatures searchFeatures3 = new SearchFeatures("FIX_RECYCLER_BIND_ON_LAYOUT", 2, "search_fix_recycler_bol");
        FIX_RECYCLER_BIND_ON_LAYOUT = searchFeatures3;
        SearchFeatures searchFeatures4 = new SearchFeatures("GLOBAL_FEED_FILTERS", 3, "search_global_feed_filters");
        GLOBAL_FEED_FILTERS = searchFeatures4;
        SearchFeatures searchFeatures5 = new SearchFeatures("SEARCH_SHOU_ENTITY", 4, "search_shou_entity");
        SEARCH_SHOU_ENTITY = searchFeatures5;
        SearchFeatures searchFeatures6 = new SearchFeatures("VIDEO_HASHTAG", 5, "search_video_hashtag");
        VIDEO_HASHTAG = searchFeatures6;
        SearchFeatures searchFeatures7 = new SearchFeatures("SEARCH_VIDEO_CATEGORY", 6, "search_video_category");
        SEARCH_VIDEO_CATEGORY = searchFeatures7;
        SearchFeatures searchFeatures8 = new SearchFeatures("SEARCH_INSIDE_COMMUNITY", 7, "search_inside_communities");
        SEARCH_INSIDE_COMMUNITY = searchFeatures8;
        SearchFeatures searchFeatures9 = new SearchFeatures("SEARCH_VIDEO_NEW_SPELLCHECKER", 8, "search_video_new_spellchecker");
        SEARCH_VIDEO_NEW_SPELLCHECKER = searchFeatures9;
        SearchFeatures searchFeatures10 = new SearchFeatures("SEARCH_VIDEO_HISTORY", 9, "search_video_history");
        SEARCH_VIDEO_HISTORY = searchFeatures10;
        SearchFeatures searchFeatures11 = new SearchFeatures("SEARCH_APP_DS", 10, "search_app_ds");
        SEARCH_APP_DS = searchFeatures11;
        SearchFeatures searchFeatures12 = new SearchFeatures("SEARCH_FILTERS_DS", 11, "search_filters_ds");
        SEARCH_FILTERS_DS = searchFeatures12;
        SearchFeatures searchFeatures13 = new SearchFeatures("SEARCH_COMMUNITY_DS", 12, "search_community_ds");
        SEARCH_COMMUNITY_DS = searchFeatures13;
        SearchFeatures[] searchFeaturesArr = {searchFeatures, searchFeatures2, searchFeatures3, searchFeatures4, searchFeatures5, searchFeatures6, searchFeatures7, searchFeatures8, searchFeatures9, searchFeatures10, searchFeatures11, searchFeatures12, searchFeatures13};
        $VALUES = searchFeaturesArr;
        $ENTRIES = new asp(searchFeaturesArr);
    }

    public SearchFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<SearchFeatures> i() {
        return $ENTRIES;
    }

    public static SearchFeatures valueOf(String str) {
        return (SearchFeatures) Enum.valueOf(SearchFeatures.class, str);
    }

    public static SearchFeatures[] values() {
        return (SearchFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        return b.A.a(this);
    }
}
