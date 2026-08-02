package com.vk.newsfeed.common.discover.media.cells.holders.tags;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoverTag.kt */
/* loaded from: classes4.dex */
public final class DiscoverTagType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoverTagType[] $VALUES;
    public static final DiscoverTagType OZON_BADGE;
    public static final DiscoverTagType SIMPLE_BADGE;

    static {
        DiscoverTagType discoverTagType = new DiscoverTagType("SIMPLE_BADGE", 0);
        SIMPLE_BADGE = discoverTagType;
        DiscoverTagType discoverTagType2 = new DiscoverTagType("OZON_BADGE", 1);
        OZON_BADGE = discoverTagType2;
        DiscoverTagType[] discoverTagTypeArr = {discoverTagType, discoverTagType2};
        $VALUES = discoverTagTypeArr;
        $ENTRIES = new asp(discoverTagTypeArr);
    }

    public DiscoverTagType() {
        throw null;
    }

    public static DiscoverTagType valueOf(String str) {
        return (DiscoverTagType) Enum.valueOf(DiscoverTagType.class, str);
    }

    public static DiscoverTagType[] values() {
        return (DiscoverTagType[]) $VALUES.clone();
    }
}
