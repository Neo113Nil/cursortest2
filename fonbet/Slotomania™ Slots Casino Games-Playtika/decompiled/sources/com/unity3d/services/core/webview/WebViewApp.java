package com.unity3d.services.core.webview;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.UnityCoreNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridge;
import com.vungle.ads.internal.model.AdPayload;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class WebViewApp implements IWebViewBridgeInvoker {
    private static final int INVOKE_JS_CHARS_LENGTH = 22;
    private static ConditionVariable _conditionVariable;
    private static WebViewApp _currentApp;
    private Configuration _configuration;
    private final HashMap<String, NativeCallback> _nativeCallbacks;
    private boolean _webAppLoaded;
    private WebView _webView;
    protected final IWebViewBridge _webViewBridge;
    private static final AtomicReference<Boolean> _initialized = new AtomicReference<>(false);
    private static final AtomicReference<String> _webAppFailureMessage = new AtomicReference<>();
    private static final AtomicReference<Integer> _webAppFailureCode = new AtomicReference<>();

    private WebViewApp(Configuration configuration, boolean z, boolean z2) {
        this(configuration, z, z2, SharedInstances.INSTANCE.getWebViewBridge());
    }

    private WebViewApp(Configuration configuration, boolean z, boolean z2, IWebViewBridge iWebViewBridge) {
        WebView webView;
        this._webAppLoaded = false;
        this._nativeCallbacks = new HashMap<>();
        setConfiguration(configuration);
        WebViewBridge.setClassTable(getConfiguration().getWebAppApiClassList());
        IExperiments experiments = configuration.getExperiments();
        this._webViewBridge = iWebViewBridge;
        if (z) {
            webView = new WebViewWithCache(ClientProperties.getApplicationContext(), z2, experiments);
        } else {
            webView = new WebView(ClientProperties.getApplicationContext(), z2, SharedInstances.INSTANCE.getWebViewBridge(), SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), experiments);
        }
        this._webView = webView;
        webView.setWebViewClient(new WebAppClient());
    }

    public WebViewApp() {
        this._webAppLoaded = false;
        this._nativeCallbacks = new HashMap<>();
        WebViewBridge.setClassTable(new Class[0]);
        this._webViewBridge = SharedInstances.INSTANCE.getWebViewBridge();
        _conditionVariable = new ConditionVariable();
    }

    public void setWebAppLoaded(boolean z) {
        this._webAppLoaded = z;
    }

    public boolean isWebAppLoaded() {
        return this._webAppLoaded;
    }

    public void setWebAppFailureMessage(String str) {
        _webAppFailureMessage.set(str);
    }

    public void setWebAppFailureCode(int i) {
        _webAppFailureCode.set(Integer.valueOf(i));
    }

    public String getWebAppFailureMessage() {
        return _webAppFailureMessage.get();
    }

    public int getWebAppFailureCode() {
        return _webAppFailureCode.get().intValue();
    }

    public void setWebAppInitialized(boolean z) {
        _initialized.set(Boolean.valueOf(z));
        _conditionVariable.open();
    }

    public void resetWebViewAppInitialization() {
        this._webAppLoaded = false;
        _webAppFailureCode.set(-1);
        _webAppFailureMessage.set("");
        _initialized.set(false);
    }

    public boolean isWebAppInitialized() {
        return _initialized.get().booleanValue();
    }

    public WebView getWebView() {
        return this._webView;
    }

    public void setWebView(WebView webView) {
        this._webView = webView;
    }

    public Configuration getConfiguration() {
        return this._configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this._configuration = configuration;
    }

    private void invokeJavascriptMethod(String str, String str2, JSONArray jSONArray) {
        String buildInvokeJavascript = buildInvokeJavascript(str, str2, jSONArray);
        DeviceLog.debug("Invoking javascript: %s", buildInvokeJavascript);
        getWebView().evaluateJavascript(buildInvokeJavascript, null);
    }

    private String buildInvokeJavascript(String str, String str2, JSONArray jSONArray) {
        String jSONArray2 = jSONArray.toString();
        StringBuilder sb = new StringBuilder(str.length() + 22 + str2.length() + jSONArray2.length());
        sb.append("javascript:window.");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        sb.append("(");
        sb.append(jSONArray2);
        sb.append(");");
        return sb.toString();
    }

    public boolean sendEvent(Enum r6, Enum r7, Object... objArr) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("sendEvent ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(r6.name());
        jSONArray.put(r7.name());
        for (Object obj : objArr) {
            jSONArray.put(obj);
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleEvent", jSONArray);
            return true;
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while sending event to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap<String, String>(r6, r7) { // from class: com.unity3d.services.core.webview.WebViewApp.1
                final /* synthetic */ Enum val$eventCategory;
                final /* synthetic */ Enum val$eventId;

                {
                    this.val$eventCategory = r6;
                    this.val$eventId = r7;
                    put("src", "handleEvent");
                    put("eventCategory", r6.name());
                    put("eventId", r7.name());
                }
            });
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error while sending event to WebView", e);
            return false;
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
    public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeMethod ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        if (method != null) {
            NativeCallback nativeCallback = new NativeCallback(method);
            addCallback(nativeCallback);
            jSONArray.put(nativeCallback.getId());
        } else {
            jSONArray.put((Object) null);
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                jSONArray.put(obj);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleInvocation", jSONArray);
            return true;
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while handling invocation to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap<String, String>(str, str2) { // from class: com.unity3d.services.core.webview.WebViewApp.2
                final /* synthetic */ String val$className;
                final /* synthetic */ String val$methodName;

                {
                    this.val$className = str;
                    this.val$methodName = str2;
                    put("src", "handleInvocation");
                    put("className", str);
                    put("methodName", str2);
                }
            });
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error invoking javascript method", e);
            return false;
        }
    }

    public boolean invokeCallback(Invocation invocation) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeBatchCallback ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList<ArrayList<Object>> responses = invocation.getResponses();
        if (responses != null && !responses.isEmpty()) {
            Iterator<ArrayList<Object>> it = responses.iterator();
            while (it.hasNext()) {
                ArrayList<Object> next = it.next();
                CallbackStatus callbackStatus = (CallbackStatus) next.get(0);
                Enum r6 = (Enum) next.get(1);
                Object[] objArr = (Object[]) next.get(2);
                String str = (String) objArr[0];
                Object[] copyOfRange = Arrays.copyOfRange(objArr, 1, objArr.length);
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                arrayList.add(callbackStatus.toString());
                JSONArray jSONArray2 = new JSONArray();
                if (r6 != null) {
                    jSONArray2.put(r6.name());
                }
                for (Object obj : copyOfRange) {
                    jSONArray2.put(obj);
                }
                arrayList.add(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONArray.put(jSONArray3);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleCallback", jSONArray);
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while invoking callback to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap<String, String>(invocation) { // from class: com.unity3d.services.core.webview.WebViewApp.3
                final /* synthetic */ Invocation val$invocation;

                {
                    this.val$invocation = invocation;
                    put("src", "handleCallback");
                    put("invocation", invocation.toString());
                }
            });
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error while invoking batch response for WebView", e);
        }
        return true;
    }

    public void addCallback(NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.put(nativeCallback.getId(), nativeCallback);
        }
    }

    public void removeCallback(NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.remove(nativeCallback.getId());
        }
    }

    public NativeCallback getCallback(String str) {
        NativeCallback nativeCallback;
        synchronized (this._nativeCallbacks) {
            nativeCallback = this._nativeCallbacks.get(str);
        }
        return nativeCallback;
    }

    public static WebViewApp getCurrentApp() {
        return _currentApp;
    }

    public static void setCurrentApp(WebViewApp webViewApp) {
        _currentApp = webViewApp;
    }

    public static ErrorState create(Configuration configuration) throws IllegalThreadStateException {
        return create(configuration, false);
    }

    public static ErrorState create(final Configuration configuration, boolean z) throws IllegalThreadStateException {
        DeviceLog.entered();
        if (z) {
            return createWithRemoteUrl(configuration);
        }
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Configuration configuration2 = Configuration.this;
                    WebViewApp webViewApp = new WebViewApp(configuration2, configuration2.getExperiments().isWebAssetAdCaching(), Configuration.this.getExperiments().isWebGestureNotRequired());
                    UnityCoreNetworkBridge.webviewLoadDataWithBaseURL(webViewApp.getWebView(), new WebViewUrlBuilder(AdPayload.FILE_SCHEME + SdkProperties.getLocalWebViewFile(), Configuration.this).getUrlWithQueryString(), Configuration.this.getWebViewData(), "text/html", C.UTF8_NAME, null);
                    WebViewApp.setCurrentApp(webViewApp);
                } catch (Exception e) {
                    DeviceLog.error("Unity Ads SDK unable to create WebViewApp " + e.getMessage());
                    WebViewApp._conditionVariable.open();
                }
            }
        });
        ConditionVariable conditionVariable = new ConditionVariable();
        _conditionVariable = conditionVariable;
        boolean block = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z2 = getCurrentApp() != null;
        boolean z3 = z2 && getCurrentApp().isWebAppInitialized();
        if (block && z2 && z3) {
            return null;
        }
        if (!block) {
            return ErrorState.CreateWebviewTimeout;
        }
        if (getCurrentApp() == null) {
            return ErrorState.CreateWebview;
        }
        return getCurrentApp().getErrorStateFromWebAppCode();
    }

    private static ErrorState createWithRemoteUrl(final Configuration configuration) {
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Configuration configuration2 = Configuration.this;
                    WebViewApp webViewApp = new WebViewApp(configuration2, true, configuration2.getExperiments().isWebGestureNotRequired());
                    webViewApp.getWebView().loadUrl(new WebViewUrlBuilder(Configuration.this.getWebViewUrl(), Configuration.this).getUrlWithQueryString());
                    WebViewApp.setCurrentApp(webViewApp);
                } catch (Exception unused) {
                    DeviceLog.error("Unity Ads SDK unable to create WebViewApp");
                    WebViewApp._conditionVariable.open();
                }
            }
        });
        ConditionVariable conditionVariable = new ConditionVariable();
        _conditionVariable = conditionVariable;
        boolean block = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z = getCurrentApp() != null;
        boolean z2 = z && getCurrentApp().isWebAppInitialized();
        if (block && z && z2) {
            return null;
        }
        if (!block) {
            return ErrorState.CreateWebviewTimeout;
        }
        if (getCurrentApp() == null) {
            return ErrorState.CreateWebview;
        }
        return getCurrentApp().getErrorStateFromWebAppCode();
    }

    public ErrorState getErrorStateFromWebAppCode() {
        int webAppFailureCode = getWebAppFailureCode();
        if (webAppFailureCode == 1) {
            return ErrorState.CreateWebviewGameIdDisabled;
        }
        if (webAppFailureCode == 2) {
            return ErrorState.CreateWebviewConfigError;
        }
        if (webAppFailureCode == 3) {
            return ErrorState.CreateWebviewInvalidArgument;
        }
        return ErrorState.CreateWebview;
    }

    private static class WebAppClient extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onLoadResource(android.webkit.WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(h.m, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(h.m, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/WebViewApp$WebAppClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
            BrandSafetyUtils.onWebViewReceivedError(h.m, webView, webResourceRequest, webResourceError);
            safedk_WebViewApp$WebAppClient_onReceivedError_0fc2ec921ce958561d178251ce8fae2e(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(h.m, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
            Logger.d("UnityCore|SafeDK: Execution> Lcom/unity3d/services/core/webview/WebViewApp$WebAppClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_WebViewApp$WebAppClient_shouldOverrideUrlLoading_54eebbc9c83f5e2c874e122cf9bd3001 = safedk_WebViewApp$WebAppClient_shouldOverrideUrlLoading_54eebbc9c83f5e2c874e122cf9bd3001(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(h.m, webView, str, safedk_WebViewApp$WebAppClient_shouldOverrideUrlLoading_54eebbc9c83f5e2c874e122cf9bd3001);
            return safedk_WebViewApp$WebAppClient_shouldOverrideUrlLoading_54eebbc9c83f5e2c874e122cf9bd3001;
        }

        private WebAppClient() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.WebAppClient.1
                @Override // java.lang.Runnable
                public void run() {
                    if (AdUnit.getAdUnitActivity() != null) {
                        AdUnit.getAdUnitActivity().finish();
                    }
                    if (WebViewApp.getCurrentApp() != null && WebViewApp.getCurrentApp().getWebView() != null) {
                        ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
                    }
                    InitializeThread.reset();
                }
            });
            DeviceLog.error("UnityAds SDK WebView render process gone with following reason : " + renderProcessGoneDetail.toString());
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_render_process_gone", null, new HashMap<String, String>(renderProcessGoneDetail) { // from class: com.unity3d.services.core.webview.WebViewApp.WebAppClient.2
                final /* synthetic */ RenderProcessGoneDetail val$detail;

                {
                    this.val$detail = renderProcessGoneDetail;
                    if (Build.VERSION.SDK_INT >= 26) {
                        put("dc", "" + renderProcessGoneDetail.didCrash());
                        put("pae", "" + renderProcessGoneDetail.rendererPriorityAtExit());
                    }
                }
            });
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, String str) {
            super.onPageFinished(webView, str);
            DeviceLog.debug("Unity Ads SDK finished loading URL inside WebView: " + str);
        }

        public boolean safedk_WebViewApp$WebAppClient_shouldOverrideUrlLoading_54eebbc9c83f5e2c874e122cf9bd3001(android.webkit.WebView p0, String p1) {
            DeviceLog.debug("Unity Ads SDK attempts to load URL inside WebView: " + p1);
            return false;
        }

        public void safedk_WebViewApp$WebAppClient_onReceivedError_0fc2ec921ce958561d178251ce8fae2e(android.webkit.WebView p0, WebResourceRequest p1, WebResourceError p2) {
            super.onReceivedError(p0, p1, p2);
            if (p1 != null && p2 != null) {
                DeviceLog.error("Unity Ads SDK encountered an error (code: " + p2.getErrorCode() + ")  in WebView while loading a resource " + p1.getUrl());
            } else if (p1 != null) {
                DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource " + p1.getUrl());
            } else {
                DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource");
            }
        }
    }
}
