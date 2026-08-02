package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSystemWidgetType.kt */
/* loaded from: classes6.dex */
public final class VkSystemWidgetType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkSystemWidgetType[] $VALUES;
    public static final VkSystemWidgetType LARGE_OVERVIEW;
    public static final VkSystemWidgetType SMALL_OVERVIEW;

    static {
        VkSystemWidgetType vkSystemWidgetType = new VkSystemWidgetType("SMALL_OVERVIEW", 0);
        SMALL_OVERVIEW = vkSystemWidgetType;
        VkSystemWidgetType vkSystemWidgetType2 = new VkSystemWidgetType("LARGE_OVERVIEW", 1);
        LARGE_OVERVIEW = vkSystemWidgetType2;
        VkSystemWidgetType[] vkSystemWidgetTypeArr = {vkSystemWidgetType, vkSystemWidgetType2};
        $VALUES = vkSystemWidgetTypeArr;
        $ENTRIES = new asp(vkSystemWidgetTypeArr);
    }

    public VkSystemWidgetType() {
        throw null;
    }

    public static VkSystemWidgetType valueOf(String str) {
        return (VkSystemWidgetType) Enum.valueOf(VkSystemWidgetType.class, str);
    }

    public static VkSystemWidgetType[] values() {
        return (VkSystemWidgetType[]) $VALUES.clone();
    }
}
