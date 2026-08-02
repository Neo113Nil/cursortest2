package com.vk.inappreview.impl;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InAppReviewConditionGroup.kt */
/* loaded from: classes2.dex */
public final class InAppReviewConditionGroup {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InAppReviewConditionGroup[] $VALUES;
    public static final a Companion;
    public static final InAppReviewConditionGroup DEFAULT;
    private final String toggleValue = "default_group";

    /* compiled from: InAppReviewConditionGroup.kt */
    public static final class a {
    }

    static {
        InAppReviewConditionGroup inAppReviewConditionGroup = new InAppReviewConditionGroup();
        DEFAULT = inAppReviewConditionGroup;
        InAppReviewConditionGroup[] inAppReviewConditionGroupArr = {inAppReviewConditionGroup};
        $VALUES = inAppReviewConditionGroupArr;
        $ENTRIES = new asp(inAppReviewConditionGroupArr);
        Companion = new a();
    }

    public static InAppReviewConditionGroup valueOf(String str) {
        return (InAppReviewConditionGroup) Enum.valueOf(InAppReviewConditionGroup.class, str);
    }

    public static InAppReviewConditionGroup[] values() {
        return (InAppReviewConditionGroup[]) $VALUES.clone();
    }

    public final String h() {
        return this.toggleValue;
    }
}
