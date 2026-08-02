package com.vk.superapp.common.js.bridge.api.events;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: GetPurchaseBundles.kt */
/* loaded from: classes6.dex */
public final class GetPurchaseBundles$StoreItemInfo {

    @pmi0("id")
    private final String id;

    @pmi0("price")
    private final int price;

    @pmi0("purchase_type")
    private final String purchaseType;

    @pmi0("store_price")
    private final String storePrice;

    @pmi0("title")
    private final String title;

    public GetPurchaseBundles$StoreItemInfo(String str, int i, String str2, String str3, String str4) {
        this.id = str;
        this.price = i;
        this.storePrice = str2;
        this.title = str3;
        this.purchaseType = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPurchaseBundles$StoreItemInfo)) {
            return false;
        }
        GetPurchaseBundles$StoreItemInfo getPurchaseBundles$StoreItemInfo = (GetPurchaseBundles$StoreItemInfo) obj;
        return epx.f(this.id, getPurchaseBundles$StoreItemInfo.id) && this.price == getPurchaseBundles$StoreItemInfo.price && epx.f(this.storePrice, getPurchaseBundles$StoreItemInfo.storePrice) && epx.f(this.title, getPurchaseBundles$StoreItemInfo.title) && epx.f(this.purchaseType, getPurchaseBundles$StoreItemInfo.purchaseType);
    }

    public final int hashCode() {
        return this.purchaseType.hashCode() + urd0.a(urd0.a(shy.a(this.price, this.id.hashCode() * 31, 31), 31, this.storePrice), 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreItemInfo(id=");
        sb.append(this.id);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", storePrice=");
        sb.append(this.storePrice);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", purchaseType=");
        return ho8.a(sb, this.purchaseType, ')');
    }
}
