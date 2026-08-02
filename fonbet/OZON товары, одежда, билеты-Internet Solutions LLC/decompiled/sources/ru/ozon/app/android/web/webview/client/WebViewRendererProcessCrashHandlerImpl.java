package ru.ozon.app.android.web.webview.client;

import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.web.webview.OzonWebViewContainer;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandlerImpl;", "Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "<init>", "()V", "reCreationWebView", "", "onRendererProcessGone", "", ProductAction.ACTION_DETAIL, "Landroid/webkit/RenderProcessGoneDetail;", "webView", "Landroid/webkit/WebView;", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewRendererProcessCrashHandlerImpl implements WebViewRendererProcessCrashHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private int reCreationWebView;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandlerImpl$Companion;", "", "<init>", "()V", "RECREATION_WEB_VIEW_LIMIT", "", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.app.android.web.webview.client.WebViewRendererProcessCrashHandler
    public boolean onRendererProcessGone(RenderProcessGoneDetail detail, WebView webView) {
        ViewParent parent = webView != null ? webView.getParent() : null;
        OzonWebViewContainer ozonWebViewContainer = parent instanceof OzonWebViewContainer ? (OzonWebViewContainer) parent : null;
        if (ozonWebViewContainer == null || detail == null || !detail.didCrash()) {
            return false;
        }
        int i11 = this.reCreationWebView;
        if (i11 < 2) {
            this.reCreationWebView = i11 + 1;
            ozonWebViewContainer.reCreateWebView();
            ozonWebViewContainer.loadLastUrl();
        }
        return true;
    }
}
