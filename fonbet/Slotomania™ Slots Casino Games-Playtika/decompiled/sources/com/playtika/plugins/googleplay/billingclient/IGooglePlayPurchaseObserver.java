package com.playtika.plugins.googleplay.billingclient;

/* loaded from: classes8.dex */
public interface IGooglePlayPurchaseObserver {
    void onGetPurchasesCompleted(String str, Boolean bool);

    void onGetPurchasesFailed(String str, Boolean bool);

    void onInitCompleted();

    void onInitFailed();

    void onInitStarted();

    void onLaunchStoreViewCompleted(String str);

    void onLaunchStoreViewFailed(String str);

    void onPurchaseCanceled(String str);

    void onPurchaseCompleted(String str);

    void onPurchaseConsumeFailed(String str, Boolean bool);

    void onPurchaseConsumed(Boolean bool);

    void onPurchaseFailed(String str, String str2);
}
