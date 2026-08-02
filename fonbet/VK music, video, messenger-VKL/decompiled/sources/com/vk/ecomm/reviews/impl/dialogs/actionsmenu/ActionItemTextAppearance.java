package com.vk.ecomm.reviews.impl.dialogs.actionsmenu;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionItem.kt */
/* loaded from: classes18.dex */
public final class ActionItemTextAppearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionItemTextAppearance[] $VALUES;
    public static final ActionItemTextAppearance Negative;
    public static final ActionItemTextAppearance Primary;

    static {
        ActionItemTextAppearance actionItemTextAppearance = new ActionItemTextAppearance("Primary", 0);
        Primary = actionItemTextAppearance;
        ActionItemTextAppearance actionItemTextAppearance2 = new ActionItemTextAppearance("Negative", 1);
        Negative = actionItemTextAppearance2;
        ActionItemTextAppearance[] actionItemTextAppearanceArr = {actionItemTextAppearance, actionItemTextAppearance2};
        $VALUES = actionItemTextAppearanceArr;
        $ENTRIES = new asp(actionItemTextAppearanceArr);
    }

    public ActionItemTextAppearance() {
        throw null;
    }

    public static ActionItemTextAppearance valueOf(String str) {
        return (ActionItemTextAppearance) Enum.valueOf(ActionItemTextAppearance.class, str);
    }

    public static ActionItemTextAppearance[] values() {
        return (ActionItemTextAppearance[]) $VALUES.clone();
    }
}
