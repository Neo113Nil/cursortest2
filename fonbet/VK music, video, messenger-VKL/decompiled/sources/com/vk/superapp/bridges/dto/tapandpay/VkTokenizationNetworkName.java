package com.vk.superapp.bridges.dto.tapandpay;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkTokenizationNetworkName.kt */
/* loaded from: classes6.dex */
public final class VkTokenizationNetworkName {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkTokenizationNetworkName[] $VALUES;
    public static final VkTokenizationNetworkName MASTERCARD;
    public static final VkTokenizationNetworkName VISA;

    static {
        VkTokenizationNetworkName vkTokenizationNetworkName = new VkTokenizationNetworkName("MASTERCARD", 0);
        MASTERCARD = vkTokenizationNetworkName;
        VkTokenizationNetworkName vkTokenizationNetworkName2 = new VkTokenizationNetworkName("VISA", 1);
        VISA = vkTokenizationNetworkName2;
        VkTokenizationNetworkName[] vkTokenizationNetworkNameArr = {vkTokenizationNetworkName, vkTokenizationNetworkName2};
        $VALUES = vkTokenizationNetworkNameArr;
        $ENTRIES = new asp(vkTokenizationNetworkNameArr);
    }

    public VkTokenizationNetworkName() {
        throw null;
    }

    public static VkTokenizationNetworkName valueOf(String str) {
        return (VkTokenizationNetworkName) Enum.valueOf(VkTokenizationNetworkName.class, str);
    }

    public static VkTokenizationNetworkName[] values() {
        return (VkTokenizationNetworkName[]) $VALUES.clone();
    }
}
