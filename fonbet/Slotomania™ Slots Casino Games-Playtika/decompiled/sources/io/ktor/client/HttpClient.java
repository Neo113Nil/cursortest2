package io.ktor.client;

import androidx.core.app.NotificationCompat;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.plugins.BodyProgressKt;
import io.ktor.client.plugins.DefaultResponseValidationKt;
import io.ktor.client.plugins.DefaultTransformKt;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.plugins.HttpCallValidatorKt;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.HttpPlainTextKt;
import io.ktor.client.plugins.HttpRedirectKt;
import io.ktor.client.plugins.HttpRequestLifecycleKt;
import io.ktor.client.plugins.HttpSend;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.client.utils.ClientEventsKt;
import io.ktor.client.utils.HttpResponseReceiveFail;
import io.ktor.events.Events;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: HttpClient.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001c\u001a\u00020\u00002\u001b\u0010\u001b\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010;\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010E\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010I\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010N\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lio/ktor/client/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/engine/HttpClientEngine;", "engine", "Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "userConfig", "<init>", "(Lio/ktor/client/engine/HttpClientEngine;Lio/ktor/client/HttpClientConfig;)V", "", "manageEngine", "(Lio/ktor/client/engine/HttpClientEngine;Lio/ktor/client/HttpClientConfig;Z)V", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/call/HttpClientCall;", "execute$ktor_client_core", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lio/ktor/client/engine/HttpClientEngineCapability;", "capability", "isSupported", "(Lio/ktor/client/engine/HttpClientEngineCapability;)Z", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "config", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/HttpClient;", "close", "()V", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/engine/HttpClientEngine;", "getEngine", "()Lio/ktor/client/engine/HttpClientEngine;", "Lio/ktor/client/HttpClientConfig;", "Z", "Lkotlinx/coroutines/CompletableJob;", "clientJob", "Lkotlinx/coroutines/CompletableJob;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/client/request/HttpRequestPipeline;", "requestPipeline", "Lio/ktor/client/request/HttpRequestPipeline;", "getRequestPipeline", "()Lio/ktor/client/request/HttpRequestPipeline;", "Lio/ktor/client/statement/HttpResponsePipeline;", "responsePipeline", "Lio/ktor/client/statement/HttpResponsePipeline;", "getResponsePipeline", "()Lio/ktor/client/statement/HttpResponsePipeline;", "Lio/ktor/client/request/HttpSendPipeline;", "sendPipeline", "Lio/ktor/client/request/HttpSendPipeline;", "getSendPipeline", "()Lio/ktor/client/request/HttpSendPipeline;", "Lio/ktor/client/statement/HttpReceivePipeline;", "receivePipeline", "Lio/ktor/client/statement/HttpReceivePipeline;", "getReceivePipeline", "()Lio/ktor/client/statement/HttpReceivePipeline;", "Lio/ktor/util/Attributes;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "engineConfig", "Lio/ktor/client/engine/HttpClientEngineConfig;", "getEngineConfig", "()Lio/ktor/client/engine/HttpClientEngineConfig;", "Lio/ktor/events/Events;", "monitor", "Lio/ktor/events/Events;", "getMonitor", "()Lio/ktor/events/Events;", "getConfig$ktor_client_core", "()Lio/ktor/client/HttpClientConfig;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HttpClient implements CoroutineScope, Closeable {
    private static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClient.class, "closed");
    private final Attributes attributes;
    private final CompletableJob clientJob;
    private volatile /* synthetic */ int closed;
    private final HttpClientConfig<HttpClientEngineConfig> config;
    private final CoroutineContext coroutineContext;
    private final HttpClientEngine engine;
    private final HttpClientEngineConfig engineConfig;
    private boolean manageEngine;
    private final Events monitor;
    private final HttpReceivePipeline receivePipeline;
    private final HttpRequestPipeline requestPipeline;
    private final HttpResponsePipeline responsePipeline;
    private final HttpSendPipeline sendPipeline;
    private final HttpClientConfig<? extends HttpClientEngineConfig> userConfig;

    public HttpClient(HttpClientEngine engine, HttpClientConfig<? extends HttpClientEngineConfig> userConfig) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.engine = engine;
        this.userConfig = userConfig;
        boolean z = false;
        this.closed = 0;
        CompletableJob Job = JobKt.Job((Job) engine.getCoroutineContext().get(Job.INSTANCE));
        this.clientJob = Job;
        this.coroutineContext = engine.getCoroutineContext().plus(Job);
        int i = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.requestPipeline = new HttpRequestPipeline(z, i, defaultConstructorMarker);
        HttpResponsePipeline httpResponsePipeline = new HttpResponsePipeline(z, i, defaultConstructorMarker);
        this.responsePipeline = httpResponsePipeline;
        HttpSendPipeline httpSendPipeline = new HttpSendPipeline(z, i, defaultConstructorMarker);
        this.sendPipeline = httpSendPipeline;
        this.receivePipeline = new HttpReceivePipeline(z, i, defaultConstructorMarker);
        this.attributes = AttributesJvmKt.Attributes(true);
        this.engineConfig = engine.getConfig();
        this.monitor = new Events();
        HttpClientConfig<HttpClientEngineConfig> httpClientConfig = new HttpClientConfig<>();
        this.config = httpClientConfig;
        if (this.manageEngine) {
            Job.invokeOnCompletion(new Function1() { // from class: io.ktor.client.HttpClient$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit _init_$lambda$0;
                    _init_$lambda$0 = HttpClient._init_$lambda$0(HttpClient.this, (Throwable) obj);
                    return _init_$lambda$0;
                }
            });
        }
        engine.install(this);
        httpSendPipeline.intercept(HttpSendPipeline.INSTANCE.getReceive(), new AnonymousClass2(null));
        HttpClientConfig.install$default(httpClientConfig, HttpRequestLifecycleKt.getHttpRequestLifecycle(), null, 2, null);
        HttpClientConfig.install$default(httpClientConfig, BodyProgressKt.getBodyProgress(), null, 2, null);
        HttpClientConfig.install$default(httpClientConfig, DoubleReceivePluginKt.getSaveBody(), null, 2, null);
        if (userConfig.getUseDefaultTransformers()) {
            httpClientConfig.install("DefaultTransformers", new Function1() { // from class: io.ktor.client.HttpClient$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HttpClient.lambda$2$lambda$1((HttpClient) obj);
                }
            });
        }
        HttpClientConfig.install$default(httpClientConfig, HttpSend.INSTANCE, null, 2, null);
        HttpClientConfig.install$default(httpClientConfig, HttpCallValidatorKt.getHttpCallValidator(), null, 2, null);
        if (userConfig.getFollowRedirects()) {
            HttpClientConfig.install$default(httpClientConfig, HttpRedirectKt.getHttpRedirect(), null, 2, null);
        }
        httpClientConfig.plusAssign(userConfig);
        if (userConfig.getUseDefaultTransformers()) {
            HttpClientConfig.install$default(httpClientConfig, HttpPlainTextKt.getHttpPlainText(), null, 2, null);
        }
        DefaultResponseValidationKt.addDefaultResponseValidation(httpClientConfig);
        httpClientConfig.install(this);
        httpResponsePipeline.intercept(HttpResponsePipeline.INSTANCE.getReceive(), new AnonymousClass4(null));
    }

    public final HttpClientEngine getEngine() {
        return this.engine;
    }

    public /* synthetic */ HttpClient(HttpClientEngine httpClientEngine, HttpClientConfig httpClientConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClientEngine, (i & 2) != 0 ? new HttpClientConfig() : httpClientConfig);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpClient(HttpClientEngine engine, HttpClientConfig<? extends HttpClientEngineConfig> userConfig, boolean z) {
        this(engine, userConfig);
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.manageEngine = z;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final HttpRequestPipeline getRequestPipeline() {
        return this.requestPipeline;
    }

    public final HttpResponsePipeline getResponsePipeline() {
        return this.responsePipeline;
    }

    public final HttpSendPipeline getSendPipeline() {
        return this.sendPipeline;
    }

    public final HttpReceivePipeline getReceivePipeline() {
        return this.receivePipeline;
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final HttpClientEngineConfig getEngineConfig() {
        return this.engineConfig;
    }

    public final Events getMonitor() {
        return this.monitor;
    }

    public final HttpClientConfig<HttpClientEngineConfig> getConfig$ktor_client_core() {
        return this.config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(HttpClient httpClient, Throwable th) {
        if (th != null) {
            CoroutineScopeKt.cancel$default(httpClient.engine, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HttpClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", NotificationCompat.CATEGORY_CALL}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", i = {0, 0}, l = {1370, 1372}, m = "invokeSuspend", n = {"$this$intercept", NotificationCompat.CATEGORY_CALL}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.HttpClient$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = HttpClient.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = pipelineContext;
            anonymousClass2.L$1 = obj;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
        
            if (r3.proceedWith(r1, r9) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            PipelineContext pipelineContext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                obj2 = this.L$1;
                if (!(obj2 instanceof HttpClientCall)) {
                    throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + Reflection.getOrCreateKotlinClass(obj2.getClass()) + ").").toString());
                }
                this.L$0 = pipelineContext2;
                this.L$1 = obj2;
                this.label = 1;
                Object execute = HttpClient.this.getReceivePipeline().execute(Unit.INSTANCE, ((HttpClientCall) obj2).getResponse(), this);
                if (execute != coroutine_suspended) {
                    pipelineContext = pipelineContext2;
                    obj = execute;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            obj2 = this.L$1;
            pipelineContext = (PipelineContext) this.L$0;
            ResultKt.throwOnFailure(obj);
            ((HttpClientCall) obj2).setResponse$ktor_client_core((HttpResponse) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
    }

    static final Unit lambda$2$lambda$1(HttpClient install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        DefaultTransformKt.defaultTransformers(install);
        return Unit.INSTANCE;
    }

    /* compiled from: HttpClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", i = {0}, l = {1404}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    /* renamed from: io.ktor.client.HttpClient$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, Continuation<? super Unit> continuation) {
            AnonymousClass4 anonymousClass4 = HttpClient.this.new AnonymousClass4(continuation);
            anonymousClass4.L$0 = pipelineContext;
            return anonymousClass4.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PipelineContext pipelineContext;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                try {
                    this.L$0 = pipelineContext2;
                    this.label = 1;
                    Object proceed = pipelineContext2.proceed(this);
                    if (proceed == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pipelineContext = pipelineContext2;
                    obj = proceed;
                } catch (Throwable th2) {
                    pipelineContext = pipelineContext2;
                    th = th2;
                    HttpClient.this.getMonitor().raise(ClientEventsKt.getHttpResponseReceiveFailed(), new HttpResponseReceiveFail(((HttpClientCall) pipelineContext.getContext()).getResponse(), th));
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pipelineContext = (PipelineContext) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th = th3;
                    HttpClient.this.getMonitor().raise(ClientEventsKt.getHttpResponseReceiveFailed(), new HttpResponseReceiveFail(((HttpClientCall) pipelineContext.getContext()).getResponse(), th));
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute$ktor_client_core(HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpClientCall> continuation) {
        HttpClient$execute$1 httpClient$execute$1;
        int i;
        if (continuation instanceof HttpClient$execute$1) {
            httpClient$execute$1 = (HttpClient$execute$1) continuation;
            if ((httpClient$execute$1.label & Integer.MIN_VALUE) != 0) {
                httpClient$execute$1.label -= Integer.MIN_VALUE;
                Object obj = httpClient$execute$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpClient$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.monitor.raise(ClientEventsKt.getHttpRequestCreated(), httpRequestBuilder);
                    HttpRequestPipeline httpRequestPipeline = this.requestPipeline;
                    Object body = httpRequestBuilder.getBody();
                    httpClient$execute$1.label = 1;
                    obj = httpRequestPipeline.execute(httpRequestBuilder, body, httpClient$execute$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
                return (HttpClientCall) obj;
            }
        }
        httpClient$execute$1 = new HttpClient$execute$1(this, continuation);
        Object obj2 = httpClient$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpClient$execute$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (HttpClientCall) obj2;
    }

    public final boolean isSupported(HttpClientEngineCapability<?> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return this.engine.getSupportedCapabilities().contains(capability);
    }

    public final HttpClient config(Function1<? super HttpClientConfig<?>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        HttpClientEngine httpClientEngine = this.engine;
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        httpClientConfig.plusAssign(this.userConfig);
        block.invoke(httpClientConfig);
        return new HttpClient(httpClientEngine, httpClientConfig, this.manageEngine);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (closed$FU.compareAndSet(this, 0, 1)) {
            Attributes attributes = (Attributes) this.attributes.get(HttpClientPluginKt.getPLUGIN_INSTALLED_LIST());
            Iterator<T> it = attributes.getAllKeys().iterator();
            while (it.hasNext()) {
                AttributeKey attributeKey = (AttributeKey) it.next();
                Intrinsics.checkNotNull(attributeKey, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object obj = attributes.get(attributeKey);
                if (obj instanceof AutoCloseable) {
                    ((AutoCloseable) obj).close();
                }
            }
            this.clientJob.complete();
            if (this.manageEngine) {
                this.engine.close();
            }
        }
    }

    public String toString() {
        return "HttpClient[" + this.engine + AbstractJsonLexerKt.END_LIST;
    }
}
