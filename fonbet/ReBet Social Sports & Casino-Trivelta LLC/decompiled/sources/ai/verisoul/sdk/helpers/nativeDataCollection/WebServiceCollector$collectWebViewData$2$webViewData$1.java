package ai.verisoul.sdk.helpers.nativeDataCollection;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.P;
import ai.verisoul.sdk.helpers.webview.VerisoulWebView;
import ai.verisoul.sdk.helpers.webview.VerisoulWebviewCallback;
import ai.verisoul.sdk.helpers.webview.WebViewData;
import ai.verisoul.sdk.logger.Logger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "Lai/verisoul/sdk/helpers/webview/WebViewData;", "<anonymous>", "(LPh/P;)Lai/verisoul/sdk/helpers/webview/WebViewData;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.helpers.nativeDataCollection.WebServiceCollector$collectWebViewData$2$webViewData$1", f = "WebServiceCollector.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nWebServiceCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebServiceCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/WebServiceCollector$collectWebViewData$2$webViewData$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,80:1\n314#2,11:81\n*S KotlinDebug\n*F\n+ 1 WebServiceCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/WebServiceCollector$collectWebViewData$2$webViewData$1\n*L\n52#1:81,11\n*E\n"})
/* loaded from: classes.dex */
public final class WebServiceCollector$collectWebViewData$2$webViewData$1 extends SuspendLambda implements Function2<P, Continuation<? super WebViewData>, Object> {
    final /* synthetic */ String $sessionId;
    final /* synthetic */ long $webViewSessionStartTimestamp;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WebServiceCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebServiceCollector$collectWebViewData$2$webViewData$1(WebServiceCollector webServiceCollector, String str, long j10, Continuation<? super WebServiceCollector$collectWebViewData$2$webViewData$1> continuation) {
        super(2, continuation);
        this.this$0 = webServiceCollector;
        this.$sessionId = str;
        this.$webViewSessionStartTimestamp = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WebServiceCollector$collectWebViewData$2$webViewData$1(this.this$0, this.$sessionId, this.$webViewSessionStartTimestamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super WebViewData> continuation) {
        return ((WebServiceCollector$collectWebViewData$2$webViewData$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        VerisoulWebView webView;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        final WebServiceCollector webServiceCollector = this.this$0;
        String str = this.$sessionId;
        final long j10 = this.$webViewSessionStartTimestamp;
        this.L$0 = webServiceCollector;
        this.L$1 = str;
        this.J$0 = j10;
        this.label = 1;
        final C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(this), 1);
        c1469p.F();
        webView = webServiceCollector.getWebView();
        webView.onInit(str, new VerisoulWebviewCallback() { // from class: ai.verisoul.sdk.helpers.nativeDataCollection.WebServiceCollector$collectWebViewData$2$webViewData$1$1$1
            @Override // ai.verisoul.sdk.helpers.webview.VerisoulWebviewCallback
            public void onFailure(@NotNull Throwable exception) {
                String str2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                Logger logger = Logger.INSTANCE;
                str2 = WebServiceCollector.this.logTag;
                logger.error(str2, "Error during WebView init: " + exception.getMessage());
                if (c1469p.isActive()) {
                    InterfaceC1465n interfaceC1465n = c1469p;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(exception)));
                }
            }

            @Override // ai.verisoul.sdk.helpers.webview.VerisoulWebviewCallback
            public void onLoad(@NotNull WebViewData webViewType) {
                String str2;
                Intrinsics.checkNotNullParameter(webViewType, "webViewType");
                long currentTimeMillis = System.currentTimeMillis();
                Logger logger = Logger.INSTANCE;
                str2 = WebServiceCollector.this.logTag;
                logger.metricLog(str2, "webview_duration", currentTimeMillis - j10);
                if (c1469p.isActive()) {
                    c1469p.f(webViewType, null);
                }
            }
        });
        c1469p.c(new Function1<Throwable, Unit>() { // from class: ai.verisoul.sdk.helpers.nativeDataCollection.WebServiceCollector$collectWebViewData$2$webViewData$1$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                String str2;
                Logger logger = Logger.INSTANCE;
                str2 = WebServiceCollector.this.logTag;
                logger.debug(str2, "WebView coroutine was cancelled");
            }
        });
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        return z10 == coroutine_suspended ? coroutine_suspended : z10;
    }
}
