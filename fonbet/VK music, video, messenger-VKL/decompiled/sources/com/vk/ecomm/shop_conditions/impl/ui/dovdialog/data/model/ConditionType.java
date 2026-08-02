package com.vk.ecomm.shop_conditions.impl.ui.dovdialog.data.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShopConditionParams.kt */
/* loaded from: classes18.dex */
public final class ConditionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ConditionType[] $VALUES;
    public static final ConditionType DELIVERY;
    public static final ConditionType OZON;
    public static final ConditionType PARTNER_INTEGRATION;
    public static final ConditionType PAYMENT;
    public static final ConditionType REFUND;

    static {
        ConditionType conditionType = new ConditionType("OZON", 0);
        OZON = conditionType;
        ConditionType conditionType2 = new ConditionType("PARTNER_INTEGRATION", 1);
        PARTNER_INTEGRATION = conditionType2;
        ConditionType conditionType3 = new ConditionType("DELIVERY", 2);
        DELIVERY = conditionType3;
        ConditionType conditionType4 = new ConditionType("PAYMENT", 3);
        PAYMENT = conditionType4;
        ConditionType conditionType5 = new ConditionType("REFUND", 4);
        REFUND = conditionType5;
        ConditionType[] conditionTypeArr = {conditionType, conditionType2, conditionType3, conditionType4, conditionType5};
        $VALUES = conditionTypeArr;
        $ENTRIES = new asp(conditionTypeArr);
    }

    public ConditionType() {
        throw null;
    }

    public static ConditionType valueOf(String str) {
        return (ConditionType) Enum.valueOf(ConditionType.class, str);
    }

    public static ConditionType[] values() {
        return (ConditionType[]) $VALUES.clone();
    }
}
