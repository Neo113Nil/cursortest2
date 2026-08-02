package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSegmentedControlDefaults.kt */
/* loaded from: classes17.dex */
public final class SegmentSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SegmentSize[] $VALUES;
    public static final SegmentSize Large;
    public static final SegmentSize Medium;

    static {
        SegmentSize segmentSize = new SegmentSize("Medium", 0);
        Medium = segmentSize;
        SegmentSize segmentSize2 = new SegmentSize("Large", 1);
        Large = segmentSize2;
        SegmentSize[] segmentSizeArr = {segmentSize, segmentSize2};
        $VALUES = segmentSizeArr;
        $ENTRIES = new asp(segmentSizeArr);
    }

    public SegmentSize() {
        throw null;
    }

    public static SegmentSize valueOf(String str) {
        return (SegmentSize) Enum.valueOf(SegmentSize.class, str);
    }

    public static SegmentSize[] values() {
        return (SegmentSize[]) $VALUES.clone();
    }
}
