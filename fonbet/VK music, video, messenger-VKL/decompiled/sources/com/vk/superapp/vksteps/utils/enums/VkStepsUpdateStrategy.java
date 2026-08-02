package com.vk.superapp.vksteps.utils.enums;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStepsUpdateStrategy.kt */
/* loaded from: classes6.dex */
public final class VkStepsUpdateStrategy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStepsUpdateStrategy[] $VALUES;
    public static final VkStepsUpdateStrategy MONTHLY_SYNC;
    public static final VkStepsUpdateStrategy PARTIAL_MONTHLY_SYNC;
    public static final VkStepsUpdateStrategy SYNC_FROM_EVENTS;
    public static final VkStepsUpdateStrategy UNDEFINED;

    static {
        VkStepsUpdateStrategy vkStepsUpdateStrategy = new VkStepsUpdateStrategy("MONTHLY_SYNC", 0);
        MONTHLY_SYNC = vkStepsUpdateStrategy;
        VkStepsUpdateStrategy vkStepsUpdateStrategy2 = new VkStepsUpdateStrategy("PARTIAL_MONTHLY_SYNC", 1);
        PARTIAL_MONTHLY_SYNC = vkStepsUpdateStrategy2;
        VkStepsUpdateStrategy vkStepsUpdateStrategy3 = new VkStepsUpdateStrategy("SYNC_FROM_EVENTS", 2);
        SYNC_FROM_EVENTS = vkStepsUpdateStrategy3;
        VkStepsUpdateStrategy vkStepsUpdateStrategy4 = new VkStepsUpdateStrategy("UNDEFINED", 3);
        UNDEFINED = vkStepsUpdateStrategy4;
        VkStepsUpdateStrategy[] vkStepsUpdateStrategyArr = {vkStepsUpdateStrategy, vkStepsUpdateStrategy2, vkStepsUpdateStrategy3, vkStepsUpdateStrategy4};
        $VALUES = vkStepsUpdateStrategyArr;
        $ENTRIES = new asp(vkStepsUpdateStrategyArr);
    }

    public VkStepsUpdateStrategy() {
        throw null;
    }

    public static VkStepsUpdateStrategy valueOf(String str) {
        return (VkStepsUpdateStrategy) Enum.valueOf(VkStepsUpdateStrategy.class, str);
    }

    public static VkStepsUpdateStrategy[] values() {
        return (VkStepsUpdateStrategy[]) $VALUES.clone();
    }
}
