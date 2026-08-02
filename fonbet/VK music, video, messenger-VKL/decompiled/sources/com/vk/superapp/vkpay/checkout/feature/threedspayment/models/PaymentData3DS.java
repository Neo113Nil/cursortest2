package com.vk.superapp.vkpay.checkout.feature.threedspayment.models;

import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import java.io.Serializable;
import xsna.epx;

/* compiled from: PaymentData3DS.kt */
/* loaded from: classes6.dex */
public final class PaymentData3DS implements Serializable {
    private final VkCheckoutPayMethod method;
    private final PostData3DS postData3DS;
    private final String transactionId;

    public PaymentData3DS(String str, VkCheckoutPayMethod vkCheckoutPayMethod, PostData3DS postData3DS) {
        this.transactionId = str;
        this.method = vkCheckoutPayMethod;
        this.postData3DS = postData3DS;
    }

    public static PaymentData3DS i(PaymentData3DS paymentData3DS, PostData3DS postData3DS) {
        return new PaymentData3DS(paymentData3DS.transactionId, paymentData3DS.method, postData3DS);
    }

    public final String d() {
        return this.transactionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentData3DS)) {
            return false;
        }
        PaymentData3DS paymentData3DS = (PaymentData3DS) obj;
        return epx.f(this.transactionId, paymentData3DS.transactionId) && this.method == paymentData3DS.method && epx.f(this.postData3DS, paymentData3DS.postData3DS);
    }

    public final VkCheckoutPayMethod g() {
        return this.method;
    }

    public final PostData3DS h() {
        return this.postData3DS;
    }

    public final int hashCode() {
        int hashCode = (this.method.hashCode() + (this.transactionId.hashCode() * 31)) * 31;
        PostData3DS postData3DS = this.postData3DS;
        return hashCode + (postData3DS == null ? 0 : postData3DS.hashCode());
    }

    public final String toString() {
        return "PaymentData3DS(transactionId=" + this.transactionId + ", method=" + this.method + ", postData3DS=" + this.postData3DS + ')';
    }
}
