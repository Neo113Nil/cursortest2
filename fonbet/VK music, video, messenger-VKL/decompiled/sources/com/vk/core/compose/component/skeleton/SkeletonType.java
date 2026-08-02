package com.vk.core.compose.component.skeleton;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SkeletonType.kt */
/* loaded from: classes17.dex */
public final class SkeletonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SkeletonType[] $VALUES;
    public static final SkeletonType Block;
    public static final SkeletonType Circle;

    static {
        SkeletonType skeletonType = new SkeletonType("Block", 0);
        Block = skeletonType;
        SkeletonType skeletonType2 = new SkeletonType("Circle", 1);
        Circle = skeletonType2;
        SkeletonType[] skeletonTypeArr = {skeletonType, skeletonType2};
        $VALUES = skeletonTypeArr;
        $ENTRIES = new asp(skeletonTypeArr);
    }

    public SkeletonType() {
        throw null;
    }

    public static SkeletonType valueOf(String str) {
        return (SkeletonType) Enum.valueOf(SkeletonType.class, str);
    }

    public static SkeletonType[] values() {
        return (SkeletonType[]) $VALUES.clone();
    }
}
