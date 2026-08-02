package com.vk.superapp.bridges.dto;

import java.io.Serializable;
import xsna.epx;
import xsna.urd0;

/* compiled from: GooglePayTransactionRequest.kt */
/* loaded from: classes6.dex */
public final class GooglePayTransactionRequest implements Serializable {
    private final String currency = "RUB";
    private final GooglePayMerchantInfo merchantInfo;
    private final int price;

    public GooglePayTransactionRequest(int i, GooglePayMerchantInfo googlePayMerchantInfo) {
        this.price = i;
        this.merchantInfo = googlePayMerchantInfo;
    }

    public final String d() {
        return this.currency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayTransactionRequest)) {
            return false;
        }
        GooglePayTransactionRequest googlePayTransactionRequest = (GooglePayTransactionRequest) obj;
        return this.price == googlePayTransactionRequest.price && epx.f(this.currency, googlePayTransactionRequest.currency) && epx.f(this.merchantInfo, googlePayTransactionRequest.merchantInfo);
    }

    public final GooglePayMerchantInfo g() {
        return this.merchantInfo;
    }

    public final int h() {
        return this.price;
    }

    public final int hashCode() {
        return this.merchantInfo.hashCode() + urd0.a(Integer.hashCode(this.price) * 31, 31, this.currency);
    }

    public final String toString() {
        return "GooglePayTransactionRequest(price=" + this.price + ", currency=" + this.currency + ", merchantInfo=" + this.merchantInfo + ')';
    }
}
