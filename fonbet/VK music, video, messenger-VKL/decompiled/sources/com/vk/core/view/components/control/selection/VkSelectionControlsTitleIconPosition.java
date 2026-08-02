package com.vk.core.view.components.control.selection;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSelectionControlsTitleIconPosition.kt */
/* loaded from: classes17.dex */
public final class VkSelectionControlsTitleIconPosition {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkSelectionControlsTitleIconPosition[] $VALUES;
    public static final VkSelectionControlsTitleIconPosition AfterTitleText;
    public static final VkSelectionControlsTitleIconPosition ComponentEnd;

    static {
        VkSelectionControlsTitleIconPosition vkSelectionControlsTitleIconPosition = new VkSelectionControlsTitleIconPosition("AfterTitleText", 0);
        AfterTitleText = vkSelectionControlsTitleIconPosition;
        VkSelectionControlsTitleIconPosition vkSelectionControlsTitleIconPosition2 = new VkSelectionControlsTitleIconPosition("ComponentEnd", 1);
        ComponentEnd = vkSelectionControlsTitleIconPosition2;
        VkSelectionControlsTitleIconPosition[] vkSelectionControlsTitleIconPositionArr = {vkSelectionControlsTitleIconPosition, vkSelectionControlsTitleIconPosition2};
        $VALUES = vkSelectionControlsTitleIconPositionArr;
        $ENTRIES = new asp(vkSelectionControlsTitleIconPositionArr);
    }

    public VkSelectionControlsTitleIconPosition() {
        throw null;
    }

    public static VkSelectionControlsTitleIconPosition valueOf(String str) {
        return (VkSelectionControlsTitleIconPosition) Enum.valueOf(VkSelectionControlsTitleIconPosition.class, str);
    }

    public static VkSelectionControlsTitleIconPosition[] values() {
        return (VkSelectionControlsTitleIconPosition[]) $VALUES.clone();
    }
}
