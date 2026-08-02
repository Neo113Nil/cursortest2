package com.vk.newsfeed.presentation.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionsMenuType.kt */
/* loaded from: classes4.dex */
public final class ActionsMenuType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionsMenuType[] $VALUES;
    public static final ActionsMenuType REDESIGN;
    public static final ActionsMenuType REDESIGN_AND_DISABLE;

    static {
        ActionsMenuType actionsMenuType = new ActionsMenuType("REDESIGN_AND_DISABLE", 0);
        REDESIGN_AND_DISABLE = actionsMenuType;
        ActionsMenuType actionsMenuType2 = new ActionsMenuType("REDESIGN", 1);
        REDESIGN = actionsMenuType2;
        ActionsMenuType[] actionsMenuTypeArr = {actionsMenuType, actionsMenuType2};
        $VALUES = actionsMenuTypeArr;
        $ENTRIES = new asp(actionsMenuTypeArr);
    }

    public ActionsMenuType() {
        throw null;
    }

    public static ActionsMenuType valueOf(String str) {
        return (ActionsMenuType) Enum.valueOf(ActionsMenuType.class, str);
    }

    public static ActionsMenuType[] values() {
        return (ActionsMenuType[]) $VALUES.clone();
    }
}
