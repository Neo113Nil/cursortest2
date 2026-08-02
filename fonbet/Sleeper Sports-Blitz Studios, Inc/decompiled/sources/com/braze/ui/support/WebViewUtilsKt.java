package com.braze.ui.support;

import android.content.Context;
import android.webkit.WebSettings;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"TAG", "", "setWebViewSettings", "", "settings", "Landroid/webkit/WebSettings;", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebViewUtilsKt {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("WebViewUtils");

    public static final void setWebViewSettings(WebSettings settings, Context context) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(context, "context");
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        try {
            if (WebViewFeature.isFeatureSupported("FORCE_DARK") && ViewUtils.isDeviceInNightMode(context)) {
                WebSettingsCompat.setForceDark(settings, 2);
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
                WebSettingsCompat.setForceDarkStrategy(settings, 1);
            }
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, new Function0() { // from class: com.braze.ui.support.WebViewUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String webViewSettings$lambda$0;
                    webViewSettings$lambda$0 = WebViewUtilsKt.setWebViewSettings$lambda$0();
                    return webViewSettings$lambda$0;
                }
            }, 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setWebViewSettings$lambda$0() {
        return "Failed to set dark mode WebView settings.";
    }
}
