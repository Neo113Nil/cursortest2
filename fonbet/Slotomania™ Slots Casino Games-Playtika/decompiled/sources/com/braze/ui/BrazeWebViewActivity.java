package com.braze.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.ViewUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrazeWebViewActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/BrazeWebViewActivity;", "Landroidx/fragment/app/FragmentActivity;", "()V", "createWebChromeClient", "Landroid/webkit/WebChromeClient;", "createWebViewClient", "Landroid/webkit/WebViewClient;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class BrazeWebViewActivity extends FragmentActivity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("com.appboy", me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        getWindow().setFlags(16777216, 16777216);
        setContentView(R.layout.com_braze_webview_activity);
        WebView webView = (WebView) findViewById(R.id.com_braze_webview_activity_webview);
        webView.setLayerType(2, null);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "this.applicationContext");
        if (ViewUtils.isDeviceInNightMode(applicationContext)) {
            if (Build.VERSION.SDK_INT >= 33) {
                settings.setAlgorithmicDarkeningAllowed(true);
            } else if (Build.VERSION.SDK_INT >= 29) {
                settings.setForceDark(2);
            }
        }
        webView.setWebChromeClient(createWebChromeClient());
        webView.setWebViewClient(createWebViewClient());
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("url")) == null) {
            return;
        }
        webView.loadUrl(string);
    }

    public WebChromeClient createWebChromeClient() {
        return new WebChromeClient() { // from class: com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(final ConsoleMessage cm) {
                Intrinsics.checkNotNullParameter(cm, "cm");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1$onConsoleMessage$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Braze WebView Activity log. Line: " + cm.lineNumber() + ". SourceId: " + ((Object) cm.sourceId()) + ". Log Level: " + cm.messageLevel() + ". Message: " + ((Object) cm.message());
                    }
                }, 3, (Object) null);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
        };
    }

    public WebViewClient createWebViewClient() {
        return new WebViewClient() { // from class: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1
            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded("com.appboy", view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                BrandSafetyUtils.onWebViewPageStarted("com.appboy", view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                BrandSafetyUtils.onWebViewReceivedError("com.appboy", view, errorCode, description, failingUrl);
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                return CreativeInfoManager.onWebViewResponseWithHeaders("com.appboy", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Logger.d("Braze|SafeDK: Execution> Lcom/braze/ui/BrazeWebViewActivity$createWebViewClient$1;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
                boolean safedk_BrazeWebViewActivity$createWebViewClient$1_shouldOverrideUrlLoading_02fabc533200906ac2fd810c209aad80 = safedk_BrazeWebViewActivity$createWebViewClient$1_shouldOverrideUrlLoading_02fabc533200906ac2fd810c209aad80(view, request);
                BrandSafetyUtils.onShouldOverrideUrlLoading("com.appboy", view, request, safedk_BrazeWebViewActivity$createWebViewClient$1_shouldOverrideUrlLoading_02fabc533200906ac2fd810c209aad80);
                return safedk_BrazeWebViewActivity$createWebViewClient$1_shouldOverrideUrlLoading_02fabc533200906ac2fd810c209aad80;
            }

            @Override // android.webkit.WebViewClient
            @Deprecated(message = "Deprecated in Java")
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Logger.d("Braze|SafeDK: Execution> Lcom/braze/ui/BrazeWebViewActivity$createWebViewClient$1;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                boolean safedk_BrazeWebViewActivity$createWebViewClient$1_shouldOverrideUrlLoading_cebeff156d86a7de6bc8558aa1f52aa3 = safedk_BrazeWebViewActivity$createWebViewClient$1_shouldOverrideUrlLoading_cebeff156d86a7de6bc8558aa1f52aa3(view, url);
                BrandSafetyUtils.onShouldOverrideUrlLoading("com.appboy", view, url, safedk_BrazeWebViewActivity$createWebViewClient$1_shouldOverrideUrlLoading_cebeff156d86a7de6bc8558aa1f52aa3);
                return safedk_BrazeWebViewActivity$createWebViewClient$1_shouldOverrideUrlLoading_cebeff156d86a7de6bc8558aa1f52aa3;
            }

            public boolean safedk_BrazeWebViewActivity$createWebViewClient$1_shouldOverrideUrlLoading_02fabc533200906ac2fd810c209aad80(WebView view, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                String uri = request.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "request.url.toString()");
                Boolean handleUrlOverride = handleUrlOverride(context, uri);
                return handleUrlOverride == null ? super.shouldOverrideUrlLoading(view, request) : handleUrlOverride.booleanValue();
            }

            @Deprecated(message = "Deprecated in Java")
            public boolean safedk_BrazeWebViewActivity$createWebViewClient$1_shouldOverrideUrlLoading_cebeff156d86a7de6bc8558aa1f52aa3(WebView view, String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                Boolean handleUrlOverride = handleUrlOverride(context, url);
                return handleUrlOverride == null ? super.shouldOverrideUrlLoading(view, url) : handleUrlOverride.booleanValue();
            }

            private final Boolean handleUrlOverride(Context context, final String url) {
                try {
                    if (CollectionsKt.contains(BrazeFileUtils.REMOTE_SCHEMES, Uri.parse(url).getScheme())) {
                        return null;
                    }
                    UriAction createUriActionFromUrlString = BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, BrazeWebViewActivity.this.getIntent().getExtras(), false, Channel.UNKNOWN);
                    if (createUriActionFromUrlString != null) {
                        createUriActionFromUrlString.execute(context);
                        BrazeWebViewActivity.this.finish();
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1$handleUrlOverride$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Unexpected exception while processing url " + url + ". Passing url back to WebView.";
                        }
                    });
                    return null;
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(detail, "detail");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1$onRenderProcessGone$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "The webview rendering process crashed, returning true";
                    }
                }, 2, (Object) null);
                return true;
            }
        };
    }
}
