package com.vk.profile.user.impl.ui.adapter;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserProfileAdapterItemUtils.kt */
/* loaded from: classes5.dex */
public final class MergeMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MergeMode[] $VALUES;
    public static final MergeMode Default;
    public static final MergeMode FlatMerge;
    public static final MergeMode MergeBoth;
    public static final MergeMode MergeBottom;
    public static final MergeMode MergeTop;
    private final int resId;

    static {
        MergeMode mergeMode = new MergeMode("Default", 0, R.drawable.profile_card_background);
        Default = mergeMode;
        MergeMode mergeMode2 = new MergeMode("MergeBoth", 1, R.drawable.profile_card_background_small);
        MergeBoth = mergeMode2;
        MergeMode mergeMode3 = new MergeMode("MergeTop", 2, R.drawable.profile_card_background_top_small);
        MergeTop = mergeMode3;
        MergeMode mergeMode4 = new MergeMode("MergeBottom", 3, R.drawable.profile_card_background_bottom_small);
        MergeBottom = mergeMode4;
        MergeMode mergeMode5 = new MergeMode("FlatMerge", 4, R.drawable.profile_card_background_bottom_slice);
        FlatMerge = mergeMode5;
        MergeMode[] mergeModeArr = {mergeMode, mergeMode2, mergeMode3, mergeMode4, mergeMode5};
        $VALUES = mergeModeArr;
        $ENTRIES = new asp(mergeModeArr);
    }

    public MergeMode(String str, int i, int i2) {
        this.resId = i2;
    }

    public static MergeMode valueOf(String str) {
        return (MergeMode) Enum.valueOf(MergeMode.class, str);
    }

    public static MergeMode[] values() {
        return (MergeMode[]) $VALUES.clone();
    }

    public final int h() {
        return this.resId;
    }
}
