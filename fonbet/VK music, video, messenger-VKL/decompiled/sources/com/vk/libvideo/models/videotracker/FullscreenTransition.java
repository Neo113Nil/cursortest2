package com.vk.libvideo.models.videotracker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FullscreenTransition.kt */
/* loaded from: classes3.dex */
public final class FullscreenTransition {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FullscreenTransition[] $VALUES;
    public static final FullscreenTransition SCREEN_ROTATION;
    public static final FullscreenTransition TAP;

    static {
        FullscreenTransition fullscreenTransition = new FullscreenTransition("TAP", 0);
        TAP = fullscreenTransition;
        FullscreenTransition fullscreenTransition2 = new FullscreenTransition("SCREEN_ROTATION", 1);
        SCREEN_ROTATION = fullscreenTransition2;
        FullscreenTransition[] fullscreenTransitionArr = {fullscreenTransition, fullscreenTransition2};
        $VALUES = fullscreenTransitionArr;
        $ENTRIES = new asp(fullscreenTransitionArr);
    }

    public FullscreenTransition() {
        throw null;
    }

    public static FullscreenTransition valueOf(String str) {
        return (FullscreenTransition) Enum.valueOf(FullscreenTransition.class, str);
    }

    public static FullscreenTransition[] values() {
        return (FullscreenTransition[]) $VALUES.clone();
    }
}
