package com.vk.clips.upload.vk.ui.impl.fragment.utils.resulter;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActivityResultType.kt */
/* loaded from: classes17.dex */
public final class ActivityResultType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActivityResultType[] $VALUES;
    public static final ActivityResultType AttachVideo;
    public static final ActivityResultType CoverSelector;
    public static final ActivityResultType Editor;
    public static final ActivityResultType MarketItem;
    public static final ActivityResultType Preview;

    static {
        ActivityResultType activityResultType = new ActivityResultType("AttachVideo", 0);
        AttachVideo = activityResultType;
        ActivityResultType activityResultType2 = new ActivityResultType("Preview", 1);
        Preview = activityResultType2;
        ActivityResultType activityResultType3 = new ActivityResultType("MarketItem", 2);
        MarketItem = activityResultType3;
        ActivityResultType activityResultType4 = new ActivityResultType("Editor", 3);
        Editor = activityResultType4;
        ActivityResultType activityResultType5 = new ActivityResultType("CoverSelector", 4);
        CoverSelector = activityResultType5;
        ActivityResultType[] activityResultTypeArr = {activityResultType, activityResultType2, activityResultType3, activityResultType4, activityResultType5};
        $VALUES = activityResultTypeArr;
        $ENTRIES = new asp(activityResultTypeArr);
    }

    public ActivityResultType() {
        throw null;
    }

    public static zrp<ActivityResultType> h() {
        return $ENTRIES;
    }

    public static ActivityResultType valueOf(String str) {
        return (ActivityResultType) Enum.valueOf(ActivityResultType.class, str);
    }

    public static ActivityResultType[] values() {
        return (ActivityResultType[]) $VALUES.clone();
    }
}
