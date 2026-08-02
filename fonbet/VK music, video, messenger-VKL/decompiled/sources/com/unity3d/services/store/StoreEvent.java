package com.unity3d.services.store;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoreEvent.kt */
/* loaded from: classes14.dex */
public final class StoreEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoreEvent[] $VALUES;
    public static final StoreEvent INITIALIZATION_REQUEST_RESULT = new StoreEvent("INITIALIZATION_REQUEST_RESULT", 0);
    public static final StoreEvent INITIALIZATION_REQUEST_FAILED = new StoreEvent("INITIALIZATION_REQUEST_FAILED", 1);
    public static final StoreEvent DISCONNECTED_RESULT = new StoreEvent("DISCONNECTED_RESULT", 2);
    public static final StoreEvent PURCHASES_ON_RESUME_RESULT = new StoreEvent("PURCHASES_ON_RESUME_RESULT", 3);
    public static final StoreEvent PURCHASES_ON_RESUME_ERROR = new StoreEvent("PURCHASES_ON_RESUME_ERROR", 4);
    public static final StoreEvent PURCHASES_UPDATED_RESULT = new StoreEvent("PURCHASES_UPDATED_RESULT", 5);
    public static final StoreEvent PURCHASES_UPDATED_ERROR = new StoreEvent("PURCHASES_UPDATED_ERROR", 6);
    public static final StoreEvent PURCHASES_REQUEST_RESULT = new StoreEvent("PURCHASES_REQUEST_RESULT", 7);
    public static final StoreEvent PURCHASES_REQUEST_ERROR = new StoreEvent("PURCHASES_REQUEST_ERROR", 8);
    public static final StoreEvent PURCHASE_HISTORY_LIST_REQUEST_RESULT = new StoreEvent("PURCHASE_HISTORY_LIST_REQUEST_RESULT", 9);
    public static final StoreEvent PURCHASE_HISTORY_LIST_REQUEST_ERROR = new StoreEvent("PURCHASE_HISTORY_LIST_REQUEST_ERROR", 10);
    public static final StoreEvent SKU_DETAILS_LIST_REQUEST_RESULT = new StoreEvent("SKU_DETAILS_LIST_REQUEST_RESULT", 11);
    public static final StoreEvent SKU_DETAILS_LIST_REQUEST_ERROR = new StoreEvent("SKU_DETAILS_LIST_REQUEST_ERROR", 12);
    public static final StoreEvent IS_FEATURE_SUPPORTED_REQUEST_RESULT = new StoreEvent("IS_FEATURE_SUPPORTED_REQUEST_RESULT", 13);
    public static final StoreEvent IS_FEATURE_SUPPORTED_REQUEST_ERROR = new StoreEvent("IS_FEATURE_SUPPORTED_REQUEST_ERROR", 14);

    private static final /* synthetic */ StoreEvent[] $values() {
        return new StoreEvent[]{INITIALIZATION_REQUEST_RESULT, INITIALIZATION_REQUEST_FAILED, DISCONNECTED_RESULT, PURCHASES_ON_RESUME_RESULT, PURCHASES_ON_RESUME_ERROR, PURCHASES_UPDATED_RESULT, PURCHASES_UPDATED_ERROR, PURCHASES_REQUEST_RESULT, PURCHASES_REQUEST_ERROR, PURCHASE_HISTORY_LIST_REQUEST_RESULT, PURCHASE_HISTORY_LIST_REQUEST_ERROR, SKU_DETAILS_LIST_REQUEST_RESULT, SKU_DETAILS_LIST_REQUEST_ERROR, IS_FEATURE_SUPPORTED_REQUEST_RESULT, IS_FEATURE_SUPPORTED_REQUEST_ERROR};
    }

    static {
        StoreEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private StoreEvent(String str, int i) {
    }

    public static zrp<StoreEvent> getEntries() {
        return $ENTRIES;
    }

    public static StoreEvent valueOf(String str) {
        return (StoreEvent) Enum.valueOf(StoreEvent.class, str);
    }

    public static StoreEvent[] values() {
        return (StoreEvent[]) $VALUES.clone();
    }
}
