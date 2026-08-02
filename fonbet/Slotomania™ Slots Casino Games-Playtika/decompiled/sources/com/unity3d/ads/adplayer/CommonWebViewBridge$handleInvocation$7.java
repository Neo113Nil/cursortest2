package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.json.JSONArray;

/* compiled from: CommonWebViewBridge.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", i = {0, 0, 1, 1, 2, 3, 4}, l = {134, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 138, 139, 148}, m = "invokeSuspend", n = {"$this$launch", "invocation", "$this$launch", "invocation", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class CommonWebViewBridge$handleInvocation$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $callback;
    final /* synthetic */ String $location;
    final /* synthetic */ String $message;
    final /* synthetic */ JSONArray $parameters;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonWebViewBridge$handleInvocation$7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, String str3, Continuation<? super CommonWebViewBridge$handleInvocation$7> continuation) {
        super(2, continuation);
        this.$location = str;
        this.$parameters = jSONArray;
        this.this$0 = commonWebViewBridge;
        this.$callback = str2;
        this.$message = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CommonWebViewBridge$handleInvocation$7 commonWebViewBridge$handleInvocation$7 = new CommonWebViewBridge$handleInvocation$7(this.$location, this.$parameters, this.this$0, this.$callback, this.$message, continuation);
        commonWebViewBridge$handleInvocation$7.L$0 = obj;
        return commonWebViewBridge$handleInvocation$7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommonWebViewBridge$handleInvocation$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
    
        if (r14 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011d, code lost:
    
        if (r14 != r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:18:0x0021, B:21:0x002f, B:22:0x00aa, B:24:0x00ae, B:28:0x00c1, B:31:0x003c, B:32:0x0097, B:37:0x007d), top: B:2:0x0009, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:18:0x0021, B:21:0x002f, B:22:0x00aa, B:24:0x00ae, B:28:0x00c1, B:31:0x003c, B:32:0x0097, B:37:0x007d), top: B:2:0x0009, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m11180constructorimpl;
        String simpleName;
        Object respond;
        SendDiagnosticEvent sendDiagnosticEvent;
        CoroutineScope coroutineScope;
        MutableSharedFlow mutableSharedFlow;
        Invocation invocation;
        CoroutineScope coroutineScope2;
        Object respond2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
            } catch (Throwable th) {
                if (th instanceof TimeoutCancellationException) {
                    simpleName = "Invocation(" + this.$location + ") is not handled";
                } else {
                    String message = th.getMessage();
                    simpleName = message == null ? th.getClass().getSimpleName() : message;
                }
                CommonWebViewBridge commonWebViewBridge = this.this$0;
                String str = this.$callback;
                Result.Companion companion = Result.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                respond = commonWebViewBridge.respond(str, "ERROR", new Object[]{simpleName}, this);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th2));
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                Invocation invocation2 = new Invocation(this.$location, JSONArrayExtensionsKt.toTypedArray(this.$parameters));
                mutableSharedFlow = this.this$0._onInvocation;
                this.L$0 = coroutineScope;
                this.L$1 = invocation2;
                this.label = 1;
                if (mutableSharedFlow.emit(invocation2, this) != coroutine_suspended) {
                    invocation = invocation2;
                    this.L$0 = coroutineScope;
                    this.L$1 = invocation;
                    this.label = 2;
                    if (TimeoutKt.withTimeout(5000L, new AnonymousClass1(invocation, null), this) == coroutine_suspended) {
                    }
                    this.L$0 = coroutineScope;
                    this.L$1 = null;
                    this.label = 3;
                    obj = invocation.getResult(this);
                    if (obj != coroutine_suspended) {
                        coroutineScope2 = coroutineScope;
                        if (obj instanceof WebViewEvent) {
                            this.L$0 = coroutineScope2;
                            this.label = 5;
                            respond2 = this.this$0.respond(this.$callback, "OK", new Object[]{obj}, this);
                            break;
                        } else {
                            this.L$0 = coroutineScope2;
                            this.label = 4;
                            if (this.this$0.sendEvent((WebViewEvent) obj, this) == coroutine_suspended) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 1:
                invocation = (Invocation) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope;
                this.L$1 = invocation;
                this.label = 2;
                if (TimeoutKt.withTimeout(5000L, new AnonymousClass1(invocation, null), this) == coroutine_suspended) {
                }
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.label = 3;
                obj = invocation.getResult(this);
                if (obj != coroutine_suspended) {
                }
                break;
            case 2:
                invocation = (Invocation) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.label = 3;
                obj = invocation.getResult(this);
                if (obj != coroutine_suspended) {
                }
                break;
            case 3:
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (obj instanceof WebViewEvent) {
                }
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
                CommonWebViewBridge commonWebViewBridge2 = this.this$0;
                String str2 = this.$message;
                Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                if (m11183exceptionOrNullimpl != null) {
                    sendDiagnosticEvent = commonWebViewBridge2.sendDiagnosticEvent;
                    Pair[] pairArr = new Pair[2];
                    String message2 = m11183exceptionOrNullimpl.getMessage();
                    if (message2 == null) {
                        message2 = m11183exceptionOrNullimpl.getClass().getSimpleName();
                    }
                    pairArr[0] = TuplesKt.to("reason_debug", message2);
                    pairArr[1] = TuplesKt.to("webview_invocation", str2);
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, MapsKt.mapOf(pairArr), null, null, null, 58, null);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CommonWebViewBridge.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1", f = "CommonWebViewBridge.kt", i = {}, l = {Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Invocation $invocation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Invocation invocation, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$invocation = invocation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$invocation, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$invocation.isHandled().await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
