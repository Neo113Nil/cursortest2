package com.vk.music.stickyplayer.presentation.components.radio;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RadioPlayerSheetTab.kt */
/* loaded from: classes3.dex */
public final class RadioPlayerSheetTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RadioPlayerSheetTab[] $VALUES;
    public static final RadioPlayerSheetTab QUEUE;

    static {
        RadioPlayerSheetTab radioPlayerSheetTab = new RadioPlayerSheetTab("QUEUE", 0);
        QUEUE = radioPlayerSheetTab;
        RadioPlayerSheetTab[] radioPlayerSheetTabArr = {radioPlayerSheetTab};
        $VALUES = radioPlayerSheetTabArr;
        $ENTRIES = new asp(radioPlayerSheetTabArr);
    }

    public RadioPlayerSheetTab() {
        throw null;
    }

    public static RadioPlayerSheetTab valueOf(String str) {
        return (RadioPlayerSheetTab) Enum.valueOf(RadioPlayerSheetTab.class, str);
    }

    public static RadioPlayerSheetTab[] values() {
        return (RadioPlayerSheetTab[]) $VALUES.clone();
    }
}
