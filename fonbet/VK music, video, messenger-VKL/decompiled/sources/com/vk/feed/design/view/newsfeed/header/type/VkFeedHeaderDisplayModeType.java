package com.vk.feed.design.view.newsfeed.header.type;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkFeedHeaderDisplayModeType.kt */
/* loaded from: classes18.dex */
public final class VkFeedHeaderDisplayModeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkFeedHeaderDisplayModeType[] $VALUES;
    public static final VkFeedHeaderDisplayModeType DEFAULT;
    public static final VkFeedHeaderDisplayModeType OVERLAY;

    static {
        VkFeedHeaderDisplayModeType vkFeedHeaderDisplayModeType = new VkFeedHeaderDisplayModeType("DEFAULT", 0);
        DEFAULT = vkFeedHeaderDisplayModeType;
        VkFeedHeaderDisplayModeType vkFeedHeaderDisplayModeType2 = new VkFeedHeaderDisplayModeType("OVERLAY", 1);
        OVERLAY = vkFeedHeaderDisplayModeType2;
        VkFeedHeaderDisplayModeType[] vkFeedHeaderDisplayModeTypeArr = {vkFeedHeaderDisplayModeType, vkFeedHeaderDisplayModeType2};
        $VALUES = vkFeedHeaderDisplayModeTypeArr;
        $ENTRIES = new asp(vkFeedHeaderDisplayModeTypeArr);
    }

    public VkFeedHeaderDisplayModeType() {
        throw null;
    }

    public static VkFeedHeaderDisplayModeType valueOf(String str) {
        return (VkFeedHeaderDisplayModeType) Enum.valueOf(VkFeedHeaderDisplayModeType.class, str);
    }

    public static VkFeedHeaderDisplayModeType[] values() {
        return (VkFeedHeaderDisplayModeType[]) $VALUES.clone();
    }
}
