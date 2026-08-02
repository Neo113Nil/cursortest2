package com.vk.superapp.bridges.dto;

import java.io.Serializable;
import xsna.epx;
import xsna.ho8;

/* compiled from: GooglePayMerchantInfo.kt */
/* loaded from: classes6.dex */
public final class GooglePayMerchantInfo implements Serializable {
    private final int merchantId;
    private final String merchantName;

    public GooglePayMerchantInfo(int i, String str) {
        this.merchantId = i;
        this.merchantName = str;
    }

    public final int d() {
        return this.merchantId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayMerchantInfo)) {
            return false;
        }
        GooglePayMerchantInfo googlePayMerchantInfo = (GooglePayMerchantInfo) obj;
        return this.merchantId == googlePayMerchantInfo.merchantId && epx.f(this.merchantName, googlePayMerchantInfo.merchantName);
    }

    public final String g() {
        return this.merchantName;
    }

    public final int hashCode() {
        return this.merchantName.hashCode() + (Integer.hashCode(this.merchantId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GooglePayMerchantInfo(merchantId=");
        sb.append(this.merchantId);
        sb.append(", merchantName=");
        return ho8.a(sb, this.merchantName, ')');
    }
}
