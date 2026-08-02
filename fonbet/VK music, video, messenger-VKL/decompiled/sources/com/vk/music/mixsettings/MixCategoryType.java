package com.vk.music.mixsettings;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MixCategoryType.kt */
/* loaded from: classes3.dex */
public final class MixCategoryType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MixCategoryType[] $VALUES;
    public static final MixCategoryType BUTTONS;
    public static final MixCategoryType HIDDEN;
    public static final MixCategoryType ICONS;
    private final String type;

    static {
        MixCategoryType mixCategoryType = new MixCategoryType("BUTTONS", 0, "button_horizontal_group");
        BUTTONS = mixCategoryType;
        MixCategoryType mixCategoryType2 = new MixCategoryType("ICONS", 1, "pictured_button_horizontal_group");
        ICONS = mixCategoryType2;
        MixCategoryType mixCategoryType3 = new MixCategoryType("HIDDEN", 2, "hidden_button_horizontal_group");
        HIDDEN = mixCategoryType3;
        MixCategoryType[] mixCategoryTypeArr = {mixCategoryType, mixCategoryType2, mixCategoryType3};
        $VALUES = mixCategoryTypeArr;
        $ENTRIES = new asp(mixCategoryTypeArr);
    }

    public MixCategoryType(String str, int i, String str2) {
        this.type = str2;
    }

    public static zrp<MixCategoryType> h() {
        return $ENTRIES;
    }

    public static MixCategoryType valueOf(String str) {
        return (MixCategoryType) Enum.valueOf(MixCategoryType.class, str);
    }

    public static MixCategoryType[] values() {
        return (MixCategoryType[]) $VALUES.clone();
    }

    public final String i() {
        return this.type;
    }
}
