package com.braze.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.AbstractActivityC2168s;
import com.braze.BrazeInternal;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.support.ViewUtils;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/BrazeWebViewActivity;", "Landroidx/fragment/app/s;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/webkit/WebChromeClient;", "createWebChromeClient", "()Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebViewClient;", "createWebViewClient", "()Landroid/webkit/WebViewClient;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes.dex */
public class BrazeWebViewActivity extends AbstractActivityC2168s {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreate$lambda$1() {
        return "Error creating BrazeWebViewActivity. Webview will not display.";
    }

    @NotNull
    public WebChromeClient createWebChromeClient() {
        return new BrazeWebViewActivity$createWebChromeClient$1();
    }

    @NotNull
    public WebViewClient createWebViewClient() {
        return new BrazeWebViewActivity$createWebViewClient$1(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        try {
            super.onCreate(savedInstanceState);
            getWindow().setFlags(16777216, 16777216);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
                getWindow().setFlags(8192, 8192);
            }
            setContentView(R$layout.com_braze_webview_activity);
            WebView webView = (WebView) findViewById(R$id.com_braze_webview_activity_webview);
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
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    settings.setAlgorithmicDarkeningAllowed(true);
                } else if (i10 >= 29) {
                    settings.setForceDark(2);
                }
            }
            webView.setWebChromeClient(createWebChromeClient());
            webView.setWebViewClient(createWebViewClient());
            Bundle extras = getIntent().getExtras();
            if (extras == null || (string = extras.getString(EventKeys.URL)) == null) {
                return;
            }
            webView.loadUrl(string);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: Z3.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onCreate$lambda$1;
                    onCreate$lambda$1 = BrazeWebViewActivity.onCreate$lambda$1();
                    return onCreate$lambda$1;
                }
            }, 4, (Object) null);
        }
    }
}
