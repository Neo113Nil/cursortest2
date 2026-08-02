package com.playtika.pras.sdk.views;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import com.playtika.pras.sdk.network.ResponseCode;
import com.playtika.pras.sdk.network.models.results.BillingResult;
import com.safedk.android.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class f extends WebViewClient {
    public final String a;
    public final /* synthetic */ BaseWebViewContainer b;

    public f(BaseWebViewContainer baseWebViewContainer, String str) {
        this.b = baseWebViewContainer;
        this.a = str;
    }

    public static void safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(Fragment p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        try {
            if (str.contains(this.a)) {
                super.onPageStarted(webView, str, bitmap);
            } else {
                safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(this.b, new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        } catch (Exception unused) {
            com.playtika.pras.c.d.a(this.b.TAG, "Error onPageStarted: url=" + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean shouldRetryWidgetLoading;
        int i;
        String str;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            try {
                JSONObject createAdditionalFieldsWithSessionId = this.b.createAdditionalFieldsWithSessionId();
                i = this.b.currentRetryAttempt;
                createAdditionalFieldsWithSessionId.put("attempt_number", i);
                str = this.b.widgetRuntimeGuid;
                createAdditionalFieldsWithSessionId.put("widget_runtime_guid", str);
                String obj = webResourceError.getDescription().toString();
                BaseWebViewContainer baseWebViewContainer = this.b;
                baseWebViewContainer.sendAnalyticsErrorEvent("result_webview_loading_error", baseWebViewContainer.getESContext(), obj, createAdditionalFieldsWithSessionId);
            } catch (JSONException e) {
                com.playtika.pras.c.d.a("Error creating error analytics event", e);
            }
            this.b.clearTimer();
            shouldRetryWidgetLoading = this.b.shouldRetryWidgetLoading();
            if (shouldRetryWidgetLoading) {
                this.b.retryWidgetLoading();
            } else {
                this.b.closeWidget(new BillingResult(ResponseCode.RESULT_WIDGET_LOADING_ERROR).toBundle());
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        boolean shouldRetryWidgetLoading;
        int i;
        String str;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String uri = webResourceRequest.getUrl().toString();
        if (uri.contains("favicon.ico")) {
            return;
        }
        try {
            JSONObject createAdditionalFieldsWithSessionId = this.b.createAdditionalFieldsWithSessionId();
            i = this.b.currentRetryAttempt;
            createAdditionalFieldsWithSessionId.put("attempt_number", i);
            str = this.b.widgetRuntimeGuid;
            createAdditionalFieldsWithSessionId.put("widget_runtime_guid", str);
            BaseWebViewContainer baseWebViewContainer = this.b;
            baseWebViewContainer.sendAnalyticsErrorEvent("result_webview_error", baseWebViewContainer.getESContext(), uri + ":" + webResourceResponse.getReasonPhrase(), createAdditionalFieldsWithSessionId);
        } catch (JSONException unused) {
            BaseWebViewContainer baseWebViewContainer2 = this.b;
            baseWebViewContainer2.sendAnalyticsErrorEvent("result_webview_error", baseWebViewContainer2.getESContext(), uri + ":" + webResourceResponse.getReasonPhrase());
        }
        if (uri.contains(this.a)) {
            this.b.clearTimer();
            shouldRetryWidgetLoading = this.b.shouldRetryWidgetLoading();
            if (shouldRetryWidgetLoading) {
                this.b.retryWidgetLoading();
            } else {
                this.b.closeWidget(new BillingResult(ResponseCode.RESULT_WIDGET_LOADING_ERROR).toBundle());
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        BaseWebViewContainer baseWebViewContainer = this.b;
        baseWebViewContainer.sendAnalyticsErrorEvent("result_webview_error", baseWebViewContainer.getESContext(), "SSL error: " + sslError.toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            if (keyEvent.getKeyCode() == 66) {
                ((InputMethodManager) this.b.requireActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.b.getView().getWindowToken(), 0);
            }
        } catch (Exception unused) {
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.playtika.pras.c.d.a(this.b.TAG, str);
        try {
            if (str.contains(this.a)) {
                webView.loadUrl(str);
            } else {
                safedk_Fragment_startActivity_d519b2d71bdac81b1d20f350086c68e6(this.b, new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
            return true;
        } catch (Exception unused) {
            com.playtika.pras.c.d.a(this.b.TAG, "Error shouldOverrideUrlLoading: url=" + str);
            return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (webView != null) {
            webView.post(new com.playtika.pras.c.c(webView, "checkIfComplete('Android')"));
        }
    }
}
