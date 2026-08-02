package ru.ozon.app.android.payment.ui;

import B0.A0;
import Bc.b;
import Bc.m;
import Bc.q;
import Bc.u;
import android.app.Activity;
import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import hC.C6884b;
import hC.c;
import io.reactivex.B;
import io.reactivex.C;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.MobilePaymentToken;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010 J'\u0010'\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b)\u0010\"J-\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190*2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b+\u0010,J?\u00101\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190*2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b3\u00104J-\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190*2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b5\u0010,J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/payment/ui/GooglePayManagerImpl;", "Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "googlePayAvailabilityStorage", "<init>", "(Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;)V", "", "totalPrice", "Lorg/json/JSONObject;", "getTransactionInfo", "(Ljava/lang/String;)Lorg/json/JSONObject;", "gateway", "merchantId", "getGatewayTokenizationSpecification", "(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "config", "", "getEnvironment", "(Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;)I", "Landroid/content/Context;", "context", "Lcom/google/android/gms/wallet/PaymentsClient;", "createPaymentsClient", "(Landroid/content/Context;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;)Lcom/google/android/gms/wallet/PaymentsClient;", "", "panOnlyEnabled", "createPaymentDataRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;", "isSupportGoogleServices", "(Landroid/content/Context;)Z", "getBaseRequest", "()Lorg/json/JSONObject;", "getBaseCardPaymentMethod", "(Z)Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "getAllowedAuthMethods", "(Z)Lorg/json/JSONArray;", "getMerchantInfo", "getCardPaymentMethod", "(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;", "getIsReadyToPayRequest", "Lio/reactivex/y;", "isGooglePayReady", "(Landroid/content/Context;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;Z)Lio/reactivex/y;", "sumToPay", "Landroid/app/Activity;", "activity", "", "sendRequestToGooglePay", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;Z)V", "isSupportGooglePay", "(Landroid/content/Context;)Lio/reactivex/y;", "checkIsGooglePayReady", "paymentInformation", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;", "getMobilePaymentToken", "(Ljava/lang/String;)Lru/ozon/app/android/checkoutgeo/payment/sberpay/MobilePaymentToken;", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GooglePayManagerImpl implements GooglePayManager {

    @NotNull
    private final GooglePayAvailabilityStorage googlePayAvailabilityStorage;

    public GooglePayManagerImpl(@NotNull GooglePayAvailabilityStorage googlePayAvailabilityStorage) {
        Intrinsics.checkNotNullParameter(googlePayAvailabilityStorage, "googlePayAvailabilityStorage");
        this.googlePayAvailabilityStorage = googlePayAvailabilityStorage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean checkIsGooglePayReady$lambda$1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C checkIsGooglePayReady$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    private final JSONObject createPaymentDataRequest(String gateway, String merchantId, String totalPrice, boolean panOnlyEnabled) {
        JSONObject baseRequest = getBaseRequest();
        baseRequest.put("allowedPaymentMethods", new JSONArray().put(getCardPaymentMethod(gateway, merchantId, panOnlyEnabled)));
        baseRequest.put("transactionInfo", getTransactionInfo(totalPrice));
        baseRequest.put("merchantInfo", getMerchantInfo());
        return baseRequest;
    }

    private final PaymentsClient createPaymentsClient(Context context, AndroidPlatformComponentConfig config) {
        PaymentsClient paymentsClient = Wallet.getPaymentsClient(context, new Wallet.WalletOptions.Builder().setEnvironment(getEnvironment(config)).build());
        Intrinsics.checkNotNullExpressionValue(paymentsClient, "let(...)");
        return paymentsClient;
    }

    private final JSONArray getAllowedAuthMethods(boolean panOnlyEnabled) {
        return new JSONArray((Collection) (panOnlyEnabled ? C7714v.b0("PAN_ONLY", "CRYPTOGRAM_3DS") : C7714v.a0("CRYPTOGRAM_3DS")));
    }

    private final JSONObject getBaseCardPaymentMethod(boolean panOnlyEnabled) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "CARD");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedCardNetworks", new JSONArray((Collection) C7714v.b0("VISA", "MASTERCARD", "MIR")));
        jSONObject2.put("allowedAuthMethods", getAllowedAuthMethods(panOnlyEnabled));
        Unit unit = Unit.f71690a;
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    private final JSONObject getBaseRequest() {
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    private final JSONObject getCardPaymentMethod(String gateway, String merchantId, boolean panOnlyEnabled) {
        JSONObject baseCardPaymentMethod = getBaseCardPaymentMethod(panOnlyEnabled);
        baseCardPaymentMethod.put("tokenizationSpecification", getGatewayTokenizationSpecification(gateway, merchantId));
        return baseCardPaymentMethod;
    }

    private final int getEnvironment(AndroidPlatformComponentConfig config) {
        return config.getIsDebug() ? 3 : 1;
    }

    private final JSONObject getGatewayTokenizationSpecification(String gateway, String merchantId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "PAYMENT_GATEWAY");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("gateway", gateway);
        jSONObject2.put("gatewayMerchantId", merchantId);
        Unit unit = Unit.f71690a;
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    private final JSONObject getIsReadyToPayRequest(boolean panOnlyEnabled) {
        JSONObject baseRequest = getBaseRequest();
        baseRequest.put("allowedPaymentMethods", new JSONArray().put(getBaseCardPaymentMethod(panOnlyEnabled)));
        return baseRequest;
    }

    private final JSONObject getMerchantInfo() {
        JSONObject put = new JSONObject().put("merchantName", "Ozon");
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    private final JSONObject getTransactionInfo(String totalPrice) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalPrice", totalPrice);
        jSONObject.put("totalPriceStatus", "FINAL");
        jSONObject.put(AppsFlyerProperties.CURRENCY_CODE, "RUB");
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y<Boolean> isGooglePayReady(final Context context, final AndroidPlatformComponentConfig config, final boolean panOnlyEnabled) {
        b bVar = new b(new B() { // from class: hC.d
            @Override // io.reactivex.B
            public final void b(z zVar) {
                GooglePayManagerImpl.isGooglePayReady$lambda$13(GooglePayManagerImpl.this, panOnlyEnabled, context, config, zVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isGooglePayReady$lambda$13(final GooglePayManagerImpl googlePayManagerImpl, boolean z11, Context context, AndroidPlatformComponentConfig androidPlatformComponentConfig, final z emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Task<Boolean> isReadyToPay = googlePayManagerImpl.createPaymentsClient(context, androidPlatformComponentConfig).isReadyToPay(IsReadyToPayRequest.fromJson(googlePayManagerImpl.getIsReadyToPayRequest(z11).toString()));
        isReadyToPay.addOnCompleteListener(new OnCompleteListener() { // from class: hC.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GooglePayManagerImpl.isGooglePayReady$lambda$13$lambda$12$lambda$10(GooglePayManagerImpl.this, emitter, task);
            }
        });
        isReadyToPay.addOnFailureListener(new C6884b(googlePayManagerImpl, emitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isGooglePayReady$lambda$13$lambda$12$lambda$10(GooglePayManagerImpl googlePayManagerImpl, z zVar, Task completedTask) {
        Intrinsics.checkNotNullParameter(completedTask, "completedTask");
        if (!completedTask.isSuccessful()) {
            googlePayManagerImpl.googlePayAvailabilityStorage.setGooglePayReady(false);
            zVar.onSuccess(Boolean.FALSE);
            return;
        }
        Boolean bool = (Boolean) completedTask.getResult();
        GooglePayAvailabilityStorage googlePayAvailabilityStorage = googlePayManagerImpl.googlePayAvailabilityStorage;
        Intrinsics.f(bool);
        googlePayAvailabilityStorage.setGooglePayReady(bool.booleanValue());
        zVar.onSuccess(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isGooglePayReady$lambda$13$lambda$12$lambda$11(GooglePayManagerImpl googlePayManagerImpl, z zVar, Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        googlePayManagerImpl.googlePayAvailabilityStorage.setGooglePayReady(false);
        zVar.onError(error);
    }

    private final boolean isSupportGoogleServices(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.GooglePayManager
    @NotNull
    public y<Boolean> checkIsGooglePayReady(@NotNull Context context, @NotNull AndroidPlatformComponentConfig config, boolean panOnlyEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        y<Boolean> isSupportGooglePay = isSupportGooglePay(context);
        A0 a02 = new A0(6);
        isSupportGooglePay.getClass();
        m mVar = new m(new u(isSupportGooglePay, a02), new c(new GooglePayManagerImpl$checkIsGooglePayReady$2(this, context, config, panOnlyEnabled)));
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.GooglePayManager
    @NotNull
    public MobilePaymentToken getMobilePaymentToken(@NotNull String paymentInformation) throws JSONException {
        Intrinsics.checkNotNullParameter(paymentInformation, "paymentInformation");
        JSONObject jSONObject = new JSONObject(new JSONObject(paymentInformation).getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token"));
        String string = jSONObject.getString("signature");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("protocolVersion");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = jSONObject.getString("signedMessage");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new MobilePaymentToken(string, string2, string3);
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.GooglePayManager
    @NotNull
    public y<Boolean> isSupportGooglePay(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        q f7 = y.f(Boolean.valueOf(isSupportGoogleServices(context)));
        Intrinsics.checkNotNullExpressionValue(f7, "just(...)");
        return f7;
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.GooglePayManager
    public void sendRequestToGooglePay(@NotNull String gateway, @NotNull String merchantId, @NotNull String sumToPay, @NotNull Activity activity, @NotNull AndroidPlatformComponentConfig config, boolean panOnlyEnabled) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(sumToPay, "sumToPay");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(config, "config");
        AutoResolveHelper.resolveTask(createPaymentsClient(activity, config).loadPaymentData(PaymentDataRequest.fromJson(createPaymentDataRequest(gateway, merchantId, sumToPay, panOnlyEnabled).toString())), activity, 2018);
    }
}
