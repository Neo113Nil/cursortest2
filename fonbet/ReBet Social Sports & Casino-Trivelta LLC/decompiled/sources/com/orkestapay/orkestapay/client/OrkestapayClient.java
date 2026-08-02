package com.orkestapay.orkestapay.client;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.Q;
import android.content.Context;
import android.view.ViewGroup;
import com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI;
import com.orkestapay.orkestapay.client.apirequest.PaymentMethodListener;
import com.orkestapay.orkestapay.client.apirequest.PromotionsListener;
import com.orkestapay.orkestapay.client.model.PaymentMethod;
import com.orkestapay.orkestapay.client.model.PaymentMethodData;
import com.orkestapay.orkestapay.client.model.clicktopay.ClickToPay;
import com.orkestapay.orkestapay.client.model.clicktopay.ClickToPayStyle;
import com.orkestapay.orkestapay.client.model.googlepay.GooglePayData;
import com.orkestapay.orkestapay.core.clicktopay.ClickToPayClient;
import com.orkestapay.orkestapay.core.clicktopay.ClickToPayListener;
import com.orkestapay.orkestapay.core.devicesession.DeviceSessionClient;
import com.orkestapay.orkestapay.core.devicesession.DeviceSessionListener;
import com.orkestapay.orkestapay.core.googlepay.GooglePayCallback;
import com.orkestapay.orkestapay.core.googlepay.GooglePayClient;
import com.orkestapay.orkestapay.core.networking.CoreConfig;
import com.orkestapay.orkestapay.core.networking.Environment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J(\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010 \u001a\u00020%J\u001e\u0010&\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J&\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00032\u0006\u0010 \u001a\u00020/J\u000e\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u000202J\u0016\u00103\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010)\u001a\u000204R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/orkestapay/orkestapay/client/OrkestapayClient;", "", "merchantId", "", "publicKey", "isProductionMode", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "clickToPayClient", "Lcom/orkestapay/orkestapay/core/clicktopay/ClickToPayClient;", "coreConfig", "Lcom/orkestapay/orkestapay/core/networking/CoreConfig;", "deviceSessionClient", "Lcom/orkestapay/orkestapay/core/devicesession/DeviceSessionClient;", "googlePayClient", "Lcom/orkestapay/orkestapay/core/googlepay/GooglePayClient;", "googlePaymentMethodData", "Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;", "getGooglePaymentMethodData", "()Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;", "setGooglePaymentMethodData", "(Lcom/orkestapay/orkestapay/client/model/PaymentMethodData;)V", "orkestapayAPI", "Lcom/orkestapay/orkestapay/client/apirequest/OrkestapayAPI;", "clickToPayCheckout", "", "context", "Landroid/content/Context;", "clickToPay", "Lcom/orkestapay/orkestapay/client/model/clicktopay/ClickToPay;", "clickToPayStyle", "Lcom/orkestapay/orkestapay/client/model/clicktopay/ClickToPayStyle;", "listener", "Lcom/orkestapay/orkestapay/core/clicktopay/ClickToPayListener;", "createPaymentMethod", "paymentMethod", "Lcom/orkestapay/orkestapay/client/model/PaymentMethod;", "Lcom/orkestapay/orkestapay/client/apirequest/PaymentMethodListener;", "creteDeviceSession", "parent", "Landroid/view/ViewGroup;", "callback", "Lcom/orkestapay/orkestapay/core/devicesession/DeviceSessionListener;", "getPromotions", "binNumber", "currency", "totalAmount", "Lcom/orkestapay/orkestapay/client/apirequest/PromotionsListener;", "googlePayCheckout", "googlePayData", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayData;", "googlePaySetup", "Lcom/orkestapay/orkestapay/core/googlepay/GooglePayCallback;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrkestapayClient {

    @NotNull
    private ClickToPayClient clickToPayClient;

    @NotNull
    private CoreConfig coreConfig;

    @NotNull
    private DeviceSessionClient deviceSessionClient;

    @NotNull
    private GooglePayClient googlePayClient;

    @Nullable
    private PaymentMethodData googlePaymentMethodData;

    @NotNull
    private OrkestapayAPI orkestapayAPI;

    public OrkestapayClient(@NotNull String merchantId, @NotNull String publicKey, boolean z10) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        if (!StringsKt.startsWith$default(merchantId, "mid_", false, 2, (Object) null)) {
            merchantId = "mid_" + merchantId;
        }
        CoreConfig coreConfig = new CoreConfig(merchantId, publicKey, z10 ? Environment.PRODUCTION : Environment.SANDBOX);
        this.coreConfig = coreConfig;
        this.deviceSessionClient = new DeviceSessionClient(coreConfig);
        this.clickToPayClient = new ClickToPayClient(this.coreConfig);
        this.orkestapayAPI = new OrkestapayAPI(this.coreConfig);
        this.googlePayClient = new GooglePayClient(this.coreConfig);
    }

    public final void clickToPayCheckout(@NotNull Context context, @NotNull ClickToPay clickToPay, @Nullable ClickToPayStyle clickToPayStyle, @NotNull ClickToPayListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clickToPay, "clickToPay");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.clickToPayClient.openClickToPayCheckout(context, clickToPay, clickToPayStyle, listener);
    }

    public final void createPaymentMethod(@NotNull PaymentMethod paymentMethod, @NotNull PaymentMethodListener listener) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(listener, "listener");
        AbstractC1459k.d(Q.a(C1452g0.b()), null, null, new OrkestapayClient$createPaymentMethod$1(this, paymentMethod, listener, null), 3, null);
    }

    public final void creteDeviceSession(@NotNull Context context, @NotNull ViewGroup parent, @NotNull DeviceSessionListener callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.deviceSessionClient.getDeviceSessionId(context, parent, callback);
    }

    @Nullable
    public final PaymentMethodData getGooglePaymentMethodData() {
        return this.googlePaymentMethodData;
    }

    public final void getPromotions(@NotNull String binNumber, @NotNull String currency, @NotNull String totalAmount, @NotNull PromotionsListener listener) {
        Intrinsics.checkNotNullParameter(binNumber, "binNumber");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(listener, "listener");
        AbstractC1459k.d(Q.a(C1452g0.b()), null, null, new OrkestapayClient$getPromotions$1(this, binNumber, currency, totalAmount, listener, null), 3, null);
    }

    public final void googlePayCheckout(@NotNull GooglePayData googlePayData) {
        Intrinsics.checkNotNullParameter(googlePayData, "googlePayData");
        AbstractC1459k.d(Q.a(C1452g0.b()), null, null, new OrkestapayClient$googlePayCheckout$1(this, googlePayData, null), 3, null);
    }

    public final void googlePaySetup(@NotNull Context context, @NotNull GooglePayCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1459k.d(Q.a(C1452g0.b()), null, null, new OrkestapayClient$googlePaySetup$1(this, context, callback, null), 3, null);
    }

    public final void setGooglePaymentMethodData(@Nullable PaymentMethodData paymentMethodData) {
        this.googlePaymentMethodData = paymentMethodData;
    }
}
