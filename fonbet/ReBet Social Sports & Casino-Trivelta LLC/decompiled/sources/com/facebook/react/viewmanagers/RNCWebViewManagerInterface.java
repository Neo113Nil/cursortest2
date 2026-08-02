package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNCWebViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void clearCache(T t10, boolean z10);

    void clearFormData(T t10);

    void clearHistory(T t10);

    void goBack(T t10);

    void goForward(T t10);

    void injectJavaScript(T t10, String str);

    void loadUrl(T t10, String str);

    void postMessage(T t10, String str);

    void reload(T t10);

    void requestFocus(T t10);

    void setAllowFileAccess(T t10, boolean z10);

    void setAllowFileAccessFromFileURLs(T t10, boolean z10);

    void setAllowUniversalAccessFromFileURLs(T t10, boolean z10);

    void setAllowingReadAccessToURL(T t10, String str);

    void setAllowsAirPlayForMediaPlayback(T t10, boolean z10);

    void setAllowsBackForwardNavigationGestures(T t10, boolean z10);

    void setAllowsFullscreenVideo(T t10, boolean z10);

    void setAllowsInlineMediaPlayback(T t10, boolean z10);

    void setAllowsLinkPreview(T t10, boolean z10);

    void setAllowsPictureInPictureMediaPlayback(T t10, boolean z10);

    void setAllowsProtectedMedia(T t10, boolean z10);

    void setAndroidLayerType(T t10, String str);

    void setApplicationNameForUserAgent(T t10, String str);

    void setAutoManageStatusBarEnabled(T t10, boolean z10);

    void setAutomaticallyAdjustContentInsets(T t10, boolean z10);

    void setBasicAuthCredential(T t10, ReadableMap readableMap);

    void setBounces(T t10, boolean z10);

    void setCacheEnabled(T t10, boolean z10);

    void setCacheMode(T t10, String str);

    void setContentInset(T t10, ReadableMap readableMap);

    void setContentInsetAdjustmentBehavior(T t10, String str);

    void setContentMode(T t10, String str);

    void setDataDetectorTypes(T t10, ReadableArray readableArray);

    void setDecelerationRate(T t10, double d10);

    void setDirectionalLockEnabled(T t10, boolean z10);

    void setDomStorageEnabled(T t10, boolean z10);

    void setDownloadingMessage(T t10, String str);

    void setEnableApplePay(T t10, boolean z10);

    void setForceDarkOn(T t10, boolean z10);

    void setFraudulentWebsiteWarningEnabled(T t10, boolean z10);

    void setGeolocationEnabled(T t10, boolean z10);

    void setHasOnFileDownload(T t10, boolean z10);

    void setHasOnOpenWindowEvent(T t10, boolean z10);

    void setHasOnScroll(T t10, boolean z10);

    void setHideKeyboardAccessoryView(T t10, boolean z10);

    void setIncognito(T t10, boolean z10);

    void setIndicatorStyle(T t10, String str);

    void setInjectedJavaScript(T t10, String str);

    void setInjectedJavaScriptBeforeContentLoaded(T t10, String str);

    void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(T t10, boolean z10);

    void setInjectedJavaScriptForMainFrameOnly(T t10, boolean z10);

    void setInjectedJavaScriptObject(T t10, String str);

    void setJavaScriptCanOpenWindowsAutomatically(T t10, boolean z10);

    void setJavaScriptEnabled(T t10, boolean z10);

    void setKeyboardDisplayRequiresUserAction(T t10, boolean z10);

    void setLackPermissionToDownloadMessage(T t10, String str);

    void setLimitsNavigationsToAppBoundDomains(T t10, boolean z10);

    void setMediaCapturePermissionGrantType(T t10, String str);

    void setMediaPlaybackRequiresUserAction(T t10, boolean z10);

    void setMenuItems(T t10, ReadableArray readableArray);

    void setMessagingEnabled(T t10, boolean z10);

    void setMessagingModuleName(T t10, String str);

    void setMinimumFontSize(T t10, int i10);

    void setMixedContentMode(T t10, String str);

    void setNestedScrollEnabled(T t10, boolean z10);

    void setNewSource(T t10, ReadableMap readableMap);

    void setOverScrollMode(T t10, String str);

    void setPagingEnabled(T t10, boolean z10);

    void setPaymentRequestEnabled(T t10, boolean z10);

    void setPullToRefreshEnabled(T t10, boolean z10);

    void setRefreshControlLightMode(T t10, boolean z10);

    void setSaveFormDataDisabled(T t10, boolean z10);

    void setScalesPageToFit(T t10, boolean z10);

    void setScrollEnabled(T t10, boolean z10);

    void setSetBuiltInZoomControls(T t10, boolean z10);

    void setSetDisplayZoomControls(T t10, boolean z10);

    void setSetSupportMultipleWindows(T t10, boolean z10);

    void setSharedCookiesEnabled(T t10, boolean z10);

    void setShowsHorizontalScrollIndicator(T t10, boolean z10);

    void setShowsVerticalScrollIndicator(T t10, boolean z10);

    void setSuppressMenuItems(T t10, ReadableArray readableArray);

    void setTextInteractionEnabled(T t10, boolean z10);

    void setTextZoom(T t10, int i10);

    void setThirdPartyCookiesEnabled(T t10, boolean z10);

    void setUseSharedProcessPool(T t10, boolean z10);

    void setUserAgent(T t10, String str);

    void setWebviewDebuggingEnabled(T t10, boolean z10);

    void stopLoading(T t10);
}
