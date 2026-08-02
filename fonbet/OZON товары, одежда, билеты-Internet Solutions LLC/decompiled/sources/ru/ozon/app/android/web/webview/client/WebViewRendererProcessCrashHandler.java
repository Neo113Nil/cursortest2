package ru.ozon.app.android.web.webview.client;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "", "onRendererProcessGone", "", ProductAction.ACTION_DETAIL, "Landroid/webkit/RenderProcessGoneDetail;", "webView", "Landroid/webkit/WebView;", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WebViewRendererProcessCrashHandler {
    boolean onRendererProcessGone(RenderProcessGoneDetail detail, WebView webView);
}
