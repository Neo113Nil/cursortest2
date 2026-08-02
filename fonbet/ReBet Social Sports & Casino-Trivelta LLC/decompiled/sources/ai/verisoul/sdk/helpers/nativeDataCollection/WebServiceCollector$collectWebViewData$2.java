package ai.verisoul.sdk.helpers.nativeDataCollection;

import Ph.P;
import Ph.h1;
import ai.verisoul.sdk.helpers.session.SessionHelper;
import ai.verisoul.sdk.helpers.webview.WebViewData;
import ai.verisoul.sdk.logger.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "Lai/verisoul/sdk/helpers/webview/WebViewData;", "<anonymous>", "(LPh/P;)Lai/verisoul/sdk/helpers/webview/WebViewData;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.helpers.nativeDataCollection.WebServiceCollector$collectWebViewData$2", f = "WebServiceCollector.kt", i = {0}, l = {41, 48}, m = "invokeSuspend", n = {"webViewSessionStartTimestamp"}, s = {"J$0"})
/* loaded from: classes.dex */
public final class WebServiceCollector$collectWebViewData$2 extends SuspendLambda implements Function2<P, Continuation<? super WebViewData>, Object> {
    long J$0;
    int label;
    final /* synthetic */ WebServiceCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebServiceCollector$collectWebViewData$2(WebServiceCollector webServiceCollector, Continuation<? super WebServiceCollector$collectWebViewData$2> continuation) {
        super(2, continuation);
        this.this$0 = webServiceCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WebServiceCollector$collectWebViewData$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super WebViewData> continuation) {
        return ((WebServiceCollector$collectWebViewData$2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (r10 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        SessionHelper sessionService;
        long j10;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            long currentTimeMillis = System.currentTimeMillis();
            sessionService = this.this$0.getSessionService();
            this.J$0 = currentTimeMillis;
            this.label = 1;
            obj = sessionService.getSessionId(this);
            if (obj != coroutine_suspended) {
                j10 = currentTimeMillis;
            }
            return coroutine_suspended;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (WebViewData) obj;
        }
        long j11 = this.J$0;
        ResultKt.throwOnFailure(obj);
        j10 = j11;
        String str2 = (String) obj;
        if (str2 == null) {
            Logger logger = Logger.INSTANCE;
            str = this.this$0.logTag;
            logger.error(str, "no session id found, returning empty webview data");
            return new WebViewData("", null);
        }
        WebServiceCollector$collectWebViewData$2$webViewData$1 webServiceCollector$collectWebViewData$2$webViewData$1 = new WebServiceCollector$collectWebViewData$2$webViewData$1(this.this$0, str2, j10, null);
        this.label = 2;
        obj = h1.c(61000L, webServiceCollector$collectWebViewData$2$webViewData$1, this);
    }
}
