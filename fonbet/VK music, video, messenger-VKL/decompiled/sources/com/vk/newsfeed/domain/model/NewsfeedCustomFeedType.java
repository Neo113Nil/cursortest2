package com.vk.newsfeed.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedCustomFeedType.kt */
/* loaded from: classes4.dex */
public final class NewsfeedCustomFeedType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedCustomFeedType[] $VALUES;
    public static final NewsfeedCustomFeedType BREAKING_NEWS;
    public static final NewsfeedCustomFeedType NONE;

    static {
        NewsfeedCustomFeedType newsfeedCustomFeedType = new NewsfeedCustomFeedType("BREAKING_NEWS", 0);
        BREAKING_NEWS = newsfeedCustomFeedType;
        NewsfeedCustomFeedType newsfeedCustomFeedType2 = new NewsfeedCustomFeedType("NONE", 1);
        NONE = newsfeedCustomFeedType2;
        NewsfeedCustomFeedType[] newsfeedCustomFeedTypeArr = {newsfeedCustomFeedType, newsfeedCustomFeedType2};
        $VALUES = newsfeedCustomFeedTypeArr;
        $ENTRIES = new asp(newsfeedCustomFeedTypeArr);
    }

    public NewsfeedCustomFeedType() {
        throw null;
    }

    public static NewsfeedCustomFeedType valueOf(String str) {
        return (NewsfeedCustomFeedType) Enum.valueOf(NewsfeedCustomFeedType.class, str);
    }

    public static NewsfeedCustomFeedType[] values() {
        return (NewsfeedCustomFeedType[]) $VALUES.clone();
    }
}
