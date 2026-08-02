package com.vk.superapp.common.js.bridge.api.events;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GetPurchaseBundles.kt */
/* loaded from: classes6.dex */
public final class GetPurchaseBundles$StoreSubInfo {

    @pmi0("id")
    private final String id;

    @pmi0("period")
    private final String period;

    @pmi0("price")
    private final int price;

    @pmi0("purchase_type")
    private final String purchaseType;

    @pmi0("store_price")
    private final String storePrice;

    @pmi0("title")
    private final String title;

    @pmi0("trial")
    private final Trial trial;

    /* compiled from: GetPurchaseBundles.kt */
    public static final class Trial {

        @pmi0("duration")
        private final String duration;

        @pmi0("store_price")
        private final String storePrice;

        public Trial(String str, String str2) {
            this.storePrice = str;
            this.duration = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Trial)) {
                return false;
            }
            Trial trial = (Trial) obj;
            return epx.f(this.storePrice, trial.storePrice) && epx.f(this.duration, trial.duration);
        }

        public final int hashCode() {
            return this.duration.hashCode() + (this.storePrice.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Trial(storePrice=");
            sb.append(this.storePrice);
            sb.append(", duration=");
            return ho8.a(sb, this.duration, ')');
        }
    }

    public GetPurchaseBundles$StoreSubInfo(String str, int i, String str2, String str3, String str4, String str5, Trial trial) {
        this.id = str;
        this.price = i;
        this.storePrice = str2;
        this.title = str3;
        this.purchaseType = str4;
        this.period = str5;
        this.trial = trial;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPurchaseBundles$StoreSubInfo)) {
            return false;
        }
        GetPurchaseBundles$StoreSubInfo getPurchaseBundles$StoreSubInfo = (GetPurchaseBundles$StoreSubInfo) obj;
        return epx.f(this.id, getPurchaseBundles$StoreSubInfo.id) && this.price == getPurchaseBundles$StoreSubInfo.price && epx.f(this.storePrice, getPurchaseBundles$StoreSubInfo.storePrice) && epx.f(this.title, getPurchaseBundles$StoreSubInfo.title) && epx.f(this.purchaseType, getPurchaseBundles$StoreSubInfo.purchaseType) && epx.f(this.period, getPurchaseBundles$StoreSubInfo.period) && epx.f(this.trial, getPurchaseBundles$StoreSubInfo.trial);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(urd0.a(shy.a(this.price, this.id.hashCode() * 31, 31), 31, this.storePrice), 31, this.title), 31, this.purchaseType), 31, this.period);
        Trial trial = this.trial;
        return a + (trial == null ? 0 : trial.hashCode());
    }

    public final String toString() {
        return "StoreSubInfo(id=" + this.id + ", price=" + this.price + ", storePrice=" + this.storePrice + ", title=" + this.title + ", purchaseType=" + this.purchaseType + ", period=" + this.period + ", trial=" + this.trial + ')';
    }

    public /* synthetic */ GetPurchaseBundles$StoreSubInfo(String str, int i, String str2, String str3, String str4, String str5, Trial trial, int i2, zcl zclVar) {
        this(str, i, str2, str3, str4, str5, (i2 & 64) != 0 ? null : trial);
    }
}
