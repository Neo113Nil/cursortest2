package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionButtonsStyle.kt */
/* loaded from: classes6.dex */
public final class ActionButtonsStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionButtonsStyle[] $VALUES;
    public static final ActionButtonsStyle DEFAULT;
    public static final ActionButtonsStyle LIGHT;

    static {
        ActionButtonsStyle actionButtonsStyle = new ActionButtonsStyle("DEFAULT", 0);
        DEFAULT = actionButtonsStyle;
        ActionButtonsStyle actionButtonsStyle2 = new ActionButtonsStyle("LIGHT", 1);
        LIGHT = actionButtonsStyle2;
        ActionButtonsStyle[] actionButtonsStyleArr = {actionButtonsStyle, actionButtonsStyle2};
        $VALUES = actionButtonsStyleArr;
        $ENTRIES = new asp(actionButtonsStyleArr);
    }

    public ActionButtonsStyle() {
        throw null;
    }

    public static zrp<ActionButtonsStyle> h() {
        return $ENTRIES;
    }

    public static ActionButtonsStyle valueOf(String str) {
        return (ActionButtonsStyle) Enum.valueOf(ActionButtonsStyle.class, str);
    }

    public static ActionButtonsStyle[] values() {
        return (ActionButtonsStyle[]) $VALUES.clone();
    }
}
