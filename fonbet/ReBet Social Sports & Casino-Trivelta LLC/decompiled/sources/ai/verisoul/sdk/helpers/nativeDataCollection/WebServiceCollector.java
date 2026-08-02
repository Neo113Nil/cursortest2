package ai.verisoul.sdk.helpers.nativeDataCollection;

import Ph.A;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.P;
import Ph.Q;
import Ph.X;
import Ph.X0;
import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.session.SessionHelper;
import ai.verisoul.sdk.helpers.webview.VerisoulWebView;
import ai.verisoul.sdk.helpers.webview.WebViewData;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lai/verisoul/sdk/helpers/nativeDataCollection/WebServiceCollector;", "", "<init>", "()V", "", "cancel", "Lai/verisoul/sdk/helpers/webview/WebViewData;", "collectWebViewData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "logTag", "Ljava/lang/String;", "Lai/verisoul/sdk/helpers/webview/VerisoulWebView;", "webView$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "getWebView", "()Lai/verisoul/sdk/helpers/webview/VerisoulWebView;", "webView", "Lai/verisoul/sdk/helpers/session/SessionHelper;", "sessionService$delegate", "getSessionService", "()Lai/verisoul/sdk/helpers/session/SessionHelper;", "sessionService", "LPh/A;", "job", "LPh/A;", "LPh/P;", "scope", "LPh/P;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebServiceCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebServiceCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/WebServiceCollector\n+ 2 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n*L\n1#1,80:1\n67#2:81\n67#2:82\n*S KotlinDebug\n*F\n+ 1 WebServiceCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/WebServiceCollector\n*L\n27#1:81\n28#1:82\n*E\n"})
/* loaded from: classes.dex */
public final class WebServiceCollector {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WebServiceCollector.class, "webView", "getWebView()Lai/verisoul/sdk/helpers/webview/VerisoulWebView;", 0)), Reflection.property1(new PropertyReference1Impl(WebServiceCollector.class, "sessionService", "getSessionService()Lai/verisoul/sdk/helpers/session/SessionHelper;", 0))};

    @NotNull
    private A job;

    @NotNull
    private P scope;

    @NotNull
    private final String logTag = "Verisoul-[" + WebServiceCollector.class.getSimpleName() + "]";

    /* renamed from: webView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate webView = new InjectDelegate(VerisoulWebView.class);

    /* renamed from: sessionService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate sessionService = new InjectDelegate(SessionHelper.class);

    public WebServiceCollector() {
        A b10 = X0.b(null, 1, null);
        this.job = b10;
        this.scope = Q.a(b10.plus(C1452g0.c().e2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionHelper getSessionService() {
        return (SessionHelper) this.sessionService.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VerisoulWebView getWebView() {
        return (VerisoulWebView) this.webView.getValue(this, $$delegatedProperties[0]);
    }

    public final void cancel() {
        this.job.cancel(new CancellationException("WebView data collection cancelled"));
        A b10 = X0.b(null, 1, null);
        this.job = b10;
        this.scope = Q.a(b10.plus(C1452g0.c().e2()));
    }

    @Nullable
    public final Object collectWebViewData(@NotNull Continuation<? super WebViewData> continuation) {
        X b10;
        b10 = AbstractC1459k.b(this.scope, null, null, new WebServiceCollector$collectWebViewData$2(this, null), 3, null);
        return b10.await(continuation);
    }
}
