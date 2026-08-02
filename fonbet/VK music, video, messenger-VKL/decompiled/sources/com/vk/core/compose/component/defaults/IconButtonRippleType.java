package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkIconButtonDefault.kt */
/* loaded from: classes17.dex */
public final class IconButtonRippleType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IconButtonRippleType[] $VALUES;
    public static final IconButtonRippleType Bounded;
    public static final IconButtonRippleType Unbounded;

    static {
        IconButtonRippleType iconButtonRippleType = new IconButtonRippleType("Bounded", 0);
        Bounded = iconButtonRippleType;
        IconButtonRippleType iconButtonRippleType2 = new IconButtonRippleType("Unbounded", 1);
        Unbounded = iconButtonRippleType2;
        IconButtonRippleType[] iconButtonRippleTypeArr = {iconButtonRippleType, iconButtonRippleType2};
        $VALUES = iconButtonRippleTypeArr;
        $ENTRIES = new asp(iconButtonRippleTypeArr);
    }

    public IconButtonRippleType() {
        throw null;
    }

    public static IconButtonRippleType valueOf(String str) {
        return (IconButtonRippleType) Enum.valueOf(IconButtonRippleType.class, str);
    }

    public static IconButtonRippleType[] values() {
        return (IconButtonRippleType[]) $VALUES.clone();
    }
}
