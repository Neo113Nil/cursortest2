package com.vk.im.ui.views.msg.bubble;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MsgBubblePart.kt */
/* loaded from: classes2.dex */
public final class MsgBubblePart {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MsgBubblePart[] $VALUES;
    public static final MsgBubblePart BOTTOM;
    public static final MsgBubblePart FULL;
    public static final MsgBubblePart MIDDLE;
    public static final MsgBubblePart TOP;

    static {
        MsgBubblePart msgBubblePart = new MsgBubblePart("FULL", 0);
        FULL = msgBubblePart;
        MsgBubblePart msgBubblePart2 = new MsgBubblePart("TOP", 1);
        TOP = msgBubblePart2;
        MsgBubblePart msgBubblePart3 = new MsgBubblePart("MIDDLE", 2);
        MIDDLE = msgBubblePart3;
        MsgBubblePart msgBubblePart4 = new MsgBubblePart("BOTTOM", 3);
        BOTTOM = msgBubblePart4;
        MsgBubblePart[] msgBubblePartArr = {msgBubblePart, msgBubblePart2, msgBubblePart3, msgBubblePart4};
        $VALUES = msgBubblePartArr;
        $ENTRIES = new asp(msgBubblePartArr);
    }

    public MsgBubblePart() {
        throw null;
    }

    public static MsgBubblePart valueOf(String str) {
        return (MsgBubblePart) Enum.valueOf(MsgBubblePart.class, str);
    }

    public static MsgBubblePart[] values() {
        return (MsgBubblePart[]) $VALUES.clone();
    }
}
