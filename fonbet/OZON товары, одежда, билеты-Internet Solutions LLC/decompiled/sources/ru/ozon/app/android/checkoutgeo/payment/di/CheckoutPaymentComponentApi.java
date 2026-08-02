package ru.ozon.app.android.checkoutgeo.payment.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayManager;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayPreferences;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/di/CheckoutPaymentComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "getGooglePayAvailabilityStorage", "()Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManager;", "getSberPayManager", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManager;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayPreferences;", "getSberPayPreferences", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayPreferences;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CheckoutPaymentComponentApi extends InterfaceC6958a {
    @NotNull
    GooglePayAvailabilityStorage getGooglePayAvailabilityStorage();

    @NotNull
    SberPayManager getSberPayManager();

    @NotNull
    SberPayPreferences getSberPayPreferences();
}
