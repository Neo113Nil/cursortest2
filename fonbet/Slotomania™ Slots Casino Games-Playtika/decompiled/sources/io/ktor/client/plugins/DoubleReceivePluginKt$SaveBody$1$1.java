package io.ktor.client.plugins;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedCallKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.io.ByteReadChannelKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.slf4j.Logger;

/* compiled from: SaveBody.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "response"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1", f = "SaveBody.kt", i = {0, 0, 0}, l = {45, 52}, m = "invokeSuspend", n = {"$this$intercept", "response", "attributes"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class DoubleReceivePluginKt$SaveBody$1$1 extends SuspendLambda implements Function3<PipelineContext<HttpResponse, Unit>, HttpResponse, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    DoubleReceivePluginKt$SaveBody$1$1(Continuation<? super DoubleReceivePluginKt$SaveBody$1$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponse, Unit> pipelineContext, HttpResponse httpResponse, Continuation<? super Unit> continuation) {
        DoubleReceivePluginKt$SaveBody$1$1 doubleReceivePluginKt$SaveBody$1$1 = new DoubleReceivePluginKt$SaveBody$1$1(continuation);
        doubleReceivePluginKt$SaveBody$1$1.L$0 = pipelineContext;
        doubleReceivePluginKt$SaveBody$1$1.L$1 = httpResponse;
        return doubleReceivePluginKt$SaveBody$1$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:2|(1:(1:(3:6|7|8)(2:10|11))(2:12|13))(2:27|(4:29|(1:31)|32|33)(4:34|(1:36)|37|(2:39|22)(1:40)))|14|15|16|17|(1:19)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f2, code lost:
    
        if (r5.proceedWith(r11, r10) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r2 = kotlin.Result.m11180constructorimpl(kotlin.ResultKt.createFailure(r2));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [io.ktor.client.statement.HttpResponse] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.client.statement.HttpResponse] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AttributeKey<?> attributeKey;
        Logger logger;
        PipelineContext pipelineContext;
        Attributes attributes;
        Logger logger2;
        AttributeKey attributeKey2;
        Logger logger3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = this.label;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                HttpResponse httpResponse = (HttpResponse) this.L$1;
                HttpClientCall call = httpResponse.getCall();
                Attributes attributes2 = call.getAttributes();
                attributeKey = DoubleReceivePluginKt.SKIP_SAVE_BODY;
                if (attributes2.contains(attributeKey)) {
                    logger2 = DoubleReceivePluginKt.getLOGGER();
                    if (LoggerJvmKt.isTraceEnabled(logger2)) {
                        logger2.trace("Skipping body saving for " + call.getRequest().getUrl());
                    }
                    return Unit.INSTANCE;
                }
                logger = DoubleReceivePluginKt.getLOGGER();
                if (LoggerJvmKt.isTraceEnabled(logger)) {
                    logger.trace("Saving body for " + call.getRequest().getUrl());
                }
                this.L$0 = pipelineContext2;
                this.L$1 = httpResponse;
                this.L$2 = attributes2;
                this.label = 1;
                Object save = SavedCallKt.save(call, this);
                if (save == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pipelineContext = pipelineContext2;
                obj = save;
                attributes = attributes2;
                r2 = httpResponse;
            } else {
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                attributes = (Attributes) this.L$2;
                HttpResponse httpResponse2 = (HttpResponse) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                r2 = httpResponse2;
            }
            HttpResponse response = ((HttpClientCall) obj).getResponse();
            Result.Companion companion = Result.INSTANCE;
            ByteReadChannelKt.cancel(r2.getRawContent());
            Object m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
            Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
            if (m11183exceptionOrNullimpl != null) {
                logger3 = DoubleReceivePluginKt.getLOGGER();
                logger3.debug("Failed to cancel response body", m11183exceptionOrNullimpl);
            }
            attributeKey2 = DoubleReceivePluginKt.RESPONSE_BODY_SAVED;
            attributes.put(attributeKey2, Unit.INSTANCE);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        } finally {
        }
    }
}
