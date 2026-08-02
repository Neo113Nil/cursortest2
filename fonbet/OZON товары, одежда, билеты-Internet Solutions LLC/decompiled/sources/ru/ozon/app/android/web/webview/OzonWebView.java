package ru.ozon.app.android.web.webview;

import Ob0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import a5.C4945c;
import a5.C4947e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.web.OnReceiveTitleListener;
import ru.ozon.app.android.web.di.WebComponent;
import ru.ozon.app.android.web.di.WebComponentApi;
import ru.ozon.app.android.web.webview.OzonWebView;
import ru.ozon.app.android.web.webview.client.OzonWebViewClient;
import ru.ozon.app.android.web.webview.client.chrome.OzonWebChromeClient;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u000f\u0010\u001cJ%\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J%\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\r2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\rH\u0007¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0004\u0018\u00010\n2\u0006\u00100\u001a\u00020\u001a¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u00020\n2\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b6\u0010\u0019J\u000f\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\b7\u0010\fR\u0016\u00108\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R2\u0010A\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\n\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR2\u0010G\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\n\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR2\u0010J\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\n\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010B\u001a\u0004\bK\u0010D\"\u0004\bL\u0010FR.\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001a0@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010B\u001a\u0004\bN\u0010D\"\u0004\bO\u0010FRB\u0010T\u001a\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0#\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\n\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010[\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010aR\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010<\u001a\u0004\bd\u0010eR$\u0010k\u001a\u00020\u001a2\u0006\u0010g\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010-\"\u0004\bi\u0010jR\u0016\u0010o\u001a\u0004\u0018\u00010l8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006p"}, d2 = {"Lru/ozon/app/android/web/webview/OzonWebView;", "Lru/ozon/app/android/web/webview/OzonWebViewContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onDetachedFromWindow", "()V", "", ImagesContract.URL, "loadUrl", "(Ljava/lang/String;)V", "initWebView", "Landroidx/lifecycle/J;", "owner", "init", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/web/webview/client/OzonWebViewClient;", "client", "setOzonWebViewClient", "(Lru/ozon/app/android/web/webview/client/OzonWebViewClient;)V", "", "clearHistory", "(Ljava/lang/String;Z)V", "data", "mimeType", "encoding", "loadData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "script", "Landroid/webkit/ValueCallback;", "resultCallback", "evaluateJavascript", "(Ljava/lang/String;Landroid/webkit/ValueCallback;)V", "", "jsInterface", AppMeasurementSdk.ConditionalUserProperty.NAME, "addJavascriptInterface", "(Ljava/lang/Object;Ljava/lang/String;)V", "canGoBack", "()Z", "goBack", "()Lkotlin/Unit;", "isFullscreen", "setFullscreen", "(Z)Lkotlin/Unit;", "color", "setBlankColor", "(Ljava/lang/Integer;)V", "attachWebViewClient", "clearHistoryIfNeeded", "webViewClient", "Lru/ozon/app/android/web/webview/client/OzonWebViewClient;", "LOb0/a;", "ozonIdAppApi$delegate", "LSc/j;", "getOzonIdAppApi", "()LOb0/a;", "ozonIdAppApi", "Lkotlin/Function1;", "onPageStartListener", "Lkotlin/jvm/functions/Function1;", "getOnPageStartListener", "()Lkotlin/jvm/functions/Function1;", "setOnPageStartListener", "(Lkotlin/jvm/functions/Function1;)V", "onPageFinishedListener", "getOnPageFinishedListener", "setOnPageFinishedListener", "onLinkClickListener", "getOnLinkClickListener", "setOnLinkClickListener", "onRedirectListener", "getOnRedirectListener", "setOnRedirectListener", "Lkotlin/Function2;", "", "Landroid/net/Uri;", "Landroid/webkit/WebChromeClient$FileChooserParams;", "onShowFileChooserListener", "Lkotlin/jvm/functions/Function2;", "getOnShowFileChooserListener", "()Lkotlin/jvm/functions/Function2;", "setOnShowFileChooserListener", "(Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/web/OnReceiveTitleListener;", "onReceiveTitleListener", "Lru/ozon/app/android/web/OnReceiveTitleListener;", "getOnReceiveTitleListener", "()Lru/ozon/app/android/web/OnReceiveTitleListener;", "setOnReceiveTitleListener", "(Lru/ozon/app/android/web/OnReceiveTitleListener;)V", "Z", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "webViewErrorLogger$delegate", "getWebViewErrorLogger", "()Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "webViewErrorLogger", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getResourcesCacheEnabled", "setResourcesCacheEnabled", "(Z)V", "resourcesCacheEnabled", "Landroid/webkit/CookieManager;", "getWebViewCookieManager", "()Landroid/webkit/CookieManager;", "webViewCookieManager", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes2.dex */
public class OzonWebView extends OzonWebViewContainer {
    private boolean clearHistory;
    private Function1<? super String, Unit> onLinkClickListener;
    private Function1<? super String, Unit> onPageFinishedListener;
    private Function1<? super String, Unit> onPageStartListener;
    private OnReceiveTitleListener onReceiveTitleListener;

    @NotNull
    private Function1<? super String, Boolean> onRedirectListener;
    private Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> onShowFileChooserListener;

    /* renamed from: ozonIdAppApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonIdAppApi;

    @NotNull
    private OzonWebViewClient webViewClient;

    /* renamed from: webViewErrorLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j webViewErrorLogger;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.web.webview.OzonWebView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String lastUrl = OzonWebView.this.getLastUrl();
            if (lastUrl != null) {
                OzonWebView.this.loadUrl(lastUrl);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OzonWebView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void attachWebViewClient(OzonWebViewClient client) {
        client.setOnPageStartListener(new OzonWebView$attachWebViewClient$1$1(this));
        client.setOnPageFinishedListener(new OzonWebView$attachWebViewClient$1$2(this));
        client.setOnUpdateVisitedHistoryListener(new OzonWebView$attachWebViewClient$1$3(this));
        client.setOnLinkClickListener(new OzonWebView$attachWebViewClient$1$4(this));
        client.setOnRedirectListener(new OzonWebView$attachWebViewClient$1$5(this));
        WebView webView = getWebView();
        if (webView != null) {
            webView.setWebViewClient(client);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearHistoryIfNeeded() {
        if (this.clearHistory) {
            WebView webView = getWebView();
            if (webView != null) {
                webView.clearHistory();
            }
            this.clearHistory = false;
        }
    }

    private final a getOzonIdAppApi() {
        return (a) this.ozonIdAppApi.getValue();
    }

    private final CookieManager getWebViewCookieManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        return ((NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class)).getWebViewCookieManager();
    }

    private final WebViewErrorLogger getWebViewErrorLogger() {
        return (WebViewErrorLogger) this.webViewErrorLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initWebView$lambda$2$lambda$1(OzonWebView ozonWebView, String str) {
        OnReceiveTitleListener onReceiveTitleListener = ozonWebView.onReceiveTitleListener;
        if (onReceiveTitleListener != null) {
            onReceiveTitleListener.receiveTitle(str);
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public final void addJavascriptInterface(@NotNull Object jsInterface, @NotNull String name) {
        Intrinsics.checkNotNullParameter(jsInterface, "jsInterface");
        Intrinsics.checkNotNullParameter(name, "name");
        WebView webView = getWebView();
        if (webView != null) {
            webView.addJavascriptInterface(jsInterface, name);
        }
    }

    public final boolean canGoBack() {
        WebView webView = getWebView();
        return webView != null && webView.canGoBack();
    }

    public final void evaluateJavascript(@NotNull String script, ValueCallback<String> resultCallback) {
        Intrinsics.checkNotNullParameter(script, "script");
        WebView webView = getWebView();
        if (webView != null) {
            webView.evaluateJavascript(script, resultCallback);
        }
    }

    public final Function1<String, Unit> getOnLinkClickListener() {
        return this.onLinkClickListener;
    }

    public final Function1<String, Unit> getOnPageFinishedListener() {
        return this.onPageFinishedListener;
    }

    public final Function1<String, Unit> getOnPageStartListener() {
        return this.onPageStartListener;
    }

    @NotNull
    public final Function1<String, Boolean> getOnRedirectListener() {
        return this.onRedirectListener;
    }

    public final Function2<ValueCallback<Uri[]>, WebChromeClient.FileChooserParams, Unit> getOnShowFileChooserListener() {
        return this.onShowFileChooserListener;
    }

    public final Unit goBack() {
        WebView webView = getWebView();
        if (webView == null) {
            return null;
        }
        webView.goBack();
        return Unit.f71690a;
    }

    public final void init(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        final AbstractC5434v lifecycle = owner.getLifecycle();
        lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.web.webview.OzonWebView$init$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner2) {
                Intrinsics.checkNotNullParameter(owner2, "owner");
                OzonWebView.this.onDestroyWebView();
                WebView webView = OzonWebView.this.getWebView();
                WebChromeClient webChromeClient = webView != null ? webView.getWebChromeClient() : null;
                OzonWebChromeClient ozonWebChromeClient = webChromeClient instanceof OzonWebChromeClient ? (OzonWebChromeClient) webChromeClient : null;
                if (ozonWebChromeClient != null) {
                    ozonWebChromeClient.onDestroyWebView();
                }
                lifecycle.e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner2) {
                Intrinsics.checkNotNullParameter(owner2, "owner");
                WebView webView = OzonWebView.this.getWebView();
                if (webView != null) {
                    webView.onPause();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner2) {
                Intrinsics.checkNotNullParameter(owner2, "owner");
                WebView webView = OzonWebView.this.getWebView();
                if (webView != null) {
                    webView.onResume();
                }
            }
        });
    }

    @Override // ru.ozon.app.android.web.webview.OzonWebViewContainer
    protected void initWebView() {
        final WebView webView = getWebView();
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptEnabled(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setMixedContentMode(2);
            settings.setAllowContentAccess(false);
            if (C4947e.a("FORCE_DARK") && C4947e.a("FORCE_DARK_STRATEGY")) {
                Context context = webView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                C4945c.a(webView.getSettings(), ThemeExtKt.isDarkThemeActive(context) ? 2 : 0);
                C4945c.b(webView.getSettings());
            }
            Context context2 = webView.getContext();
            Intrinsics.g(context2, "null cannot be cast to non-null type android.app.Activity");
            OzonWebChromeClient ozonWebChromeClient = new OzonWebChromeClient((Activity) context2, webView, getWebViewErrorLogger());
            ozonWebChromeClient.setOnShowFileChooserListener(new OzonWebView$initWebView$1$2(this));
            ozonWebChromeClient.setOnReceiveTitleListener(new OnReceiveTitleListener() { // from class: JY.a
                @Override // ru.ozon.app.android.web.OnReceiveTitleListener
                public final void receiveTitle(String str) {
                    OzonWebView.initWebView$lambda$2$lambda$1(OzonWebView.this, str);
                }
            });
            webView.setWebChromeClient(ozonWebChromeClient);
            CookieManager webViewCookieManager = getWebViewCookieManager();
            if (webViewCookieManager != null) {
                webViewCookieManager.setAcceptThirdPartyCookies(webView, true);
            }
            getOzonIdAppApi().r(new Pb0.a(webView) { // from class: ru.ozon.app.android.web.webview.OzonWebView$initWebView$1$4
                private final WebView webView;

                {
                    this.webView = webView;
                }

                @Override // Pb0.a
                public WebView getWebView() {
                    return this.webView;
                }
            });
        }
        attachWebViewClient(this.webViewClient);
    }

    public final void loadData(@NotNull String data, @NotNull String mimeType, @NotNull String encoding) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        WebView webView = getWebView();
        if (webView != null) {
            webView.loadDataWithBaseURL(null, data, mimeType, encoding, null);
        }
    }

    @Override // ru.ozon.app.android.web.webview.OzonWebViewContainer
    public void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        loadUrl(url, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CookieManager webViewCookieManager = getWebViewCookieManager();
        if (webViewCookieManager != null) {
            webViewCookieManager.flush();
        }
    }

    public final void setBlankColor(Integer color) {
        getScreenState().setBlankColor(color);
    }

    public final Unit setFullscreen(boolean isFullscreen) {
        ViewGroup.LayoutParams layoutParams;
        WebView webView = getWebView();
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return null;
        }
        if (isFullscreen) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        return Unit.f71690a;
    }

    public final void setOnPageFinishedListener(Function1<? super String, Unit> function1) {
        this.onPageFinishedListener = function1;
    }

    public final void setOnPageStartListener(Function1<? super String, Unit> function1) {
        this.onPageStartListener = function1;
    }

    public final void setOnReceiveTitleListener(OnReceiveTitleListener onReceiveTitleListener) {
        this.onReceiveTitleListener = onReceiveTitleListener;
    }

    public final void setOnRedirectListener(@NotNull Function1<? super String, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onRedirectListener = function1;
    }

    public final void setOnShowFileChooserListener(Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> function2) {
        this.onShowFileChooserListener = function2;
    }

    public final void setOzonWebViewClient(@NotNull OzonWebViewClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.webViewClient = client;
        attachWebViewClient(client);
    }

    public final void setResourcesCacheEnabled(boolean z11) {
        this.webViewClient.setResourcesCacheEnabled(z11);
    }

    public /* synthetic */ OzonWebView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void loadUrl(@NotNull String url, boolean clearHistory) {
        Intrinsics.checkNotNullParameter(url, "url");
        setLastUrl(url);
        this.clearHistory = clearHistory;
        WebView webView = getWebView();
        if (webView == null || this.webViewClient.getWebViewUrlInterceptor().interceptUrl(webView, url)) {
            return;
        }
        webView.loadUrl(url);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonWebView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ozonIdAppApi = k.b(new OzonWebView$ozonIdAppApi$2(context));
        this.onRedirectListener = OzonWebView$onRedirectListener$1.INSTANCE;
        this.webViewErrorLogger = k.b(new OzonWebView$webViewErrorLogger$2(context));
        if (!WebComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            C6740b dependencyStorage = C6739a.a(context, WebComponentApi.class).getDependencyStorage();
            if (!WebComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                this.webViewClient = ((WebComponent) dependencyStorage.b(WebComponentApi.class)).getOzonWebViewClient();
                addView(getScreenState());
                reCreateWebView();
                getScreenState().setListener(new AnonymousClass1());
                return;
            }
            throw new IllegalStateException("Requested component WebComponentApi is not DiComponent");
        }
        throw new IllegalStateException("Requested component WebComponentApi is not DiComponent");
    }
}
