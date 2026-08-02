package com.vk.ecomm.cart.impl.points_map.feature.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeliveryPointsMode.kt */
/* loaded from: classes18.dex */
public final class DeliveryPointsMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DeliveryPointsMode[] $VALUES;
    public static final DeliveryPointsMode SELECT_DELIVERY_POINT;
    public static final DeliveryPointsMode SHOW_DELIVERY_POINT;

    static {
        DeliveryPointsMode deliveryPointsMode = new DeliveryPointsMode("SHOW_DELIVERY_POINT", 0);
        SHOW_DELIVERY_POINT = deliveryPointsMode;
        DeliveryPointsMode deliveryPointsMode2 = new DeliveryPointsMode("SELECT_DELIVERY_POINT", 1);
        SELECT_DELIVERY_POINT = deliveryPointsMode2;
        DeliveryPointsMode[] deliveryPointsModeArr = {deliveryPointsMode, deliveryPointsMode2};
        $VALUES = deliveryPointsModeArr;
        $ENTRIES = new asp(deliveryPointsModeArr);
    }

    public DeliveryPointsMode() {
        throw null;
    }

    public static DeliveryPointsMode valueOf(String str) {
        return (DeliveryPointsMode) Enum.valueOf(DeliveryPointsMode.class, str);
    }

    public static DeliveryPointsMode[] values() {
        return (DeliveryPointsMode[]) $VALUES.clone();
    }
}
