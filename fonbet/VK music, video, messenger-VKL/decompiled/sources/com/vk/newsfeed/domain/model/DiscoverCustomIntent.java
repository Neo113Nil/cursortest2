package com.vk.newsfeed.domain.model;

import com.huawei.hms.common.data.DataBufferUtils;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverCustomIntent.kt */
/* loaded from: classes4.dex */
public final class DiscoverCustomIntent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverCustomIntent[] $VALUES;
    public static final DiscoverCustomIntent FEED_BLOCK;
    public static final DiscoverCustomIntent INITIAL;
    public static final DiscoverCustomIntent NEXT_PAGE;
    public static final DiscoverCustomIntent PRELOAD;
    public static final DiscoverCustomIntent PTR;
    private final String value;

    static {
        DiscoverCustomIntent discoverCustomIntent = new DiscoverCustomIntent("PRELOAD", 0, "preload");
        PRELOAD = discoverCustomIntent;
        DiscoverCustomIntent discoverCustomIntent2 = new DiscoverCustomIntent("INITIAL", 1, "initial");
        INITIAL = discoverCustomIntent2;
        DiscoverCustomIntent discoverCustomIntent3 = new DiscoverCustomIntent("PTR", 2, "ptr");
        PTR = discoverCustomIntent3;
        DiscoverCustomIntent discoverCustomIntent4 = new DiscoverCustomIntent("NEXT_PAGE", 3, DataBufferUtils.NEXT_PAGE);
        NEXT_PAGE = discoverCustomIntent4;
        DiscoverCustomIntent discoverCustomIntent5 = new DiscoverCustomIntent("FEED_BLOCK", 4, "feed_block");
        FEED_BLOCK = discoverCustomIntent5;
        DiscoverCustomIntent[] discoverCustomIntentArr = {discoverCustomIntent, discoverCustomIntent2, discoverCustomIntent3, discoverCustomIntent4, discoverCustomIntent5};
        $VALUES = discoverCustomIntentArr;
        $ENTRIES = new asp(discoverCustomIntentArr);
    }

    public DiscoverCustomIntent(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscoverCustomIntent valueOf(String str) {
        return (DiscoverCustomIntent) Enum.valueOf(DiscoverCustomIntent.class, str);
    }

    public static DiscoverCustomIntent[] values() {
        return (DiscoverCustomIntent[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
