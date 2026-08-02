package com.vk.polls.ui;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollStyle.kt */
/* loaded from: classes18.dex */
public final class PollStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PollStyle[] $VALUES;
    public static final PollStyle CONTENT_COLOR;
    public static final PollStyle DEFAULT;
    public static final PollStyle DYNAMIC;

    static {
        PollStyle pollStyle = new PollStyle("DEFAULT", 0);
        DEFAULT = pollStyle;
        PollStyle pollStyle2 = new PollStyle("DYNAMIC", 1);
        DYNAMIC = pollStyle2;
        PollStyle pollStyle3 = new PollStyle("CONTENT_COLOR", 2);
        CONTENT_COLOR = pollStyle3;
        PollStyle[] pollStyleArr = {pollStyle, pollStyle2, pollStyle3};
        $VALUES = pollStyleArr;
        $ENTRIES = new asp(pollStyleArr);
    }

    public PollStyle() {
        throw null;
    }

    public static PollStyle valueOf(String str) {
        return (PollStyle) Enum.valueOf(PollStyle.class, str);
    }

    public static PollStyle[] values() {
        return (PollStyle[]) $VALUES.clone();
    }
}
