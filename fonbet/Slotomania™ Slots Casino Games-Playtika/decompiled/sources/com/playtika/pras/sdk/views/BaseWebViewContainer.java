package com.playtika.pras.sdk.views;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.X3;
import com.playtika.pras.e.g;
import com.playtika.pras.e.h;
import com.playtika.pras.e.i;
import com.playtika.pras.e.j;
import com.playtika.pras.sdk.R;
import com.playtika.pras.sdk.network.JSInterface;
import com.playtika.pras.sdk.network.ResponseCode;
import com.playtika.pras.sdk.network.SdkConfig;
import com.playtika.pras.sdk.network.StagesApi;
import com.playtika.pras.sdk.network.models.DeviceInfo;
import com.playtika.pras.sdk.network.models.PrasSdkRequestParams;
import com.playtika.pras.sdk.network.models.WebStage;
import com.playtika.pras.sdk.network.models.WidgetSessionData;
import com.playtika.pras.sdk.network.models.results.BillingResult;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.sentry.protocol.Device;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class BaseWebViewContainer extends Fragment implements h {
    private static final int REDIRECTION_REQUEST_CODE = 13592;
    private static final int TIMEOUT = 30000;
    protected String TAG;
    private Timer _retryTimer;
    private Timer _timer;
    private int currentTimeoutMs;
    private com.playtika.pras.d.a es;
    private JSInterface jsInterface;
    private Button mCloseButton;
    protected PrasSdkRequestParams mRequestParams;
    protected i mWebView;
    protected g webViewActionsListener;
    private String widgetLoadUrl;
    private String widgetRuntimeGuid;
    private WidgetSessionData widgetSessionData;
    private Boolean scrollWebViewKeyboardEnabled = Boolean.FALSE;
    private int currentRetryAttempt = 0;

    private i createWebView() {
        i iVar = new i(getContext());
        iVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        iVar.setLayerType(2, null);
        iVar.setVisibility(4);
        iVar.setInitialScale(100);
        iVar.setBackgroundColor(0);
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOnViewCreated(View view, WebStage webStage) {
        setupWebView(view, getCDNUrl(webStage));
        PrasSdkRequestParams requestParams = getRequestParams();
        this.mRequestParams = requestParams;
        if (requestParams == null) {
            com.playtika.pras.c.d.b("Error parsing request params");
            sendAnalyticsErrorEvent("result_webview_error", getESContext(), "Error parsing request params");
            closeWidget(new BillingResult(ResponseCode.RESULT_ERROR).toBundle());
            return;
        }
        String stageNameParam = getStageNameParam();
        String serverHost = StagesApi.getInstance().getServerHost();
        String stringExtra = requireActivity().getIntent().getStringExtra("widget_params_session_id");
        String stringExtra2 = requireActivity().getIntent().getStringExtra("widget_params_session_token");
        DeviceInfo deviceInfoParam = getDeviceInfoParam();
        if (stringExtra == null || stringExtra2 == null) {
            com.playtika.pras.c.d.a("No session data - using legacy flow");
            this.widgetSessionData = null;
        } else {
            com.playtika.pras.c.d.a("Session flow detected - sessionId: ".concat(stringExtra));
            this.widgetSessionData = new WidgetSessionData(stringExtra, stringExtra2, com.playtika.pras.c.g.a(stageNameParam, serverHost), getStageNameParam(), true, getRedirectPMOpenMode(), this.mRequestParams.getLocale(), getProductTitleForSession(), isSettingsWidget(), this.mRequestParams.getPlatform(), deviceInfoParam != null ? deviceInfoParam.getScreenSizeInches() : null, deviceInfoParam != null ? deviceInfoParam.getUiMode() : null, deviceInfoParam != null ? deviceInfoParam.getDeviceMemory() : null, deviceInfoParam != null ? deviceInfoParam.getRefreshRate() : null, "Android " + Build.VERSION.RELEASE, deviceInfoParam != null ? deviceInfoParam.getBatteryStatus() : null, deviceInfoParam != null ? deviceInfoParam.getAccessibilityEnabled() : null);
        }
        Button button = (Button) view.findViewById(R.id.web_view_close_button);
        this.mCloseButton = button;
        button.setOnClickListener(new com.playtika.pras.e.b(this));
        com.playtika.pras.d.a initializeEventStream = initializeEventStream(deviceInfoParam, stageNameParam, this.mRequestParams.getSdkVersionCode(), this.mRequestParams.getPlatform());
        this.es = initializeEventStream;
        String str = com.playtika.pras.c.g.a(stageNameParam, serverHost) + "/event-stream/events";
        com.playtika.pras.d.g gVar = initializeEventStream.j;
        if (gVar != null) {
            gVar.a.a = str;
        }
        load(getFormattedUrl(webStage).build().toString());
        this.mWebView.getViewTreeObserver().addOnGlobalLayoutListener(new a(this, view));
    }

    private DeviceInfo getDeviceInfoParam() {
        Bundle bundleExtra = requireActivity().getIntent().getBundleExtra("widget_params_device_info_bundle");
        if (bundleExtra == null) {
            return null;
        }
        return (DeviceInfo) bundleExtra.getParcelable("widget_params_device_info");
    }

    private String getRedirectPMOpenMode() {
        return SdkConfig.useInternalBrowserForRedirects() ? "in_app_browser" : X3.i.J;
    }

    private PrasSdkRequestParams getRequestParams() {
        Bundle bundleExtra = requireActivity().getIntent().getBundleExtra("widget_params_purchase_request_extra_params_bundle");
        if (bundleExtra == null) {
            return null;
        }
        return (PrasSdkRequestParams) bundleExtra.getParcelable("widget_params_purchase_request_extra_params");
    }

    private String getReturnUrlScheme() {
        try {
            return requireContext().getPackageName().toLowerCase().replace("_", "") + ".redirect";
        } catch (Exception e) {
            com.playtika.pras.c.d.a("Failed to get return URL scheme", e.getMessage());
            return "";
        }
    }

    private String getStageNameParam() {
        return requireActivity().getIntent().getStringExtra("widget_params_stage_name");
    }

    private com.playtika.pras.d.a initializeEventStream(DeviceInfo deviceInfo, String str, int i, String str2) {
        com.playtika.pras.d.a aVar;
        boolean isQA = isQA();
        String packageName = this.mRequestParams.getPackageName();
        String appUserId = this.mRequestParams.getAppUserId();
        String appSessionId = this.mRequestParams.getAppSessionId();
        synchronized (com.playtika.pras.d.a.class) {
            com.playtika.pras.d.a aVar2 = com.playtika.pras.d.a.k;
            if (aVar2 == null) {
                com.playtika.pras.d.a.k = new com.playtika.pras.d.a(deviceInfo, isQA, str, i, packageName, appUserId, appSessionId, str2);
            } else {
                aVar2.h = isQA;
                aVar2.b = str;
                aVar2.g = i;
                aVar2.c = packageName;
                aVar2.d = appUserId;
                aVar2.e = appSessionId;
                aVar2.i = deviceInfo;
                aVar2.f = str2;
            }
            aVar = com.playtika.pras.d.a.k;
        }
        return aVar;
    }

    private boolean isQA() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void load(String str) {
        this.widgetLoadUrl = str;
        if (this.currentRetryAttempt == 0) {
            SdkConfig sdkConfig = SdkConfig.getInstance();
            if (sdkConfig == null || sdkConfig.getInitResponse() == null || sdkConfig.getInitResponse().getRetryPolicyWidget() == null) {
                this.currentTimeoutMs = 30000;
            } else {
                this.currentTimeoutMs = sdkConfig.getInitResponse().getRetryPolicyWidget().getInitialTimeout();
            }
        }
        this.currentRetryAttempt++;
        try {
            JSONObject createAdditionalFieldsWithSessionId = createAdditionalFieldsWithSessionId();
            createAdditionalFieldsWithSessionId.put("attempt_number", this.currentRetryAttempt);
            createAdditionalFieldsWithSessionId.put("widget_runtime_guid", this.widgetRuntimeGuid);
            sendAnalyticsContextEvent(getWidgetLoadingStartEventType(), getESContext(), createAdditionalFieldsWithSessionId);
        } catch (JSONException unused) {
            sendAnalyticsContextEvent(getWidgetLoadingStartEventType(), getESContext());
        }
        Timer timer = new Timer();
        this._timer = timer;
        timer.schedule(new com.playtika.pras.e.e(this), this.currentTimeoutMs);
        this.mWebView.loadUrl(str);
    }

    private void onRedirectionResult(int i, j jVar, Uri uri) {
        String str;
        if (jVar == j.b) {
            i iVar = this.mWebView;
            if (iVar != null) {
                iVar.post(new com.playtika.pras.c.c(iVar, "if (typeof window.APP.onCancelRedirection === 'function') {  window.APP.onCancelRedirection();} else {  window.APP.onCompleteRedirection(null, null);}"));
                return;
            }
            return;
        }
        String str2 = null;
        if (jVar != j.a) {
            str = null;
        } else {
            if (uri == null || !uri.getScheme().equals(getReturnUrlScheme()) || !uri.getHost().equals("resultdatav1")) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                for (String str3 : queryParameterNames) {
                    try {
                        jSONObject2.put(str3, uri.getQueryParameter(str3));
                    } catch (JSONException e) {
                        str2 = "new Error('Failed to parse query items from return URL. " + e.getLocalizedMessage() + "')";
                    }
                }
            }
            try {
                jSONObject.put("path", uri.getPath());
                jSONObject.put("queryItems", jSONObject2);
                jSONObject.put("hash", uri.getFragment());
            } catch (JSONException unused) {
            }
            str = jSONObject.toString();
        }
        i iVar2 = this.mWebView;
        String str4 = "window.APP.onCompleteRedirection(" + str2 + ", " + str + ");";
        if (iVar2 != null) {
            iVar2.post(new com.playtika.pras.c.c(iVar2, str4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTimeout() {
        try {
            JSONObject createAdditionalFieldsWithSessionId = createAdditionalFieldsWithSessionId();
            createAdditionalFieldsWithSessionId.put("attempt_number", this.currentRetryAttempt);
            createAdditionalFieldsWithSessionId.put("widget_runtime_guid", this.widgetRuntimeGuid);
            sendAnalyticsErrorEvent("result_webview_loading_timeout_error", getESContext(), "", createAdditionalFieldsWithSessionId);
        } catch (JSONException unused) {
            sendAnalyticsErrorEvent("result_webview_loading_timeout_error", getESContext(), "");
        }
        clearTimer();
        if (shouldRetryWidgetLoading()) {
            retryWidgetLoading();
        } else {
            closeWidget(new BillingResult(ResponseCode.RESULT_WIDGET_LOADING_ERROR).toBundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retryWidgetLoading() {
        SdkConfig sdkConfig = SdkConfig.getInstance();
        if (sdkConfig == null || sdkConfig.getInitResponse() == null || sdkConfig.getInitResponse().getRetryPolicyWidget() == null) {
            return;
        }
        int maxTimeout = sdkConfig.getInitResponse().getRetryPolicyWidget().getMaxTimeout();
        double backoffMultiplier = sdkConfig.getInitResponse().getRetryPolicyWidget().getBackoffMultiplier();
        this.currentTimeoutMs = Math.min((int) (this.currentTimeoutMs * backoffMultiplier), maxTimeout);
        int min = (int) Math.min(Math.pow(backoffMultiplier, this.currentRetryAttempt - 1) * sdkConfig.getInitResponse().getRetryPolicyWidget().getInitialInterval(), sdkConfig.getInitResponse().getRetryPolicyWidget().getMaxInterval());
        com.playtika.pras.c.d.a(this.TAG, "Retrying widget loading, attempt: " + this.currentRetryAttempt + ", interval: " + min + "ms, timeout: " + this.currentTimeoutMs + "ms");
        Timer timer = this._retryTimer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this._retryTimer = timer2;
        timer2.schedule(new com.playtika.pras.e.f(this), min);
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldRetryWidgetLoading() {
        SdkConfig sdkConfig = SdkConfig.getInstance();
        if (sdkConfig != null && sdkConfig.getInitResponse() != null && sdkConfig.getInitResponse().getRetryPolicyWidget() != null) {
            if (this.currentRetryAttempt < sdkConfig.getInitResponse().getRetryPolicyWidget().getMaxAttempts()) {
                return true;
            }
        }
        return false;
    }

    private void showWebView() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new d(this));
    }

    public void backButtonHandler() {
        i iVar = this.mWebView;
        if (iVar != null) {
            iVar.post(new com.playtika.pras.c.c(iVar, "closePopupRequest()"));
        }
    }

    @Override // com.playtika.pras.e.h
    public void clearTimer() {
        Timer timer = this._timer;
        if (timer != null) {
            timer.cancel();
            this._timer = null;
        }
        Timer timer2 = this._retryTimer;
        if (timer2 != null) {
            timer2.cancel();
            this._retryTimer = null;
        }
    }

    public void closeWidget(Bundle bundle) {
        g gVar = this.webViewActionsListener;
        if (gVar != null) {
            gVar.a(bundle);
            this.webViewActionsListener = null;
        }
    }

    public JSONObject createAdditionalFieldsWithSessionId() {
        WidgetSessionData widgetSessionData;
        JSONObject jSONObject = new JSONObject();
        if (isSessionFlow() && (widgetSessionData = this.widgetSessionData) != null) {
            try {
                jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, widgetSessionData.getSessionId());
                return jSONObject;
            } catch (JSONException e) {
                com.playtika.pras.c.d.a("Error adding session_id to additionalFields", e);
            }
        }
        return jSONObject;
    }

    public String getCDNUrl(WebStage webStage) {
        return "";
    }

    public abstract String getESContext();

    public Uri.Builder getFormattedUrl(WebStage webStage) {
        if (isSessionFlow()) {
            com.playtika.pras.c.d.a("Session flow - loading clean URL, widget will get data from getInitData()");
            return new Uri.Builder().encodedPath(getCDNUrl(webStage) + "/index.html");
        }
        String stageNameParam = getStageNameParam();
        String serverHost = StagesApi.getInstance().getServerHost();
        Uri.Builder appendQueryParameter = new Uri.Builder().encodedPath(getCDNUrl(webStage) + "/index.html").appendQueryParameter("ppsUrl", com.playtika.pras.c.g.a(stageNameParam, serverHost) + "/payment-service/3.1").appendQueryParameter("esUrl", com.playtika.pras.c.g.a(stageNameParam, serverHost) + "/event-stream/events").appendQueryParameter("envName", stageNameParam).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.mRequestParams.getPackageName()).appendQueryParameter("platform", this.mRequestParams.getPlatform());
        com.playtika.pras.d.a aVar = this.es;
        if (aVar != null) {
            appendQueryParameter.appendQueryParameter("esRuntimeGuid", aVar.a);
        }
        String str = this.widgetRuntimeGuid;
        if (str != null) {
            appendQueryParameter.appendQueryParameter("widgetRuntimeGuid", str);
        }
        if (serverHost != null) {
            appendQueryParameter.appendQueryParameter("apiHost", serverHost);
        }
        DeviceInfo deviceInfoParam = getDeviceInfoParam();
        if (deviceInfoParam != null) {
            if (deviceInfoParam.getNetworkType() != null) {
                appendQueryParameter.appendQueryParameter("connectionType", deviceInfoParam.getNetworkType());
            }
            if (deviceInfoParam.getVendor() != null) {
                appendQueryParameter.appendQueryParameter("vendor", deviceInfoParam.getVendor());
            }
            if (deviceInfoParam.getModel() != null) {
                appendQueryParameter.appendQueryParameter("model", deviceInfoParam.getModel());
            }
            if (deviceInfoParam.getSdkAndroidId() != null) {
                appendQueryParameter.appendQueryParameter("sdkAndroidId", deviceInfoParam.getSdkAndroidId());
            }
            if (deviceInfoParam.getType() != null) {
                appendQueryParameter.appendQueryParameter("type", deviceInfoParam.getType());
            }
        }
        if (webStage != null) {
            try {
                JSONObject additionalParams = webStage.getAdditionalParams();
                if (additionalParams != null) {
                    Iterator<String> keys = additionalParams.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = additionalParams.get(next);
                        if (obj instanceof String) {
                            appendQueryParameter.appendQueryParameter(next, obj.toString());
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (!TextUtils.isEmpty(this.mRequestParams.getAppUserId())) {
            appendQueryParameter.appendQueryParameter("appUid", this.mRequestParams.getAppUserId());
        }
        if (!TextUtils.isEmpty(this.mRequestParams.getAppSessionId())) {
            appendQueryParameter.appendQueryParameter(JsonStorageKeyNames.SESSION_ID_KEY, this.mRequestParams.getAppSessionId());
        }
        if (!TextUtils.isEmpty(this.mRequestParams.getAppUserToken())) {
            appendQueryParameter.appendQueryParameter("appUserToken", this.mRequestParams.getAppUserToken());
        }
        if (!TextUtils.isEmpty(this.mRequestParams.getClientType())) {
            appendQueryParameter.appendQueryParameter("clientType", this.mRequestParams.getClientType());
        }
        if (!TextUtils.isEmpty(this.mRequestParams.getLocale())) {
            appendQueryParameter.appendQueryParameter(Device.JsonKeys.LOCALE, this.mRequestParams.getLocale());
        }
        appendQueryParameter.appendQueryParameter("sdkVersionCode", Integer.toString(this.mRequestParams.getSdkVersionCode()));
        appendQueryParameter.appendQueryParameter("appVersionCode", Long.toString(this.mRequestParams.getAppVersionCode()));
        appendQueryParameter.appendQueryParameter("responseCodePendingAllowed", "true");
        appendQueryParameter.appendQueryParameter("redirectPMOpenMode", getRedirectPMOpenMode());
        return appendQueryParameter;
    }

    @Override // com.playtika.pras.e.h
    public String getInitData() {
        WidgetSessionData widgetSessionData = this.widgetSessionData;
        if (widgetSessionData == null) {
            com.playtika.pras.c.d.a("No session data available for getInitData()");
            return null;
        }
        try {
            String json = widgetSessionData.toJson();
            com.playtika.pras.c.d.a("getInitData() returning session flow data: " + json);
            return json;
        } catch (JSONException e) {
            com.playtika.pras.c.d.a("Error serializing session data to JSON", e);
            return null;
        }
    }

    @Override // com.playtika.pras.e.h
    public String getOrientation() {
        try {
            int requestedOrientation = requireActivity().getRequestedOrientation();
            if (requestedOrientation == -1) {
                return "unspecified";
            }
            if (requestedOrientation == 0) {
                return X3.i.C;
            }
            if (requestedOrientation == 1) {
                return X3.i.D;
            }
            if (requestedOrientation == 4) {
                return "sensor";
            }
            switch (requestedOrientation) {
                case 6:
                    return "sensor_landscape";
                case 7:
                    return "sensor_portrait";
                case 8:
                    return "reverse_landscape";
                case 9:
                    return "reverse_portrait";
                case 10:
                    return "full_sensor";
                default:
                    return "unknown";
            }
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public abstract String getProductTitleForSession();

    public String getWidgetClosedEventType() {
        return "result_webview_close_clicked";
    }

    public String getWidgetLoadingStartEventType() {
        return "result_webview_loading_start";
    }

    public String getWidgetLoadingSuccessEventType() {
        return "result_webview_loading_success";
    }

    @Override // com.playtika.pras.e.h
    public boolean isPackageInstalled(String str) {
        try {
            return requireContext().getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isSessionFlow() {
        return this.widgetSessionData != null;
    }

    public abstract Boolean isSettingsWidget();

    @Override // com.playtika.pras.e.h
    public void loadingCompleted() {
        showWebView();
        try {
            JSONObject createAdditionalFieldsWithSessionId = createAdditionalFieldsWithSessionId();
            createAdditionalFieldsWithSessionId.put("attempt_number", this.currentRetryAttempt);
            createAdditionalFieldsWithSessionId.put("widget_runtime_guid", this.widgetRuntimeGuid);
            sendAnalyticsContextEvent(getWidgetLoadingSuccessEventType(), getESContext(), createAdditionalFieldsWithSessionId);
        } catch (JSONException unused) {
            sendAnalyticsContextEvent(getWidgetLoadingSuccessEventType(), getESContext());
        }
        this.currentRetryAttempt = 0;
        this.currentTimeoutMs = 0;
        this.widgetLoadUrl = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == REDIRECTION_REQUEST_CODE) {
            g gVar = this.webViewActionsListener;
            if (gVar != null) {
                gVar.onAfterExternalBrowserClosed();
            }
            if (i2 == -1) {
                Uri data = intent != null ? intent.getData() : null;
                if (data != null) {
                    onRedirectionResult(i, j.a, data);
                } else {
                    onRedirectionResult(i, j.b, null);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.playtika.pras.e.h
    public void onAfterExternalBrowserClosed() {
        g gVar = this.webViewActionsListener;
        if (gVar != null) {
            gVar.onAfterExternalBrowserClosed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof g)) {
            throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
        }
        this.webViewActionsListener = (g) context;
    }

    @Override // com.playtika.pras.e.h
    public void onBeforeExternalBrowserOpened(String str) {
        g gVar = this.webViewActionsListener;
        if (gVar != null) {
            gVar.onBeforeExternalBrowserOpened(str);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ViewGroup.LayoutParams layoutParams;
        super.onConfigurationChanged(configuration);
        i iVar = this.mWebView;
        if (iVar == null || (layoutParams = iVar.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -2;
        this.mWebView.setLayoutParams(layoutParams);
        this.mWebView.post(new b(this, layoutParams));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.web_view_container, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        clearTimer();
        i iVar = this.mWebView;
        if (iVar != null) {
            iVar.removeJavascriptInterface("APP");
            this.mWebView.destroy();
            this.mWebView = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.webViewActionsListener = null;
    }

    @Override // com.playtika.pras.e.h
    public void onResult(String str) {
        Bundle bundle;
        com.playtika.pras.c.d.a("result data: " + str);
        try {
            bundle = new BillingResult(ResponseCode.fromCode(new JSONObject(str).getInt("responseCode"))).toBundle();
        } catch (JSONException unused) {
            bundle = new BillingResult(ResponseCode.RESULT_ERROR).toBundle();
        }
        closeWidget(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.widgetRuntimeGuid = UUID.randomUUID().toString();
        if (SdkConfig.isDynamicConfigFlow()) {
            doOnViewCreated(view, null);
        } else {
            StagesApi.getInstance().getWebStage(new com.playtika.pras.e.a(this, view), getESContext());
        }
    }

    @Override // com.playtika.pras.e.h
    public void openWebPage(String str) {
        g gVar = this.webViewActionsListener;
        if (gVar != null) {
            gVar.onBeforeExternalBrowserOpened("payment");
        }
        Intent intent = new Intent(getContext(), (Class<?>) RedirectionWebViewActivity.class);
        intent.putExtra("RedirectionWebViewActivity.RedirectUri", getReturnUrlScheme());
        intent.setData(Uri.parse(str));
        safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(this, intent, REDIRECTION_REQUEST_CODE);
    }

    public void sendAnalyticsContextEvent(String str, String str2) {
        com.playtika.pras.d.a aVar = this.es;
        if (aVar != null) {
            aVar.getClass();
            JSONObject a = aVar.a(str, str2, "PRAS_SDK_WIDGETS");
            if (a != null) {
                aVar.a(a, false);
            }
        }
    }

    public void sendAnalyticsErrorEvent(String str, String str2, String str3) {
        com.playtika.pras.d.a aVar = this.es;
        if (aVar != null) {
            aVar.a(str, str2, str3, com.playtika.pras.d.b.PRAS_SDK_WIDGETS_EXCEPTIONS, false);
        }
    }

    @Override // com.playtika.pras.e.h
    public void setDoneButtonKeyboardMode(boolean z) {
        i iVar = this.mWebView;
        if (iVar != null) {
            iVar.setDoneButtonKeyboardMode(z);
        }
    }

    @Override // com.playtika.pras.e.h
    public void setOrientation(String str) {
        if (this.webViewActionsListener != null) {
            try {
                requireActivity().runOnUiThread(new c(this, str));
            } catch (Exception unused) {
            }
        }
    }

    public void setPaypalWaiting() {
        i iVar = this.mWebView;
        if (iVar != null) {
            iVar.post(new com.playtika.pras.c.c(iVar, "if (typeof window.setPaypalWaiting === 'function') {  window.setPaypalWaiting();}"));
        }
    }

    @Override // com.playtika.pras.e.h
    public abstract /* synthetic */ void setResult(String str);

    @Override // com.playtika.pras.e.h
    public void setScrollKeyboard(boolean z) {
        this.scrollWebViewKeyboardEnabled = Boolean.valueOf(z);
    }

    public void setupWebView(View view, String str) {
        this.mWebView = createWebView();
        ((ViewGroup) view.findViewById(R.id.web_view_container)).addView(this.mWebView);
        WebSettings settings = this.mWebView.getSettings();
        settings.setCacheMode(-1);
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        if (WebViewFeature.isFeatureSupported("PAYMENT_REQUEST")) {
            WebSettingsCompat.setPaymentRequestEnabled(settings, true);
        }
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setTextZoom(100);
        settings.setDomStorageEnabled(true);
        JSInterface jSInterface = new JSInterface(this);
        this.jsInterface = jSInterface;
        this.mWebView.addJavascriptInterface(jSInterface, "APP");
        this.mWebView.setWebViewClient(new f(this, str));
        g gVar = this.webViewActionsListener;
        if (gVar != null) {
            gVar.a(this.mWebView);
        }
    }

    public void sendAnalyticsErrorEvent(String str, String str2, String str3, JSONObject jSONObject) {
        com.playtika.pras.d.a aVar = this.es;
        if (aVar != null) {
            aVar.a(str, str2, str3, com.playtika.pras.d.b.PRAS_SDK_WIDGETS_EXCEPTIONS, jSONObject);
        }
    }

    public void sendAnalyticsContextEvent(String str, String str2, JSONObject jSONObject) {
        com.playtika.pras.d.a aVar = this.es;
        if (aVar != null) {
            aVar.a(str, str2, com.playtika.pras.d.b.PRAS_SDK_WIDGETS, jSONObject);
        }
    }
}
