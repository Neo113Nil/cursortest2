package io.ktor.client.plugins;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: HttpCallValidator.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.ReceiveError$install$1", f = "HttpCallValidator.kt", i = {0}, l = {165, 167}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class ReceiveError$install$1 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<HttpRequest, Throwable, Continuation<? super Throwable>, Object> $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReceiveError$install$1(Function3<? super HttpRequest, ? super Throwable, ? super Continuation<? super Throwable>, ? extends Object> function3, Continuation<? super ReceiveError$install$1> continuation) {
        super(3, continuation);
        this.$handler = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, Continuation<? super Unit> continuation) {
        ReceiveError$install$1 receiveError$install$1 = new ReceiveError$install$1(this.$handler, continuation);
        receiveError$install$1.L$0 = pipelineContext;
        return receiveError$install$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r6 != r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.PipelineContext] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
        } catch (Throwable th) {
            Function3<HttpRequest, Throwable, Continuation<? super Throwable>, Object> function3 = this.$handler;
            HttpRequest request = ((HttpClientCall) r1.getContext()).getRequest();
            this.L$0 = null;
            this.label = 2;
            obj = function3.invoke(request, th, this);
        }
        if (r1 == 0) {
            ResultKt.throwOnFailure(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            this.L$0 = pipelineContext;
            this.label = 1;
            Object proceed = pipelineContext.proceed(this);
            r1 = pipelineContext;
        } else {
            if (r1 != 1) {
                if (r1 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    throw th2;
                }
                return Unit.INSTANCE;
            }
            PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
            ResultKt.throwOnFailure(obj);
            r1 = pipelineContext2;
        }
        return Unit.INSTANCE;
    }
}
