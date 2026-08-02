package com.vk.im.engine.models.stories;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImStoryState.kt */
/* loaded from: classes2.dex */
public final class ImStoryState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImStoryState[] $VALUES;
    public static final a Companion;
    public static final ImStoryState NEW;
    public static final ImStoryState NONE;
    public static final ImStoryState SEEN;
    private final int typeAsInt;

    /* compiled from: ImStoryState.kt */
    public static final class a {
    }

    static {
        ImStoryState imStoryState = new ImStoryState("NONE", 0, 0);
        NONE = imStoryState;
        ImStoryState imStoryState2 = new ImStoryState("NEW", 1, 1);
        NEW = imStoryState2;
        ImStoryState imStoryState3 = new ImStoryState("SEEN", 2, 2);
        SEEN = imStoryState3;
        ImStoryState[] imStoryStateArr = {imStoryState, imStoryState2, imStoryState3};
        $VALUES = imStoryStateArr;
        $ENTRIES = new asp(imStoryStateArr);
        Companion = new a();
    }

    public ImStoryState(String str, int i, int i2) {
        this.typeAsInt = i2;
    }

    public static ImStoryState valueOf(String str) {
        return (ImStoryState) Enum.valueOf(ImStoryState.class, str);
    }

    public static ImStoryState[] values() {
        return (ImStoryState[]) $VALUES.clone();
    }

    public final int h() {
        return this.typeAsInt;
    }

    public final boolean i() {
        return this == SEEN || this == NEW;
    }
}
