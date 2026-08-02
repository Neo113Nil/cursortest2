package com.vk.libvideo.ui;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubsVisibilityController.kt */
/* loaded from: classes3.dex */
public final class SubsShowBlocker {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubsShowBlocker[] $VALUES;
    public static final SubsShowBlocker ADS;
    public static final SubsShowBlocker MINIMIZABLE_STATE;
    public static final SubsShowBlocker PIP;
    public static final SubsShowBlocker SEEKBAR;

    static {
        SubsShowBlocker subsShowBlocker = new SubsShowBlocker("MINIMIZABLE_STATE", 0);
        MINIMIZABLE_STATE = subsShowBlocker;
        SubsShowBlocker subsShowBlocker2 = new SubsShowBlocker("ADS", 1);
        ADS = subsShowBlocker2;
        SubsShowBlocker subsShowBlocker3 = new SubsShowBlocker("PIP", 2);
        PIP = subsShowBlocker3;
        SubsShowBlocker subsShowBlocker4 = new SubsShowBlocker("SEEKBAR", 3);
        SEEKBAR = subsShowBlocker4;
        SubsShowBlocker[] subsShowBlockerArr = {subsShowBlocker, subsShowBlocker2, subsShowBlocker3, subsShowBlocker4};
        $VALUES = subsShowBlockerArr;
        $ENTRIES = new asp(subsShowBlockerArr);
    }

    public SubsShowBlocker() {
        throw null;
    }

    public static SubsShowBlocker valueOf(String str) {
        return (SubsShowBlocker) Enum.valueOf(SubsShowBlocker.class, str);
    }

    public static SubsShowBlocker[] values() {
        return (SubsShowBlocker[]) $VALUES.clone();
    }
}
