package com.playtika.pras.sdk;

import android.content.Context;
import android.os.Bundle;
import com.playtika.pras.c.d;
import com.playtika.pras.sdk.network.RequestsManager;
import com.playtika.pras.sdk.network.models.WidgetGeneration;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class PrasSDK implements IPrasSDK {
    public static final String APP_SESSION_ID_KEY = "SESSION_ID";
    public static final String APP_TRANSACTION_ID_KEY = "APP_TRANSACTION_ID";
    public static final String APP_USER_ID_KEY = "APP_USER_ID";
    public static final String APP_USER_TOKEN_KEY = "APP_USER_TOKEN";
    public static final String CDN_HOST_KEY = "CDN_HOST";
    public static final String CLIENT_TYPE_KEY = "CLIENT_TYPE";
    public static final String CURRENCY_KEY = "CURRENCY";
    public static final String EXTRA_PARAMS_JSON_KEY = "EXTRA_PARAMS_JSON";
    public static final String LOCALE_KEY = "LOCALE";
    public static final String PLATFORM_KEY = "PLATFORM";
    public static final String PRODUCT_TITLE_KEY = "PRODUCT_TITLE";
    public static final String SERVER_HOST_KEY = "SERVER_HOST";
    private static final String STAGE_VERSION_NAME = "unified_2.0";
    public static final String WIDGET_GENERATION_KEY = "WIDGET_GENERATION";
    private RequestsManager requestsManager;

    public interface CreateHandlerV2 {
        void onCreate(IPrasSDK iPrasSDK);
    }

    public interface ResponseHandler {
        void onResponse(Bundle bundle);
    }

    public interface ResponseHandlerEx extends ResponseHandler {
        default void onAfterExternalBrowserClosed() {
        }

        default void onBeforeExternalBrowserOpened(String str) {
        }
    }

    private PrasSDK() {
    }

    public static void create(Context context, Bundle bundle, String str, String str2, CreateHandlerV2 createHandlerV2) {
        doCreate(context, bundle, str, str2, createHandlerV2);
    }

    private static void doCreate(Context context, Bundle bundle, String str, String str2, CreateHandlerV2 createHandlerV2) {
        PrasSDK prasSDK = new PrasSDK();
        int i = bundle.getInt(CLIENT_TYPE_KEY, -1);
        prasSDK.init(context, bundle.getString(APP_USER_ID_KEY), bundle.getString(APP_SESSION_ID_KEY), bundle.getString(APP_USER_TOKEN_KEY), bundle.getString(SERVER_HOST_KEY), bundle.getString(CDN_HOST_KEY), bundle.getString(PLATFORM_KEY, "android").toLowerCase(), str, str2, i == -1 ? null : Integer.valueOf(i), WidgetGeneration.fromInt(bundle.getInt(WIDGET_GENERATION_KEY, 4)), createHandlerV2);
    }

    private void init(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, WidgetGeneration widgetGeneration, CreateHandlerV2 createHandlerV2) {
        this.requestsManager = new RequestsManager(context, str7, str2, str, str3, str4, str5, str6, str8, STAGE_VERSION_NAME, isQA(), num, widgetGeneration);
        d.a().a = isQA();
        this.requestsManager.init(new a(createHandlerV2, this));
    }

    private boolean isQA() {
        return false;
    }

    public int _getSdkVersionCode() {
        return 7104;
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void consumePurchase(String str, ResponseHandler responseHandler) {
        d.a("consumePurchase method called");
        this.requestsManager.consumePurchase(str, responseHandler);
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void getApprovedUnacknowledgedTransactions(ResponseHandler responseHandler) {
        d.a("getApprovedUnacknowledgedTransactions method called");
        this.requestsManager.getApprovedUnacknowledgedPurchases(responseHandler, null);
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void getProductDetails(ArrayList<String> arrayList, ResponseHandler responseHandler) {
        d.a("getProductDetails method called");
        this.requestsManager.getProductDetails(arrayList, responseHandler, null);
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void openPaymentSettings(ResponseHandler responseHandler) {
        d.a("openPaymentSettings method called");
        this.requestsManager.openPaymentSettings(responseHandler, null);
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void startPurchase(String str, String str2, Bundle bundle, ResponseHandler responseHandler) {
        d.a("startPurchase method called");
        this.requestsManager.startPurchase(str, str2, bundle, responseHandler);
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void getApprovedUnacknowledgedTransactions(ResponseHandler responseHandler, String str) {
        d.a("getApprovedUnacknowledgedTransactions method called");
        this.requestsManager.getApprovedUnacknowledgedPurchases(responseHandler, str);
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void getProductDetails(ArrayList<String> arrayList, ResponseHandler responseHandler, String str) {
        d.a("getProductDetails method called");
        this.requestsManager.getProductDetails(arrayList, responseHandler, str);
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void openPaymentSettings(ResponseHandler responseHandler, String str) {
        d.a("openPaymentSettings method called");
        this.requestsManager.openPaymentSettings(responseHandler, str);
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void startPurchase(String str, String str2, Bundle bundle, ResponseHandlerEx responseHandlerEx) {
        d.a("startPurchase method called with ResponseHandlerEx");
        this.requestsManager.startPurchase(str, str2, bundle, responseHandlerEx);
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void openPaymentSettings(ResponseHandlerEx responseHandlerEx) {
        d.a("openPaymentSettings method called with ResponseHandlerEx");
        this.requestsManager.openPaymentSettings(responseHandlerEx, null);
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void openPaymentSettings(ResponseHandlerEx responseHandlerEx, String str) {
        d.a("openPaymentSettings method called with ResponseHandlerEx");
        this.requestsManager.openPaymentSettings(responseHandlerEx, str);
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void openPaymentSettings(ResponseHandler responseHandler, Bundle bundle) {
        this.requestsManager.openPaymentSettings(responseHandler, bundle.getString(LOCALE_KEY), bundle.getString(EXTRA_PARAMS_JSON_KEY));
    }

    @Override // com.playtika.pras.sdk.IPrasSDK
    public void openPaymentSettings(ResponseHandlerEx responseHandlerEx, Bundle bundle) {
        this.requestsManager.openPaymentSettings(responseHandlerEx, bundle.getString(LOCALE_KEY), bundle.getString(EXTRA_PARAMS_JSON_KEY));
    }
}
