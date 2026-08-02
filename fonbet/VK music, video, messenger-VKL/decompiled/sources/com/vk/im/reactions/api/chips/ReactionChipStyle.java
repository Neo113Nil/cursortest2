package com.vk.im.reactions.api.chips;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReactionChipModel.kt */
/* loaded from: classes2.dex */
public final class ReactionChipStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReactionChipStyle[] $VALUES;
    public static final ReactionChipStyle GRADIENT_BUBBLE;
    public static final ReactionChipStyle INCOMING;
    public static final ReactionChipStyle OUTGOING;
    public static final ReactionChipStyle WITHOUT_BUBBLE;

    static {
        ReactionChipStyle reactionChipStyle = new ReactionChipStyle("INCOMING", 0);
        INCOMING = reactionChipStyle;
        ReactionChipStyle reactionChipStyle2 = new ReactionChipStyle("OUTGOING", 1);
        OUTGOING = reactionChipStyle2;
        ReactionChipStyle reactionChipStyle3 = new ReactionChipStyle("WITHOUT_BUBBLE", 2);
        WITHOUT_BUBBLE = reactionChipStyle3;
        ReactionChipStyle reactionChipStyle4 = new ReactionChipStyle("GRADIENT_BUBBLE", 3);
        GRADIENT_BUBBLE = reactionChipStyle4;
        ReactionChipStyle[] reactionChipStyleArr = {reactionChipStyle, reactionChipStyle2, reactionChipStyle3, reactionChipStyle4};
        $VALUES = reactionChipStyleArr;
        $ENTRIES = new asp(reactionChipStyleArr);
    }

    public ReactionChipStyle() {
        throw null;
    }

    public static ReactionChipStyle valueOf(String str) {
        return (ReactionChipStyle) Enum.valueOf(ReactionChipStyle.class, str);
    }

    public static ReactionChipStyle[] values() {
        return (ReactionChipStyle[]) $VALUES.clone();
    }
}
