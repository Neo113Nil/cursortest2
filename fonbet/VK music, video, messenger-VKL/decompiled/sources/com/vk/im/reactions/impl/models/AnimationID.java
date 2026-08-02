package com.vk.im.reactions.impl.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnimationID.kt */
/* loaded from: classes2.dex */
public final class AnimationID {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AnimationID[] $VALUES;
    public static final AnimationID ANGRY;
    public static final AnimationID COIN;
    public static final AnimationID CRY;
    public static final AnimationID FIRE;
    public static final AnimationID HEART;
    public static final AnimationID LIKE;
    public static final AnimationID LOL;
    public static final AnimationID POOP;
    public static final AnimationID QUESTION;
    private final int id;

    static {
        AnimationID animationID = new AnimationID("COIN", 0, -2);
        COIN = animationID;
        AnimationID animationID2 = new AnimationID("HEART", 1, 1);
        HEART = animationID2;
        AnimationID animationID3 = new AnimationID("FIRE", 2, 2);
        FIRE = animationID3;
        AnimationID animationID4 = new AnimationID("LOL", 3, 3);
        LOL = animationID4;
        AnimationID animationID5 = new AnimationID("LIKE", 4, 4);
        LIKE = animationID5;
        AnimationID animationID6 = new AnimationID("POOP", 5, 5);
        POOP = animationID6;
        AnimationID animationID7 = new AnimationID("QUESTION", 6, 6);
        QUESTION = animationID7;
        AnimationID animationID8 = new AnimationID("CRY", 7, 7);
        CRY = animationID8;
        AnimationID animationID9 = new AnimationID("ANGRY", 8, 8);
        ANGRY = animationID9;
        AnimationID[] animationIDArr = {animationID, animationID2, animationID3, animationID4, animationID5, animationID6, animationID7, animationID8, animationID9};
        $VALUES = animationIDArr;
        $ENTRIES = new asp(animationIDArr);
    }

    public AnimationID(String str, int i, int i2) {
        this.id = i2;
    }

    public static AnimationID valueOf(String str) {
        return (AnimationID) Enum.valueOf(AnimationID.class, str);
    }

    public static AnimationID[] values() {
        return (AnimationID[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
