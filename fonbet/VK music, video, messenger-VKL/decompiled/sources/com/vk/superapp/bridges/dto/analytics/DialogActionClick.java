package com.vk.superapp.bridges.dto.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DialogActionClick.kt */
/* loaded from: classes6.dex */
public final class DialogActionClick {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DialogActionClick[] $VALUES;
    public static final DialogActionClick RECOMMENDATION_MODAL_CANCEL;
    public static final DialogActionClick RECOMMENDATION_MODAL_RECOMMEND;

    static {
        DialogActionClick dialogActionClick = new DialogActionClick("RECOMMENDATION_MODAL_RECOMMEND", 0);
        RECOMMENDATION_MODAL_RECOMMEND = dialogActionClick;
        DialogActionClick dialogActionClick2 = new DialogActionClick("RECOMMENDATION_MODAL_CANCEL", 1);
        RECOMMENDATION_MODAL_CANCEL = dialogActionClick2;
        DialogActionClick[] dialogActionClickArr = {dialogActionClick, dialogActionClick2};
        $VALUES = dialogActionClickArr;
        $ENTRIES = new asp(dialogActionClickArr);
    }

    public DialogActionClick() {
        throw null;
    }

    public static DialogActionClick valueOf(String str) {
        return (DialogActionClick) Enum.valueOf(DialogActionClick.class, str);
    }

    public static DialogActionClick[] values() {
        return (DialogActionClick[]) $VALUES.clone();
    }
}
