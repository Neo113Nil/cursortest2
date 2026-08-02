package com.vk.superapp.browser_events;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkAppEvent.kt */
/* loaded from: classes6.dex */
public final class VkAppEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkAppEvent[] $VALUES;
    public static final VkAppEvent VK_APP_FAVORITE_STATUS_CHANGED;

    static {
        VkAppEvent vkAppEvent = new VkAppEvent("VK_APP_FAVORITE_STATUS_CHANGED", 0);
        VK_APP_FAVORITE_STATUS_CHANGED = vkAppEvent;
        VkAppEvent[] vkAppEventArr = {vkAppEvent};
        $VALUES = vkAppEventArr;
        $ENTRIES = new asp(vkAppEventArr);
    }

    public VkAppEvent() {
        throw null;
    }

    public static VkAppEvent valueOf(String str) {
        return (VkAppEvent) Enum.valueOf(VkAppEvent.class, str);
    }

    public static VkAppEvent[] values() {
        return (VkAppEvent[]) $VALUES.clone();
    }
}
