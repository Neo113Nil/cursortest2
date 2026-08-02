package com.vk.newsfeed.presentation.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionButtonType.kt */
/* loaded from: classes4.dex */
public final class ActionButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionButtonType[] $VALUES;
    public static final ActionButtonType SUBSCRIBE_AVATAR;
    public static final ActionButtonType SUBSCRIBE_IMAGE;
    public static final ActionButtonType SUBSCRIBE_TEXT;
    public static final ActionButtonType SUBSCRIBE_TEXT_WITH_BG;

    static {
        ActionButtonType actionButtonType = new ActionButtonType("SUBSCRIBE_IMAGE", 0);
        SUBSCRIBE_IMAGE = actionButtonType;
        ActionButtonType actionButtonType2 = new ActionButtonType("SUBSCRIBE_TEXT", 1);
        SUBSCRIBE_TEXT = actionButtonType2;
        ActionButtonType actionButtonType3 = new ActionButtonType("SUBSCRIBE_TEXT_WITH_BG", 2);
        SUBSCRIBE_TEXT_WITH_BG = actionButtonType3;
        ActionButtonType actionButtonType4 = new ActionButtonType("SUBSCRIBE_AVATAR", 3);
        SUBSCRIBE_AVATAR = actionButtonType4;
        ActionButtonType[] actionButtonTypeArr = {actionButtonType, actionButtonType2, actionButtonType3, actionButtonType4};
        $VALUES = actionButtonTypeArr;
        $ENTRIES = new asp(actionButtonTypeArr);
    }

    public ActionButtonType() {
        throw null;
    }

    public static ActionButtonType valueOf(String str) {
        return (ActionButtonType) Enum.valueOf(ActionButtonType.class, str);
    }

    public static ActionButtonType[] values() {
        return (ActionButtonType[]) $VALUES.clone();
    }
}
