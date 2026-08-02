package ai.verisoul.sdk.helpers.webview;

import Ph.P;
import Ph.Q;
import ai.verisoul.sdk.VerisoulErrorCodes;
import ai.verisoul.sdk.VerisoulException;
import ai.verisoul.sdk.logger.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.helpers.webview.VerisoulWebViewImpl$onInit$2", f = "VerisoulWebViewImpl.kt", i = {0, 0, 0, 0, 0}, l = {95}, m = "invokeSuspend", n = {"$this$launch", "lastException", "startTimestamp", "currentAttempt", "success"}, s = {"L$0", "L$1", "J$0", "I$0", "I$1"})
/* loaded from: classes.dex */
public final class VerisoulWebViewImpl$onInit$2 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ VerisoulWebviewCallback $callback;
    final /* synthetic */ String $sessionId;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ VerisoulWebViewImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerisoulWebViewImpl$onInit$2(VerisoulWebViewImpl verisoulWebViewImpl, String str, VerisoulWebviewCallback verisoulWebviewCallback, Continuation<? super VerisoulWebViewImpl$onInit$2> continuation) {
        super(2, continuation);
        this.this$0 = verisoulWebViewImpl;
        this.$sessionId = str;
        this.$callback = verisoulWebviewCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        VerisoulWebViewImpl$onInit$2 verisoulWebViewImpl$onInit$2 = new VerisoulWebViewImpl$onInit$2(this.this$0, this.$sessionId, this.$callback, continuation);
        verisoulWebViewImpl$onInit$2.L$0 = obj;
        return verisoulWebViewImpl$onInit$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((VerisoulWebViewImpl$onInit$2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:4|5|6|7|8|10|11|12|13|(3:(3:25|(1:27)|28)|29|30)(12:18|(1:20)|7|8|10|11|12|13|(0)|(4:23|25|(0)|28)|29|30)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:4|(2:5|6)|7|8|10|11|12|13|(3:(3:25|(1:27)|28)|29|30)(12:18|(1:20)|7|8|10|11|12|13|(0)|(4:23|25|(0)|28)|29|30)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:7:0x0065). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        P p10;
        long currentTimeMillis;
        Exception exc;
        int i10;
        int i11;
        String str;
        String str2;
        String str3;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        Object loadingWebView;
        Exception exc2;
        WebViewData webViewType;
        String str4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        int i13 = 1;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            p10 = (P) this.L$0;
            currentTimeMillis = System.currentTimeMillis();
            exc = null;
            i10 = 0;
            i11 = 0;
            if (i11 < 3) {
            }
            if (i10 == 0) {
            }
            atomicBoolean2 = this.this$0.isLoading;
            atomicBoolean2.set(false);
            this.this$0.initJob = null;
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i10 = this.I$1;
        i11 = this.I$0;
        currentTimeMillis = this.J$0;
        Exception exc3 = (Exception) this.L$1;
        p10 = (P) this.L$0;
        try {
            try {
                ResultKt.throwOnFailure(obj);
                exc2 = exc3;
            } catch (VerisoulException e10) {
                e = e10;
                if (!Intrinsics.areEqual(e.getCode(), VerisoulErrorCodes.WEBVIEW_UNAVAILABLE)) {
                    Logger logger = Logger.INSTANCE;
                    str3 = this.this$0.TAG;
                    logger.error(str3, "WebView unavailable, not retrying: " + e.getMessage());
                    this.$callback.onFailure(e);
                    atomicBoolean = this.this$0.isLoading;
                    atomicBoolean.set(false);
                    this.this$0.initJob = null;
                    return Unit.INSTANCE;
                }
                i11++;
                Logger logger2 = Logger.INSTANCE;
                str2 = this.this$0.TAG;
                logger2.error(str2, "Attempt #" + i11 + " failed with message: " + e.getMessage());
                i13 = 1;
                exc = e;
                if (i11 < 3) {
                }
                if (i10 == 0) {
                }
                atomicBoolean2 = this.this$0.isLoading;
                atomicBoolean2.set(false);
                this.this$0.initJob = null;
                return Unit.INSTANCE;
            }
        } catch (Exception e11) {
            Exception exc4 = e11;
            i11++;
            Logger logger3 = Logger.INSTANCE;
            str = this.this$0.TAG;
            logger3.error(str, "Attempt #" + i11 + " failed with message: " + exc4.getMessage());
            i13 = 1;
            exc = exc4;
            if (i11 < 3) {
            }
            if (i10 == 0) {
            }
            atomicBoolean2 = this.this$0.isLoading;
            atomicBoolean2.set(false);
            this.this$0.initJob = null;
            return Unit.INSTANCE;
        }
        webViewType = this.this$0.getWebViewType();
        long currentTimeMillis2 = System.currentTimeMillis();
        Logger logger4 = Logger.INSTANCE;
        str4 = this.this$0.TAG;
        logger4.metricLog(str4, "web_view_session_duration", currentTimeMillis2 - currentTimeMillis);
        this.$callback.onLoad(webViewType);
        VerisoulWebViewImpl.destroyWebView$default(this.this$0, 0L, 1, null);
        i13 = 1;
        i10 = 1;
        exc = exc2;
        if (i11 < 3 || i10 != 0 || !Q.i(p10)) {
            if (i10 == 0 && Q.i(p10)) {
                VerisoulWebviewCallback verisoulWebviewCallback = this.$callback;
                Exception exc5 = exc;
                if (exc == null) {
                    exc5 = new Exception("WebView load failed");
                }
                verisoulWebviewCallback.onFailure(exc5);
            }
            atomicBoolean2 = this.this$0.isLoading;
            atomicBoolean2.set(false);
            this.this$0.initJob = null;
            return Unit.INSTANCE;
        }
        VerisoulWebViewImpl verisoulWebViewImpl = this.this$0;
        String str5 = this.$sessionId;
        this.L$0 = p10;
        this.L$1 = exc;
        this.J$0 = currentTimeMillis;
        this.I$0 = i11;
        this.I$1 = i10;
        this.label = i13;
        loadingWebView = verisoulWebViewImpl.loadingWebView(str5, this);
        exc2 = exc;
        if (loadingWebView == coroutine_suspended) {
            return coroutine_suspended;
        }
        webViewType = this.this$0.getWebViewType();
        long currentTimeMillis22 = System.currentTimeMillis();
        Logger logger42 = Logger.INSTANCE;
        str4 = this.this$0.TAG;
        logger42.metricLog(str4, "web_view_session_duration", currentTimeMillis22 - currentTimeMillis);
        this.$callback.onLoad(webViewType);
        VerisoulWebViewImpl.destroyWebView$default(this.this$0, 0L, 1, null);
        i13 = 1;
        i10 = 1;
        exc = exc2;
        if (i11 < 3) {
        }
        if (i10 == 0) {
            VerisoulWebviewCallback verisoulWebviewCallback2 = this.$callback;
            Exception exc52 = exc;
            if (exc == null) {
            }
            verisoulWebviewCallback2.onFailure(exc52);
        }
        atomicBoolean2 = this.this$0.isLoading;
        atomicBoolean2.set(false);
        this.this$0.initJob = null;
        return Unit.INSTANCE;
    }
}
