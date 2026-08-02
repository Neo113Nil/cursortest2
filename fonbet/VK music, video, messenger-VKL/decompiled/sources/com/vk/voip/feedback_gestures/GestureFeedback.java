package com.vk.voip.feedback_gestures;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GestureFeedback.kt */
/* loaded from: classes7.dex */
public final class GestureFeedback {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GestureFeedback[] $VALUES;
    public static final a Companion;
    public static final GestureFeedback DISLIKE;
    public static final GestureFeedback HEART;
    public static final GestureFeedback LIKE;
    public static final GestureFeedback PALM;
    public static final GestureFeedback ROCK;
    public static final GestureFeedback VICTORY;
    private final String value;

    /* compiled from: GestureFeedback.kt */
    public static final class a {
    }

    static {
        GestureFeedback gestureFeedback = new GestureFeedback("HEART", 0, "heart");
        HEART = gestureFeedback;
        GestureFeedback gestureFeedback2 = new GestureFeedback("LIKE", 1, "like");
        LIKE = gestureFeedback2;
        GestureFeedback gestureFeedback3 = new GestureFeedback("DISLIKE", 2, "dlike");
        DISLIKE = gestureFeedback3;
        GestureFeedback gestureFeedback4 = new GestureFeedback("PALM", 3, "rhand");
        PALM = gestureFeedback4;
        GestureFeedback gestureFeedback5 = new GestureFeedback("ROCK", 4, "rock");
        ROCK = gestureFeedback5;
        GestureFeedback gestureFeedback6 = new GestureFeedback("VICTORY", 5, "victo");
        VICTORY = gestureFeedback6;
        GestureFeedback[] gestureFeedbackArr = {gestureFeedback, gestureFeedback2, gestureFeedback3, gestureFeedback4, gestureFeedback5, gestureFeedback6};
        $VALUES = gestureFeedbackArr;
        $ENTRIES = new asp(gestureFeedbackArr);
        Companion = new a();
    }

    public GestureFeedback(String str, int i, String str2) {
        this.value = str2;
    }

    public static GestureFeedback valueOf(String str) {
        return (GestureFeedback) Enum.valueOf(GestureFeedback.class, str);
    }

    public static GestureFeedback[] values() {
        return (GestureFeedback[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
