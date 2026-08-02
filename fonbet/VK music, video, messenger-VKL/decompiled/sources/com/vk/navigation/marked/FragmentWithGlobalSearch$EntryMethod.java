package com.vk.navigation.marked;

import com.huawei.hms.hihealth.data.DeviceInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FragmentWithGlobalSearch.kt */
/* loaded from: classes3.dex */
public final class FragmentWithGlobalSearch$EntryMethod {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FragmentWithGlobalSearch$EntryMethod[] $VALUES;
    public static final a Companion;
    public static final FragmentWithGlobalSearch$EntryMethod FeedScreenSearchIcon;
    public static final FragmentWithGlobalSearch$EntryMethod HomeBottomIconLongTap;
    public static final FragmentWithGlobalSearch$EntryMethod LeftTabletMenuSearchIconClick;
    public static final FragmentWithGlobalSearch$EntryMethod OtherTab;
    public static final FragmentWithGlobalSearch$EntryMethod OverviewBottomIconLongTap;
    public static final FragmentWithGlobalSearch$EntryMethod OverviewScreenSearchIcon;
    public static final FragmentWithGlobalSearch$EntryMethod SuperAppBottomIconLongTap;
    public static final FragmentWithGlobalSearch$EntryMethod SuperAppScreenQueryView;
    public static final FragmentWithGlobalSearch$EntryMethod SuperAppScreenSearchIcon;
    public static final FragmentWithGlobalSearch$EntryMethod Unknown;

    /* compiled from: FragmentWithGlobalSearch.kt */
    public static final class a {
        public static void a(int i) {
        }
    }

    static {
        FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod = new FragmentWithGlobalSearch$EntryMethod(DeviceInfo.STR_TYPE_UNKNOWN, 0);
        Unknown = fragmentWithGlobalSearch$EntryMethod;
        FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod2 = new FragmentWithGlobalSearch$EntryMethod("OtherTab", 1);
        OtherTab = fragmentWithGlobalSearch$EntryMethod2;
        FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod3 = new FragmentWithGlobalSearch$EntryMethod("LeftTabletMenuSearchIconClick", 2);
        LeftTabletMenuSearchIconClick = fragmentWithGlobalSearch$EntryMethod3;
        FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod4 = new FragmentWithGlobalSearch$EntryMethod("FeedScreenSearchIcon", 3);
        FeedScreenSearchIcon = fragmentWithGlobalSearch$EntryMethod4;
        FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod5 = new FragmentWithGlobalSearch$EntryMethod("SuperAppScreenSearchIcon", 4);
        SuperAppScreenSearchIcon = fragmentWithGlobalSearch$EntryMethod5;
        FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod6 = new FragmentWithGlobalSearch$EntryMethod("SuperAppScreenQueryView", 5);
        SuperAppScreenQueryView = fragmentWithGlobalSearch$EntryMethod6;
        FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod7 = new FragmentWithGlobalSearch$EntryMethod("HomeBottomIconLongTap", 6);
        HomeBottomIconLongTap = fragmentWithGlobalSearch$EntryMethod7;
        FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod8 = new FragmentWithGlobalSearch$EntryMethod("SuperAppBottomIconLongTap", 7);
        SuperAppBottomIconLongTap = fragmentWithGlobalSearch$EntryMethod8;
        FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod9 = new FragmentWithGlobalSearch$EntryMethod("OverviewScreenSearchIcon", 8);
        OverviewScreenSearchIcon = fragmentWithGlobalSearch$EntryMethod9;
        FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod10 = new FragmentWithGlobalSearch$EntryMethod("OverviewBottomIconLongTap", 9);
        OverviewBottomIconLongTap = fragmentWithGlobalSearch$EntryMethod10;
        FragmentWithGlobalSearch$EntryMethod[] fragmentWithGlobalSearch$EntryMethodArr = {fragmentWithGlobalSearch$EntryMethod, fragmentWithGlobalSearch$EntryMethod2, fragmentWithGlobalSearch$EntryMethod3, fragmentWithGlobalSearch$EntryMethod4, fragmentWithGlobalSearch$EntryMethod5, fragmentWithGlobalSearch$EntryMethod6, fragmentWithGlobalSearch$EntryMethod7, fragmentWithGlobalSearch$EntryMethod8, fragmentWithGlobalSearch$EntryMethod9, fragmentWithGlobalSearch$EntryMethod10};
        $VALUES = fragmentWithGlobalSearch$EntryMethodArr;
        $ENTRIES = new asp(fragmentWithGlobalSearch$EntryMethodArr);
        Companion = new a();
    }

    public FragmentWithGlobalSearch$EntryMethod() {
        throw null;
    }

    public static FragmentWithGlobalSearch$EntryMethod valueOf(String str) {
        return (FragmentWithGlobalSearch$EntryMethod) Enum.valueOf(FragmentWithGlobalSearch$EntryMethod.class, str);
    }

    public static FragmentWithGlobalSearch$EntryMethod[] values() {
        return (FragmentWithGlobalSearch$EntryMethod[]) $VALUES.clone();
    }
}
