package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.utils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EcoplateElementViewType.kt */
/* loaded from: classes6.dex */
public final class EcoplateElementViewType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EcoplateElementViewType[] $VALUES;
    public static final EcoplateElementViewType AVATAR;
    public static final EcoplateElementViewType INFO;
    public static final EcoplateElementViewType LK_BUTTON;
    public static final EcoplateElementViewType LOGOUT_BUTTON;
    public static final EcoplateElementViewType NAME;

    static {
        EcoplateElementViewType ecoplateElementViewType = new EcoplateElementViewType("AVATAR", 0);
        AVATAR = ecoplateElementViewType;
        EcoplateElementViewType ecoplateElementViewType2 = new EcoplateElementViewType("NAME", 1);
        NAME = ecoplateElementViewType2;
        EcoplateElementViewType ecoplateElementViewType3 = new EcoplateElementViewType("INFO", 2);
        INFO = ecoplateElementViewType3;
        EcoplateElementViewType ecoplateElementViewType4 = new EcoplateElementViewType("LK_BUTTON", 3);
        LK_BUTTON = ecoplateElementViewType4;
        EcoplateElementViewType ecoplateElementViewType5 = new EcoplateElementViewType("LOGOUT_BUTTON", 4);
        LOGOUT_BUTTON = ecoplateElementViewType5;
        EcoplateElementViewType[] ecoplateElementViewTypeArr = {ecoplateElementViewType, ecoplateElementViewType2, ecoplateElementViewType3, ecoplateElementViewType4, ecoplateElementViewType5};
        $VALUES = ecoplateElementViewTypeArr;
        $ENTRIES = new asp(ecoplateElementViewTypeArr);
    }

    public EcoplateElementViewType() {
        throw null;
    }

    public static EcoplateElementViewType valueOf(String str) {
        return (EcoplateElementViewType) Enum.valueOf(EcoplateElementViewType.class, str);
    }

    public static EcoplateElementViewType[] values() {
        return (EcoplateElementViewType[]) $VALUES.clone();
    }
}
