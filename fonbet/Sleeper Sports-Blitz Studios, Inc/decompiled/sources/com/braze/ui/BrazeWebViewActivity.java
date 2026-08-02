package com.braze.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.braze.BrazeInternal;
import com.braze.support.BrazeLogger;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrazeWebViewActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/braze/ui/BrazeWebViewActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "createWebChromeClient", "Landroid/webkit/WebChromeClient;", "createWebViewClient", "Landroid/webkit/WebViewClient;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BrazeWebViewActivity extends FragmentActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String string;
        try {
            super.onCreate(savedInstanceState);
            getWindow().setFlags(16777216, 16777216);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
                getWindow().setFlags(8192, 8192);
            }
            setContentView(R.layout.com_braze_webview_activity);
            WebView webView = (WebView) findViewById(R.id.com_braze_webview_activity_webview);
            webView.setLayerType(2, null);
            WebSettings settings = webView.getSettings();
            Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
            settings.setAllowFileAccess(false);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setDisplayZoomControls(false);
            settings.setDomStorageEnabled(true);
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
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
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.ui.BrazeWebViewActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onCreate$lambda$1;
                    onCreate$lambda$1 = BrazeWebViewActivity.onCreate$lambda$1();
                    return onCreate$lambda$1;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreate$lambda$1() {
        return "Error creating BrazeWebViewActivity. Webview will not display.";
    }

    public WebChromeClient createWebChromeClient() {
        return new BrazeWebViewActivity$createWebChromeClient$1();
    }

    public WebViewClient createWebViewClient() {
        return new BrazeWebViewActivity$createWebViewClient$1(this);
    }
}
