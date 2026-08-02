package io.ktor.client.plugins.sse;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.sse.ServerSentEvent;
import io.ktor.sse.TypedServerSentEvent;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.slf4j.Logger;

/* compiled from: SSE.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$2", f = "SSE.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SSEKt$SSE$2$2 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    SSEKt$SSE$2$2(Continuation<? super SSEKt$SSE$2$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, Continuation<? super Unit> continuation) {
        SSEKt$SSE$2$2 sSEKt$SSE$2$2 = new SSEKt$SSE$2$2(continuation);
        sSEKt$SSE$2$2.L$0 = pipelineContext;
        sSEKt$SSE$2$2.L$1 = httpResponseContainer;
        return sSEKt$SSE$2$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ClientSSESession clientSSESession;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            HttpResponseContainer httpResponseContainer = (HttpResponseContainer) this.L$1;
            TypeInfo expectedType = httpResponseContainer.getExpectedType();
            final Object response = httpResponseContainer.getResponse();
            HttpResponse response2 = ((HttpClientCall) pipelineContext.getContext()).getResponse();
            if (!Intrinsics.areEqual(HttpResponseKt.getRequest(response2).getAttributes().getOrNull(BuildersKt.getSseRequestAttr()), Boxing.boxBoolean(true))) {
                Logger logger = SSEKt.getLOGGER();
                if (LoggerJvmKt.isTraceEnabled(logger)) {
                    logger.trace("Skipping non SSE response from " + HttpResponseKt.getRequest(response2).getUrl());
                }
                return Unit.INSTANCE;
            }
            SSEKt.checkResponse(response2);
            if (!(response instanceof SSESession)) {
                throw new SSEClientException(response2, null, "Expected " + Reflection.getOrCreateKotlinClass(SSESession.class).getSimpleName() + " content but was " + response, 2, null);
            }
            Logger logger2 = SSEKt.getLOGGER();
            if (LoggerJvmKt.isTraceEnabled(logger2)) {
                logger2.trace("Receive SSE session from " + HttpResponseKt.getRequest(response2).getUrl() + ": " + response);
            }
            final Function2 function2 = (Function2) HttpResponseKt.getRequest(response2).getAttributes().getOrNull(BuildersKt.getDeserializerAttr());
            if (function2 != null) {
                clientSSESession = new ClientSSESessionWithDeserialization((HttpClientCall) pipelineContext.getContext(), new SSESessionWithDeserialization(response, function2) { // from class: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1
                    private final CoroutineContext coroutineContext;
                    private final Function2<TypeInfo, String, Object> deserializer;
                    private final Flow<TypedServerSentEvent<String>> incoming;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        SSESession sSESession = (SSESession) response;
                        final Flow<ServerSentEvent> incoming = sSESession.getIncoming();
                        this.incoming = new Flow<TypedServerSentEvent<String>>() { // from class: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super TypedServerSentEvent<String>> flowCollector, Continuation continuation) {
                                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                @DebugMetadata(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2", f = "SSE.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                                /* renamed from: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    int i;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label -= Integer.MIN_VALUE;
                                            Object obj2 = anonymousClass1.result;
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            i = anonymousClass1.label;
                                            if (i != 0) {
                                                ResultKt.throwOnFailure(obj2);
                                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                                ServerSentEvent serverSentEvent = (ServerSentEvent) obj;
                                                TypedServerSentEvent typedServerSentEvent = new TypedServerSentEvent(serverSentEvent.getData(), serverSentEvent.getEvent(), serverSentEvent.getId(), serverSentEvent.getRetry(), serverSentEvent.getComments());
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(typedServerSentEvent, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj2);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                    Object obj22 = anonymousClass1.result;
                                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        };
                        this.deserializer = function2;
                        this.coroutineContext = sSESession.getCoroutineContext();
                    }

                    @Override // io.ktor.client.plugins.sse.SSESessionWithDeserialization
                    public Flow<TypedServerSentEvent<String>> getIncoming() {
                        return this.incoming;
                    }

                    @Override // io.ktor.client.plugins.sse.SSESessionWithDeserialization
                    public Function2<TypeInfo, String, Object> getDeserializer() {
                        return this.deserializer;
                    }

                    @Override // kotlinx.coroutines.CoroutineScope
                    public CoroutineContext getCoroutineContext() {
                        return this.coroutineContext;
                    }
                });
            } else {
                clientSSESession = new ClientSSESession((HttpClientCall) pipelineContext.getContext(), (SSESession) response);
            }
            this.L$0 = null;
            this.label = 1;
            if (pipelineContext.proceedWith(new HttpResponseContainer(expectedType, clientSSESession), this) == coroutine_suspended) {
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
