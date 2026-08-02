package com.yandex.mapkit.transport.masstransit;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.Money;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class RoutePaymentOption implements Serializable {
    private NativeObject nativeObject;
    private List<Payment> payment;
    private boolean payment__is_initialized;
    private List<Money> totalPrice;
    private boolean totalPrice__is_initialized;

    public RoutePaymentOption() {
        this.payment__is_initialized = false;
        this.totalPrice__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RoutePaymentOption";
    }

    private native List<Payment> getPayment__Native();

    private native List<Money> getTotalPrice__Native();

    private native NativeObject init(List<Payment> list, List<Money> list2);

    @NonNull
    public synchronized List<Payment> getPayment() {
        try {
            if (!this.payment__is_initialized) {
                this.payment = getPayment__Native();
                this.payment__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.payment;
    }

    @NonNull
    public synchronized List<Money> getTotalPrice() {
        try {
            if (!this.totalPrice__is_initialized) {
                this.totalPrice = getTotalPrice__Native();
                this.totalPrice__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.totalPrice;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getPayment(), false, (ArchivingHandler) new ClassHandler(Payment.class));
            C2616s.f(Money.class, archive, getTotalPrice(), false);
            return;
        }
        this.payment = G.d(Payment.class, archive, this.payment, false);
        this.payment__is_initialized = true;
        List<Money> d11 = G.d(Money.class, archive, this.totalPrice, false);
        this.totalPrice = d11;
        this.totalPrice__is_initialized = true;
        this.nativeObject = init(this.payment, d11);
    }

    public RoutePaymentOption(@NonNull List<Payment> list, @NonNull List<Money> list2) {
        this.payment__is_initialized = false;
        this.totalPrice__is_initialized = false;
        if (list == null) {
            throw new IllegalArgumentException("Required field \"payment\" cannot be null");
        }
        if (list2 != null) {
            this.nativeObject = init(list, list2);
            this.payment = list;
            this.payment__is_initialized = true;
            this.totalPrice = list2;
            this.totalPrice__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"totalPrice\" cannot be null");
    }

    private RoutePaymentOption(NativeObject nativeObject) {
        this.payment__is_initialized = false;
        this.totalPrice__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
