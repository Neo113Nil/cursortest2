package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class SectionPaymentOption implements Serializable {
    private AppliedFare appliedFare;
    private Payment payment;

    public enum AppliedFare {
        BOARDING,
        TRANSFER
    }

    public SectionPaymentOption(Payment payment, @NonNull AppliedFare appliedFare) {
        if (appliedFare == null) {
            throw new IllegalArgumentException("Required field \"appliedFare\" cannot be null");
        }
        this.payment = payment;
        this.appliedFare = appliedFare;
    }

    @NonNull
    public AppliedFare getAppliedFare() {
        return this.appliedFare;
    }

    public Payment getPayment() {
        return this.payment;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.payment = (Payment) archive.add((Archive) this.payment, true, (Class<Archive>) Payment.class);
        this.appliedFare = (AppliedFare) archive.add((Archive) this.appliedFare, false, (Class<Archive>) AppliedFare.class);
    }

    public SectionPaymentOption() {
    }
}
