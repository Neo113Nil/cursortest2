package com.vk.core.ui.utils;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SimpleAdapter.kt */
/* loaded from: classes17.dex */
public final class TitleColorAttr {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TitleColorAttr[] $VALUES;
    public static final TitleColorAttr DEFAULT;
    public static final TitleColorAttr DESTRUCTIVE;
    public static final TitleColorAttr SECONDARY;
    public static final TitleColorAttr SUBHEAD;
    private final int resId;

    static {
        TitleColorAttr titleColorAttr = new TitleColorAttr("DEFAULT", 0, R.attr.vk_ui_text_primary);
        DEFAULT = titleColorAttr;
        TitleColorAttr titleColorAttr2 = new TitleColorAttr("SECONDARY", 1, R.attr.vk_ui_text_secondary);
        SECONDARY = titleColorAttr2;
        TitleColorAttr titleColorAttr3 = new TitleColorAttr("DESTRUCTIVE", 2, R.attr.vk_ui_background_negative);
        DESTRUCTIVE = titleColorAttr3;
        TitleColorAttr titleColorAttr4 = new TitleColorAttr("SUBHEAD", 3, R.attr.vk_ui_text_subhead);
        SUBHEAD = titleColorAttr4;
        TitleColorAttr[] titleColorAttrArr = {titleColorAttr, titleColorAttr2, titleColorAttr3, titleColorAttr4};
        $VALUES = titleColorAttrArr;
        $ENTRIES = new asp(titleColorAttrArr);
    }

    public TitleColorAttr(String str, int i, int i2) {
        this.resId = i2;
    }

    public static TitleColorAttr valueOf(String str) {
        return (TitleColorAttr) Enum.valueOf(TitleColorAttr.class, str);
    }

    public static TitleColorAttr[] values() {
        return (TitleColorAttr[]) $VALUES.clone();
    }

    public final int h() {
        return this.resId;
    }
}
