package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkHealthProductType.kt */
/* loaded from: classes6.dex */
public final class VkHealthProductType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkHealthProductType[] $VALUES;
    public static final VkHealthProductType STEPS;
    public static final VkHealthProductType WORKOUTS;

    static {
        VkHealthProductType vkHealthProductType = new VkHealthProductType("STEPS", 0);
        STEPS = vkHealthProductType;
        VkHealthProductType vkHealthProductType2 = new VkHealthProductType("WORKOUTS", 1);
        WORKOUTS = vkHealthProductType2;
        VkHealthProductType[] vkHealthProductTypeArr = {vkHealthProductType, vkHealthProductType2};
        $VALUES = vkHealthProductTypeArr;
        $ENTRIES = new asp(vkHealthProductTypeArr);
    }

    public VkHealthProductType() {
        throw null;
    }

    public static VkHealthProductType valueOf(String str) {
        return (VkHealthProductType) Enum.valueOf(VkHealthProductType.class, str);
    }

    public static VkHealthProductType[] values() {
        return (VkHealthProductType[]) $VALUES.clone();
    }
}
