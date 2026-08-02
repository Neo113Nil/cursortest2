package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VhStyle.kt */
/* loaded from: classes2.dex */
public final class VhStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VhStyle[] $VALUES;
    public static final VhStyle AUDIOMSG_TRANSCRIPT;
    public static final VhStyle BLOCKED;
    public static final VhStyle BUTTON;
    public static final VhStyle CHANNEL_MSG_HEADER;
    public static final VhStyle CHANNEL_MSG_UNAVAILABLE;
    public static final VhStyle EMPTY;
    public static final VhStyle FAKE_NEWS;
    public static final VhStyle FWD_SENDER;
    public static final VhStyle FWD_TIME;
    public static final VhStyle HEADER;
    public static final VhStyle IMAGE;
    public static final VhStyle REACTIONS;
    public static final VhStyle SNIPPET;
    public static final VhStyle TEXT;
    public static final VhStyle TWO_LINE;
    public static final VhStyle VIDEOMSG_TRANSCRIPT;
    public static final VhStyle WALLPOST_HEADER;
    public final int index;

    static {
        VhStyle vhStyle = new VhStyle("TEXT", 0, 0);
        TEXT = vhStyle;
        VhStyle vhStyle2 = new VhStyle("IMAGE", 1, 1);
        IMAGE = vhStyle2;
        VhStyle vhStyle3 = new VhStyle("SNIPPET", 2, 2);
        SNIPPET = vhStyle3;
        VhStyle vhStyle4 = new VhStyle("TWO_LINE", 3, 3);
        TWO_LINE = vhStyle4;
        VhStyle vhStyle5 = new VhStyle("FWD_SENDER", 4, 4);
        FWD_SENDER = vhStyle5;
        VhStyle vhStyle6 = new VhStyle("FWD_TIME", 5, 5);
        FWD_TIME = vhStyle6;
        VhStyle vhStyle7 = new VhStyle("BUTTON", 6, 6);
        BUTTON = vhStyle7;
        VhStyle vhStyle8 = new VhStyle("EMPTY", 7, 7);
        EMPTY = vhStyle8;
        VhStyle vhStyle9 = new VhStyle("HEADER", 8, 8);
        HEADER = vhStyle9;
        VhStyle vhStyle10 = new VhStyle("AUDIOMSG_TRANSCRIPT", 9, 9);
        AUDIOMSG_TRANSCRIPT = vhStyle10;
        VhStyle vhStyle11 = new VhStyle("VIDEOMSG_TRANSCRIPT", 10, 10);
        VIDEOMSG_TRANSCRIPT = vhStyle11;
        VhStyle vhStyle12 = new VhStyle("WALLPOST_HEADER", 11, 11);
        WALLPOST_HEADER = vhStyle12;
        VhStyle vhStyle13 = new VhStyle("REACTIONS", 12, 12);
        REACTIONS = vhStyle13;
        VhStyle vhStyle14 = new VhStyle("BLOCKED", 13, 13);
        BLOCKED = vhStyle14;
        VhStyle vhStyle15 = new VhStyle("CHANNEL_MSG_HEADER", 14, 14);
        CHANNEL_MSG_HEADER = vhStyle15;
        VhStyle vhStyle16 = new VhStyle("CHANNEL_MSG_UNAVAILABLE", 15, 15);
        CHANNEL_MSG_UNAVAILABLE = vhStyle16;
        VhStyle vhStyle17 = new VhStyle("FAKE_NEWS", 16, 16);
        FAKE_NEWS = vhStyle17;
        VhStyle[] vhStyleArr = {vhStyle, vhStyle2, vhStyle3, vhStyle4, vhStyle5, vhStyle6, vhStyle7, vhStyle8, vhStyle9, vhStyle10, vhStyle11, vhStyle12, vhStyle13, vhStyle14, vhStyle15, vhStyle16, vhStyle17};
        $VALUES = vhStyleArr;
        $ENTRIES = new asp(vhStyleArr);
    }

    public VhStyle(String str, int i, int i2) {
        this.index = i2;
    }

    public static VhStyle valueOf(String str) {
        return (VhStyle) Enum.valueOf(VhStyle.class, str);
    }

    public static VhStyle[] values() {
        return (VhStyle[]) $VALUES.clone();
    }
}
