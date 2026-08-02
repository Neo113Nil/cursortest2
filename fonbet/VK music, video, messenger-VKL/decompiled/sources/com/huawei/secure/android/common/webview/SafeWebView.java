package com.huawei.secure.android.common.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.dto.common.ImageSizeKey;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import xsna.sd9;
import xsna.z200;
import xsna.zix0;

/* loaded from: classes13.dex */
public class SafeWebView extends WebView {
    public String b;
    public String[] c;
    public String[] d;
    public String[] e;

    public SafeWebView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        settings.setGeolocationEnabled(false);
        settings.setMixedContentMode(1);
        settings.setAllowContentAccess(false);
        setWebViewClient(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f4 A[LOOP:2: B:99:0x014d->B:115:0x01f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9 A[LOOP:0: B:33:0x0059->B:58:0x00e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f A[SYNTHETIC] */
    @TargetApi(9)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        if (TextUtils.isEmpty(str)) {
            z200.b("SafeWebView", "url is null");
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            String[] whitelistWithPath = getWhitelistWithPath();
            String[] whitelistNotMatchSubDomain = getWhitelistNotMatchSubDomain();
            String[] whitelist = getWhitelist();
            boolean z4 = whitelistWithPath == null || whitelistWithPath.length == 0;
            boolean z5 = whitelistNotMatchSubDomain == null || whitelistNotMatchSubDomain.length == 0;
            boolean z6 = whitelist == null || whitelist.length == 0;
            if (!z4 || !z5 || !z6) {
                if (whitelistWithPath != null && whitelistWithPath.length != 0) {
                    if (whitelistWithPath.length == 0) {
                        z200.b("UriUtil", "whitelist is null");
                        return false;
                    }
                    for (String str2 : whitelistWithPath) {
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                            String decode = Uri.decode(str);
                            String decode2 = Uri.decode(str2);
                            if (decode.contains("..") || decode2.contains("@")) {
                                Log.e("UriUtil", "url contains unsafe char");
                            } else if (str.contains("..") || str.contains("@")) {
                                Log.e("UriUtil", "url contains unsafe char");
                            } else {
                                if (str2.equals(str) || str.startsWith(str2.concat("?")) || str.startsWith(str2.concat("#"))) {
                                    z3 = true;
                                } else if (str2.endsWith(DomExceptionUtils.SEPARATOR)) {
                                    if (Uri.parse(decode).getPathSegments().size() - Uri.parse(decode2).getPathSegments().size() == 1) {
                                        z3 = str.startsWith(str2);
                                    }
                                }
                                if (z3) {
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                    }
                    return false;
                }
                if (whitelistNotMatchSubDomain != null && whitelistNotMatchSubDomain.length != 0) {
                    if (whitelistNotMatchSubDomain.length == 0) {
                        z200.b("UriUtil", "whitelist is null");
                        return false;
                    }
                    for (String str3 : whitelistNotMatchSubDomain) {
                        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
                            Log.e("UriUtil", "isUrlHostSameWhitelist: url or host is null");
                            z2 = false;
                        } else {
                            String j = sd9.j(str);
                            if (TextUtils.isEmpty(str3)) {
                                Pattern pattern = z200.a;
                                if (!TextUtils.isEmpty("whiteListUrl is null")) {
                                    z200.a("whiteListUrl is null");
                                }
                                str3 = null;
                            } else if (URLUtil.isNetworkUrl(str3)) {
                                str3 = sd9.j(str3);
                            }
                            z2 = TextUtils.equals(j, str3);
                        }
                        if (!z2) {
                        }
                    }
                    return false;
                }
                if (whitelist == null || whitelist.length == 0) {
                    z200.b("UriUtil", "whitelist is null");
                    return false;
                }
                int length = whitelist.length;
                for (int i = 0; i < length; i++) {
                    String str4 = whitelist[i];
                    String j2 = sd9.j(str);
                    if (TextUtils.isEmpty(j2) || TextUtils.isEmpty(str4)) {
                        z200.b("UriUtil", "url or whitelist is null");
                    } else {
                        if (TextUtils.isEmpty(str4)) {
                            Pattern pattern2 = z200.a;
                            if (!TextUtils.isEmpty("whiteListUrl is null")) {
                                z200.a("whiteListUrl is null");
                            }
                            str4 = null;
                        } else if (URLUtil.isNetworkUrl(str4)) {
                            str4 = sd9.j(str4);
                        }
                        if (TextUtils.isEmpty(str4)) {
                            Log.e("UriUtil", "whitelist host is null");
                        } else {
                            if (str4.equals(j2)) {
                                z = true;
                            } else if (j2.endsWith(str4)) {
                                try {
                                    String substring = j2.substring(0, j2.length() - str4.length());
                                    if (substring.endsWith(".")) {
                                        z = substring.matches("^[A-Za-z0-9.-]+$");
                                    }
                                } catch (IndexOutOfBoundsException e) {
                                    z200.b("UriUtil", "IndexOutOfBoundsException" + e.getMessage());
                                } catch (Exception e2) {
                                    z200.b("UriUtil", "Exception : " + e2.getMessage());
                                }
                            }
                            if (!z) {
                                return true;
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final void c(WebView webView, String str) {
        Pattern pattern = z200.a;
        if (!TextUtils.isEmpty("onCheckError url is not in white list ") || !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(512);
            if (!TextUtils.isEmpty("onCheckError url is not in white list ")) {
                sb.append("onCheckError url is not in white list ");
            }
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str)) {
                    int length = str.length();
                    int i = 1;
                    if (1 == length) {
                        str = String.valueOf(ImageSizeKey.SIZE_KEY_BASE);
                    } else {
                        StringBuilder sb2 = new StringBuilder(length);
                        for (int i2 = 0; i2 < length; i2++) {
                            char charAt = str.charAt(i2);
                            if (z200.a.matcher(String.valueOf(charAt)).matches()) {
                                if (i % 2 == 0) {
                                    charAt = '*';
                                }
                                i++;
                            }
                            sb2.append(charAt);
                        }
                        str = sb2.toString();
                    }
                }
                sb.append(str);
            }
            Log.e("SafeWebView", sb.toString());
        }
        webView.stopLoading();
        String defaultErrorPage = getDefaultErrorPage();
        if (TextUtils.isEmpty(defaultErrorPage)) {
            getWebViewLoadCallBack();
        } else {
            webView.loadUrl(defaultErrorPage);
        }
    }

    public String getDefaultErrorPage() {
        return this.b;
    }

    public zix0 getWebViewLoadCallBack() {
        return null;
    }

    @TargetApi(9)
    @Deprecated
    public String[] getWhitelist() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] getWhitelistNotMatchSubDomain() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public String[] getWhitelistNotMathcSubDomain() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public String[] getWhitelistWithPath() {
        String[] strArr = this.e;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!URLUtil.isHttpUrl(str)) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        Log.e("SafeWebView", "loadDataWithBaseURL: http url , not safe");
        if (TextUtils.isEmpty(this.b)) {
            getWebViewLoadCallBack();
        } else {
            super.loadDataWithBaseURL(this.b, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        if (b(str) && !URLUtil.isHttpUrl(str)) {
            super.loadUrl(str);
            return;
        }
        Log.e("SafeWebView", "loadUrl: url is not in white list or http url not safe");
        if (TextUtils.isEmpty(this.b)) {
            getWebViewLoadCallBack();
        } else {
            super.loadUrl(this.b);
        }
    }

    @Override // android.webkit.WebView
    public final void postUrl(String str, byte[] bArr) {
        if (b(str) && !URLUtil.isHttpUrl(str)) {
            super.postUrl(str, bArr);
            return;
        }
        Log.e("SafeWebView", "postUrl: url is not in white list or http url not safe");
        if (TextUtils.isEmpty(this.b)) {
            getWebViewLoadCallBack();
        } else {
            super.postUrl(this.b, bArr);
        }
    }

    public void setDefaultErrorPage(String str) {
        this.b = str;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new a(webViewClient));
    }

    @TargetApi(9)
    @Deprecated
    public void setWhitelist(String[] strArr) {
        this.c = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWhitelistNotMatchSubDomain(String[] strArr) {
        this.d = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public void setWhitelistNotMathcSubDomain(String[] strArr) {
        this.d = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public void setWhitelistWithPath(String[] strArr) {
        this.e = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public final class a extends WebViewClient {
        public final WebViewClient a;
        public final boolean b = true;

        public a(WebViewClient webViewClient) {
            this.a = webViewClient;
        }

        @Override // android.webkit.WebViewClient
        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z);
            } else {
                super.doUpdateVisitedHistory(webView, str, z);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                super.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null && !this.b) {
                webViewClient.onPageStarted(webView, str, bitmap);
                return;
            }
            SafeWebView safeWebView = SafeWebView.this;
            if (safeWebView.b(str)) {
                super.onPageStarted(webView, str, bitmap);
            } else {
                safeWebView.c(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i, str, str2);
            } else {
                super.onReceivedError(webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } else {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(12)
        public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewClient webViewClient = this.a;
            return webViewClient != null ? webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            } else {
                super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onScaleChanged(WebView webView, float f, float f2) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f, f2);
            } else {
                super.onScaleChanged(webView, f, f2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.a;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.a;
            return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null && !this.b) {
                return webViewClient.shouldOverrideUrlLoading(webView, str);
            }
            SafeWebView safeWebView = SafeWebView.this;
            if (safeWebView.b(str)) {
                return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
            }
            safeWebView.c(webView, str);
            return false;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(11)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, str);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public SafeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public SafeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    @TargetApi(21)
    public SafeWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map<String, String> map) {
        if (b(str) && !URLUtil.isHttpUrl(str)) {
            super.loadUrl(str, map);
            return;
        }
        Log.e("SafeWebView", "loadUrl: url is not in white list or http url not safe");
        if (!TextUtils.isEmpty(this.b)) {
            super.loadUrl(this.b, map);
        } else {
            getWebViewLoadCallBack();
        }
    }

    public void setWebViewLoadCallBack(zix0 zix0Var) {
    }
}
