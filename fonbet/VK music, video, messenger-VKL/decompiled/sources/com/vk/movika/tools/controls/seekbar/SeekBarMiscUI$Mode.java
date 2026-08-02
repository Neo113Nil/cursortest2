package com.vk.movika.tools.controls.seekbar;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SeekBarMiscUI$Mode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SeekBarMiscUI$Mode[] $VALUES;
    public static final SeekBarMiscUI$Mode COMMON;
    public static final SeekBarMiscUI$Mode SEEK;

    static {
        SeekBarMiscUI$Mode seekBarMiscUI$Mode = new SeekBarMiscUI$Mode("COMMON", 0);
        COMMON = seekBarMiscUI$Mode;
        SeekBarMiscUI$Mode seekBarMiscUI$Mode2 = new SeekBarMiscUI$Mode("SEEK", 1);
        SEEK = seekBarMiscUI$Mode2;
        SeekBarMiscUI$Mode[] seekBarMiscUI$ModeArr = {seekBarMiscUI$Mode, seekBarMiscUI$Mode2};
        $VALUES = seekBarMiscUI$ModeArr;
        $ENTRIES = new asp(seekBarMiscUI$ModeArr);
    }

    public SeekBarMiscUI$Mode() {
        throw null;
    }

    public static SeekBarMiscUI$Mode valueOf(String str) {
        return (SeekBarMiscUI$Mode) Enum.valueOf(SeekBarMiscUI$Mode.class, str);
    }

    public static SeekBarMiscUI$Mode[] values() {
        return (SeekBarMiscUI$Mode[]) $VALUES.clone();
    }
}
