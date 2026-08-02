package com.reactnativecommunity.webview;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNCWebViewManagerDelegate;
import com.facebook.react.viewmanagers.RNCWebViewManagerInterface;
import com.facebook.react.views.scroll.ScrollEventType;
import com.twilio.voice.EventKeys;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = "RNCWebView")
/* loaded from: classes4.dex */
public class RNCWebViewManager extends ViewGroupManager<p> implements RNCWebViewManagerInterface<p> {
    private final ViewManagerDelegate<p> mDelegate = new RNCWebViewManagerDelegate(this);
    private final k mRNCWebViewManagerImpl = new k(true);

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return this.mRNCWebViewManagerImpl.g();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<p> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = MapBuilder.newHashMap();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", MapBuilder.of("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", MapBuilder.of("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", MapBuilder.of("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topLoadingSubResourceError", MapBuilder.of("registrationName", "onLoadingSubResourceError"));
        exportedCustomDirectEventTypeConstants.put("topMessage", MapBuilder.of("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", MapBuilder.of("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", MapBuilder.of("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), MapBuilder.of("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", MapBuilder.of("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", MapBuilder.of("registrationName", "onRenderProcessGone"));
        exportedCustomDirectEventTypeConstants.put("topCustomMenuSelection", MapBuilder.of("registrationName", "onCustomMenuSelection"));
        exportedCustomDirectEventTypeConstants.put("topOpenWindow", MapBuilder.of("registrationName", "onOpenWindow"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNCWebView";
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowingReadAccessToURL(p pVar, String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowsAirPlayForMediaPlayback(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowsBackForwardNavigationGestures(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowsInlineMediaPlayback(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowsLinkPreview(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAllowsPictureInPictureMediaPlayback(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAutoManageStatusBarEnabled(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setAutomaticallyAdjustContentInsets(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setBounces(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setContentInset(p pVar, ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setContentInsetAdjustmentBehavior(p pVar, String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setContentMode(p pVar, String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setDataDetectorTypes(p pVar, ReadableArray readableArray) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setDecelerationRate(p pVar, double d10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setDirectionalLockEnabled(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setEnableApplePay(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setFraudulentWebsiteWarningEnabled(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setHasOnFileDownload(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setHideKeyboardAccessoryView(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setIndicatorStyle(p pVar, String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setKeyboardDisplayRequiresUserAction(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setLimitsNavigationsToAppBoundDomains(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setMediaCapturePermissionGrantType(p pVar, String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setPagingEnabled(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setPullToRefreshEnabled(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setRefreshControlLightMode(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setScrollEnabled(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setSharedCookiesEnabled(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "suppressMenuItems")
    public void setSuppressMenuItems(p pVar, ReadableArray readableArray) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setTextInteractionEnabled(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void setUseSharedProcessPool(p pVar, boolean z10) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NonNull ThemedReactContext themedReactContext, p pVar) {
        pVar.getWebView().setWebViewClient(new g());
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void clearCache(p pVar, boolean z10) {
        pVar.getWebView().clearCache(z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void clearFormData(p pVar) {
        pVar.getWebView().clearFormData();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void clearHistory(p pVar) {
        pVar.getWebView().clearHistory();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public p createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return this.mRNCWebViewManagerImpl.d(themedReactContext);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void goBack(p pVar) {
        pVar.getWebView().goBack();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void goForward(p pVar) {
        pVar.getWebView().goForward();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void injectJavaScript(p pVar, String str) {
        pVar.getWebView().h(str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void loadUrl(p pVar, String str) {
        pVar.getWebView().loadUrl(str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull p pVar) {
        super.onAfterUpdateTransaction((RNCWebViewManager) pVar);
        this.mRNCWebViewManagerImpl.l(pVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull p pVar) {
        this.mRNCWebViewManagerImpl.m(pVar);
        super.onDropViewInstance((RNCWebViewManager) pVar);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void postMessage(p pVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(EventKeys.DATA, str);
            pVar.getWebView().h("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull p pVar, String str, ReadableArray readableArray) {
        super.receiveCommand((RNCWebViewManager) pVar, str, readableArray);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void reload(p pVar) {
        pVar.getWebView().reload();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void requestFocus(p pVar) {
        pVar.requestFocus();
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.n(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.o(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.p(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.q(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "allowsProtectedMedia")
    public void setAllowsProtectedMedia(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.r(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "androidLayerType")
    public void setAndroidLayerType(p pVar, String str) {
        this.mRNCWebViewManagerImpl.s(pVar, str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(p pVar, String str) {
        this.mRNCWebViewManagerImpl.t(pVar, str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "basicAuthCredential")
    public void setBasicAuthCredential(p pVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.u(pVar, readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "cacheEnabled")
    public void setCacheEnabled(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.v(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "cacheMode")
    public void setCacheMode(p pVar, String str) {
        this.mRNCWebViewManagerImpl.w(pVar, str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.x(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "downloadingMessage")
    public void setDownloadingMessage(p pVar, String str) {
        this.mRNCWebViewManagerImpl.y(str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "forceDarkOn")
    public void setForceDarkOn(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.z(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "geolocationEnabled")
    public void setGeolocationEnabled(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.A(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "hasOnOpenWindowEvent")
    public void setHasOnOpenWindowEvent(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.B(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "hasOnScroll")
    public void setHasOnScroll(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.C(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "incognito")
    public void setIncognito(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.D(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(p pVar, String str) {
        this.mRNCWebViewManagerImpl.E(pVar, str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(p pVar, String str) {
        this.mRNCWebViewManagerImpl.F(pVar, str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.G(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.H(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "injectedJavaScriptObject")
    public void setInjectedJavaScriptObject(p pVar, String str) {
        this.mRNCWebViewManagerImpl.I(pVar, str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.J(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.K(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownloadMessage(p pVar, String str) {
        this.mRNCWebViewManagerImpl.L(str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.M(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "menuItems")
    public void setMenuItems(p pVar, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.N(pVar, readableArray);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.O(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "messagingModuleName")
    public void setMessagingModuleName(p pVar, String str) {
        this.mRNCWebViewManagerImpl.P(pVar, str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "minimumFontSize")
    public void setMinimumFontSize(p pVar, int i10) {
        this.mRNCWebViewManagerImpl.Q(pVar, i10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "mixedContentMode")
    public void setMixedContentMode(p pVar, String str) {
        this.mRNCWebViewManagerImpl.R(pVar, str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.S(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "newSource")
    public void setNewSource(p pVar, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.c0(pVar, readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(p pVar, String str) {
        this.mRNCWebViewManagerImpl.T(pVar, str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "paymentRequestEnabled")
    public void setPaymentRequestEnabled(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.U(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.V(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.W(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "setBuiltInZoomControls")
    public void setSetBuiltInZoomControls(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.X(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "setDisplayZoomControls")
    public void setSetDisplayZoomControls(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.Y(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "setSupportMultipleWindows")
    public void setSetSupportMultipleWindows(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.Z(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.a0(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.b0(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "textZoom")
    public void setTextZoom(p pVar, int i10) {
        this.mRNCWebViewManagerImpl.d0(pVar, i10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.e0(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "userAgent")
    public void setUserAgent(p pVar, String str) {
        this.mRNCWebViewManagerImpl.f0(pVar, str);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    @ReactProp(name = "webviewDebuggingEnabled")
    public void setWebviewDebuggingEnabled(p pVar, boolean z10) {
        this.mRNCWebViewManagerImpl.h0(pVar, z10);
    }

    @Override // com.facebook.react.viewmanagers.RNCWebViewManagerInterface
    public void stopLoading(p pVar) {
        pVar.getWebView().stopLoading();
    }
}
