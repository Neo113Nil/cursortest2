package com.tiktok.appevents;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class TTPurchaseInfo {
    private String eventId;
    private boolean isAutoTrack;
    private final JSONObject purchase;
    private final JSONObject skuDetails;

    public static class InvalidTTPurchaseInfoException extends Exception {
        public InvalidTTPurchaseInfoException(String str) {
            super(str);
        }
    }

    public TTPurchaseInfo(JSONObject purchase, JSONObject skuDetails) throws InvalidTTPurchaseInfoException {
        if (!isValidPurchase(purchase)) {
            throw new InvalidTTPurchaseInfoException("Not a valid purchase object");
        }
        if (!isValidSkuDetails(skuDetails)) {
            throw new InvalidTTPurchaseInfoException("Not a valid skuDetails Object");
        }
        if (!purchase.optString("productId").equals(skuDetails.optString("productId"))) {
            throw new InvalidTTPurchaseInfoException("Product Id does not match");
        }
        this.purchase = purchase;
        this.skuDetails = skuDetails;
    }

    public TTPurchaseInfo(JSONObject purchase, JSONObject skuDetails, String eventId) throws InvalidTTPurchaseInfoException {
        this(purchase, skuDetails);
        this.eventId = eventId;
    }

    public JSONObject getPurchase() {
        return this.purchase;
    }

    public JSONObject getSkuDetails() {
        return this.skuDetails;
    }

    private boolean isValidPurchase(JSONObject purchase) {
        return (purchase.isNull("orderId") || purchase.isNull("productId")) ? false : true;
    }

    private boolean isValidSkuDetails(JSONObject skuDetails) {
        return (skuDetails.isNull(FirebaseAnalytics.Param.PRICE) || skuDetails.isNull("productId")) ? false : true;
    }

    public String getEventId() {
        return this.eventId;
    }

    public boolean isAutoTrack() {
        return this.isAutoTrack;
    }

    public void setAutoTrack(boolean autoTrack) {
        this.isAutoTrack = autoTrack;
    }
}
