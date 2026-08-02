package ru.ozon.app.android.miniapp.webview;

import Lm0.a;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.auth.flags.ForceCastHttpToHttps;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.network.utils.TestCookieExtensionsKt;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.web.webview.client.OzonLoggerWebViewClient;
import ru.ozon.app.android.web.webview.client.OzonWebViewUrlInterceptor;
import ru.ozon.app.android.web.webview.client.WebViewRendererProcessCrashHandler;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B{\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001f\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b!\u0010%J5\u0010*\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\"\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00102R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00103R\"\u00104\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b4\u00106\"\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R0\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00100\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lru/ozon/app/android/miniapp/webview/MiniAppWebViewClient;", "Lru/ozon/app/android/web/webview/client/OzonLoggerWebViewClient;", "Lkotlin/Function1;", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "", "onUpdateScreenState", "", "onPageStartListener", "onPageFinishedListener", "", "onRedirectListener", "Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "webViewRendererProcessCrashHandler", "Lru/ozon/app/android/web/webview/client/OzonWebViewUrlInterceptor;", "ozonWebViewUrlInterceptor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "webViewErrorLogger", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;Lru/ozon/app/android/web/webview/client/OzonWebViewUrlInterceptor;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/logs/WebViewErrorLogger;)V", "Landroid/webkit/WebView;", "view", ImagesContract.URL, "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "isReload", "doUpdateVisitedHistory", "(Landroid/webkit/WebView;Ljava/lang/String;Z)V", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Landroid/webkit/WebResourceRequest;", "request", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "", "errorCode", "description", "failingUrl", "onReceivedError", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/RenderProcessGoneDetail;", ProductAction.ACTION_DETAIL, "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "Lru/ozon/app/android/web/webview/client/OzonWebViewUrlInterceptor;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "isErrorsIgnored", "Z", "()Z", "setErrorsIgnored", "(Z)V", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "getDomainsInteractor", "()Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "setDomainsInteractor", "(Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;)V", "canGoBackListener", "getCanGoBackListener", "()Lkotlin/jvm/functions/Function1;", "setCanGoBackListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/net/Uri;", "lastRedirectedUrl", "Landroid/net/Uri;", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MiniAppWebViewClient extends OzonLoggerWebViewClient {
    private Function1<? super Boolean, Unit> canGoBackListener;
    private DomainsInteractor domainsInteractor;

    @NotNull
    private final FeatureChecker featureChecker;
    private boolean isErrorsIgnored;
    private Uri lastRedirectedUrl;

    @NotNull
    private final Function1<String, Unit> onPageFinishedListener;

    @NotNull
    private final Function1<String, Unit> onPageStartListener;

    @NotNull
    private final Function1<String, Boolean> onRedirectListener;

    @NotNull
    private final Function1<ScreenState, Unit> onUpdateScreenState;

    @NotNull
    private final OzonWebViewUrlInterceptor ozonWebViewUrlInterceptor;

    @NotNull
    private final WebViewRendererProcessCrashHandler webViewRendererProcessCrashHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MiniAppWebViewClient(@NotNull Function1<? super ScreenState, Unit> onUpdateScreenState, @NotNull Function1<? super String, Unit> onPageStartListener, @NotNull Function1<? super String, Unit> onPageFinishedListener, @NotNull Function1<? super String, Boolean> onRedirectListener, @NotNull WebViewRendererProcessCrashHandler webViewRendererProcessCrashHandler, @NotNull OzonWebViewUrlInterceptor ozonWebViewUrlInterceptor, @NotNull FeatureChecker featureChecker, @NotNull WebViewErrorLogger webViewErrorLogger) {
        super(webViewErrorLogger);
        Intrinsics.checkNotNullParameter(onUpdateScreenState, "onUpdateScreenState");
        Intrinsics.checkNotNullParameter(onPageStartListener, "onPageStartListener");
        Intrinsics.checkNotNullParameter(onPageFinishedListener, "onPageFinishedListener");
        Intrinsics.checkNotNullParameter(onRedirectListener, "onRedirectListener");
        Intrinsics.checkNotNullParameter(webViewRendererProcessCrashHandler, "webViewRendererProcessCrashHandler");
        Intrinsics.checkNotNullParameter(ozonWebViewUrlInterceptor, "ozonWebViewUrlInterceptor");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(webViewErrorLogger, "webViewErrorLogger");
        this.onUpdateScreenState = onUpdateScreenState;
        this.onPageStartListener = onPageStartListener;
        this.onPageFinishedListener = onPageFinishedListener;
        this.onRedirectListener = onRedirectListener;
        this.webViewRendererProcessCrashHandler = webViewRendererProcessCrashHandler;
        this.ozonWebViewUrlInterceptor = ozonWebViewUrlInterceptor;
        this.featureChecker = featureChecker;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
        Function1<? super Boolean, Unit> function1;
        super.doUpdateVisitedHistory(view, url, isReload);
        if (view == null || (function1 = this.canGoBackListener) == null) {
            return;
        }
        function1.invoke(Boolean.valueOf(view.canGoBack()));
    }

    /* renamed from: isErrorsIgnored, reason: from getter */
    public final boolean getIsErrorsIgnored() {
        return this.isErrorsIgnored;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(view, url);
        this.onPageFinishedListener.invoke(url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        this.onUpdateScreenState.invoke(new ScreenState.Loading());
        this.onPageStartListener.invoke(url);
    }

    @Override // ru.ozon.app.android.web.webview.client.OzonLoggerWebViewClient, android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        a.f17149a.e(new MiniAppWebViewError(description));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        return this.webViewRendererProcessCrashHandler.onRendererProcessGone(detail, view);
    }

    public final void setCanGoBackListener(Function1<? super Boolean, Unit> function1) {
        this.canGoBackListener = function1;
    }

    public final void setDomainsInteractor(DomainsInteractor domainsInteractor) {
        this.domainsInteractor = domainsInteractor;
    }

    public final void setErrorsIgnored(boolean z11) {
        this.isErrorsIgnored = z11;
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
        } else {
            this.lastRedirectedUrl = null;
            Function1<String, Boolean> function1 = this.onRedirectListener;
            String uri = parse.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            if (function1.invoke(uri).booleanValue()) {
                return true;
            }
        }
        OzonWebViewUrlInterceptor ozonWebViewUrlInterceptor = this.ozonWebViewUrlInterceptor;
        String uri2 = parse.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return ozonWebViewUrlInterceptor.interceptUrl(view, uri2);
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
