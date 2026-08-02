package ru.ozon.app.android.web.webview.client;

import Lm0.a;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.auth.flags.ForceCastHttpToHttps;
import ru.ozon.app.android.network.auth.flags.LogWebViewUrlIsHttp;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.network.utils.TestCookieExtensionsKt;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.web.webview.WebViewMetrics;
import ru.ozon.app.android.web.webview.cache.service.ResourcesCacheInterceptor;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 ^2\u00020\u0001:\u0001^B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010 \u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\"\u0010#J+\u0010&\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010(\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b(\u0010,J5\u00101\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010\u00102\b\u00100\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b1\u00102J!\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b4\u00105J#\u00108\u001a\u00020$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J#\u0010<\u001a\u00020\u00152\u0014\u0010;\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00150:¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\u00020\u00152\u0014\u0010;\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00150:¢\u0006\u0004\b>\u0010=J)\u0010@\u001a\u00020\u00152\u001a\u0010;\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00150?¢\u0006\u0004\b@\u0010AJ!\u0010B\u001a\u00020\u00152\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$0:¢\u0006\u0004\bB\u0010=J#\u0010C\u001a\u00020\u00152\u0014\u0010;\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00150:¢\u0006\u0004\bC\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bI\u0010JR\"\u0010K\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR&\u0010Q\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR&\u0010S\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR,\u0010T\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0015\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR&\u0010V\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010RR$\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010RR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lru/ozon/app/android/web/webview/client/OzonWebViewClient;", "Lru/ozon/app/android/web/webview/client/OzonLoggerWebViewClient;", "Lru/ozon/app/android/web/webview/cache/service/ResourcesCacheInterceptor;", "resourcesCacheInterceptor", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "webViewRendererProcessCrashHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/web/webview/client/WebViewUrlInterceptor;", "webViewUrlInterceptor", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "webViewErrorLogger", "<init>", "(Lru/ozon/app/android/web/webview/cache/service/ResourcesCacheInterceptor;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/web/webview/client/WebViewUrlInterceptor;Lru/ozon/app/android/network/logs/WebViewErrorLogger;)V", "", ImagesContract.URL, "modifyPdfUrl", "(Ljava/lang/String;)Ljava/lang/String;", "pageUrl", "", "pageLoadedMetricStartedHandler", "(Ljava/lang/String;)V", "", "duration", "pageLoadedMetricCalculatedHandler", "(Ljava/lang/String;J)V", "Landroid/webkit/WebView;", "view", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "", "isReload", "doUpdateVisitedHistory", "(Landroid/webkit/WebView;Ljava/lang/String;Z)V", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Landroid/webkit/WebResourceRequest;", "request", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "", "errorCode", "description", "failingUrl", "onReceivedError", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/webkit/RenderProcessGoneDetail;", ProductAction.ACTION_DETAIL, "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnPageStartListener", "(Lkotlin/jvm/functions/Function1;)V", "setOnPageFinishedListener", "Lkotlin/Function2;", "setOnUpdateVisitedHistoryListener", "(Lkotlin/jvm/functions/Function2;)V", "setOnRedirectListener", "setOnLinkClickListener", "Lru/ozon/app/android/web/webview/cache/service/ResourcesCacheInterceptor;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/web/webview/client/WebViewUrlInterceptor;", "getWebViewUrlInterceptor", "()Lru/ozon/app/android/web/webview/client/WebViewUrlInterceptor;", "resourcesCacheEnabled", "Z", "getResourcesCacheEnabled", "()Z", "setResourcesCacheEnabled", "(Z)V", "onPageStartListener", "Lkotlin/jvm/functions/Function1;", "onPageFinishedListener", "onUpdateVisitedHistoryListener", "Lkotlin/jvm/functions/Function2;", "onLinkClickListener", "onRedirectListener", "Lru/ozon/app/android/web/webview/WebViewMetrics;", "metrics", "Lru/ozon/app/android/web/webview/WebViewMetrics;", "Landroid/net/Uri;", "lastRedirectedUrl", "Landroid/net/Uri;", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OzonWebViewClient extends OzonLoggerWebViewClient {

    @NotNull
    private final FeatureChecker featureChecker;
    private Uri lastRedirectedUrl;

    @NotNull
    private final WebViewMetrics metrics;
    private Function1<? super String, Unit> onLinkClickListener;
    private Function1<? super String, Unit> onPageFinishedListener;
    private Function1<? super String, Unit> onPageStartListener;
    private Function1<? super String, Boolean> onRedirectListener;
    private Function2<? super String, ? super Boolean, Unit> onUpdateVisitedHistoryListener;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;
    private boolean resourcesCacheEnabled;

    @NotNull
    private final ResourcesCacheInterceptor resourcesCacheInterceptor;

    @NotNull
    private final WebViewRendererProcessCrashHandler webViewRendererProcessCrashHandler;

    @NotNull
    private final WebViewUrlInterceptor webViewUrlInterceptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonWebViewClient(@NotNull ResourcesCacheInterceptor resourcesCacheInterceptor, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull WebViewRendererProcessCrashHandler webViewRendererProcessCrashHandler, @NotNull FeatureChecker featureChecker, @NotNull WebViewUrlInterceptor webViewUrlInterceptor, @NotNull WebViewErrorLogger webViewErrorLogger) {
        super(webViewErrorLogger);
        Intrinsics.checkNotNullParameter(resourcesCacheInterceptor, "resourcesCacheInterceptor");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(webViewRendererProcessCrashHandler, "webViewRendererProcessCrashHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(webViewUrlInterceptor, "webViewUrlInterceptor");
        Intrinsics.checkNotNullParameter(webViewErrorLogger, "webViewErrorLogger");
        this.resourcesCacheInterceptor = resourcesCacheInterceptor;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.webViewRendererProcessCrashHandler = webViewRendererProcessCrashHandler;
        this.featureChecker = featureChecker;
        this.webViewUrlInterceptor = webViewUrlInterceptor;
        this.metrics = new WebViewMetrics(new OzonWebViewClient$metrics$1(this), new OzonWebViewClient$metrics$2(this));
    }

    private final String modifyPdfUrl(String url) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(url));
        if (mimeTypeFromExtension == null || !mimeTypeFromExtension.equals("application/pdf")) {
            return url;
        }
        String uri = LinkGenerator.pdfViewer$default(LinkGenerator.INSTANCE, url, false, 2, null).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pageLoadedMetricCalculatedHandler(String pageUrl, long duration) {
        this.performanceTrackerDelegate.endTrace(pageUrl, U.c());
        a.b bVar = a.f17149a;
        bVar.b("WebViewCache");
        bVar.d("Page " + pageUrl + " loaded for " + duration, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pageLoadedMetricStartedHandler(String pageUrl) {
        this.performanceTrackerDelegate.beginTrace(pageUrl);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
        super.doUpdateVisitedHistory(view, url, isReload);
        Function2<? super String, ? super Boolean, Unit> function2 = this.onUpdateVisitedHistoryListener;
        if (function2 != null) {
            function2.invoke(url, Boolean.valueOf(isReload));
        }
    }

    @NotNull
    public final WebViewUrlInterceptor getWebViewUrlInterceptor() {
        return this.webViewUrlInterceptor;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        String clearQuery;
        super.onPageFinished(view, url);
        Function1<? super String, Unit> function1 = this.onPageFinishedListener;
        if (function1 != null) {
            function1.invoke(url);
        }
        if (url == null || (clearQuery = WebViewMetrics.INSTANCE.clearQuery(url)) == null) {
            return;
        }
        this.metrics.onFinished(clearQuery);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        Function1<? super String, Unit> function1 = this.onPageStartListener;
        if (function1 != null) {
            function1.invoke(url);
        }
    }

    @Override // ru.ozon.app.android.web.webview.client.OzonLoggerWebViewClient, android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        a.f17149a.e(new OzonWebViewError(description));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        return this.webViewRendererProcessCrashHandler.onRendererProcessGone(detail, view);
    }

    public final void setOnLinkClickListener(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onLinkClickListener = listener;
    }

    public final void setOnPageFinishedListener(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPageFinishedListener = listener;
    }

    public final void setOnPageStartListener(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPageStartListener = listener;
    }

    public final void setOnRedirectListener(@NotNull Function1<? super String, Boolean> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onRedirectListener = listener;
    }

    public final void setOnUpdateVisitedHistoryListener(@NotNull Function2<? super String, ? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUpdateVisitedHistoryListener = listener;
    }

    public final void setResourcesCacheEnabled(boolean z11) {
        this.resourcesCacheEnabled = z11;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.featureChecker.isEnabled(LogWebViewUrlIsHttp.INSTANCE)) {
            WebViewUrlChecker webViewUrlChecker = WebViewUrlChecker.INSTANCE;
            String uri = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            webViewUrlChecker.checkUrl(uri);
        }
        if (request.isForMainFrame()) {
            WebViewMetrics webViewMetrics = this.metrics;
            WebViewMetrics.Companion companion = WebViewMetrics.INSTANCE;
            String uri2 = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            webViewMetrics.onStarted(companion.clearQuery(uri2));
        }
        WebResourceResponse intercept = this.resourcesCacheEnabled ? this.resourcesCacheInterceptor.intercept(request) : null;
        return intercept == null ? super.shouldInterceptRequest(view, request) : intercept;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        if (this.featureChecker.isEnabled(ForceCastHttpToHttps.INSTANCE)) {
            Intrinsics.f(parse);
            parse = UriExtKt.mapToHttps(parse);
        }
        if (TestCookieExtensionsKt.isNetworkRedirect(parse, this.lastRedirectedUrl)) {
            this.lastRedirectedUrl = parse;
            WebViewUrlInterceptor webViewUrlInterceptor = this.webViewUrlInterceptor;
            String uri = parse.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            return webViewUrlInterceptor.interceptRedirectUrl(view, uri);
        }
        this.lastRedirectedUrl = null;
        String uri2 = parse.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        String modifyPdfUrl = modifyPdfUrl(uri2);
        Function1<? super String, Unit> function1 = this.onLinkClickListener;
        if (function1 != null) {
            function1.invoke(modifyPdfUrl);
        }
        Function1<? super String, Boolean> function12 = this.onRedirectListener;
        if (function12 != null && function12.invoke(modifyPdfUrl).booleanValue()) {
            return true;
        }
        WebViewUrlInterceptor webViewUrlInterceptor2 = this.webViewUrlInterceptor;
        String uri3 = parse.toString();
        Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
        return webViewUrlInterceptor2.interceptUrl(view, uri3);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return shouldOverrideUrlLoading(view, uri);
    }
}
