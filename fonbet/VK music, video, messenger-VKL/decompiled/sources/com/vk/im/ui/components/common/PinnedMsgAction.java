package com.vk.im.ui.components.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PinnedMsgAction.kt */
/* loaded from: classes2.dex */
public final class PinnedMsgAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PinnedMsgAction[] $VALUES;
    public static final PinnedMsgAction HIDE;
    public static final PinnedMsgAction SHOW;
    public static final PinnedMsgAction UNPIN;

    static {
        PinnedMsgAction pinnedMsgAction = new PinnedMsgAction("SHOW", 0);
        SHOW = pinnedMsgAction;
        PinnedMsgAction pinnedMsgAction2 = new PinnedMsgAction("HIDE", 1);
        HIDE = pinnedMsgAction2;
        PinnedMsgAction pinnedMsgAction3 = new PinnedMsgAction("UNPIN", 2);
        UNPIN = pinnedMsgAction3;
        PinnedMsgAction[] pinnedMsgActionArr = {pinnedMsgAction, pinnedMsgAction2, pinnedMsgAction3};
        $VALUES = pinnedMsgActionArr;
        $ENTRIES = new asp(pinnedMsgActionArr);
    }

    public PinnedMsgAction() {
        throw null;
    }

    public static PinnedMsgAction valueOf(String str) {
        return (PinnedMsgAction) Enum.valueOf(PinnedMsgAction.class, str);
    }

    public static PinnedMsgAction[] values() {
        return (PinnedMsgAction[]) $VALUES.clone();
    }
}
