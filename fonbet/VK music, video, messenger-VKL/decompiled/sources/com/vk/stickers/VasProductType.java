package com.vk.stickers;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VasProductType.kt */
/* loaded from: classes5.dex */
public final class VasProductType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VasProductType[] $VALUES;
    public static final VasProductType GIFT;
    public static final VasProductType STICKER;

    static {
        VasProductType vasProductType = new VasProductType("GIFT", 0);
        GIFT = vasProductType;
        VasProductType vasProductType2 = new VasProductType("STICKER", 1);
        STICKER = vasProductType2;
        VasProductType[] vasProductTypeArr = {vasProductType, vasProductType2};
        $VALUES = vasProductTypeArr;
        $ENTRIES = new asp(vasProductTypeArr);
    }

    public VasProductType() {
        throw null;
    }

    public static VasProductType valueOf(String str) {
        return (VasProductType) Enum.valueOf(VasProductType.class, str);
    }

    public static VasProductType[] values() {
        return (VasProductType[]) $VALUES.clone();
    }
}
