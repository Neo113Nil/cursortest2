package com.vk.superapp.bridges;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperappPurchasesBridge.kt */
/* loaded from: classes6.dex */
public final class SuperappPurchasesBridge$PurchaseResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperappPurchasesBridge$PurchaseResult[] $VALUES;
    public static final SuperappPurchasesBridge$PurchaseResult CANCEL;
    public static final SuperappPurchasesBridge$PurchaseResult CONNECTION_LOST;
    public static final SuperappPurchasesBridge$PurchaseResult ERROR;
    public static final SuperappPurchasesBridge$PurchaseResult SUCCESS;
    public static final SuperappPurchasesBridge$PurchaseResult UNAVAILABLE;

    static {
        SuperappPurchasesBridge$PurchaseResult superappPurchasesBridge$PurchaseResult = new SuperappPurchasesBridge$PurchaseResult("SUCCESS", 0);
        SUCCESS = superappPurchasesBridge$PurchaseResult;
        SuperappPurchasesBridge$PurchaseResult superappPurchasesBridge$PurchaseResult2 = new SuperappPurchasesBridge$PurchaseResult("ERROR", 1);
        ERROR = superappPurchasesBridge$PurchaseResult2;
        SuperappPurchasesBridge$PurchaseResult superappPurchasesBridge$PurchaseResult3 = new SuperappPurchasesBridge$PurchaseResult("CANCEL", 2);
        CANCEL = superappPurchasesBridge$PurchaseResult3;
        SuperappPurchasesBridge$PurchaseResult superappPurchasesBridge$PurchaseResult4 = new SuperappPurchasesBridge$PurchaseResult("UNAVAILABLE", 3);
        UNAVAILABLE = superappPurchasesBridge$PurchaseResult4;
        SuperappPurchasesBridge$PurchaseResult superappPurchasesBridge$PurchaseResult5 = new SuperappPurchasesBridge$PurchaseResult("CONNECTION_LOST", 4);
        CONNECTION_LOST = superappPurchasesBridge$PurchaseResult5;
        SuperappPurchasesBridge$PurchaseResult[] superappPurchasesBridge$PurchaseResultArr = {superappPurchasesBridge$PurchaseResult, superappPurchasesBridge$PurchaseResult2, superappPurchasesBridge$PurchaseResult3, superappPurchasesBridge$PurchaseResult4, superappPurchasesBridge$PurchaseResult5};
        $VALUES = superappPurchasesBridge$PurchaseResultArr;
        $ENTRIES = new asp(superappPurchasesBridge$PurchaseResultArr);
    }

    public SuperappPurchasesBridge$PurchaseResult() {
        throw null;
    }

    public static SuperappPurchasesBridge$PurchaseResult valueOf(String str) {
        return (SuperappPurchasesBridge$PurchaseResult) Enum.valueOf(SuperappPurchasesBridge$PurchaseResult.class, str);
    }

    public static SuperappPurchasesBridge$PurchaseResult[] values() {
        return (SuperappPurchasesBridge$PurchaseResult[]) $VALUES.clone();
    }
}
