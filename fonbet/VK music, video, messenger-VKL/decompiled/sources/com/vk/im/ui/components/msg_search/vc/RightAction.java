package com.vk.im.ui.components.msg_search.vc;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class RightAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RightAction[] $VALUES;
    public static final RightAction JUST_SUBSCRIBED;
    public static final RightAction NONE;
    public static final RightAction PLUS;

    static {
        RightAction rightAction = new RightAction("NONE", 0);
        NONE = rightAction;
        RightAction rightAction2 = new RightAction("PLUS", 1);
        PLUS = rightAction2;
        RightAction rightAction3 = new RightAction("JUST_SUBSCRIBED", 2);
        JUST_SUBSCRIBED = rightAction3;
        RightAction[] rightActionArr = {rightAction, rightAction2, rightAction3};
        $VALUES = rightActionArr;
        $ENTRIES = new asp(rightActionArr);
    }

    public RightAction() {
        throw null;
    }

    public static RightAction valueOf(String str) {
        return (RightAction) Enum.valueOf(RightAction.class, str);
    }

    public static RightAction[] values() {
        return (RightAction[]) $VALUES.clone();
    }
}
