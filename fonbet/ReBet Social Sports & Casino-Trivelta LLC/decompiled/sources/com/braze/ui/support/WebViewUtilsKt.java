package com.braze.ui.support;

import O2.d;
import O2.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import com.braze.support.BrazeLogger;
import com.braze.ui.support.WebViewUtilsKt;
import com.twilio.voice.EventGroupType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"TAG", "", "setWebViewSettings", "", EventGroupType.SETTINGS_GROUP, "Landroid/webkit/WebSettings;", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WebViewUtilsKt {

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("WebViewUtils");

    @SuppressLint({"SetJavaScriptEnabled"})
    public static final void setWebViewSettings(@NotNull WebSettings settings, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(context, "context");
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        try {
            if (g.a("FORCE_DARK") && ViewUtils.isDeviceInNightMode(context)) {
                d.c(settings, 2);
            }
            if (g.a("FORCE_DARK_STRATEGY")) {
                d.d(settings, 1);
            }
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, th2, false, new Function0() { // from class: p4.m
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
