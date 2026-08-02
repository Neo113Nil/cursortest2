package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.util.Consumer;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.util.Logger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewUtil.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/platform/WebViewUtil;", "", "()V", "TAG", "", "applyWebSettings", "", "webView", "Landroid/webkit/WebView;", "webViewSettings", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "getUserAgent", "context", "Landroid/content/Context;", "consumer", "Landroidx/core/util/Consumer;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class WebViewUtil {
    public static final WebViewUtil INSTANCE = new WebViewUtil();
    private static final String TAG = "WebViewUtil";

    private WebViewUtil() {
    }

    public final void getUserAgent(Context context, Consumer<String> consumer) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        try {
            Result.Companion companion = Result.INSTANCE;
            WebViewUtil webViewUtil = this;
            obj = Result.m11180constructorimpl(WebSettings.getDefaultUserAgent(context));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            obj = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11187isSuccessimpl(obj)) {
            consumer.accept((String) obj);
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(obj);
        if (m11183exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "Failed to get user agent", m11183exceptionOrNullimpl);
            consumer.accept(null);
        }
    }

    public final void applyWebSettings(WebView webView, AdPayload.WebViewSettings webViewSettings) {
        Boolean allowUniversalAccessFromFileUrls;
        Boolean allowFileAccessFromFileUrls;
        Intrinsics.checkNotNullParameter(webView, "webView");
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs((webViewSettings == null || (allowFileAccessFromFileUrls = webViewSettings.getAllowFileAccessFromFileUrls()) == null) ? false : allowFileAccessFromFileUrls.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs((webViewSettings == null || (allowUniversalAccessFromFileUrls = webViewSettings.getAllowUniversalAccessFromFileUrls()) == null) ? false : allowUniversalAccessFromFileUrls.booleanValue());
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }
}
