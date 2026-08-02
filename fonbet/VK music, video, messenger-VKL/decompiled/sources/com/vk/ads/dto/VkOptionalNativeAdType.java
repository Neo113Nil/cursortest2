package com.vk.ads.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOptionalNativeAdType.kt */
/* loaded from: classes14.dex */
public final class VkOptionalNativeAdType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkOptionalNativeAdType[] $VALUES;
    public static final VkOptionalNativeAdType APPLOVIN;

    static {
        VkOptionalNativeAdType vkOptionalNativeAdType = new VkOptionalNativeAdType("APPLOVIN", 0);
        APPLOVIN = vkOptionalNativeAdType;
        VkOptionalNativeAdType[] vkOptionalNativeAdTypeArr = {vkOptionalNativeAdType};
        $VALUES = vkOptionalNativeAdTypeArr;
        $ENTRIES = new asp(vkOptionalNativeAdTypeArr);
    }

    public VkOptionalNativeAdType() {
        throw null;
    }

    public static VkOptionalNativeAdType valueOf(String str) {
        return (VkOptionalNativeAdType) Enum.valueOf(VkOptionalNativeAdType.class, str);
    }

    public static VkOptionalNativeAdType[] values() {
        return (VkOptionalNativeAdType[]) $VALUES.clone();
    }
}
