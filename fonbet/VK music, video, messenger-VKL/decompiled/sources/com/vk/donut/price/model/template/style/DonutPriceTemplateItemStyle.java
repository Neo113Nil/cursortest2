package com.vk.donut.price.model.template.style;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutPriceTemplateItemStyle.kt */
/* loaded from: classes18.dex */
public final class DonutPriceTemplateItemStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutPriceTemplateItemStyle[] $VALUES;
    public static final DonutPriceTemplateItemStyle SECONDARY;

    static {
        DonutPriceTemplateItemStyle donutPriceTemplateItemStyle = new DonutPriceTemplateItemStyle("SECONDARY", 0);
        SECONDARY = donutPriceTemplateItemStyle;
        DonutPriceTemplateItemStyle[] donutPriceTemplateItemStyleArr = {donutPriceTemplateItemStyle};
        $VALUES = donutPriceTemplateItemStyleArr;
        $ENTRIES = new asp(donutPriceTemplateItemStyleArr);
    }

    public DonutPriceTemplateItemStyle() {
        throw null;
    }

    public static DonutPriceTemplateItemStyle valueOf(String str) {
        return (DonutPriceTemplateItemStyle) Enum.valueOf(DonutPriceTemplateItemStyle.class, str);
    }

    public static DonutPriceTemplateItemStyle[] values() {
        return (DonutPriceTemplateItemStyle[]) $VALUES.clone();
    }
}
