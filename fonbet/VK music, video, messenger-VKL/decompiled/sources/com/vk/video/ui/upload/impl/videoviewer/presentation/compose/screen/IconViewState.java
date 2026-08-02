package com.vk.video.ui.upload.impl.videoviewer.presentation.compose.screen;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScreenViewState.kt */
/* loaded from: classes7.dex */
public final class IconViewState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IconViewState[] $VALUES;
    public static final IconViewState ARROW_LEFT;
    public static final IconViewState CANCEL;
    public static final IconViewState CHECK;

    static {
        IconViewState iconViewState = new IconViewState("ARROW_LEFT", 0);
        ARROW_LEFT = iconViewState;
        IconViewState iconViewState2 = new IconViewState("CHECK", 1);
        CHECK = iconViewState2;
        IconViewState iconViewState3 = new IconViewState("CANCEL", 2);
        CANCEL = iconViewState3;
        IconViewState[] iconViewStateArr = {iconViewState, iconViewState2, iconViewState3};
        $VALUES = iconViewStateArr;
        $ENTRIES = new asp(iconViewStateArr);
    }

    public IconViewState() {
        throw null;
    }

    public static IconViewState valueOf(String str) {
        return (IconViewState) Enum.valueOf(IconViewState.class, str);
    }

    public static IconViewState[] values() {
        return (IconViewState[]) $VALUES.clone();
    }
}
