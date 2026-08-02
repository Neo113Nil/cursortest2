package com.vk.dto.stories.model;

import androidx.core.app.NotificationCompat;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverBlockType.kt */
/* loaded from: classes18.dex */
public final class DiscoverBlockType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverBlockType[] $VALUES;
    public static final DiscoverBlockType DISCOVER;

    @pmi0("feed")
    public static final DiscoverBlockType FEED;

    @pmi0("phone_book_stories")
    public static final DiscoverBlockType PHONE_BOOK_STORIES;

    @pmi0(NotificationCompat.CATEGORY_SOCIAL)
    public static final DiscoverBlockType SOCIAL;
    private final String value;

    static {
        DiscoverBlockType discoverBlockType = new DiscoverBlockType("DISCOVER", 0, "discover");
        DISCOVER = discoverBlockType;
        DiscoverBlockType discoverBlockType2 = new DiscoverBlockType("FEED", 1, "feed");
        FEED = discoverBlockType2;
        DiscoverBlockType discoverBlockType3 = new DiscoverBlockType("SOCIAL", 2, NotificationCompat.CATEGORY_SOCIAL);
        SOCIAL = discoverBlockType3;
        DiscoverBlockType discoverBlockType4 = new DiscoverBlockType("PHONE_BOOK_STORIES", 3, "phone_book_stories");
        PHONE_BOOK_STORIES = discoverBlockType4;
        DiscoverBlockType[] discoverBlockTypeArr = {discoverBlockType, discoverBlockType2, discoverBlockType3, discoverBlockType4};
        $VALUES = discoverBlockTypeArr;
        $ENTRIES = new asp(discoverBlockTypeArr);
    }

    private DiscoverBlockType(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverBlockType valueOf(String str) {
        return (DiscoverBlockType) Enum.valueOf(DiscoverBlockType.class, str);
    }

    public static DiscoverBlockType[] values() {
        return (DiscoverBlockType[]) $VALUES.clone();
    }
}
