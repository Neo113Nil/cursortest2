package com.vk.ecomm.reviews.impl.dialogs.actionsmenu;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionItem.kt */
/* loaded from: classes18.dex */
public final class ActionItemIconAppearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionItemIconAppearance[] $VALUES;
    public static final ActionItemIconAppearance Accent;
    public static final ActionItemIconAppearance Negative;

    static {
        ActionItemIconAppearance actionItemIconAppearance = new ActionItemIconAppearance("Negative", 0);
        Negative = actionItemIconAppearance;
        ActionItemIconAppearance actionItemIconAppearance2 = new ActionItemIconAppearance("Accent", 1);
        Accent = actionItemIconAppearance2;
        ActionItemIconAppearance[] actionItemIconAppearanceArr = {actionItemIconAppearance, actionItemIconAppearance2};
        $VALUES = actionItemIconAppearanceArr;
        $ENTRIES = new asp(actionItemIconAppearanceArr);
    }

    public ActionItemIconAppearance() {
        throw null;
    }

    public static ActionItemIconAppearance valueOf(String str) {
        return (ActionItemIconAppearance) Enum.valueOf(ActionItemIconAppearance.class, str);
    }

    public static ActionItemIconAppearance[] values() {
        return (ActionItemIconAppearance[]) $VALUES.clone();
    }
}
