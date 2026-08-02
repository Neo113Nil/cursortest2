package com.vk.clips.design.view.component.video.seekbar.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SeekBarUpdateMode.kt */
/* loaded from: classes16.dex */
public final class SeekBarUpdateMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SeekBarUpdateMode[] $VALUES;
    public static final SeekBarUpdateMode ANIMATED;
    public static final SeekBarUpdateMode MANUAL;

    static {
        SeekBarUpdateMode seekBarUpdateMode = new SeekBarUpdateMode("MANUAL", 0);
        MANUAL = seekBarUpdateMode;
        SeekBarUpdateMode seekBarUpdateMode2 = new SeekBarUpdateMode("ANIMATED", 1);
        ANIMATED = seekBarUpdateMode2;
        SeekBarUpdateMode[] seekBarUpdateModeArr = {seekBarUpdateMode, seekBarUpdateMode2};
        $VALUES = seekBarUpdateModeArr;
        $ENTRIES = new asp(seekBarUpdateModeArr);
    }

    public SeekBarUpdateMode() {
        throw null;
    }

    public static SeekBarUpdateMode valueOf(String str) {
        return (SeekBarUpdateMode) Enum.valueOf(SeekBarUpdateMode.class, str);
    }

    public static SeekBarUpdateMode[] values() {
        return (SeekBarUpdateMode[]) $VALUES.clone();
    }
}
