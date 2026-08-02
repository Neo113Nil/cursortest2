package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$FeedPinEntryPoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SchemeStat$FeedPinEntryPoint[] $VALUES;

    @pmi0("photo_viewer")
    public static final SchemeStat$FeedPinEntryPoint PHOTO_VIEWER;

    @pmi0("shopping_bag")
    public static final SchemeStat$FeedPinEntryPoint SHOPPING_BAG;

    @pmi0("timer")
    public static final SchemeStat$FeedPinEntryPoint TIMER;

    static {
        SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint = new SchemeStat$FeedPinEntryPoint("SHOPPING_BAG", 0);
        SHOPPING_BAG = schemeStat$FeedPinEntryPoint;
        SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint2 = new SchemeStat$FeedPinEntryPoint("PHOTO_VIEWER", 1);
        PHOTO_VIEWER = schemeStat$FeedPinEntryPoint2;
        SchemeStat$FeedPinEntryPoint schemeStat$FeedPinEntryPoint3 = new SchemeStat$FeedPinEntryPoint("TIMER", 2);
        TIMER = schemeStat$FeedPinEntryPoint3;
        SchemeStat$FeedPinEntryPoint[] schemeStat$FeedPinEntryPointArr = {schemeStat$FeedPinEntryPoint, schemeStat$FeedPinEntryPoint2, schemeStat$FeedPinEntryPoint3};
        $VALUES = schemeStat$FeedPinEntryPointArr;
        $ENTRIES = new asp(schemeStat$FeedPinEntryPointArr);
    }

    private SchemeStat$FeedPinEntryPoint(String str, int i) {
    }

    public static SchemeStat$FeedPinEntryPoint valueOf(String str) {
        return (SchemeStat$FeedPinEntryPoint) Enum.valueOf(SchemeStat$FeedPinEntryPoint.class, str);
    }

    public static SchemeStat$FeedPinEntryPoint[] values() {
        return (SchemeStat$FeedPinEntryPoint[]) $VALUES.clone();
    }
}
