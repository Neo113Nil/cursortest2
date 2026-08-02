package io.ktor.client.plugins;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.cio.CIOMultipartDataBase;
import io.ktor.http.content.MultiPartData;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.DeprecationKt;
import io.ktor.utils.io.WriterJob;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.io.Source;
import org.slf4j.Logger;

/* compiled from: DefaultTransform.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9}, l = {72, Base64.mimeLineLength, Base64.mimeLineLength, 81, 81, 85, 92, 116, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend", n = {"$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info", "$this$intercept", "info"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes7.dex */
final class DefaultTransformKt$defaultTransformers$2 extends SuspendLambda implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super Unit>, Object> {
    final /* synthetic */ HttpClient $this_defaultTransformers;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultTransformKt$defaultTransformers$2(HttpClient httpClient, Continuation<? super DefaultTransformKt$defaultTransformers$2> continuation) {
        super(3, continuation);
        this.$this_defaultTransformers = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, Continuation<? super Unit> continuation) {
        DefaultTransformKt$defaultTransformers$2 defaultTransformKt$defaultTransformers$2 = new DefaultTransformKt$defaultTransformers$2(this.$this_defaultTransformers, continuation);
        defaultTransformKt$defaultTransformers$2.L$0 = pipelineContext;
        defaultTransformKt$defaultTransformers$2.L$1 = httpResponseContainer;
        return defaultTransformKt$defaultTransformers$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0166  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PipelineContext pipelineContext;
        TypeInfo expectedType;
        Object readRemaining;
        PipelineContext pipelineContext2;
        PipelineContext pipelineContext3;
        TypeInfo typeInfo;
        Object proceedWith;
        TypeInfo typeInfo2;
        Object proceedWith2;
        Object proceedWith3;
        Object byteArray;
        PipelineContext pipelineContext4;
        TypeInfo typeInfo3;
        Object readRemaining2;
        PipelineContext pipelineContext5;
        TypeInfo typeInfo4;
        Object proceedWith4;
        Object proceedWith5;
        TypeInfo typeInfo5;
        Object proceedWith6;
        Object proceedWith7;
        Logger logger;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        HttpResponseContainer httpResponseContainer = null;
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                pipelineContext = (PipelineContext) this.L$0;
                HttpResponseContainer httpResponseContainer2 = (HttpResponseContainer) this.L$1;
                expectedType = httpResponseContainer2.getExpectedType();
                Object response = httpResponseContainer2.getResponse();
                if (!(response instanceof ByteReadChannel)) {
                    return Unit.INSTANCE;
                }
                HttpResponse response2 = ((HttpClientCall) pipelineContext.getContext()).getResponse();
                KClass<?> type = expectedType.getType();
                if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(Unit.class))) {
                    ByteReadChannelKt.cancel((ByteReadChannel) response);
                    this.L$0 = pipelineContext;
                    this.L$1 = expectedType;
                    this.label = 1;
                    proceedWith4 = pipelineContext.proceedWith(new HttpResponseContainer(expectedType, Unit.INSTANCE), this);
                    if (proceedWith4 != coroutine_suspended) {
                        typeInfo2 = expectedType;
                        httpResponseContainer = (HttpResponseContainer) proceedWith4;
                        expectedType = typeInfo2;
                        if (httpResponseContainer != null) {
                            logger = DefaultTransformKt.LOGGER;
                            logger.trace("Transformed with default transformers response body for " + ((HttpClientCall) pipelineContext.getContext()).getRequest().getUrl() + " to " + expectedType.getType());
                        }
                        return Unit.INSTANCE;
                    }
                } else if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    this.L$0 = pipelineContext;
                    this.L$1 = expectedType;
                    this.L$2 = pipelineContext;
                    this.L$3 = expectedType;
                    this.label = 2;
                    readRemaining2 = ByteReadChannelOperationsKt.readRemaining((ByteReadChannel) response, this);
                    if (readRemaining2 != coroutine_suspended) {
                        pipelineContext2 = pipelineContext;
                        pipelineContext5 = pipelineContext2;
                        typeInfo4 = expectedType;
                        this.L$0 = pipelineContext2;
                        this.L$1 = expectedType;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        proceedWith5 = pipelineContext5.proceedWith(new HttpResponseContainer(typeInfo4, Boxing.boxInt(Integer.parseInt(DeprecationKt.readText((Source) readRemaining2)))), this);
                        if (proceedWith5 != coroutine_suspended) {
                            typeInfo5 = expectedType;
                            httpResponseContainer = (HttpResponseContainer) proceedWith5;
                            expectedType = typeInfo5;
                            pipelineContext = pipelineContext2;
                            if (httpResponseContainer != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(Source.class)) || Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(Source.class))) {
                    this.L$0 = pipelineContext;
                    this.L$1 = expectedType;
                    this.L$2 = pipelineContext;
                    this.L$3 = expectedType;
                    this.label = 4;
                    readRemaining = ByteReadChannelOperationsKt.readRemaining((ByteReadChannel) response, this);
                    if (readRemaining != coroutine_suspended) {
                        pipelineContext2 = pipelineContext;
                        pipelineContext3 = pipelineContext2;
                        typeInfo = expectedType;
                        this.L$0 = pipelineContext2;
                        this.L$1 = expectedType;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 5;
                        proceedWith6 = pipelineContext3.proceedWith(new HttpResponseContainer(typeInfo, readRemaining), this);
                        if (proceedWith6 != coroutine_suspended) {
                            typeInfo5 = expectedType;
                            httpResponseContainer = (HttpResponseContainer) proceedWith6;
                            expectedType = typeInfo5;
                            pipelineContext = pipelineContext2;
                            if (httpResponseContainer != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(byte[].class))) {
                    this.L$0 = pipelineContext;
                    this.L$1 = expectedType;
                    this.label = 6;
                    byteArray = ByteReadChannelOperationsKt.toByteArray((ByteReadChannel) response, this);
                    if (byteArray != coroutine_suspended) {
                        pipelineContext4 = pipelineContext;
                        typeInfo3 = expectedType;
                        UtilsKt.checkContentLength(HttpMessagePropertiesKt.contentLength(((HttpClientCall) pipelineContext4.getContext()).getResponse()), r3.length, ((HttpClientCall) pipelineContext4.getContext()).getRequest().getMethod());
                        this.L$0 = pipelineContext4;
                        this.L$1 = typeInfo3;
                        this.label = 7;
                        proceedWith7 = pipelineContext4.proceedWith(new HttpResponseContainer(typeInfo3, (byte[]) byteArray), this);
                        if (proceedWith7 != coroutine_suspended) {
                            typeInfo2 = typeInfo3;
                            pipelineContext = pipelineContext4;
                            httpResponseContainer = (HttpResponseContainer) proceedWith7;
                            expectedType = typeInfo2;
                            if (httpResponseContainer != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(ByteReadChannel.class))) {
                    final CompletableJob Job = JobKt.Job((Job) response2.getCoroutineContext().get(Job.INSTANCE));
                    WriterJob writer$default = ByteWriteChannelOperationsKt.writer$default((CoroutineScope) pipelineContext, this.$this_defaultTransformers.getCoroutineContext(), false, (Function2) new DefaultTransformKt$defaultTransformers$2$result$channel$1(response, response2, null), 2, (Object) null);
                    ByteWriteChannelOperationsKt.invokeOnCompletion(writer$default, (Function1<? super Throwable, Unit>) new Function1() { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit invokeSuspend$lambda$1$lambda$0;
                            invokeSuspend$lambda$1$lambda$0 = DefaultTransformKt$defaultTransformers$2.invokeSuspend$lambda$1$lambda$0(CompletableJob.this, (Throwable) obj2);
                            return invokeSuspend$lambda$1$lambda$0;
                        }
                    });
                    this.L$0 = pipelineContext;
                    this.L$1 = expectedType;
                    this.label = 8;
                    proceedWith3 = pipelineContext.proceedWith(new HttpResponseContainer(expectedType, writer$default.getChannel()), this);
                    if (proceedWith3 != coroutine_suspended) {
                        typeInfo2 = expectedType;
                        httpResponseContainer = (HttpResponseContainer) proceedWith3;
                        expectedType = typeInfo2;
                        if (httpResponseContainer != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (!Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(HttpStatusCode.class))) {
                        if (Intrinsics.areEqual(type, Reflection.getOrCreateKotlinClass(MultiPartData.class))) {
                            String str = ((HttpClientCall) pipelineContext.getContext()).getResponse().getHeaders().get(HttpHeaders.INSTANCE.getContentType());
                            if (str == null) {
                                throw new IllegalStateException("No content type provided for multipart".toString());
                            }
                            ContentType parse = ContentType.INSTANCE.parse(str);
                            if (!parse.match(ContentType.MultiPart.INSTANCE.getFormData())) {
                                throw new IllegalStateException(("Expected multipart/form-data, got " + parse).toString());
                            }
                            String str2 = ((HttpClientCall) pipelineContext.getContext()).getResponse().getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
                            Long boxLong = str2 != null ? Boxing.boxLong(Long.parseLong(str2)) : null;
                            this.L$0 = pipelineContext;
                            this.L$1 = expectedType;
                            this.label = 10;
                            proceedWith = pipelineContext.proceedWith(new HttpResponseContainer(expectedType, new CIOMultipartDataBase(pipelineContext.getCoroutineContext(), (ByteReadChannel) response, str, boxLong, 0L, 16, null)), this);
                            if (proceedWith != coroutine_suspended) {
                                typeInfo2 = expectedType;
                                httpResponseContainer = (HttpResponseContainer) proceedWith;
                                expectedType = typeInfo2;
                            }
                        }
                        if (httpResponseContainer != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    ByteReadChannelKt.cancel((ByteReadChannel) response);
                    this.L$0 = pipelineContext;
                    this.L$1 = expectedType;
                    this.label = 9;
                    proceedWith2 = pipelineContext.proceedWith(new HttpResponseContainer(expectedType, response2.getStatus()), this);
                    if (proceedWith2 != coroutine_suspended) {
                        typeInfo2 = expectedType;
                        httpResponseContainer = (HttpResponseContainer) proceedWith2;
                        expectedType = typeInfo2;
                        if (httpResponseContainer != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 1:
                typeInfo2 = (TypeInfo) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                proceedWith4 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith4;
                expectedType = typeInfo2;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 2:
                typeInfo4 = (TypeInfo) this.L$3;
                PipelineContext pipelineContext6 = (PipelineContext) this.L$2;
                expectedType = (TypeInfo) this.L$1;
                pipelineContext2 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                pipelineContext5 = pipelineContext6;
                readRemaining2 = obj;
                this.L$0 = pipelineContext2;
                this.L$1 = expectedType;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                proceedWith5 = pipelineContext5.proceedWith(new HttpResponseContainer(typeInfo4, Boxing.boxInt(Integer.parseInt(DeprecationKt.readText((Source) readRemaining2)))), this);
                if (proceedWith5 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                typeInfo5 = (TypeInfo) this.L$1;
                PipelineContext pipelineContext7 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                pipelineContext2 = pipelineContext7;
                proceedWith5 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith5;
                expectedType = typeInfo5;
                pipelineContext = pipelineContext2;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 4:
                typeInfo = (TypeInfo) this.L$3;
                PipelineContext pipelineContext8 = (PipelineContext) this.L$2;
                expectedType = (TypeInfo) this.L$1;
                pipelineContext2 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                pipelineContext3 = pipelineContext8;
                readRemaining = obj;
                this.L$0 = pipelineContext2;
                this.L$1 = expectedType;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                proceedWith6 = pipelineContext3.proceedWith(new HttpResponseContainer(typeInfo, readRemaining), this);
                if (proceedWith6 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 5:
                typeInfo5 = (TypeInfo) this.L$1;
                PipelineContext pipelineContext9 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                pipelineContext2 = pipelineContext9;
                proceedWith6 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith6;
                expectedType = typeInfo5;
                pipelineContext = pipelineContext2;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 6:
                typeInfo3 = (TypeInfo) this.L$1;
                PipelineContext pipelineContext10 = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                pipelineContext4 = pipelineContext10;
                byteArray = obj;
                UtilsKt.checkContentLength(HttpMessagePropertiesKt.contentLength(((HttpClientCall) pipelineContext4.getContext()).getResponse()), r3.length, ((HttpClientCall) pipelineContext4.getContext()).getRequest().getMethod());
                this.L$0 = pipelineContext4;
                this.L$1 = typeInfo3;
                this.label = 7;
                proceedWith7 = pipelineContext4.proceedWith(new HttpResponseContainer(typeInfo3, (byte[]) byteArray), this);
                if (proceedWith7 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 7:
                typeInfo2 = (TypeInfo) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                proceedWith7 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith7;
                expectedType = typeInfo2;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 8:
                typeInfo2 = (TypeInfo) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                proceedWith3 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith3;
                expectedType = typeInfo2;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 9:
                typeInfo2 = (TypeInfo) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                proceedWith2 = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith2;
                expectedType = typeInfo2;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            case 10:
                typeInfo2 = (TypeInfo) this.L$1;
                pipelineContext = (PipelineContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                proceedWith = obj;
                httpResponseContainer = (HttpResponseContainer) proceedWith;
                expectedType = typeInfo2;
                if (httpResponseContainer != null) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(CompletableJob completableJob, Throwable th) {
        completableJob.complete();
        return Unit.INSTANCE;
    }
}
