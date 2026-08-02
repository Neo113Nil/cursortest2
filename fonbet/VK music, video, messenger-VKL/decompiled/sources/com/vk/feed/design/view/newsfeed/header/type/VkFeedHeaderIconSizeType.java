package com.vk.feed.design.view.newsfeed.header.type;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkFeedHeaderIconSizeType.kt */
/* loaded from: classes18.dex */
public final class VkFeedHeaderIconSizeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkFeedHeaderIconSizeType[] $VALUES;
    public static final VkFeedHeaderIconSizeType DP_12;
    public static final VkFeedHeaderIconSizeType DP_16;

    static {
        VkFeedHeaderIconSizeType vkFeedHeaderIconSizeType = new VkFeedHeaderIconSizeType("DP_12", 0);
        DP_12 = vkFeedHeaderIconSizeType;
        VkFeedHeaderIconSizeType vkFeedHeaderIconSizeType2 = new VkFeedHeaderIconSizeType("DP_16", 1);
        DP_16 = vkFeedHeaderIconSizeType2;
        VkFeedHeaderIconSizeType[] vkFeedHeaderIconSizeTypeArr = {vkFeedHeaderIconSizeType, vkFeedHeaderIconSizeType2};
        $VALUES = vkFeedHeaderIconSizeTypeArr;
        $ENTRIES = new asp(vkFeedHeaderIconSizeTypeArr);
    }

    public VkFeedHeaderIconSizeType() {
        throw null;
    }

    public static VkFeedHeaderIconSizeType valueOf(String str) {
        return (VkFeedHeaderIconSizeType) Enum.valueOf(VkFeedHeaderIconSizeType.class, str);
    }

    public static VkFeedHeaderIconSizeType[] values() {
        return (VkFeedHeaderIconSizeType[]) $VALUES.clone();
    }
}
