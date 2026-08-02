package com.vk.clips.viewer.impl.feed.wrapper.presentation.event;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsWrapperToolbarHintEvent.kt */
/* loaded from: classes17.dex */
public final class ClipsWrapperHintButtonPosition {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsWrapperHintButtonPosition[] $VALUES;
    public static final ClipsWrapperHintButtonPosition Extra;
    public static final ClipsWrapperHintButtonPosition Main;

    static {
        ClipsWrapperHintButtonPosition clipsWrapperHintButtonPosition = new ClipsWrapperHintButtonPosition("Main", 0);
        Main = clipsWrapperHintButtonPosition;
        ClipsWrapperHintButtonPosition clipsWrapperHintButtonPosition2 = new ClipsWrapperHintButtonPosition("Extra", 1);
        Extra = clipsWrapperHintButtonPosition2;
        ClipsWrapperHintButtonPosition[] clipsWrapperHintButtonPositionArr = {clipsWrapperHintButtonPosition, clipsWrapperHintButtonPosition2};
        $VALUES = clipsWrapperHintButtonPositionArr;
        $ENTRIES = new asp(clipsWrapperHintButtonPositionArr);
    }

    public ClipsWrapperHintButtonPosition() {
        throw null;
    }

    public static ClipsWrapperHintButtonPosition valueOf(String str) {
        return (ClipsWrapperHintButtonPosition) Enum.valueOf(ClipsWrapperHintButtonPosition.class, str);
    }

    public static ClipsWrapperHintButtonPosition[] values() {
        return (ClipsWrapperHintButtonPosition[]) $VALUES.clone();
    }
}
