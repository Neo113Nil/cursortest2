package ru.ozon.app.android.checkoutgeo.payment;

import android.app.Activity;
import android.content.Context;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.MobilePaymentToken;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "", "", "gateway", "merchantId", "sumToPay", "Landroid/app/Activity;", "activity", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "config", "", "panOnlyEnabled", "", "sendRequestToGooglePay", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;Z)V", "Landroid/content/Context;", "context", "Lio/reactivex/y;", "isSupportGooglePay", "(Landroid/content/Context;)Lio/reactivex/y;", "checkIsGooglePayReady", "(Landroid/content/Context;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;Z)Lio/reactivex/y;", "paymentInformation", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;", "getMobilePaymentToken", "(Ljava/lang/String;)Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GooglePayManager {
    @NotNull
    y<Boolean> checkIsGooglePayReady(@NotNull Context context, @NotNull AndroidPlatformComponentConfig config, boolean panOnlyEnabled);

    @NotNull
    MobilePaymentToken getMobilePaymentToken(@NotNull String paymentInformation);

    @NotNull
    y<Boolean> isSupportGooglePay(@NotNull Context context);

    void sendRequestToGooglePay(@NotNull String gateway, @NotNull String merchantId, @NotNull String sumToPay, @NotNull Activity activity, @NotNull AndroidPlatformComponentConfig config, boolean panOnlyEnabled);
}
