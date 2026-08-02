package com.getcapacitor.cordova;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.getcapacitor.ViewBridge;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.List;
import java.util.Map;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewEngine;
import org.apache.cordova.ICordovaCookieManager;
import org.apache.cordova.NativeToJsMessageQueue;
import org.apache.cordova.PluginEntry;
import org.apache.cordova.PluginManager;
import org.apache.cordova.PluginResult;

/* loaded from: classes2.dex */
public class MockCordovaWebViewImpl implements CordovaWebView {
    private Context context;
    private CapacitorCordovaCookieManager cookieManager;

    /* renamed from: cordova, reason: collision with root package name */
    private CordovaInterface f3344cordova;
    private boolean hasPausedEver;
    private NativeToJsMessageQueue nativeToJsMessageQueue;
    private PluginManager pluginManager;
    private CordovaPreferences preferences;
    private CordovaResourceApi resourceApi;
    private ViewBridge webViewBridge;

    @Override // org.apache.cordova.CordovaWebView
    public boolean backHistory() {
        return false;
    }

    @Override // org.apache.cordova.CordovaWebView
    public boolean canGoBack() {
        return false;
    }

    @Override // org.apache.cordova.CordovaWebView
    public void clearCache() {
    }

    @Override // org.apache.cordova.CordovaWebView
    public void clearCache(boolean z) {
    }

    @Override // org.apache.cordova.CordovaWebView
    public void clearHistory() {
    }

    @Override // org.apache.cordova.CordovaWebView
    public CordovaWebViewEngine getEngine() {
        return null;
    }

    @Override // org.apache.cordova.CordovaWebView
    public void hideCustomView() {
    }

    @Override // org.apache.cordova.CordovaWebView
    public boolean isButtonPlumbedToJs(int i) {
        return false;
    }

    @Override // org.apache.cordova.CordovaWebView
    public boolean isCustomViewShowing() {
        return false;
    }

    @Override // org.apache.cordova.CordovaWebView
    public void setButtonPlumbedToJs(int i, boolean z) {
    }

    @Override // org.apache.cordova.CordovaWebView
    public void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    @Override // org.apache.cordova.CordovaWebView
    public void showWebPage(String str, boolean z, boolean z2, Map<String, Object> map) {
    }

    @Override // org.apache.cordova.CordovaWebView
    public void stopLoading() {
    }

    public MockCordovaWebViewImpl(Context context) {
        this.context = context;
    }

    @Override // org.apache.cordova.CordovaWebView
    public void init(CordovaInterface cordovaInterface, List<PluginEntry> list, CordovaPreferences cordovaPreferences) {
        this.f3344cordova = cordovaInterface;
        this.preferences = cordovaPreferences;
        this.pluginManager = new PluginManager(this, this.f3344cordova, list);
        this.resourceApi = new CordovaResourceApi(this.context, this.pluginManager);
        this.pluginManager.init();
    }

    public void init(CordovaInterface cordovaInterface, List<PluginEntry> list, CordovaPreferences cordovaPreferences, ViewBridge viewBridge) {
        this.f3344cordova = cordovaInterface;
        this.webViewBridge = viewBridge;
        this.preferences = cordovaPreferences;
        this.pluginManager = new PluginManager(this, this.f3344cordova, list);
        this.resourceApi = new CordovaResourceApi(this.context, this.pluginManager);
        NativeToJsMessageQueue nativeToJsMessageQueue = new NativeToJsMessageQueue();
        this.nativeToJsMessageQueue = nativeToJsMessageQueue;
        nativeToJsMessageQueue.addBridgeMode(new CapacitorEvalBridgeMode(viewBridge, this.f3344cordova));
        this.nativeToJsMessageQueue.setBridgeMode(0);
        this.cookieManager = new CapacitorCordovaCookieManager(viewBridge);
        this.pluginManager.init();
    }

    public static class CapacitorEvalBridgeMode extends NativeToJsMessageQueue.BridgeMode {

        /* renamed from: cordova, reason: collision with root package name */
        private final CordovaInterface f3345cordova;
        private final ViewBridge webViewBridge;

        public CapacitorEvalBridgeMode(ViewBridge viewBridge, CordovaInterface cordovaInterface) {
            this.webViewBridge = viewBridge;
            this.f3345cordova = cordovaInterface;
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.BridgeMode
        public void onNativeToJsMessageAvailable(final NativeToJsMessageQueue nativeToJsMessageQueue) {
            this.f3345cordova.getActivity().runOnUiThread(new Runnable() { // from class: com.getcapacitor.cordova.MockCordovaWebViewImpl.CapacitorEvalBridgeMode.1
                @Override // java.lang.Runnable
                public void run() {
                    String popAndEncodeAsJs = nativeToJsMessageQueue.popAndEncodeAsJs();
                    if (popAndEncodeAsJs != null) {
                        CapacitorEvalBridgeMode.this.webViewBridge.evaluateJavascript(popAndEncodeAsJs, null);
                    }
                }
            });
        }
    }

    @Override // org.apache.cordova.CordovaWebView
    public boolean isInitialized() {
        return this.f3344cordova != null;
    }

    @Override // org.apache.cordova.CordovaWebView
    public View getView() {
        return this.webViewBridge.getView();
    }

    @Override // org.apache.cordova.CordovaWebView
    public void loadUrlIntoView(String str, boolean z) {
        if (str.equals(AndroidWebViewClient.BLANK_PAGE) || str.startsWith("javascript:")) {
            this.webViewBridge.loadUrl(str);
        }
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handlePause(boolean z) {
        if (isInitialized()) {
            this.hasPausedEver = true;
            this.pluginManager.onPause(z);
            triggerDocumentEvent("pause");
            if (z) {
                return;
            }
            setPaused(true);
        }
    }

    @Override // org.apache.cordova.CordovaWebView
    public void onNewIntent(Intent intent) {
        PluginManager pluginManager = this.pluginManager;
        if (pluginManager != null) {
            pluginManager.onNewIntent(intent);
        }
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handleResume(boolean z) {
        if (isInitialized()) {
            setPaused(false);
            this.pluginManager.onResume(z);
            if (this.hasPausedEver) {
                triggerDocumentEvent("resume");
            }
        }
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handleStart() {
        if (isInitialized()) {
            this.pluginManager.onStart();
        }
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handleStop() {
        if (isInitialized()) {
            this.pluginManager.onStop();
        }
    }

    @Override // org.apache.cordova.CordovaWebView
    public void handleDestroy() {
        if (isInitialized()) {
            this.pluginManager.onDestroy();
        }
    }

    @Override // org.apache.cordova.CordovaWebView
    public void sendJavascript(String str) {
        this.nativeToJsMessageQueue.addJavaScript(str);
    }

    public void eval(final String str, final ValueCallback<String> valueCallback) {
        new Handler(this.context.getMainLooper()).post(new Runnable() { // from class: com.getcapacitor.cordova.MockCordovaWebViewImpl.1
            @Override // java.lang.Runnable
            public void run() {
                MockCordovaWebViewImpl.this.webViewBridge.evaluateJavascript(str, valueCallback);
            }
        });
    }

    public void triggerDocumentEvent(String str) {
        eval("window.Capacitor.triggerEvent('" + str + "', 'document');", new ValueCallback<String>() { // from class: com.getcapacitor.cordova.MockCordovaWebViewImpl.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
            }
        });
    }

    @Override // org.apache.cordova.CordovaWebView
    public CordovaResourceApi getResourceApi() {
        return this.resourceApi;
    }

    @Override // org.apache.cordova.CordovaWebView
    public void sendPluginResult(PluginResult pluginResult, String str) {
        this.nativeToJsMessageQueue.addPluginResult(pluginResult, str);
    }

    @Override // org.apache.cordova.CordovaWebView
    public PluginManager getPluginManager() {
        return this.pluginManager;
    }

    @Override // org.apache.cordova.CordovaWebView
    public CordovaPreferences getPreferences() {
        return this.preferences;
    }

    @Override // org.apache.cordova.CordovaWebView
    public ICordovaCookieManager getCookieManager() {
        return this.cookieManager;
    }

    @Override // org.apache.cordova.CordovaWebView
    public String getUrl() {
        return this.webViewBridge.getUrl();
    }

    @Override // org.apache.cordova.CordovaWebView
    public Context getContext() {
        return this.webViewBridge.getContext();
    }

    @Override // org.apache.cordova.CordovaWebView
    public void loadUrl(String str) {
        loadUrlIntoView(str, true);
    }

    @Override // org.apache.cordova.CordovaWebView
    public Object postMessage(String str, Object obj) {
        return this.pluginManager.postMessage(str, obj);
    }

    public void setPaused(boolean z) {
        this.webViewBridge.setPaused(z);
    }
}
