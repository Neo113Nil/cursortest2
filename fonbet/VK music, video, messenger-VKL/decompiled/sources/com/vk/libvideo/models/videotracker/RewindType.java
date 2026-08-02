package com.vk.libvideo.models.videotracker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RewindType.kt */
/* loaded from: classes3.dex */
public final class RewindType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RewindType[] $VALUES;
    public static final RewindType DOUBLE_TAP;
    public static final RewindType SLIDER;

    static {
        RewindType rewindType = new RewindType("SLIDER", 0);
        SLIDER = rewindType;
        RewindType rewindType2 = new RewindType("DOUBLE_TAP", 1);
        DOUBLE_TAP = rewindType2;
        RewindType[] rewindTypeArr = {rewindType, rewindType2};
        $VALUES = rewindTypeArr;
        $ENTRIES = new asp(rewindTypeArr);
    }

    public RewindType() {
        throw null;
    }

    public static RewindType valueOf(String str) {
        return (RewindType) Enum.valueOf(RewindType.class, str);
    }

    public static RewindType[] values() {
        return (RewindType[]) $VALUES.clone();
    }
}
