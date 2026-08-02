package com.vk.update.internal;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VKInAppUpdateOpenStrategy.kt */
/* loaded from: classes6.dex */
public final class VKInAppUpdateOpenStrategy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VKInAppUpdateOpenStrategy[] $VALUES;
    public static final VKInAppUpdateOpenStrategy BROWSER;
    public static final VKInAppUpdateOpenStrategy CUSTOM_TABS;

    static {
        VKInAppUpdateOpenStrategy vKInAppUpdateOpenStrategy = new VKInAppUpdateOpenStrategy("CUSTOM_TABS", 0);
        CUSTOM_TABS = vKInAppUpdateOpenStrategy;
        VKInAppUpdateOpenStrategy vKInAppUpdateOpenStrategy2 = new VKInAppUpdateOpenStrategy("BROWSER", 1);
        BROWSER = vKInAppUpdateOpenStrategy2;
        VKInAppUpdateOpenStrategy[] vKInAppUpdateOpenStrategyArr = {vKInAppUpdateOpenStrategy, vKInAppUpdateOpenStrategy2};
        $VALUES = vKInAppUpdateOpenStrategyArr;
        $ENTRIES = new asp(vKInAppUpdateOpenStrategyArr);
    }

    public VKInAppUpdateOpenStrategy() {
        throw null;
    }

    public static VKInAppUpdateOpenStrategy valueOf(String str) {
        return (VKInAppUpdateOpenStrategy) Enum.valueOf(VKInAppUpdateOpenStrategy.class, str);
    }

    public static VKInAppUpdateOpenStrategy[] values() {
        return (VKInAppUpdateOpenStrategy[]) $VALUES.clone();
    }
}
