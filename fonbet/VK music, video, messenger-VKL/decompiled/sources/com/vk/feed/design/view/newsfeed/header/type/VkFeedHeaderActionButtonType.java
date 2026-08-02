package com.vk.feed.design.view.newsfeed.header.type;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkFeedHeaderActionButtonType.kt */
/* loaded from: classes18.dex */
public final class VkFeedHeaderActionButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkFeedHeaderActionButtonType[] $VALUES;
    public static final VkFeedHeaderActionButtonType SUBSCRIBE_AVATAR;
    public static final VkFeedHeaderActionButtonType SUBSCRIBE_IMAGE;
    public static final VkFeedHeaderActionButtonType SUBSCRIBE_TEXT;
    public static final VkFeedHeaderActionButtonType SUBSCRIBE_TEXT_WITH_BG;

    static {
        VkFeedHeaderActionButtonType vkFeedHeaderActionButtonType = new VkFeedHeaderActionButtonType("SUBSCRIBE_IMAGE", 0);
        SUBSCRIBE_IMAGE = vkFeedHeaderActionButtonType;
        VkFeedHeaderActionButtonType vkFeedHeaderActionButtonType2 = new VkFeedHeaderActionButtonType("SUBSCRIBE_TEXT", 1);
        SUBSCRIBE_TEXT = vkFeedHeaderActionButtonType2;
        VkFeedHeaderActionButtonType vkFeedHeaderActionButtonType3 = new VkFeedHeaderActionButtonType("SUBSCRIBE_TEXT_WITH_BG", 2);
        SUBSCRIBE_TEXT_WITH_BG = vkFeedHeaderActionButtonType3;
        VkFeedHeaderActionButtonType vkFeedHeaderActionButtonType4 = new VkFeedHeaderActionButtonType("SUBSCRIBE_AVATAR", 3);
        SUBSCRIBE_AVATAR = vkFeedHeaderActionButtonType4;
        VkFeedHeaderActionButtonType[] vkFeedHeaderActionButtonTypeArr = {vkFeedHeaderActionButtonType, vkFeedHeaderActionButtonType2, vkFeedHeaderActionButtonType3, vkFeedHeaderActionButtonType4};
        $VALUES = vkFeedHeaderActionButtonTypeArr;
        $ENTRIES = new asp(vkFeedHeaderActionButtonTypeArr);
    }

    public VkFeedHeaderActionButtonType() {
        throw null;
    }

    public static VkFeedHeaderActionButtonType valueOf(String str) {
        return (VkFeedHeaderActionButtonType) Enum.valueOf(VkFeedHeaderActionButtonType.class, str);
    }

    public static VkFeedHeaderActionButtonType[] values() {
        return (VkFeedHeaderActionButtonType[]) $VALUES.clone();
    }
}
