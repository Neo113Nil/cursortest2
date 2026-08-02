package org.apache.cordova.engine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.apache.cordova.BuildConfig;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewEngine;

/* loaded from: classes7.dex */
public class SystemWebView extends WebView implements CordovaWebViewEngine.EngineView {
    SystemWebChromeClient chromeClient;

    /* renamed from: cordova, reason: collision with root package name */
    private CordovaInterface f3358cordova;
    private SystemWebViewEngine parentEngine;
    private SystemWebViewClient viewClient;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(BuildConfig.APPLICATION_ID, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public SystemWebView(Context context) {
        this(context, null);
    }

    public SystemWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    void init(SystemWebViewEngine systemWebViewEngine, CordovaInterface cordovaInterface) {
        this.f3358cordova = cordovaInterface;
        this.parentEngine = systemWebViewEngine;
        if (this.viewClient == null) {
            setWebViewClient(new SystemWebViewClient(systemWebViewEngine));
        }
        if (this.chromeClient == null) {
            setWebChromeClient(new SystemWebChromeClient(systemWebViewEngine));
        }
    }

    @Override // org.apache.cordova.CordovaWebViewEngine.EngineView
    public CordovaWebView getCordovaWebView() {
        SystemWebViewEngine systemWebViewEngine = this.parentEngine;
        if (systemWebViewEngine != null) {
            return systemWebViewEngine.getCordovaWebView();
        }
        return null;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        this.viewClient = (SystemWebViewClient) webViewClient;
        super.setWebViewClient(webViewClient);
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.chromeClient = (SystemWebChromeClient) webChromeClient;
        super.setWebChromeClient(webChromeClient);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean onDispatchKeyEvent = this.parentEngine.client.onDispatchKeyEvent(keyEvent);
        if (onDispatchKeyEvent != null) {
            return onDispatchKeyEvent.booleanValue();
        }
        return super.dispatchKeyEvent(keyEvent);
    }
}
