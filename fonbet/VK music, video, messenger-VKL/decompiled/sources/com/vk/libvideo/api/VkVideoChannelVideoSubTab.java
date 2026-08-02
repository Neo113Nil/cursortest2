package com.vk.libvideo.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoRouter.kt */
/* loaded from: classes2.dex */
public final class VkVideoChannelVideoSubTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkVideoChannelVideoSubTab[] $VALUES;
    public static final VkVideoChannelVideoSubTab ALL;
    public static final VkVideoChannelVideoSubTab DRAFTS;
    public static final VkVideoChannelVideoSubTab PUBLISHED;
    public static final VkVideoChannelVideoSubTab SCHEDULED;

    static {
        VkVideoChannelVideoSubTab vkVideoChannelVideoSubTab = new VkVideoChannelVideoSubTab("ALL", 0);
        ALL = vkVideoChannelVideoSubTab;
        VkVideoChannelVideoSubTab vkVideoChannelVideoSubTab2 = new VkVideoChannelVideoSubTab("DRAFTS", 1);
        DRAFTS = vkVideoChannelVideoSubTab2;
        VkVideoChannelVideoSubTab vkVideoChannelVideoSubTab3 = new VkVideoChannelVideoSubTab("SCHEDULED", 2);
        SCHEDULED = vkVideoChannelVideoSubTab3;
        VkVideoChannelVideoSubTab vkVideoChannelVideoSubTab4 = new VkVideoChannelVideoSubTab("PUBLISHED", 3);
        PUBLISHED = vkVideoChannelVideoSubTab4;
        VkVideoChannelVideoSubTab[] vkVideoChannelVideoSubTabArr = {vkVideoChannelVideoSubTab, vkVideoChannelVideoSubTab2, vkVideoChannelVideoSubTab3, vkVideoChannelVideoSubTab4};
        $VALUES = vkVideoChannelVideoSubTabArr;
        $ENTRIES = new asp(vkVideoChannelVideoSubTabArr);
    }

    public VkVideoChannelVideoSubTab() {
        throw null;
    }

    public static VkVideoChannelVideoSubTab valueOf(String str) {
        return (VkVideoChannelVideoSubTab) Enum.valueOf(VkVideoChannelVideoSubTab.class, str);
    }

    public static VkVideoChannelVideoSubTab[] values() {
        return (VkVideoChannelVideoSubTab[]) $VALUES.clone();
    }
}
