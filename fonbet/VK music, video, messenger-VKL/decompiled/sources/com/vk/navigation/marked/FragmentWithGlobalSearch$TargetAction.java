package com.vk.navigation.marked;

import com.huawei.hms.hihealth.data.DeviceInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FragmentWithGlobalSearch.kt */
/* loaded from: classes3.dex */
public final class FragmentWithGlobalSearch$TargetAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FragmentWithGlobalSearch$TargetAction[] $VALUES;
    public static final FragmentWithGlobalSearch$TargetAction HeaderSearchIconClick;
    public static final FragmentWithGlobalSearch$TargetAction HeaderSearchQueryViewClick;
    public static final FragmentWithGlobalSearch$TargetAction LongTap;
    public static final FragmentWithGlobalSearch$TargetAction Unknown;

    static {
        FragmentWithGlobalSearch$TargetAction fragmentWithGlobalSearch$TargetAction = new FragmentWithGlobalSearch$TargetAction(DeviceInfo.STR_TYPE_UNKNOWN, 0);
        Unknown = fragmentWithGlobalSearch$TargetAction;
        FragmentWithGlobalSearch$TargetAction fragmentWithGlobalSearch$TargetAction2 = new FragmentWithGlobalSearch$TargetAction("HeaderSearchIconClick", 1);
        HeaderSearchIconClick = fragmentWithGlobalSearch$TargetAction2;
        FragmentWithGlobalSearch$TargetAction fragmentWithGlobalSearch$TargetAction3 = new FragmentWithGlobalSearch$TargetAction("HeaderSearchQueryViewClick", 2);
        HeaderSearchQueryViewClick = fragmentWithGlobalSearch$TargetAction3;
        FragmentWithGlobalSearch$TargetAction fragmentWithGlobalSearch$TargetAction4 = new FragmentWithGlobalSearch$TargetAction("LongTap", 3);
        LongTap = fragmentWithGlobalSearch$TargetAction4;
        FragmentWithGlobalSearch$TargetAction[] fragmentWithGlobalSearch$TargetActionArr = {fragmentWithGlobalSearch$TargetAction, fragmentWithGlobalSearch$TargetAction2, fragmentWithGlobalSearch$TargetAction3, fragmentWithGlobalSearch$TargetAction4};
        $VALUES = fragmentWithGlobalSearch$TargetActionArr;
        $ENTRIES = new asp(fragmentWithGlobalSearch$TargetActionArr);
    }

    public FragmentWithGlobalSearch$TargetAction() {
        throw null;
    }

    public static FragmentWithGlobalSearch$TargetAction valueOf(String str) {
        return (FragmentWithGlobalSearch$TargetAction) Enum.valueOf(FragmentWithGlobalSearch$TargetAction.class, str);
    }

    public static FragmentWithGlobalSearch$TargetAction[] values() {
        return (FragmentWithGlobalSearch$TargetAction[]) $VALUES.clone();
    }
}
