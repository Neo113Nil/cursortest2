package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNCWebViewManagerInterface;
import kotlin.text.Typography;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes2.dex */
public class RNCWebViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNCWebViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNCWebViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t10, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "goBack":
                ((RNCWebViewManagerInterface) this.mViewManager).goBack(t10);
                break;
            case "stopLoading":
                ((RNCWebViewManagerInterface) this.mViewManager).stopLoading(t10);
                break;
            case "reload":
                ((RNCWebViewManagerInterface) this.mViewManager).reload(t10);
                break;
            case "clearCache":
                ((RNCWebViewManagerInterface) this.mViewManager).clearCache(t10, readableArray.getBoolean(0));
                break;
            case "goForward":
                ((RNCWebViewManagerInterface) this.mViewManager).goForward(t10);
                break;
            case "clearFormData":
                ((RNCWebViewManagerInterface) this.mViewManager).clearFormData(t10);
                break;
            case "loadUrl":
                ((RNCWebViewManagerInterface) this.mViewManager).loadUrl(t10, readableArray.getString(0));
                break;
            case "clearHistory":
                ((RNCWebViewManagerInterface) this.mViewManager).clearHistory(t10);
                break;
            case "requestFocus":
                ((RNCWebViewManagerInterface) this.mViewManager).requestFocus(t10);
                break;
            case "postMessage":
                ((RNCWebViewManagerInterface) this.mViewManager).postMessage(t10, readableArray.getString(0));
                break;
            case "injectJavaScript":
                ((RNCWebViewManagerInterface) this.mViewManager).injectJavaScript(t10, readableArray.getString(0));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2014672109:
                if (str.equals("allowFileAccessFromFileURLs")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1843391113:
                if (str.equals("sharedCookiesEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1821622534:
                if (str.equals("allowsPictureInPictureMediaPlayback")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1737229888:
                if (str.equals("allowsProtectedMedia")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1725560121:
                if (str.equals("saveFormDataDisabled")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1714115364:
                if (str.equals("textInteractionEnabled")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1682637480:
                if (str.equals("paymentRequestEnabled")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1646494270:
                if (str.equals("injectedJavaScriptBeforeContentLoaded")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1642362548:
                if (str.equals("directionalLockEnabled")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1607633676:
                if (str.equals("javaScriptEnabled")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1562001507:
                if (str.equals("messagingEnabled")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -1560813342:
                if (str.equals("indicatorStyle")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1555578679:
                if (str.equals("dataDetectorTypes")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -1547082335:
                if (str.equals("menuItems")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -1423657812:
                if (str.equals("incognito")) {
                    c10 = 14;
                    break;
                }
                break;
            case -1397361343:
                if (str.equals("allowingReadAccessToURL")) {
                    c10 = 15;
                    break;
                }
                break;
            case -1321236988:
                if (str.equals("overScrollMode")) {
                    c10 = 16;
                    break;
                }
                break;
            case -1151046732:
                if (str.equals("scrollEnabled")) {
                    c10 = 17;
                    break;
                }
                break;
            case -1150480790:
                if (str.equals("keyboardDisplayRequiresUserAction")) {
                    c10 = 18;
                    break;
                }
                break;
            case -1146673624:
                if (str.equals("domStorageEnabled")) {
                    c10 = 19;
                    break;
                }
                break;
            case -1138577980:
                if (str.equals("allowsLinkPreview")) {
                    c10 = 20;
                    break;
                }
                break;
            case -1009029441:
                if (str.equals("useSharedProcessPool")) {
                    c10 = 21;
                    break;
                }
                break;
            case -1003454816:
                if (str.equals("textZoom")) {
                    c10 = 22;
                    break;
                }
                break;
            case -922092170:
                if (str.equals("showsVerticalScrollIndicator")) {
                    c10 = 23;
                    break;
                }
                break;
            case -906998080:
                if (str.equals("forceDarkOn")) {
                    c10 = 24;
                    break;
                }
                break;
            case -800676066:
                if (str.equals("minimumFontSize")) {
                    c10 = 25;
                    break;
                }
                break;
            case -735485938:
                if (str.equals("hideKeyboardAccessoryView")) {
                    c10 = 26;
                    break;
                }
                break;
            case -728016272:
                if (str.equals("allowUniversalAccessFromFileURLs")) {
                    c10 = 27;
                    break;
                }
                break;
            case -726941883:
                if (str.equals("mediaCapturePermissionGrantType")) {
                    c10 = 28;
                    break;
                }
                break;
            case -600226341:
                if (str.equals("newSource")) {
                    c10 = 29;
                    break;
                }
                break;
            case -572048675:
                if (str.equals("hasOnFileDownload")) {
                    c10 = 30;
                    break;
                }
                break;
            case -553792443:
                if (str.equals("cacheMode")) {
                    c10 = 31;
                    break;
                }
                break;
            case -502352363:
                if (str.equals("pagingEnabled")) {
                    c10 = ' ';
                    break;
                }
                break;
            case -389349956:
                if (str.equals("contentMode")) {
                    c10 = '!';
                    break;
                }
                break;
            case -380199621:
                if (str.equals("messagingModuleName")) {
                    c10 = Typography.quote;
                    break;
                }
                break;
            case -305041273:
                if (str.equals("hasOnOpenWindowEvent")) {
                    c10 = '#';
                    break;
                }
                break;
            case -227577491:
                if (str.equals("javaScriptCanOpenWindowsAutomatically")) {
                    c10 = Typography.dollar;
                    break;
                }
                break;
            case -181845559:
                if (str.equals("setDisplayZoomControls")) {
                    c10 = '%';
                    break;
                }
                break;
            case -128312874:
                if (str.equals("allowsFullscreenVideo")) {
                    c10 = Typography.amp;
                    break;
                }
                break;
            case -127745027:
                if (str.equals("nestedScrollEnabled")) {
                    c10 = '\'';
                    break;
                }
                break;
            case -104290151:
                if (str.equals("injectedJavaScriptBeforeContentLoadedForMainFrameOnly")) {
                    c10 = '(';
                    break;
                }
                break;
            case 70220358:
                if (str.equals("hasOnScroll")) {
                    c10 = ')';
                    break;
                }
                break;
            case 70310635:
                if (str.equals("bounces")) {
                    c10 = '*';
                    break;
                }
                break;
            case 97678726:
                if (str.equals("setSupportMultipleWindows")) {
                    c10 = '+';
                    break;
                }
                break;
            case 138148216:
                if (str.equals("lackPermissionToDownloadMessage")) {
                    c10 = ',';
                    break;
                }
                break;
            case 215255965:
                if (str.equals("injectedJavaScript")) {
                    c10 = '-';
                    break;
                }
                break;
            case 226157789:
                if (str.equals("automaticallyAdjustContentInsets")) {
                    c10 = '.';
                    break;
                }
                break;
            case 311430650:
                if (str.equals("userAgent")) {
                    c10 = '/';
                    break;
                }
                break;
            case 368381276:
                if (str.equals("allowsInlineMediaPlayback")) {
                    c10 = '0';
                    break;
                }
                break;
            case 397237599:
                if (str.equals("cacheEnabled")) {
                    c10 = '1';
                    break;
                }
                break;
            case 441950324:
                if (str.equals("injectedJavaScriptForMainFrameOnly")) {
                    c10 = '2';
                    break;
                }
                break;
            case 475851404:
                if (str.equals("webviewDebuggingEnabled")) {
                    c10 = '3';
                    break;
                }
                break;
            case 496513340:
                if (str.equals("injectedJavaScriptObject")) {
                    c10 = '4';
                    break;
                }
                break;
            case 590869196:
                if (str.equals("applicationNameForUserAgent")) {
                    c10 = '5';
                    break;
                }
                break;
            case 760962753:
                if (str.equals("mixedContentMode")) {
                    c10 = '6';
                    break;
                }
                break;
            case 811343908:
                if (str.equals("contentInset")) {
                    c10 = '7';
                    break;
                }
                break;
            case 830951634:
                if (str.equals("allowsBackForwardNavigationGestures")) {
                    c10 = '8';
                    break;
                }
                break;
            case 1076208106:
                if (str.equals("allowsAirPlayForMediaPlayback")) {
                    c10 = '9';
                    break;
                }
                break;
            case 1138246185:
                if (str.equals("allowFileAccess")) {
                    c10 = ':';
                    break;
                }
                break;
            case 1170796208:
                if (str.equals("limitsNavigationsToAppBoundDomains")) {
                    c10 = ';';
                    break;
                }
                break;
            case 1177556938:
                if (str.equals("setBuiltInZoomControls")) {
                    c10 = Typography.less;
                    break;
                }
                break;
            case 1219945382:
                if (str.equals("pullToRefreshEnabled")) {
                    c10 = '=';
                    break;
                }
                break;
            case 1244240887:
                if (str.equals("refreshControlLightMode")) {
                    c10 = Typography.greater;
                    break;
                }
                break;
            case 1309684816:
                if (str.equals("fraudulentWebsiteWarningEnabled")) {
                    c10 = '?';
                    break;
                }
                break;
            case 1344414299:
                if (str.equals("geolocationEnabled")) {
                    c10 = '@';
                    break;
                }
                break;
            case 1359182925:
                if (str.equals("downloadingMessage")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 1512859629:
                if (str.equals("basicAuthCredential")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 1523258769:
                if (str.equals("enableApplePay")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 1774874798:
                if (str.equals("mediaPlaybackRequiresUserAction")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 1812525393:
                if (str.equals("thirdPartyCookiesEnabled")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 1813472596:
                if (str.equals("autoManageStatusBarEnabled")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 1850310268:
                if (str.equals("androidLayerType")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 1868864108:
                if (str.equals("suppressMenuItems")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 1915931784:
                if (str.equals("showsHorizontalScrollIndicator")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 2074641374:
                if (str.equals("scalesPageToFit")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 2129019807:
                if (str.equals("decelerationRate")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 2146755107:
                if (str.equals("contentInsetAdjustmentBehavior")) {
                    c10 = Matrix.MATRIX_TYPE_RANDOM_LT;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((RNCWebViewManagerInterface) this.mViewManager).setAllowFileAccessFromFileURLs(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNCWebViewManagerInterface) this.mViewManager).setSharedCookiesEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 2:
                ((RNCWebViewManagerInterface) this.mViewManager).setAllowsPictureInPictureMediaPlayback(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((RNCWebViewManagerInterface) this.mViewManager).setAllowsProtectedMedia(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 4:
                ((RNCWebViewManagerInterface) this.mViewManager).setSaveFormDataDisabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((RNCWebViewManagerInterface) this.mViewManager).setTextInteractionEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 6:
                ((RNCWebViewManagerInterface) this.mViewManager).setPaymentRequestEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((RNCWebViewManagerInterface) this.mViewManager).setInjectedJavaScriptBeforeContentLoaded(t10, obj != null ? (String) obj : null);
                break;
            case '\b':
                ((RNCWebViewManagerInterface) this.mViewManager).setDirectionalLockEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '\t':
                ((RNCWebViewManagerInterface) this.mViewManager).setJavaScriptEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '\n':
                ((RNCWebViewManagerInterface) this.mViewManager).setMessagingEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((RNCWebViewManagerInterface) this.mViewManager).setIndicatorStyle(t10, (String) obj);
                break;
            case '\f':
                ((RNCWebViewManagerInterface) this.mViewManager).setDataDetectorTypes(t10, (ReadableArray) obj);
                break;
            case '\r':
                ((RNCWebViewManagerInterface) this.mViewManager).setMenuItems(t10, (ReadableArray) obj);
                break;
            case 14:
                ((RNCWebViewManagerInterface) this.mViewManager).setIncognito(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 15:
                ((RNCWebViewManagerInterface) this.mViewManager).setAllowingReadAccessToURL(t10, obj != null ? (String) obj : null);
                break;
            case 16:
                ((RNCWebViewManagerInterface) this.mViewManager).setOverScrollMode(t10, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNCWebViewManagerInterface) this.mViewManager).setScrollEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 18:
                ((RNCWebViewManagerInterface) this.mViewManager).setKeyboardDisplayRequiresUserAction(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 19:
                ((RNCWebViewManagerInterface) this.mViewManager).setDomStorageEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 20:
                ((RNCWebViewManagerInterface) this.mViewManager).setAllowsLinkPreview(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 21:
                ((RNCWebViewManagerInterface) this.mViewManager).setUseSharedProcessPool(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 22:
                ((RNCWebViewManagerInterface) this.mViewManager).setTextZoom(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 23:
                ((RNCWebViewManagerInterface) this.mViewManager).setShowsVerticalScrollIndicator(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 24:
                ((RNCWebViewManagerInterface) this.mViewManager).setForceDarkOn(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 25:
                ((RNCWebViewManagerInterface) this.mViewManager).setMinimumFontSize(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 26:
                ((RNCWebViewManagerInterface) this.mViewManager).setHideKeyboardAccessoryView(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 27:
                ((RNCWebViewManagerInterface) this.mViewManager).setAllowUniversalAccessFromFileURLs(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 28:
                ((RNCWebViewManagerInterface) this.mViewManager).setMediaCapturePermissionGrantType(t10, (String) obj);
                break;
            case 29:
                ((RNCWebViewManagerInterface) this.mViewManager).setNewSource(t10, (ReadableMap) obj);
                break;
            case 30:
                ((RNCWebViewManagerInterface) this.mViewManager).setHasOnFileDownload(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 31:
                ((RNCWebViewManagerInterface) this.mViewManager).setCacheMode(t10, (String) obj);
                break;
            case ' ':
                ((RNCWebViewManagerInterface) this.mViewManager).setPagingEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '!':
                ((RNCWebViewManagerInterface) this.mViewManager).setContentMode(t10, (String) obj);
                break;
            case '\"':
                ((RNCWebViewManagerInterface) this.mViewManager).setMessagingModuleName(t10, obj != null ? (String) obj : null);
                break;
            case '#':
                ((RNCWebViewManagerInterface) this.mViewManager).setHasOnOpenWindowEvent(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '$':
                ((RNCWebViewManagerInterface) this.mViewManager).setJavaScriptCanOpenWindowsAutomatically(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '%':
                ((RNCWebViewManagerInterface) this.mViewManager).setSetDisplayZoomControls(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '&':
                ((RNCWebViewManagerInterface) this.mViewManager).setAllowsFullscreenVideo(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\'':
                ((RNCWebViewManagerInterface) this.mViewManager).setNestedScrollEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '(':
                ((RNCWebViewManagerInterface) this.mViewManager).setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case ')':
                ((RNCWebViewManagerInterface) this.mViewManager).setHasOnScroll(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '*':
                ((RNCWebViewManagerInterface) this.mViewManager).setBounces(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '+':
                ((RNCWebViewManagerInterface) this.mViewManager).setSetSupportMultipleWindows(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case ',':
                ((RNCWebViewManagerInterface) this.mViewManager).setLackPermissionToDownloadMessage(t10, obj != null ? (String) obj : null);
                break;
            case '-':
                ((RNCWebViewManagerInterface) this.mViewManager).setInjectedJavaScript(t10, obj != null ? (String) obj : null);
                break;
            case '.':
                ((RNCWebViewManagerInterface) this.mViewManager).setAutomaticallyAdjustContentInsets(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '/':
                ((RNCWebViewManagerInterface) this.mViewManager).setUserAgent(t10, obj != null ? (String) obj : null);
                break;
            case '0':
                ((RNCWebViewManagerInterface) this.mViewManager).setAllowsInlineMediaPlayback(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '1':
                ((RNCWebViewManagerInterface) this.mViewManager).setCacheEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '2':
                ((RNCWebViewManagerInterface) this.mViewManager).setInjectedJavaScriptForMainFrameOnly(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '3':
                ((RNCWebViewManagerInterface) this.mViewManager).setWebviewDebuggingEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '4':
                ((RNCWebViewManagerInterface) this.mViewManager).setInjectedJavaScriptObject(t10, obj != null ? (String) obj : null);
                break;
            case '5':
                ((RNCWebViewManagerInterface) this.mViewManager).setApplicationNameForUserAgent(t10, obj != null ? (String) obj : null);
                break;
            case '6':
                ((RNCWebViewManagerInterface) this.mViewManager).setMixedContentMode(t10, (String) obj);
                break;
            case '7':
                ((RNCWebViewManagerInterface) this.mViewManager).setContentInset(t10, (ReadableMap) obj);
                break;
            case '8':
                ((RNCWebViewManagerInterface) this.mViewManager).setAllowsBackForwardNavigationGestures(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '9':
                ((RNCWebViewManagerInterface) this.mViewManager).setAllowsAirPlayForMediaPlayback(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ':':
                ((RNCWebViewManagerInterface) this.mViewManager).setAllowFileAccess(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ';':
                ((RNCWebViewManagerInterface) this.mViewManager).setLimitsNavigationsToAppBoundDomains(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '<':
                ((RNCWebViewManagerInterface) this.mViewManager).setSetBuiltInZoomControls(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '=':
                ((RNCWebViewManagerInterface) this.mViewManager).setPullToRefreshEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '>':
                ((RNCWebViewManagerInterface) this.mViewManager).setRefreshControlLightMode(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '?':
                ((RNCWebViewManagerInterface) this.mViewManager).setFraudulentWebsiteWarningEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '@':
                ((RNCWebViewManagerInterface) this.mViewManager).setGeolocationEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 'A':
                ((RNCWebViewManagerInterface) this.mViewManager).setDownloadingMessage(t10, obj != null ? (String) obj : null);
                break;
            case 'B':
                ((RNCWebViewManagerInterface) this.mViewManager).setBasicAuthCredential(t10, (ReadableMap) obj);
                break;
            case 'C':
                ((RNCWebViewManagerInterface) this.mViewManager).setEnableApplePay(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 'D':
                ((RNCWebViewManagerInterface) this.mViewManager).setMediaPlaybackRequiresUserAction(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 'E':
                ((RNCWebViewManagerInterface) this.mViewManager).setThirdPartyCookiesEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 'F':
                ((RNCWebViewManagerInterface) this.mViewManager).setAutoManageStatusBarEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 'G':
                ((RNCWebViewManagerInterface) this.mViewManager).setAndroidLayerType(t10, (String) obj);
                break;
            case 'H':
                ((RNCWebViewManagerInterface) this.mViewManager).setSuppressMenuItems(t10, (ReadableArray) obj);
                break;
            case 'I':
                ((RNCWebViewManagerInterface) this.mViewManager).setShowsHorizontalScrollIndicator(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 'J':
                ((RNCWebViewManagerInterface) this.mViewManager).setScalesPageToFit(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 'K':
                ((RNCWebViewManagerInterface) this.mViewManager).setDecelerationRate(t10, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case 'L':
                ((RNCWebViewManagerInterface) this.mViewManager).setContentInsetAdjustmentBehavior(t10, (String) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
