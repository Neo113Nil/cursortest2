package com.vk.story.viewer.impl.presentation.stories.message;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorySendMessagePresenter.kt */
/* loaded from: classes6.dex */
public final class FastReaction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FastReaction[] $VALUES;
    public static final FastReaction FACE_WITH_HEART_EYES;
    public static final FastReaction FACE_WITH_TEARS_OF_HAPPINESS;
    public static final FastReaction FIRE;
    public static final FastReaction HEART;
    public static final FastReaction PRAYING_HANDS;
    public static final FastReaction THUMBS_UP;
    private final int packId = 10576;
    private final String statName;
    private final int stickerId;

    static {
        FastReaction fastReaction = new FastReaction("HEART", 0, 769737, "like");
        HEART = fastReaction;
        FastReaction fastReaction2 = new FastReaction("FIRE", 1, 769740, "fire");
        FIRE = fastReaction2;
        FastReaction fastReaction3 = new FastReaction("THUMBS_UP", 2, 769741, "thumbs_up");
        THUMBS_UP = fastReaction3;
        FastReaction fastReaction4 = new FastReaction("FACE_WITH_TEARS_OF_HAPPINESS", 3, 769739, "face_with_tears_of_happiness");
        FACE_WITH_TEARS_OF_HAPPINESS = fastReaction4;
        FastReaction fastReaction5 = new FastReaction("FACE_WITH_HEART_EYES", 4, 769751, "smiling_face_with_heart_eyes");
        FACE_WITH_HEART_EYES = fastReaction5;
        FastReaction fastReaction6 = new FastReaction("PRAYING_HANDS", 5, 769749, "folded_hands");
        PRAYING_HANDS = fastReaction6;
        FastReaction[] fastReactionArr = {fastReaction, fastReaction2, fastReaction3, fastReaction4, fastReaction5, fastReaction6};
        $VALUES = fastReactionArr;
        $ENTRIES = new asp(fastReactionArr);
    }

    public FastReaction(String str, int i, int i2, String str2) {
        this.stickerId = i2;
        this.statName = str2;
    }

    public static FastReaction valueOf(String str) {
        return (FastReaction) Enum.valueOf(FastReaction.class, str);
    }

    public static FastReaction[] values() {
        return (FastReaction[]) $VALUES.clone();
    }

    public final int h() {
        return this.packId;
    }

    public final String i() {
        return this.statName;
    }

    public final int j() {
        return this.stickerId;
    }
}
