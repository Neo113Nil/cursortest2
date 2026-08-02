package com.vk.newsfeed.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedSimilarFeedType.kt */
/* loaded from: classes4.dex */
public final class NewsfeedSimilarFeedType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedSimilarFeedType[] $VALUES;
    public static final NewsfeedSimilarFeedType BREAKING_NEWS_TREND;
    public static final NewsfeedSimilarFeedType DZEN;
    public static final NewsfeedSimilarFeedType NONE;
    public static final NewsfeedSimilarFeedType SIMILAR_NEWS;

    static {
        NewsfeedSimilarFeedType newsfeedSimilarFeedType = new NewsfeedSimilarFeedType("BREAKING_NEWS_TREND", 0);
        BREAKING_NEWS_TREND = newsfeedSimilarFeedType;
        NewsfeedSimilarFeedType newsfeedSimilarFeedType2 = new NewsfeedSimilarFeedType("DZEN", 1);
        DZEN = newsfeedSimilarFeedType2;
        NewsfeedSimilarFeedType newsfeedSimilarFeedType3 = new NewsfeedSimilarFeedType("SIMILAR_NEWS", 2);
        SIMILAR_NEWS = newsfeedSimilarFeedType3;
        NewsfeedSimilarFeedType newsfeedSimilarFeedType4 = new NewsfeedSimilarFeedType("NONE", 3);
        NONE = newsfeedSimilarFeedType4;
        NewsfeedSimilarFeedType[] newsfeedSimilarFeedTypeArr = {newsfeedSimilarFeedType, newsfeedSimilarFeedType2, newsfeedSimilarFeedType3, newsfeedSimilarFeedType4};
        $VALUES = newsfeedSimilarFeedTypeArr;
        $ENTRIES = new asp(newsfeedSimilarFeedTypeArr);
    }

    public NewsfeedSimilarFeedType() {
        throw null;
    }

    public static NewsfeedSimilarFeedType valueOf(String str) {
        return (NewsfeedSimilarFeedType) Enum.valueOf(NewsfeedSimilarFeedType.class, str);
    }

    public static NewsfeedSimilarFeedType[] values() {
        return (NewsfeedSimilarFeedType[]) $VALUES.clone();
    }
}
