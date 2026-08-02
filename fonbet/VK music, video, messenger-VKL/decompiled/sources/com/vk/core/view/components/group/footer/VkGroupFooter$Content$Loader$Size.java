package com.vk.core.view.components.group.footer;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkGroupFooter.kt */
/* loaded from: classes17.dex */
public final class VkGroupFooter$Content$Loader$Size {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkGroupFooter$Content$Loader$Size[] $VALUES;
    public static final VkGroupFooter$Content$Loader$Size L;
    public static final VkGroupFooter$Content$Loader$Size M;
    public static final VkGroupFooter$Content$Loader$Size S;
    public static final VkGroupFooter$Content$Loader$Size XL;

    static {
        VkGroupFooter$Content$Loader$Size vkGroupFooter$Content$Loader$Size = new VkGroupFooter$Content$Loader$Size("S", 0);
        S = vkGroupFooter$Content$Loader$Size;
        VkGroupFooter$Content$Loader$Size vkGroupFooter$Content$Loader$Size2 = new VkGroupFooter$Content$Loader$Size("M", 1);
        M = vkGroupFooter$Content$Loader$Size2;
        VkGroupFooter$Content$Loader$Size vkGroupFooter$Content$Loader$Size3 = new VkGroupFooter$Content$Loader$Size("L", 2);
        L = vkGroupFooter$Content$Loader$Size3;
        VkGroupFooter$Content$Loader$Size vkGroupFooter$Content$Loader$Size4 = new VkGroupFooter$Content$Loader$Size("XL", 3);
        XL = vkGroupFooter$Content$Loader$Size4;
        VkGroupFooter$Content$Loader$Size[] vkGroupFooter$Content$Loader$SizeArr = {vkGroupFooter$Content$Loader$Size, vkGroupFooter$Content$Loader$Size2, vkGroupFooter$Content$Loader$Size3, vkGroupFooter$Content$Loader$Size4};
        $VALUES = vkGroupFooter$Content$Loader$SizeArr;
        $ENTRIES = new asp(vkGroupFooter$Content$Loader$SizeArr);
    }

    public VkGroupFooter$Content$Loader$Size() {
        throw null;
    }

    public static VkGroupFooter$Content$Loader$Size valueOf(String str) {
        return (VkGroupFooter$Content$Loader$Size) Enum.valueOf(VkGroupFooter$Content$Loader$Size.class, str);
    }

    public static VkGroupFooter$Content$Loader$Size[] values() {
        return (VkGroupFooter$Content$Loader$Size[]) $VALUES.clone();
    }
}
