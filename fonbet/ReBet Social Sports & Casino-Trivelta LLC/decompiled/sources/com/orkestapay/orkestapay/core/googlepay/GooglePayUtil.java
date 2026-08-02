package com.orkestapay.orkestapay.core.googlepay;

import com.appsflyer.AppsFlyerProperties;
import com.twilio.voice.EventKeys;
import java.math.BigDecimal;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000bH\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J6\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fJ \u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/orkestapay/orkestapay/core/googlepay/GooglePayUtil;", "", "()V", "CENTS", "Ljava/math/BigDecimal;", "getCENTS", "()Ljava/math/BigDecimal;", "allowedCardAuthMethods", "Lorg/json/JSONArray;", "allowedCardNetworks", "baseRequest", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "allowedPaymentMethods", EventKeys.GATEWAY, "", "merchantId", "baseCardPaymentMethod", "cardPaymentMethod", "gatewayTokenizationSpecification", "getPaymentDataRequest", "amount", AppsFlyerProperties.CURRENCY_CODE, "countryCode", "merchantName", "getTransactionInfo", "price", "isReadyToPayRequest", "merchantInfo", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayUtil {

    @NotNull
    private static final JSONArray allowedCardAuthMethods;

    @NotNull
    private static final JSONArray allowedCardNetworks;

    @NotNull
    public static final GooglePayUtil INSTANCE = new GooglePayUtil();

    @NotNull
    private static final BigDecimal CENTS = new BigDecimal(100);
    private static final JSONObject baseRequest = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);

    static {
        GooglePayConstants googlePayConstants = GooglePayConstants.INSTANCE;
        allowedCardNetworks = new JSONArray((Collection) googlePayConstants.getSUPPORTED_NETWORKS());
        allowedCardAuthMethods = new JSONArray((Collection) googlePayConstants.getSUPPORTED_METHODS());
    }

    private GooglePayUtil() {
    }

    private final JSONObject baseCardPaymentMethod() {
        JSONObject put = new JSONObject().put("type", "CARD").put("parameters", new JSONObject().put("allowedAuthMethods", allowedCardAuthMethods).put("allowedCardNetworks", allowedCardNetworks));
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    private final JSONObject cardPaymentMethod(String gateway, String merchantId) {
        JSONObject put = baseCardPaymentMethod().put("tokenizationSpecification", gatewayTokenizationSpecification(gateway, merchantId));
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    private final JSONObject gatewayTokenizationSpecification(String gateway, String merchantId) {
        JSONObject put = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject(MapsKt.mapOf(TuplesKt.to(EventKeys.GATEWAY, gateway), TuplesKt.to("gatewayMerchantId", merchantId))));
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    private final JSONObject getTransactionInfo(String price, String currencyCode, String countryCode) {
        JSONObject put = new JSONObject().put("totalPrice", price).put("totalPriceStatus", "FINAL").put("totalPriceLabel", "TOTAL").put("countryCode", countryCode).put(AppsFlyerProperties.CURRENCY_CODE, currencyCode);
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    private final JSONObject merchantInfo(String merchantName) {
        JSONObject put = new JSONObject().put("merchantName", merchantName);
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    @NotNull
    public final JSONArray allowedPaymentMethods(@NotNull String gateway, @NotNull String merchantId) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        JSONArray put = new JSONArray().put(cardPaymentMethod(gateway, merchantId));
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    @NotNull
    public final BigDecimal getCENTS() {
        return CENTS;
    }

    @NotNull
    public final JSONObject getPaymentDataRequest(@NotNull String amount, @NotNull String currencyCode, @NotNull String countryCode, @NotNull String gateway, @NotNull String merchantId, @NotNull String merchantName) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        JSONObject put = baseRequest.put("allowedPaymentMethods", allowedPaymentMethods(gateway, merchantId)).put("transactionInfo", getTransactionInfo(amount, currencyCode, countryCode)).put("merchantInfo", merchantInfo(merchantName));
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    @Nullable
    public final JSONObject isReadyToPayRequest() {
        try {
            return baseRequest.put("allowedPaymentMethods", new JSONArray().put(baseCardPaymentMethod()));
        } catch (JSONException unused) {
            return null;
        }
    }
}
