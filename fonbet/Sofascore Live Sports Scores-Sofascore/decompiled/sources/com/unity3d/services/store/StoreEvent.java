package com.unity3d.services.store;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/services/store/StoreEvent;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZATION_REQUEST_RESULT", "INITIALIZATION_REQUEST_FAILED", "DISCONNECTED_RESULT", "PURCHASES_ON_RESUME_RESULT", "PURCHASES_ON_RESUME_ERROR", "PURCHASES_UPDATED_RESULT", "PURCHASES_UPDATED_ERROR", "PURCHASES_REQUEST_RESULT", "PURCHASES_REQUEST_ERROR", "PURCHASE_HISTORY_LIST_REQUEST_RESULT", "PURCHASE_HISTORY_LIST_REQUEST_ERROR", "SKU_DETAILS_LIST_REQUEST_RESULT", "SKU_DETAILS_LIST_REQUEST_ERROR", "IS_FEATURE_SUPPORTED_REQUEST_RESULT", "IS_FEATURE_SUPPORTED_REQUEST_ERROR", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoreEvent {
    private static final /* synthetic */ jp5 $ENTRIES;
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
        $ENTRIES = gz8.G($values);
    }

    private StoreEvent(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static StoreEvent valueOf(String str) {
        return (StoreEvent) Enum.valueOf(StoreEvent.class, str);
    }

    public static StoreEvent[] values() {
        return (StoreEvent[]) $VALUES.clone();
    }
}
