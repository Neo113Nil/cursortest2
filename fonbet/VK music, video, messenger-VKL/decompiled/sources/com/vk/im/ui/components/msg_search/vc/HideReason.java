package com.vk.im.ui.components.msg_search.vc;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HideReason.kt */
/* loaded from: classes2.dex */
public final class HideReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HideReason[] $VALUES;
    public static final HideReason BACK;
    public static final HideReason BOTTOM_BAR;
    public static final HideReason EMPTY_TAP;
    public static final HideReason ERROR;
    public static final HideReason FRAGMENT_SWITCHED;
    public static final HideReason INVALIDATE;
    public static final HideReason MSG_SEND;
    public static final HideReason NAV_BACK;

    static {
        HideReason hideReason = new HideReason("BACK", 0);
        BACK = hideReason;
        HideReason hideReason2 = new HideReason("EMPTY_TAP", 1);
        EMPTY_TAP = hideReason2;
        HideReason hideReason3 = new HideReason("BOTTOM_BAR", 2);
        BOTTOM_BAR = hideReason3;
        HideReason hideReason4 = new HideReason("NAV_BACK", 3);
        NAV_BACK = hideReason4;
        HideReason hideReason5 = new HideReason("FRAGMENT_SWITCHED", 4);
        FRAGMENT_SWITCHED = hideReason5;
        HideReason hideReason6 = new HideReason("ERROR", 5);
        ERROR = hideReason6;
        HideReason hideReason7 = new HideReason("MSG_SEND", 6);
        MSG_SEND = hideReason7;
        HideReason hideReason8 = new HideReason("INVALIDATE", 7);
        INVALIDATE = hideReason8;
        HideReason[] hideReasonArr = {hideReason, hideReason2, hideReason3, hideReason4, hideReason5, hideReason6, hideReason7, hideReason8};
        $VALUES = hideReasonArr;
        $ENTRIES = new asp(hideReasonArr);
    }

    public HideReason() {
        throw null;
    }

    public static HideReason valueOf(String str) {
        return (HideReason) Enum.valueOf(HideReason.class, str);
    }

    public static HideReason[] values() {
        return (HideReason[]) $VALUES.clone();
    }
}
