package io.ktor.client.plugins.observer;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.observer.AfterReceiveHook;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.ByteChannelsKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ResponseObserver.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/observer/AfterReceiveHook$Context;", "response", "Lio/ktor/client/statement/HttpResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1", f = "ResponseObserver.kt", i = {0, 0, 1, 1, 3, 3, 3}, l = {Sdk.SDKMetric.SDKMetricType.NATIVE_AD_DISPLAY_DURATION_VALUE, Sdk.SDKMetric.SDKMetricType.NATIVE_AD_DISPLAY_DURATION_VALUE, 72, 82, 87}, m = "invokeSuspend", n = {"$this$on", "response", "$this$on", "response", "$this$on", "newResponse", "sideResponse"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class ResponseObserverKt$ResponseObserver$2$1 extends SuspendLambda implements Function3<AfterReceiveHook.Context, HttpResponse, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<HttpClientCall, Boolean> $filter;
    final /* synthetic */ Function2<HttpResponse, Continuation<? super Unit>, Object> $responseHandler;
    final /* synthetic */ ClientPluginBuilder<ResponseObserverConfig> $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ResponseObserverKt$ResponseObserver$2$1(Function1<? super HttpClientCall, Boolean> function1, ClientPluginBuilder<ResponseObserverConfig> clientPluginBuilder, Function2<? super HttpResponse, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super ResponseObserverKt$ResponseObserver$2$1> continuation) {
        super(3, continuation);
        this.$filter = function1;
        this.$this_createClientPlugin = clientPluginBuilder;
        this.$responseHandler = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel invokeSuspend$lambda$0(ByteReadChannel byteReadChannel, HttpResponse httpResponse) {
        return byteReadChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel invokeSuspend$lambda$1(ByteReadChannel byteReadChannel, HttpResponse httpResponse) {
        return byteReadChannel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(AfterReceiveHook.Context context, HttpResponse httpResponse, Continuation<? super Unit> continuation) {
        ResponseObserverKt$ResponseObserver$2$1 responseObserverKt$ResponseObserver$2$1 = new ResponseObserverKt$ResponseObserver$2$1(this.$filter, this.$this_createClientPlugin, this.$responseHandler, continuation);
        responseObserverKt$ResponseObserver$2$1.L$0 = context;
        responseObserverKt$ResponseObserver$2$1.L$1 = httpResponse;
        return responseObserverKt$ResponseObserver$2$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0143, code lost:
    
        if (r1.proceedWith(r4, r14) != r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
    
        if (r2.proceedWith(r1, r14) != r0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Type inference failed for: r1v14, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AfterReceiveHook.Context context;
        HttpResponse response;
        HttpResponse response2;
        Object responseObserverContext;
        HttpClient httpClient;
        Object responseObserverContext2;
        AfterReceiveHook.Context context2;
        HttpResponse httpResponse;
        AfterReceiveHook.Context context3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            context = (AfterReceiveHook.Context) this.L$0;
            HttpResponse httpResponse2 = (HttpResponse) this.L$1;
            Function1<HttpClientCall, Boolean> function1 = this.$filter;
            if (function1 != null && !function1.invoke(httpResponse2.getCall()).booleanValue()) {
                return Unit.INSTANCE;
            }
            if (DoubleReceivePluginKt.isSaved(httpResponse2)) {
                this.L$0 = context;
                this.L$1 = httpResponse2;
                this.label = 1;
                responseObserverContext2 = ResponseObserverContextJvmKt.getResponseObserverContext(this);
                if (responseObserverContext2 != coroutine_suspended) {
                    context2 = context;
                    httpResponse = httpResponse2;
                    this.L$0 = context2;
                    this.L$1 = httpResponse;
                    this.label = 2;
                    if (BuildersKt.withContext((CoroutineContext) responseObserverContext2, new AnonymousClass1(this.$responseHandler, httpResponse, null), this) != coroutine_suspended) {
                    }
                }
            } else {
                Pair<ByteReadChannel, ByteReadChannel> split = ByteChannelsKt.split(httpResponse2.getRawContent(), httpResponse2);
                final ByteReadChannel component1 = split.component1();
                final ByteReadChannel component2 = split.component2();
                response = io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpResponse2.getCall(), null, new Function1() { // from class: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ByteReadChannel invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = ResponseObserverKt$ResponseObserver$2$1.invokeSuspend$lambda$0(ByteReadChannel.this, (HttpResponse) obj2);
                        return invokeSuspend$lambda$0;
                    }
                }, 1, null).getResponse();
                response2 = io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpResponse2.getCall(), null, new Function1() { // from class: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ByteReadChannel invokeSuspend$lambda$1;
                        invokeSuspend$lambda$1 = ResponseObserverKt$ResponseObserver$2$1.invokeSuspend$lambda$1(ByteReadChannel.this, (HttpResponse) obj2);
                        return invokeSuspend$lambda$1;
                    }
                }, 1, null).getResponse();
                HttpClient client = this.$this_createClientPlugin.getClient();
                this.L$0 = context;
                this.L$1 = response;
                this.L$2 = response2;
                this.L$3 = client;
                this.label = 4;
                responseObserverContext = ResponseObserverContextJvmKt.getResponseObserverContext(this);
                if (responseObserverContext != coroutine_suspended) {
                    httpClient = client;
                    BuildersKt__Builders_commonKt.launch$default(httpClient, (CoroutineContext) responseObserverContext, null, new AnonymousClass2(this.$responseHandler, response2, null), 2, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 5;
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            httpResponse = (HttpResponse) this.L$1;
            AfterReceiveHook.Context context4 = (AfterReceiveHook.Context) this.L$0;
            ResultKt.throwOnFailure(obj);
            context2 = context4;
            responseObserverContext2 = obj;
            this.L$0 = context2;
            this.L$1 = httpResponse;
            this.label = 2;
            if (BuildersKt.withContext((CoroutineContext) responseObserverContext2, new AnonymousClass1(this.$responseHandler, httpResponse, null), this) != coroutine_suspended) {
                context3 = context2;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }
        if (i == 2) {
            httpResponse = (HttpResponse) this.L$1;
            context3 = (AfterReceiveHook.Context) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        } else {
            if (i == 3) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ?? r1 = (CoroutineScope) this.L$3;
            HttpResponse httpResponse3 = (HttpResponse) this.L$2;
            response = (HttpResponse) this.L$1;
            AfterReceiveHook.Context context5 = (AfterReceiveHook.Context) this.L$0;
            ResultKt.throwOnFailure(obj);
            httpClient = r1;
            context = context5;
            response2 = httpResponse3;
            responseObserverContext = obj;
            BuildersKt__Builders_commonKt.launch$default(httpClient, (CoroutineContext) responseObserverContext, null, new AnonymousClass2(this.$responseHandler, response2, null), 2, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 5;
        }
    }

    /* compiled from: ResponseObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1", f = "ResponseObserver.kt", i = {}, l = {Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
        final /* synthetic */ HttpResponse $response;
        final /* synthetic */ Function2<HttpResponse, Continuation<? super Unit>, Object> $responseHandler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super HttpResponse, ? super Continuation<? super Unit>, ? extends Object> function2, HttpResponse httpResponse, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$responseHandler = function2;
            this.$response = httpResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$responseHandler, this.$response, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m11180constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2<HttpResponse, Continuation<? super Unit>, Object> function2 = this.$responseHandler;
                    HttpResponse httpResponse = this.$response;
                    Result.Companion companion = Result.INSTANCE;
                    this.label = 1;
                    if (function2.invoke(httpResponse, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            return Result.m11179boximpl(m11180constructorimpl);
        }
    }

    /* compiled from: ResponseObserver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$2", f = "ResponseObserver.kt", i = {0}, l = {83, 84}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<HttpResponse, Continuation<? super Unit>, Object> $responseHandler;
        final /* synthetic */ HttpResponse $sideResponse;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super HttpResponse, ? super Continuation<? super Unit>, ? extends Object> function2, HttpResponse httpResponse, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$responseHandler = function2;
            this.$sideResponse = httpResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$responseHandler, this.$sideResponse, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            if (r10 == r1) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    Result.m11180constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m11180constructorimpl(ResultKt.createFailure(th2));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Function2<HttpResponse, Continuation<? super Unit>, Object> function2 = this.$responseHandler;
                HttpResponse httpResponse = this.$sideResponse;
                Result.Companion companion3 = Result.INSTANCE;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (function2.invoke(httpResponse, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Result.m11180constructorimpl(Boxing.boxLong(((Number) obj).longValue()));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m11180constructorimpl(Unit.INSTANCE);
            HttpResponse httpResponse2 = this.$sideResponse;
            Result.Companion companion4 = Result.INSTANCE;
            ByteReadChannel rawContent = httpResponse2.getRawContent();
            this.L$0 = null;
            this.label = 2;
            obj = ByteReadChannelOperationsKt.discard$default(rawContent, 0L, this, 1, null);
        }
    }
}
