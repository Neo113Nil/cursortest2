package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.mapkit.Money;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Payment implements Serializable {
    private PaymentMedia paymentMedia;
    private Money price;

    public Payment(PaymentMedia paymentMedia, @NonNull Money money) {
        if (money == null) {
            throw new IllegalArgumentException("Required field \"price\" cannot be null");
        }
        this.paymentMedia = paymentMedia;
        this.price = money;
    }

    public PaymentMedia getPaymentMedia() {
        return this.paymentMedia;
    }

    @NonNull
    public Money getPrice() {
        return this.price;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.paymentMedia = (PaymentMedia) archive.add((Archive) this.paymentMedia, true, (Class<Archive>) PaymentMedia.class);
        this.price = (Money) archive.add((Archive) this.price, false, (Class<Archive>) Money.class);
    }

    public Payment() {
    }
}
