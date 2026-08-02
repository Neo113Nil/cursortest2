package com.vk.ecomm.cart.impl.cart.feature.state;

import com.huawei.hms.hihealth.data.DeviceInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CartState.kt */
/* loaded from: classes18.dex */
public final class DeliveryOptionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DeliveryOptionType[] $VALUES;
    public static final DeliveryOptionType Courier;
    public static final DeliveryOptionType DeliveryPoint;
    public static final DeliveryOptionType Post;
    public static final DeliveryOptionType PostInternational;
    public static final DeliveryOptionType Self;
    public static final DeliveryOptionType Unknown;

    static {
        DeliveryOptionType deliveryOptionType = new DeliveryOptionType("Post", 0);
        Post = deliveryOptionType;
        DeliveryOptionType deliveryOptionType2 = new DeliveryOptionType("DeliveryPoint", 1);
        DeliveryPoint = deliveryOptionType2;
        DeliveryOptionType deliveryOptionType3 = new DeliveryOptionType("PostInternational", 2);
        PostInternational = deliveryOptionType3;
        DeliveryOptionType deliveryOptionType4 = new DeliveryOptionType("Courier", 3);
        Courier = deliveryOptionType4;
        DeliveryOptionType deliveryOptionType5 = new DeliveryOptionType("Self", 4);
        Self = deliveryOptionType5;
        DeliveryOptionType deliveryOptionType6 = new DeliveryOptionType(DeviceInfo.STR_TYPE_UNKNOWN, 5);
        Unknown = deliveryOptionType6;
        DeliveryOptionType[] deliveryOptionTypeArr = {deliveryOptionType, deliveryOptionType2, deliveryOptionType3, deliveryOptionType4, deliveryOptionType5, deliveryOptionType6};
        $VALUES = deliveryOptionTypeArr;
        $ENTRIES = new asp(deliveryOptionTypeArr);
    }

    public DeliveryOptionType() {
        throw null;
    }

    public static DeliveryOptionType valueOf(String str) {
        return (DeliveryOptionType) Enum.valueOf(DeliveryOptionType.class, str);
    }

    public static DeliveryOptionType[] values() {
        return (DeliveryOptionType[]) $VALUES.clone();
    }
}
