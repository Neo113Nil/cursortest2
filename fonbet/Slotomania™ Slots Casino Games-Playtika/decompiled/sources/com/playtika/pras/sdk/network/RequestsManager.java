package com.playtika.pras.sdk.network;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.playtika.pras.c.a;
import com.playtika.pras.c.d;
import com.playtika.pras.c.g;
import com.playtika.pras.d.b;
import com.playtika.pras.e.m;
import com.playtika.pras.sdk.NextPaymentWidget;
import com.playtika.pras.sdk.NextPaymentsSettingsWidget;
import com.playtika.pras.sdk.PaymentWidget;
import com.playtika.pras.sdk.PaymentsSettingsWidget;
import com.playtika.pras.sdk.PrasSDK;
import com.playtika.pras.sdk.network.ClientFacadeApi;
import com.playtika.pras.sdk.network.models.DeviceInfo;
import com.playtika.pras.sdk.network.models.PrasSdkRequestParams;
import com.playtika.pras.sdk.network.models.SdkInitRequest;
import com.playtika.pras.sdk.network.models.SdkInitResponse;
import com.playtika.pras.sdk.network.models.WebStage;
import com.playtika.pras.sdk.network.models.WidgetGeneration;
import com.playtika.pras.sdk.network.models.WidgetSessionRequest;
import com.playtika.pras.sdk.network.models.WidgetSessionResponse;
import com.playtika.pras.sdk.network.models.results.BillingResult;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class RequestsManager {
    private static final String PAYMENTS_WIDGET_CONTEXT = "payments_widget";
    private static final String SETTINGS_WIDGET_CONTEXT = "payments_settings_widget";
    private final String appSessionId;
    private final String appUserId;
    private final String appUserToken;
    private final Integer clientType;
    private final Context context;
    private final a deviceInfoManager;
    private final com.playtika.pras.d.a es;
    private final boolean isQA;
    private final String packageName;
    private final PaymentsApi paymentsApi;
    private final String platform;
    private final String stageName;
    private final WidgetGeneration widgetGeneration;

    public RequestsManager(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, Integer num, WidgetGeneration widgetGeneration) {
        this.isQA = z;
        this.clientType = num;
        a aVar = new a(context, str8);
        this.deviceInfoManager = aVar;
        this.appSessionId = str2;
        this.appUserId = str3;
        this.appUserToken = str4;
        this.stageName = str;
        this.packageName = str8;
        this.context = context;
        this.widgetGeneration = widgetGeneration;
        this.platform = str7;
        StagesApi.init(str, str9, str5, str6);
        com.playtika.pras.d.a initializeEventStream = initializeEventStream(aVar, str, aVar.a);
        this.es = initializeEventStream;
        ConnectionType connectionType = aVar.c;
        this.paymentsApi = new PaymentsApi(str8, str3, str2, str4, initializeEventStream, connectionType == ConnectionType.WIFI ? "wi-fi" : connectionType.getType());
    }

    private void createSessionAndOpenWidget(final String str, final PrasSdkRequestParams prasSdkRequestParams, final DeviceInfo deviceInfo, final PrasSDK.ResponseHandler responseHandler) {
        String appUserId = prasSdkRequestParams.getAppUserId();
        String packageName = prasSdkRequestParams.getPackageName();
        String platform = prasSdkRequestParams.getPlatform();
        com.playtika.pras.d.a aVar = this.es;
        WidgetSessionRequest widgetSessionRequest = new WidgetSessionRequest(appUserId, packageName, str, platform, aVar != null ? aVar.a : null, "android", prasSdkRequestParams.getAppUserToken(), prasSdkRequestParams.getAppSessionId(), str.equals("PAYMENT") ? prasSdkRequestParams.getSku() : null, prasSdkRequestParams.getLocale(), str.equals("PAYMENT") ? prasSdkRequestParams.getCurrency() : null, UUID.randomUUID().toString(), str.equals("PAYMENT") ? prasSdkRequestParams.getDeveloperPayload() : null, str.equals("PAYMENT") ? prasSdkRequestParams.getAppTransactionId() : null, prasSdkRequestParams.getClientType() != null ? Integer.valueOf(Integer.parseInt(prasSdkRequestParams.getClientType())) : null, prasSdkRequestParams.getExtraParamsJson(), Integer.valueOf(prasSdkRequestParams.getSdkVersionCode()), Long.valueOf(prasSdkRequestParams.getAppVersionCode()), deviceInfo);
        SdkConfig sdkConfig = SdkConfig.getInstance();
        if (sdkConfig != null && sdkConfig.getInitResponse() != null && sdkConfig.getInitResponse().getRetryPolicySession() != null) {
            new ClientFacadeApi().createWidgetSession(widgetSessionRequest, this.stageName, StagesApi.getInstance().getServerHost(), sdkConfig.getInitResponse().getRetryPolicySession(), new ClientFacadeApi.SessionListener() { // from class: com.playtika.pras.sdk.network.RequestsManager.5
                @Override // com.playtika.pras.sdk.network.ClientFacadeApi.SessionListener
                public void onFailure(Exception exc) {
                    d.a("Session request failed after retries, using fallback", exc);
                    RequestsManager.this.openWidgetWithoutSession(str, prasSdkRequestParams, deviceInfo, responseHandler);
                }

                @Override // com.playtika.pras.sdk.network.ClientFacadeApi.SessionListener
                public void onSuccess(WidgetSessionResponse widgetSessionResponse) {
                    RequestsManager.this.openWidgetWithSession(str, prasSdkRequestParams, deviceInfo, widgetSessionResponse, responseHandler);
                }
            });
        } else {
            d.b("No retry policy available from init response, fallback to opening widget without session");
            openWidgetWithoutSession(str, prasSdkRequestParams, deviceInfo, responseHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fallbackToStageJson(final InitCompleteListener initCompleteListener) {
        getWebStage(new WebStageReceivedListener() { // from class: com.playtika.pras.sdk.network.RequestsManager.2
            @Override // com.playtika.pras.sdk.network.WebStageReceivedListener
            public void onFailure() {
                initCompleteListener.onInitError(new Error("Config loading error"));
            }

            @Override // com.playtika.pras.sdk.network.WebStageReceivedListener
            public void onSuccess(WebStage webStage) {
                initCompleteListener.onInitSuccess();
            }
        }, "init");
    }

    private String getClientFacadeUrl() {
        return g.a(this.stageName, StagesApi.getInstance().getServerHost()) + "/client-facade/public/payments-api/proxy/3.1";
    }

    private DeviceInfo getDeviceInfo(a aVar) {
        return new DeviceInfo(aVar.b(), a.g(), Build.MODEL, aVar.f().a, aVar.c.getType(), aVar.h(), aVar.j(), aVar.e(), aVar.i(), aVar.c(), aVar.a());
    }

    private void getWebStage(WebStageReceivedListener webStageReceivedListener, String str) {
        StagesApi.getInstance().getWebStage(webStageReceivedListener, str);
    }

    private com.playtika.pras.d.a initializeEventStream(a aVar, String str, int i) {
        String str2;
        com.playtika.pras.d.a aVar2;
        DeviceInfo deviceInfo = getDeviceInfo(aVar);
        boolean z = this.isQA;
        String str3 = this.packageName;
        String str4 = this.appUserId;
        String str5 = this.appSessionId;
        String str6 = this.platform;
        synchronized (com.playtika.pras.d.a.class) {
            com.playtika.pras.d.a aVar3 = com.playtika.pras.d.a.k;
            if (aVar3 == null) {
                str2 = str;
                com.playtika.pras.d.a.k = new com.playtika.pras.d.a(deviceInfo, z, str2, i, str3, str4, str5, str6);
            } else {
                str2 = str;
                aVar3.h = z;
                aVar3.b = str2;
                aVar3.g = i;
                aVar3.c = str3;
                aVar3.d = str4;
                aVar3.e = str5;
                aVar3.i = deviceInfo;
                aVar3.f = str6;
            }
            aVar2 = com.playtika.pras.d.a.k;
        }
        String str7 = g.a(str2, StagesApi.getInstance().getServerHost()) + "/event-stream/events";
        com.playtika.pras.d.g gVar = aVar2.j;
        if (gVar != null) {
            gVar.a.a = str7;
        }
        JSONObject jSONObject = new JSONObject();
        com.playtika.pras.d.g gVar2 = aVar2.j;
        if (gVar2 != null) {
            gVar2.l = jSONObject.optInt("eventsBatchSize", 2);
            gVar2.m = jSONObject.optInt("sendBatchTimeout", 10000);
            gVar2.n = jSONObject.optInt("retriesNumber", 5);
            gVar2.o = jSONObject.optInt("retryTimeout", 5000);
            gVar2.k = jSONObject.optBoolean("storeEvents", true);
        }
        return aVar2;
    }

    private boolean isWebViewErrorAvailable() {
        return Build.VERSION.SDK_INT >= 26 ? WebView.getCurrentWebViewPackage() != null : this.context.getPackageManager().hasSystemFeature("android.software.webview");
    }

    private void openPaymentWidget(String str, String str2, Bundle bundle, final PrasSDK.ResponseHandler responseHandler) {
        try {
            validateAuthorizationParams();
            if (!isWebViewErrorAvailable()) {
                sendAnalyticsErrorEvent("result_webview_error", PAYMENTS_WIDGET_CONTEXT, "WebView is not installed or disabled", b.SDK_PAYMENT_API, true);
                responseHandler.onResponse(new BillingResult(ResponseCode.RESULT_WEBVIEW_ERROR).toBundle());
                return;
            }
            String string = bundle.getString(PrasSDK.CURRENCY_KEY);
            String string2 = bundle.getString(PrasSDK.APP_TRANSACTION_ID_KEY);
            String string3 = bundle.getString(PrasSDK.PRODUCT_TITLE_KEY);
            String string4 = bundle.getString(PrasSDK.LOCALE_KEY);
            String string5 = bundle.getString(PrasSDK.EXTRA_PARAMS_JSON_KEY);
            String str3 = this.packageName;
            String str4 = this.appUserId;
            String str5 = this.appSessionId;
            String str6 = this.appUserToken;
            Integer num = this.clientType;
            a aVar = this.deviceInfoManager;
            final PrasSdkRequestParams prasSdkRequestParams = new PrasSdkRequestParams(str3, str4, str5, str6, str, string, string2, str2, string3, num, aVar.a, aVar.b, string4, this.platform, string5);
            String b = this.deviceInfoManager.b();
            this.deviceInfoManager.getClass();
            String g = a.g();
            this.deviceInfoManager.getClass();
            final DeviceInfo deviceInfo = new DeviceInfo(b, g, Build.MODEL, this.deviceInfoManager.f().a, this.deviceInfoManager.c.getType(), this.deviceInfoManager.h(), this.deviceInfoManager.j(), this.deviceInfoManager.e(), this.deviceInfoManager.i(), this.deviceInfoManager.c(), this.deviceInfoManager.a());
            if (SdkConfig.isDynamicConfigFlow()) {
                createSessionAndOpenWidget("PAYMENT", prasSdkRequestParams, deviceInfo, responseHandler);
            } else {
                getWebStage(new WebStageReceivedListener() { // from class: com.playtika.pras.sdk.network.RequestsManager.3
                    @Override // com.playtika.pras.sdk.network.WebStageReceivedListener
                    public void onFailure() {
                        responseHandler.onResponse(new BillingResult(new PPSResponse(ResponseCode.RESULT_ERROR)).toBundle());
                    }

                    @Override // com.playtika.pras.sdk.network.WebStageReceivedListener
                    public void onSuccess(WebStage webStage) {
                        Context context = RequestsManager.this.context;
                        PrasSDK.ResponseHandler responseHandler2 = responseHandler;
                        PrasSdkRequestParams prasSdkRequestParams2 = prasSdkRequestParams;
                        String str7 = RequestsManager.this.stageName;
                        DeviceInfo deviceInfo2 = deviceInfo;
                        PaymentWidget.a(SdkConfig.isFullScreen() ? m.a(context, NextPaymentWidget.class, prasSdkRequestParams2, str7, deviceInfo2) : m.a(context, PaymentWidget.class, prasSdkRequestParams2, str7, deviceInfo2), context, responseHandler2);
                    }
                }, PAYMENTS_WIDGET_CONTEXT);
            }
        } catch (RuntimeException e) {
            if (d.a().a) {
                e.printStackTrace();
            }
            responseHandler.onResponse(new BillingResult(ResponseCode.RESULT_DEVELOPER_ERROR).toBundle());
        }
    }

    private void openSettings(final PrasSDK.ResponseHandler responseHandler, final PrasSdkRequestParams prasSdkRequestParams) {
        if (!isWebViewErrorAvailable()) {
            sendAnalyticsErrorEvent("result_webview_error", SETTINGS_WIDGET_CONTEXT, "WebView is not installed or disabled", b.SDK_PAYMENT_API, true);
            responseHandler.onResponse(new BillingResult(ResponseCode.RESULT_WEBVIEW_ERROR).toBundle());
            return;
        }
        final DeviceInfo deviceInfo = getDeviceInfo(this.deviceInfoManager);
        if (SdkConfig.isDynamicConfigFlow()) {
            createSessionAndOpenWidget("SETTINGS", prasSdkRequestParams, deviceInfo, responseHandler);
        } else {
            getWebStage(new WebStageReceivedListener() { // from class: com.playtika.pras.sdk.network.RequestsManager.4
                @Override // com.playtika.pras.sdk.network.WebStageReceivedListener
                public void onFailure() {
                    responseHandler.onResponse(new BillingResult(new PPSResponse(ResponseCode.RESULT_ERROR)).toBundle());
                }

                @Override // com.playtika.pras.sdk.network.WebStageReceivedListener
                public void onSuccess(WebStage webStage) {
                    Context context = RequestsManager.this.context;
                    PrasSDK.ResponseHandler responseHandler2 = responseHandler;
                    PrasSdkRequestParams prasSdkRequestParams2 = prasSdkRequestParams;
                    String str = RequestsManager.this.stageName;
                    DeviceInfo deviceInfo2 = deviceInfo;
                    PaymentsSettingsWidget.a(SdkConfig.isFullScreen() ? m.a(context, NextPaymentsSettingsWidget.class, prasSdkRequestParams2, str, deviceInfo2) : m.a(context, PaymentsSettingsWidget.class, prasSdkRequestParams2, str, deviceInfo2), context, responseHandler2);
                }
            }, PAYMENTS_WIDGET_CONTEXT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openWidgetWithSession(String str, PrasSdkRequestParams prasSdkRequestParams, DeviceInfo deviceInfo, WidgetSessionResponse widgetSessionResponse, PrasSDK.ResponseHandler responseHandler) {
        Intent a;
        Intent a2;
        if (str.equals("PAYMENT")) {
            Context context = this.context;
            String str2 = this.stageName;
            if (SdkConfig.isFullScreen()) {
                a2 = m.a(context, NextPaymentWidget.class, prasSdkRequestParams, str2, deviceInfo);
                if (widgetSessionResponse != null) {
                    a2.putExtra("widget_params_session_id", widgetSessionResponse.getSessionId());
                    a2.putExtra("widget_params_session_token", widgetSessionResponse.getSessionToken());
                }
            } else {
                a2 = m.a(context, PaymentWidget.class, prasSdkRequestParams, str2, deviceInfo);
                if (widgetSessionResponse != null) {
                    a2.putExtra("widget_params_session_id", widgetSessionResponse.getSessionId());
                    a2.putExtra("widget_params_session_token", widgetSessionResponse.getSessionToken());
                }
            }
            PaymentWidget.a(a2, context, responseHandler);
            return;
        }
        Context context2 = this.context;
        String str3 = this.stageName;
        if (SdkConfig.isFullScreen()) {
            a = m.a(context2, NextPaymentsSettingsWidget.class, prasSdkRequestParams, str3, deviceInfo);
            if (widgetSessionResponse != null) {
                a.putExtra("widget_params_session_id", widgetSessionResponse.getSessionId());
                a.putExtra("widget_params_session_token", widgetSessionResponse.getSessionToken());
            }
        } else {
            a = m.a(context2, PaymentsSettingsWidget.class, prasSdkRequestParams, str3, deviceInfo);
            if (widgetSessionResponse != null) {
                a.putExtra("widget_params_session_id", widgetSessionResponse.getSessionId());
                a.putExtra("widget_params_session_token", widgetSessionResponse.getSessionToken());
            }
        }
        PaymentsSettingsWidget.a(a, context2, responseHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openWidgetWithoutSession(String str, PrasSdkRequestParams prasSdkRequestParams, DeviceInfo deviceInfo, PrasSDK.ResponseHandler responseHandler) {
        if (str.equals("PAYMENT")) {
            Context context = this.context;
            String str2 = this.stageName;
            PaymentWidget.a(SdkConfig.isFullScreen() ? m.a(context, NextPaymentWidget.class, prasSdkRequestParams, str2, deviceInfo) : m.a(context, PaymentWidget.class, prasSdkRequestParams, str2, deviceInfo), context, responseHandler);
        } else {
            Context context2 = this.context;
            String str3 = this.stageName;
            PaymentsSettingsWidget.a(SdkConfig.isFullScreen() ? m.a(context2, NextPaymentsSettingsWidget.class, prasSdkRequestParams, str3, deviceInfo) : m.a(context2, PaymentsSettingsWidget.class, prasSdkRequestParams, str3, deviceInfo), context2, responseHandler);
        }
    }

    private void sendAnalyticsContextEvent(String str, String str2, b bVar) {
        JSONObject a;
        com.playtika.pras.d.a aVar = this.es;
        if (aVar == null || (a = aVar.a(str, str2, bVar.a)) == null) {
            return;
        }
        aVar.a(a, false);
    }

    private void sendAnalyticsErrorEvent(String str, String str2, String str3, b bVar, boolean z) {
        com.playtika.pras.d.a aVar = this.es;
        if (aVar != null) {
            aVar.a(str, str2, str3, bVar, z);
        }
    }

    private void validateAuthorizationParams() {
        if (TextUtils.isEmpty(this.appUserId)) {
            throw new RuntimeException("Missed user id param");
        }
    }

    public void consumePurchase(String str, PrasSDK.ResponseHandler responseHandler) {
        sendAnalyticsContextEvent("method_call", "consumePurchase:" + str, b.SDK_PAYMENT_API);
        this.paymentsApi.consumePurchase(getClientFacadeUrl() + "/transaction/acknowledge", RequestTag.CONSUME_PURCHASE_REQUEST_ID, responseHandler, str);
    }

    public void getApprovedUnacknowledgedPurchases(PrasSDK.ResponseHandler responseHandler, String str) {
        sendAnalyticsContextEvent("method_call", "getApprovedUnacknowledgedTransactions", b.SDK_PAYMENT_API);
        this.paymentsApi.getPurchases(getClientFacadeUrl() + "/transaction/approved", RequestTag.GET_APPROVED_PURCHASES_REQUEST_ID, responseHandler, this.deviceInfoManager.d(), "getApprovedUnacknowledgedTransactions", str);
    }

    public void getProductDetails(ArrayList<String> arrayList, PrasSDK.ResponseHandler responseHandler, String str) {
        sendAnalyticsContextEvent("method_call", "getProductDetails", b.SDK_PAYMENT_API);
        this.paymentsApi.getProductDetails(getClientFacadeUrl() + "/product/details", RequestTag.GET_PRODUCT_DETAILS_ID, responseHandler, arrayList, str);
    }

    public void init(final InitCompleteListener initCompleteListener) {
        String str = this.packageName;
        String str2 = this.appUserId;
        String str3 = this.platform;
        String str4 = this.appUserToken;
        a aVar = this.deviceInfoManager;
        new ClientFacadeApi().init(new SdkInitRequest(str, str2, str3, "android", str4, aVar.a, aVar.b, this.clientType, this.appSessionId), this.stageName, StagesApi.getInstance().getServerHost(), new ClientFacadeApi.InitListener() { // from class: com.playtika.pras.sdk.network.RequestsManager.1
            @Override // com.playtika.pras.sdk.network.ClientFacadeApi.InitListener
            public void onFailure(Exception exc) {
                d.a("Client facade init failed, falling back to stage.json", exc);
                SdkConfig.initFallback(RequestsManager.this.widgetGeneration, RequestsManager.this.platform);
                RequestsManager.this.fallbackToStageJson(initCompleteListener);
            }

            @Override // com.playtika.pras.sdk.network.ClientFacadeApi.InitListener
            public void onSuccess(SdkInitResponse sdkInitResponse) {
                if (sdkInitResponse.isDynamicConfigFlowEnabled()) {
                    SdkConfig.init(sdkInitResponse, RequestsManager.this.platform);
                    initCompleteListener.onInitSuccess();
                } else {
                    SdkConfig.initFallback(RequestsManager.this.widgetGeneration, RequestsManager.this.platform);
                    RequestsManager.this.fallbackToStageJson(initCompleteListener);
                }
            }
        });
    }

    public void openPaymentSettings(PrasSDK.ResponseHandler responseHandler, String str) {
        openPaymentSettings(responseHandler, str, null);
    }

    public void startPurchase(String str, String str2, Bundle bundle, PrasSDK.ResponseHandler responseHandler) {
        openPaymentWidget(str, str2, bundle, responseHandler);
    }

    public void openPaymentSettings(PrasSDK.ResponseHandler responseHandler, String str, String str2) {
        String str3 = this.packageName;
        String str4 = this.appUserId;
        String str5 = this.appSessionId;
        String str6 = this.appUserToken;
        a aVar = this.deviceInfoManager;
        openSettings(responseHandler, new PrasSdkRequestParams(str3, str4, str5, str6, aVar.a, aVar.b, this.clientType, str, this.platform, str2));
    }
}
