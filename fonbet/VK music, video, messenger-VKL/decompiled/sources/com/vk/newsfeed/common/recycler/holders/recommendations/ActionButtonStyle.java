package com.vk.newsfeed.common.recycler.holders.recommendations;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionButtonStyle.kt */
/* loaded from: classes4.dex */
public final class ActionButtonStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionButtonStyle[] $VALUES;
    public static final ActionButtonStyle Accent;
    public static final ActionButtonStyle ContentInverse;
    public static final ActionButtonStyle PrimaryWithNoShadow;

    static {
        ActionButtonStyle actionButtonStyle = new ActionButtonStyle("PrimaryWithNoShadow", 0);
        PrimaryWithNoShadow = actionButtonStyle;
        ActionButtonStyle actionButtonStyle2 = new ActionButtonStyle("Accent", 1);
        Accent = actionButtonStyle2;
        ActionButtonStyle actionButtonStyle3 = new ActionButtonStyle("ContentInverse", 2);
        ContentInverse = actionButtonStyle3;
        ActionButtonStyle[] actionButtonStyleArr = {actionButtonStyle, actionButtonStyle2, actionButtonStyle3};
        $VALUES = actionButtonStyleArr;
        $ENTRIES = new asp(actionButtonStyleArr);
    }

    public ActionButtonStyle() {
        throw null;
    }

    public static ActionButtonStyle valueOf(String str) {
        return (ActionButtonStyle) Enum.valueOf(ActionButtonStyle.class, str);
    }

    public static ActionButtonStyle[] values() {
        return (ActionButtonStyle[]) $VALUES.clone();
    }
}
