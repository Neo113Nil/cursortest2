package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J4\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/sberpay/SberPayManager;", "", "initialize", "", "isSberPayReady", "", "payWithBankInvoiceId", "payInfo", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "context", "Landroid/content/Context;", "onSuccess", "Lkotlin/Function0;", "onFailure", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SberPayManager {
    void initialize();

    boolean isSberPayReady();

    void payWithBankInvoiceId(@NotNull OrderDO.PayBySberPay.SberPayInfo payInfo, @NotNull Context context, @NotNull Function0<Unit> onSuccess, @NotNull Function0<Unit> onFailure);
}
