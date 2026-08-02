package com.vk.feed.core.models.news;

import io.appmetrica.analytics.impl.L2;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnimatedBlockEntry.kt */
/* loaded from: classes18.dex */
public final class AnimatedBlockEntry$Companion$DecorationType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AnimatedBlockEntry$Companion$DecorationType[] $VALUES;
    public static final AnimatedBlockEntry$Companion$DecorationType BACKGROUND;
    public static final AnimatedBlockEntry$Companion$DecorationType CARD;
    public static final a Companion;
    public static final AnimatedBlockEntry$Companion$DecorationType NONE;
    private final String value;

    /* compiled from: AnimatedBlockEntry.kt */
    public static final class a {
    }

    static {
        AnimatedBlockEntry$Companion$DecorationType animatedBlockEntry$Companion$DecorationType = new AnimatedBlockEntry$Companion$DecorationType("NONE", 0, "none");
        NONE = animatedBlockEntry$Companion$DecorationType;
        AnimatedBlockEntry$Companion$DecorationType animatedBlockEntry$Companion$DecorationType2 = new AnimatedBlockEntry$Companion$DecorationType("BACKGROUND", 1, L2.g);
        BACKGROUND = animatedBlockEntry$Companion$DecorationType2;
        AnimatedBlockEntry$Companion$DecorationType animatedBlockEntry$Companion$DecorationType3 = new AnimatedBlockEntry$Companion$DecorationType("CARD", 2, "card");
        CARD = animatedBlockEntry$Companion$DecorationType3;
        AnimatedBlockEntry$Companion$DecorationType[] animatedBlockEntry$Companion$DecorationTypeArr = {animatedBlockEntry$Companion$DecorationType, animatedBlockEntry$Companion$DecorationType2, animatedBlockEntry$Companion$DecorationType3};
        $VALUES = animatedBlockEntry$Companion$DecorationTypeArr;
        $ENTRIES = new asp(animatedBlockEntry$Companion$DecorationTypeArr);
        Companion = new a();
    }

    public AnimatedBlockEntry$Companion$DecorationType(String str, int i, String str2) {
        this.value = str2;
    }

    public static AnimatedBlockEntry$Companion$DecorationType valueOf(String str) {
        return (AnimatedBlockEntry$Companion$DecorationType) Enum.valueOf(AnimatedBlockEntry$Companion$DecorationType.class, str);
    }

    public static AnimatedBlockEntry$Companion$DecorationType[] values() {
        return (AnimatedBlockEntry$Companion$DecorationType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
