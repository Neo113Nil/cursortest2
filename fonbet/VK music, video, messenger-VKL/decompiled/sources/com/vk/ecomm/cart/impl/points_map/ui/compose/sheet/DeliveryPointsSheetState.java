package com.vk.ecomm.cart.impl.points_map.ui.compose.sheet;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeliveryPointsSheetState.kt */
/* loaded from: classes18.dex */
public final class DeliveryPointsSheetState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DeliveryPointsSheetState[] $VALUES;
    public static final DeliveryPointsSheetState Expanded;
    public static final DeliveryPointsSheetState Half;
    public static final DeliveryPointsSheetState Hidden;
    public static final DeliveryPointsSheetState Preview;

    static {
        DeliveryPointsSheetState deliveryPointsSheetState = new DeliveryPointsSheetState("Hidden", 0);
        Hidden = deliveryPointsSheetState;
        DeliveryPointsSheetState deliveryPointsSheetState2 = new DeliveryPointsSheetState("Preview", 1);
        Preview = deliveryPointsSheetState2;
        DeliveryPointsSheetState deliveryPointsSheetState3 = new DeliveryPointsSheetState("Half", 2);
        Half = deliveryPointsSheetState3;
        DeliveryPointsSheetState deliveryPointsSheetState4 = new DeliveryPointsSheetState("Expanded", 3);
        Expanded = deliveryPointsSheetState4;
        DeliveryPointsSheetState[] deliveryPointsSheetStateArr = {deliveryPointsSheetState, deliveryPointsSheetState2, deliveryPointsSheetState3, deliveryPointsSheetState4};
        $VALUES = deliveryPointsSheetStateArr;
        $ENTRIES = new asp(deliveryPointsSheetStateArr);
    }

    public DeliveryPointsSheetState() {
        throw null;
    }

    public static zrp<DeliveryPointsSheetState> h() {
        return $ENTRIES;
    }

    public static DeliveryPointsSheetState valueOf(String str) {
        return (DeliveryPointsSheetState) Enum.valueOf(DeliveryPointsSheetState.class, str);
    }

    public static DeliveryPointsSheetState[] values() {
        return (DeliveryPointsSheetState[]) $VALUES.clone();
    }
}
