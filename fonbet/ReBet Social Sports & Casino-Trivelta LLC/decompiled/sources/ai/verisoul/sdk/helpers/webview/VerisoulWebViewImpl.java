package ai.verisoul.sdk.helpers.webview;

import O2.f;
import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.M;
import Ph.P;
import Ph.Q;
import Ph.X0;
import Ph.h1;
import ai.verisoul.sdk.VerisoulEnvironment;
import ai.verisoul.sdk.VerisoulErrorCodes;
import ai.verisoul.sdk.VerisoulException;
import ai.verisoul.sdk.logger.Logger;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u0018J\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0018\u00107\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010$R\u0014\u00108\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b8\u0010$¨\u00069"}, d2 = {"Lai/verisoul/sdk/helpers/webview/VerisoulWebViewImpl;", "Lai/verisoul/sdk/helpers/webview/VerisoulWebView;", "Landroid/content/Context;", "context", "Lai/verisoul/sdk/VerisoulEnvironment;", "environment", "", "projectId", "Lai/verisoul/sdk/helpers/webview/WebViewFactory;", "webViewFactory", "<init>", "(Landroid/content/Context;Lai/verisoul/sdk/VerisoulEnvironment;Ljava/lang/String;Lai/verisoul/sdk/helpers/webview/WebViewFactory;)V", "Lai/verisoul/sdk/helpers/webview/WebViewData;", "getWebViewType", "()Lai/verisoul/sdk/helpers/webview/WebViewData;", "sessionId", "", "loadingWebView", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delayMillis", "destroyWebView", "(J)V", "actuallyDestroy", "()V", "initializeWebView", "(Ljava/lang/String;)V", "getVerisoulUrl", "(Ljava/lang/String;)Ljava/lang/String;", "shutdown", "Lai/verisoul/sdk/helpers/webview/VerisoulWebviewCallback;", "callback", "onInit", "(Ljava/lang/String;Lai/verisoul/sdk/helpers/webview/VerisoulWebviewCallback;)V", "Landroid/content/Context;", "Lai/verisoul/sdk/VerisoulEnvironment;", "Ljava/lang/String;", "Lai/verisoul/sdk/helpers/webview/WebViewFactory;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "webViewInitialised", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoading", "LPh/M;", "exceptionHandler", "LPh/M;", "LPh/P;", "scope", "LPh/P;", "LPh/C0;", "destroyJob", "LPh/C0;", "initJob", "currentSessionId", "TAG", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVerisoulWebViewImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerisoulWebViewImpl.kt\nai/verisoul/sdk/helpers/webview/VerisoulWebViewImpl\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,281:1\n48#2,4:282\n*S KotlinDebug\n*F\n+ 1 VerisoulWebViewImpl.kt\nai/verisoul/sdk/helpers/webview/VerisoulWebViewImpl\n*L\n39#1:282,4\n*E\n"})
/* loaded from: classes.dex */
public final class VerisoulWebViewImpl implements VerisoulWebView {

    @NotNull
    private final String TAG;

    @NotNull
    private final Context context;

    @Nullable
    private String currentSessionId;

    @Nullable
    private C0 destroyJob;

    @NotNull
    private final VerisoulEnvironment environment;

    @NotNull
    private final M exceptionHandler;

    @Nullable
    private C0 initJob;

    @NotNull
    private final AtomicBoolean isLoading;

    @NotNull
    private final String projectId;

    @NotNull
    private final P scope;

    @Nullable
    private WebView webView;

    @NotNull
    private final WebViewFactory webViewFactory;

    @NotNull
    private final AtomicBoolean webViewInitialised;

    public VerisoulWebViewImpl(@NotNull Context context, @NotNull VerisoulEnvironment environment, @NotNull String projectId, @NotNull WebViewFactory webViewFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        this.context = context;
        this.environment = environment;
        this.projectId = projectId;
        this.webViewFactory = webViewFactory;
        this.webViewInitialised = new AtomicBoolean(false);
        this.isLoading = new AtomicBoolean(false);
        VerisoulWebViewImpl$special$$inlined$CoroutineExceptionHandler$1 verisoulWebViewImpl$special$$inlined$CoroutineExceptionHandler$1 = new VerisoulWebViewImpl$special$$inlined$CoroutineExceptionHandler$1(M.f9041T2, this);
        this.exceptionHandler = verisoulWebViewImpl$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = Q.a(X0.b(null, 1, null).plus(C1452g0.c()).plus(verisoulWebViewImpl$special$$inlined$CoroutineExceptionHandler$1));
        this.TAG = "[VerisoulWebView]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void actuallyDestroy() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
            webView.clearHistory();
            webView.clearCache(true);
            webView.removeAllViews();
            webView.setWebViewClient(new WebViewClient());
            webView.removeJavascriptInterface(JSBridge.class.getSimpleName());
            webView.destroy();
        }
        this.webView = null;
        this.webViewInitialised.set(false);
        this.currentSessionId = null;
        this.destroyJob = null;
    }

    private final void destroyWebView(long delayMillis) {
        C0 d10;
        C0 c02 = this.destroyJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(this.scope, null, null, new VerisoulWebViewImpl$destroyWebView$1(delayMillis, this, null), 3, null);
        this.destroyJob = d10;
    }

    public static /* synthetic */ void destroyWebView$default(VerisoulWebViewImpl verisoulWebViewImpl, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 500;
        }
        verisoulWebViewImpl.destroyWebView(j10);
    }

    private final String getVerisoulUrl(String sessionId) {
        return "https://js.verisoul.ai/" + this.environment.getValue() + "/webview.html?project_id=" + this.projectId + "&session_id=" + sessionId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebViewData getWebViewType() {
        try {
            PackageInfo d10 = f.d(this.context);
            if (d10 == null) {
                return new WebViewData("unknown", "unknown");
            }
            String packageName = d10.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            return new WebViewData(packageName, d10.versionName);
        } catch (Exception e10) {
            Logger.INSTANCE.error(this.TAG, "Error getting WebView type: " + e10.getMessage());
            return new WebViewData("unavailable", "unavailable");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void initializeWebView(String sessionId) {
        if (this.webViewInitialised.get()) {
            if (Intrinsics.areEqual(this.currentSessionId, sessionId)) {
                WebView webView = this.webView;
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            }
            C0 c02 = this.destroyJob;
            if (c02 != null) {
                C0.a.b(c02, null, 1, null);
            }
            actuallyDestroy();
        }
        Logger.INSTANCE.info(this.TAG, "WebView init started");
        try {
            WebView create = this.webViewFactory.create(this.context);
            create.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            create.getSettings().setJavaScriptEnabled(true);
            create.getSettings().setDomStorageEnabled(true);
            create.setWebViewClient(new WebViewClient() { // from class: ai.verisoul.sdk.helpers.webview.VerisoulWebViewImpl$initializeWebView$1$1
                @Override // android.webkit.WebViewClient
                public void onReceivedError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceError error) {
                    String str;
                    int i10;
                    String str2;
                    String str3;
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(error, "error");
                    super.onReceivedError(view, request, error);
                    CharSequence description = error.getDescription();
                    if (description == null || (str = description.toString()) == null) {
                        str = "Unknown error";
                    }
                    try {
                        i10 = error.getErrorCode();
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    Uri url = request.getUrl();
                    if (url == null || (str2 = url.toString()) == null) {
                        str2 = "Unknown URL";
                    }
                    Logger logger = Logger.INSTANCE;
                    str3 = VerisoulWebViewImpl.this.TAG;
                    logger.error(str3, "WebView error - Code: " + i10 + ", Description: " + str + ", URL: " + str2);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) {
                    String str;
                    String str2;
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(handler, "handler");
                    Intrinsics.checkNotNullParameter(error, "error");
                    try {
                        str = error.toString();
                    } catch (Exception unused) {
                        str = "SSL error details unavailable";
                    }
                    Intrinsics.checkNotNull(str);
                    Logger logger = Logger.INSTANCE;
                    str2 = VerisoulWebViewImpl.this.TAG;
                    logger.error(str2, "WebView SSL error: " + str);
                    handler.cancel();
                }
            });
            getVerisoulUrl(sessionId);
            create.loadUrl(getVerisoulUrl(sessionId));
            this.webView = create;
            this.currentSessionId = sessionId;
            this.webViewInitialised.set(true);
        } catch (Exception e10) {
            Logger.INSTANCE.error(this.TAG, "WebView not available: " + e10.getMessage());
            throw new VerisoulException(VerisoulErrorCodes.WEBVIEW_UNAVAILABLE, "WebView is not available on this device", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadingWebView(String str, Continuation<? super Unit> continuation) {
        Object c10 = h1.c(VerisoulWebViewImplKt.WEBVIEW_TIMEOUT, new VerisoulWebViewImpl$loadingWebView$2(this, str, null), continuation);
        return c10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c10 : Unit.INSTANCE;
    }

    private final void shutdown() {
        Logger.INSTANCE.info(this.TAG, "Shutting down WebView");
        AbstractC1457j.b(null, new VerisoulWebViewImpl$shutdown$1(this, null), 1, null);
        Q.f(this.scope, null, 1, null);
    }

    @Override // ai.verisoul.sdk.helpers.webview.VerisoulWebView
    public void onInit(@NotNull String sessionId, @NotNull VerisoulWebviewCallback callback) {
        C0 d10;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.isLoading.get() && Intrinsics.areEqual(this.currentSessionId, sessionId)) {
            destroyWebView$default(this, 0L, 1, null);
            callback.onFailure(new IllegalStateException("WebView is already initializing for this session"));
            return;
        }
        if (this.isLoading.get() && !Intrinsics.areEqual(this.currentSessionId, sessionId)) {
            destroyWebView$default(this, 0L, 1, null);
            C0 c02 = this.initJob;
            if (c02 != null) {
                c02.cancel(new CancellationException("Cancelled due to new session init"));
            }
            C0 c03 = this.destroyJob;
            if (c03 != null) {
                C0.a.b(c03, null, 1, null);
            }
            AbstractC1459k.d(this.scope, null, null, new VerisoulWebViewImpl$onInit$1(this, null), 3, null);
        }
        this.isLoading.set(true);
        this.currentSessionId = sessionId;
        d10 = AbstractC1459k.d(this.scope, null, null, new VerisoulWebViewImpl$onInit$2(this, sessionId, callback, null), 3, null);
        this.initJob = d10;
    }

    public /* synthetic */ VerisoulWebViewImpl(Context context, VerisoulEnvironment verisoulEnvironment, String str, WebViewFactory webViewFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, verisoulEnvironment, str, (i10 & 8) != 0 ? new DefaultWebViewFactory() : webViewFactory);
    }
}
