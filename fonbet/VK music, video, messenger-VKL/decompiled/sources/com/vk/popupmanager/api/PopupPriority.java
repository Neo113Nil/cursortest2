package com.vk.popupmanager.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupPriority.kt */
/* loaded from: classes18.dex */
public final class PopupPriority {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PopupPriority[] $VALUES;
    public static final PopupPriority HIGH;
    public static final PopupPriority NORMAL;

    static {
        PopupPriority popupPriority = new PopupPriority("HIGH", 0);
        HIGH = popupPriority;
        PopupPriority popupPriority2 = new PopupPriority("NORMAL", 1);
        NORMAL = popupPriority2;
        PopupPriority[] popupPriorityArr = {popupPriority, popupPriority2};
        $VALUES = popupPriorityArr;
        $ENTRIES = new asp(popupPriorityArr);
    }

    public PopupPriority() {
        throw null;
    }

    public static PopupPriority valueOf(String str) {
        return (PopupPriority) Enum.valueOf(PopupPriority.class, str);
    }

    public static PopupPriority[] values() {
        return (PopupPriority[]) $VALUES.clone();
    }
}
