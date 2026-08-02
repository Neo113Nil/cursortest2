package org.apache.cordova.engine;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.AssetHelper;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import org.apache.cordova.AuthenticationToken;
import org.apache.cordova.BuildConfig;
import org.apache.cordova.CordovaClientCertRequest;
import org.apache.cordova.CordovaHttpAuthHandler;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginManager;

/* loaded from: classes8.dex */
public class SystemWebViewClient extends WebViewClient {
    private static final String TAG = "SystemWebViewClient";
    boolean isCurrentlyLoading;
    protected final SystemWebViewEngine parentEngine;
    private boolean doClearHistory = false;
    private Hashtable<String, AuthenticationToken> authenticationTokens = new Hashtable<>();

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(BuildConfig.APPLICATION_ID, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Logger.d("Cordova|SafeDK: Execution> Lorg/apache/cordova/engine/SystemWebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
        BrandSafetyUtils.onWebViewPageStarted(BuildConfig.APPLICATION_ID, webView, str);
        safedk_SystemWebViewClient_onPageStarted_4d7817aa0e37472bcc5f2809b6c3c151(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("Cordova|SafeDK: Execution> Lorg/apache/cordova/engine/SystemWebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(BuildConfig.APPLICATION_ID, webView, i, str, str2);
        safedk_SystemWebViewClient_onReceivedError_590261282e6c354a7abff5b3b6a4e71b(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Cordova|SafeDK: Execution> Lorg/apache/cordova/engine/SystemWebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(BuildConfig.APPLICATION_ID, webView, str, safedk_SystemWebViewClient_shouldInterceptRequest_e001669b1a0990c7a1e6d96d16a6b26b(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Cordova|SafeDK: Execution> Lorg/apache/cordova/engine/SystemWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_SystemWebViewClient_shouldOverrideUrlLoading_6246de06efdf049873319ebdd3257894 = safedk_SystemWebViewClient_shouldOverrideUrlLoading_6246de06efdf049873319ebdd3257894(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(BuildConfig.APPLICATION_ID, webView, str, safedk_SystemWebViewClient_shouldOverrideUrlLoading_6246de06efdf049873319ebdd3257894);
        return safedk_SystemWebViewClient_shouldOverrideUrlLoading_6246de06efdf049873319ebdd3257894;
    }

    public SystemWebViewClient(SystemWebViewEngine systemWebViewEngine) {
        this.parentEngine = systemWebViewEngine;
    }

    public boolean safedk_SystemWebViewClient_shouldOverrideUrlLoading_6246de06efdf049873319ebdd3257894(WebView p0, String p1) {
        return this.parentEngine.client.onNavigationAttempt(p1);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AuthenticationToken authenticationToken = getAuthenticationToken(str, str2);
        if (authenticationToken != null) {
            httpAuthHandler.proceed(authenticationToken.getUserName(), authenticationToken.getPassword());
            return;
        }
        PluginManager pluginManager = this.parentEngine.pluginManager;
        if (pluginManager != null && pluginManager.onReceivedHttpAuthRequest(null, new CordovaHttpAuthHandler(httpAuthHandler), str, str2)) {
            this.parentEngine.client.clearLoadTimeoutTimer();
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        PluginManager pluginManager = this.parentEngine.pluginManager;
        if (pluginManager != null && pluginManager.onReceivedClientCertRequest(null, new CordovaClientCertRequest(clientCertRequest))) {
            this.parentEngine.client.clearLoadTimeoutTimer();
        } else {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    public void safedk_SystemWebViewClient_onPageStarted_4d7817aa0e37472bcc5f2809b6c3c151(WebView p0, String p1, Bitmap p2) {
        super.onPageStarted(p0, p1, p2);
        this.isCurrentlyLoading = true;
        this.parentEngine.bridge.reset();
        this.parentEngine.client.onPageStarted(p1);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.isCurrentlyLoading || str.startsWith("about:")) {
            this.isCurrentlyLoading = false;
            if (this.doClearHistory) {
                webView.clearHistory();
                this.doClearHistory = false;
            }
            this.parentEngine.client.onPageFinishedLoading(str);
        }
    }

    public void safedk_SystemWebViewClient_onReceivedError_590261282e6c354a7abff5b3b6a4e71b(WebView p0, int p1, String p2, String p3) {
        if (this.isCurrentlyLoading) {
            LOG.d(TAG, "CordovaWebViewClient.onReceivedError: Error code=%s Description=%s URL=%s", Integer.valueOf(p1), p2, p3);
            if (p1 == -10) {
                this.parentEngine.client.clearLoadTimeoutTimer();
                if (p0.canGoBack()) {
                    p0.goBack();
                    return;
                }
                super.onReceivedError(p0, p1, p2, p3);
            }
            this.parentEngine.client.onReceivedError(p1, p2, p3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            if ((this.parentEngine.f3359cordova.getActivity().getPackageManager().getApplicationInfo(this.parentEngine.f3359cordova.getActivity().getPackageName(), 128).flags & 2) != 0) {
                sslErrorHandler.proceed();
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public void setAuthenticationToken(AuthenticationToken authenticationToken, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        this.authenticationTokens.put(str.concat(str2), authenticationToken);
    }

    public AuthenticationToken removeAuthenticationToken(String str, String str2) {
        return this.authenticationTokens.remove(str.concat(str2));
    }

    public AuthenticationToken getAuthenticationToken(String str, String str2) {
        AuthenticationToken authenticationToken = this.authenticationTokens.get(str.concat(str2));
        if (authenticationToken != null) {
            return authenticationToken;
        }
        AuthenticationToken authenticationToken2 = this.authenticationTokens.get(str);
        if (authenticationToken2 == null) {
            authenticationToken2 = this.authenticationTokens.get(str2);
        }
        return authenticationToken2 == null ? this.authenticationTokens.get("") : authenticationToken2;
    }

    public void clearAuthenticationTokens() {
        this.authenticationTokens.clear();
    }

    public WebResourceResponse safedk_SystemWebViewClient_shouldInterceptRequest_e001669b1a0990c7a1e6d96d16a6b26b(WebView p0, String p1) {
        try {
            if (!this.parentEngine.pluginManager.shouldAllowRequest(p1)) {
                LOG.w(TAG, "URL blocked by whitelist: " + p1);
                return new WebResourceResponse(AssetHelper.DEFAULT_MIME_TYPE, C.UTF8_NAME, null);
            }
            CordovaResourceApi cordovaResourceApi = this.parentEngine.resourceApi;
            Uri parse = Uri.parse(p1);
            Uri remapUri = cordovaResourceApi.remapUri(parse);
            if (parse.equals(remapUri) && !needsSpecialsInAssetUrlFix(parse) && !needsKitKatContentUrlFix(parse)) {
                return null;
            }
            CordovaResourceApi.OpenForReadResult openForRead = cordovaResourceApi.openForRead(remapUri, true);
            return new WebResourceResponse(openForRead.mimeType, C.UTF8_NAME, openForRead.inputStream);
        } catch (IOException e) {
            if (!(e instanceof FileNotFoundException)) {
                LOG.e(TAG, "Error occurred while loading a file (returning a 404).", e);
            }
            return new WebResourceResponse(AssetHelper.DEFAULT_MIME_TYPE, C.UTF8_NAME, null);
        }
    }

    private static boolean needsKitKatContentUrlFix(Uri uri) {
        return "content".equals(uri.getScheme());
    }

    private static boolean needsSpecialsInAssetUrlFix(Uri uri) {
        if (CordovaResourceApi.getUriType(uri) != 1) {
            return false;
        }
        if (uri.getQuery() != null || uri.getFragment() != null) {
            return true;
        }
        uri.toString().contains("%");
        return false;
    }
}
