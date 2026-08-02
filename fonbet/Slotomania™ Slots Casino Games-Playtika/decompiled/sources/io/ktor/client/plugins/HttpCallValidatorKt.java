package io.ktor.client.plugins;

import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.plugins.api.SetupRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.reflect.TypeInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.slf4j.Logger;

/* compiled from: HttpCallValidator.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\u000b\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"(\u0010\u001c\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\" \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!*`\u0010)\"-\b\u0001\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0\"2-\b\u0001\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0\"*`\u0010,\"-\b\u0001\u0012\u0013\u0012\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0\"2-\b\u0001\u0012\u0013\u0012\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0\"*\u008a\u0001\u0010/\"B\b\u0001\u0012\u0013\u0012\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0-2B\b\u0001\u0012\u0013\u0012\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0-¨\u00060"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/request/HttpRequest;", "HttpRequest", "(Lio/ktor/client/request/HttpRequestBuilder;)Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpCallValidatorConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", "HttpResponseValidator", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpCallValidator", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpCallValidator", "()Lio/ktor/client/plugins/api/ClientPlugin;", "", "value", "getExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;)Z", "setExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;Z)V", "expectSuccess", "Lio/ktor/util/AttributeKey;", "ExpectSuccessAttributeKey", "Lio/ktor/util/AttributeKey;", "getExpectSuccessAttributeKey", "()Lio/ktor/util/AttributeKey;", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "name", "response", "Lkotlin/coroutines/Continuation;", "", "ResponseValidator", "", "cause", "CallExceptionHandler", "Lkotlin/Function3;", "request", "CallRequestExceptionHandler", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpCallValidatorKt {
    private static final AttributeKey<Boolean> ExpectSuccessAttributeKey;
    private static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCallValidator");
    private static final ClientPlugin<HttpCallValidatorConfig> HttpCallValidator = CreatePluginUtilsKt.createClientPlugin("HttpResponseValidator", HttpCallValidatorKt$HttpCallValidator$1.INSTANCE, new Function1() { // from class: io.ktor.client.plugins.HttpCallValidatorKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit HttpCallValidator$lambda$2;
            HttpCallValidator$lambda$2 = HttpCallValidatorKt.HttpCallValidator$lambda$2((ClientPluginBuilder) obj);
            return HttpCallValidator$lambda$2;
        }
    });

    static {
        KType kType;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
        try {
            kType = Reflection.typeOf(Boolean.TYPE);
        } catch (Throwable unused) {
            kType = null;
        }
        ExpectSuccessAttributeKey = new AttributeKey<>("ExpectSuccessAttributeKey", new TypeInfo(orCreateKotlinClass, kType));
    }

    public static final ClientPlugin<HttpCallValidatorConfig> getHttpCallValidator() {
        return HttpCallValidator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HttpCallValidator$lambda$2(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        List reversed = CollectionsKt.reversed(((HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getResponseValidators$ktor_client_core());
        List reversed2 = CollectionsKt.reversed(((HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getResponseExceptionHandlers$ktor_client_core());
        createClientPlugin.on(SetupRequest.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$1(((HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getExpectSuccess(), null));
        createClientPlugin.on(Send.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$2(reversed, null));
        createClientPlugin.on(RequestError.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$3(reversed2, null));
        createClientPlugin.on(ReceiveError.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$4(reversed2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object HttpCallValidator$lambda$2$validateResponse(List<? extends Function2<? super HttpResponse, ? super Continuation<? super Unit>, ? extends Object>> list, HttpResponse httpResponse, Continuation<? super Unit> continuation) {
        HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 httpCallValidatorKt$HttpCallValidator$2$validateResponse$1;
        int i;
        Iterator it;
        if (continuation instanceof HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) {
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = (HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) continuation;
            if ((httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label & Integer.MIN_VALUE) != 0) {
                httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label -= Integer.MIN_VALUE;
                Object obj = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    LOGGER.trace("Validating response for request " + httpResponse.getCall().getRequest().getUrl());
                    it = list.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$1;
                    httpResponse = (HttpResponse) httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    Function2 function2 = (Function2) it.next();
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$0 = httpResponse;
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$1 = it;
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label = 1;
                    if (function2.invoke(httpResponse, httpCallValidatorKt$HttpCallValidator$2$validateResponse$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = new HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(continuation);
        Object obj2 = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        if (r10.invoke(r8, r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r6 = r9;
        r9 = r8;
        r8 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object HttpCallValidator$lambda$2$processException(List<? extends HandlerWrapper> list, Throwable th, HttpRequest httpRequest, Continuation<? super Unit> continuation) {
        HttpCallValidatorKt$HttpCallValidator$2$processException$1 httpCallValidatorKt$HttpCallValidator$2$processException$1;
        int i;
        Iterator it;
        if (continuation instanceof HttpCallValidatorKt$HttpCallValidator$2$processException$1) {
            httpCallValidatorKt$HttpCallValidator$2$processException$1 = (HttpCallValidatorKt$HttpCallValidator$2$processException$1) continuation;
            if ((httpCallValidatorKt$HttpCallValidator$2$processException$1.label & Integer.MIN_VALUE) != 0) {
                httpCallValidatorKt$HttpCallValidator$2$processException$1.label -= Integer.MIN_VALUE;
                Object obj = httpCallValidatorKt$HttpCallValidator$2$processException$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCallValidatorKt$HttpCallValidator$2$processException$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    LOGGER.trace("Processing exception " + th + " for request " + httpRequest.getUrl());
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) httpCallValidatorKt$HttpCallValidator$2$processException$1.L$2;
                    HttpRequest httpRequest2 = (HttpRequest) httpCallValidatorKt$HttpCallValidator$2$processException$1.L$1;
                    Throwable th2 = (Throwable) httpCallValidatorKt$HttpCallValidator$2$processException$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Throwable th3 = th2;
                    httpRequest = httpRequest2;
                    th = th3;
                    if (it.hasNext()) {
                        HandlerWrapper handlerWrapper = (HandlerWrapper) it.next();
                        if (handlerWrapper instanceof ExceptionHandlerWrapper) {
                            Function2<Throwable, Continuation<? super Unit>, Object> handler = ((ExceptionHandlerWrapper) handlerWrapper).getHandler();
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.L$0 = th;
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.L$1 = httpRequest;
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.L$2 = it;
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.label = 1;
                            if (handler.invoke(th, httpCallValidatorKt$HttpCallValidator$2$processException$1) != coroutine_suspended) {
                                HttpRequest httpRequest3 = httpRequest;
                                th2 = th;
                                httpRequest2 = httpRequest3;
                                Throwable th32 = th2;
                                httpRequest = httpRequest2;
                                th = th32;
                            }
                            return coroutine_suspended;
                        }
                        if (!(handlerWrapper instanceof RequestExceptionHandlerWrapper)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Function3<Throwable, HttpRequest, Continuation<? super Unit>, Object> handler2 = ((RequestExceptionHandlerWrapper) handlerWrapper).getHandler();
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.L$0 = th;
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.L$1 = httpRequest;
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.L$2 = it;
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.label = 2;
                        if (it.hasNext()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        httpCallValidatorKt$HttpCallValidator$2$processException$1 = new HttpCallValidatorKt$HttpCallValidator$2$processException$1(continuation);
        Object obj2 = httpCallValidatorKt$HttpCallValidator$2$processException$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCallValidatorKt$HttpCallValidator$2$processException$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpRequest HttpRequest(final HttpRequestBuilder httpRequestBuilder) {
        return new HttpRequest() { // from class: io.ktor.client.plugins.HttpCallValidatorKt$HttpRequest$1
            private final Attributes attributes;
            private final Headers headers;
            private final HttpMethod method;
            private final Url url;

            {
                this.method = HttpRequestBuilder.this.getMethod();
                this.url = HttpRequestBuilder.this.getUrl().build();
                this.attributes = HttpRequestBuilder.this.getAttributes();
                this.headers = HttpRequestBuilder.this.getHeaders().build();
            }

            @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
            public CoroutineContext getCoroutineContext() {
                return HttpRequest.DefaultImpls.getCoroutineContext(this);
            }

            @Override // io.ktor.client.request.HttpRequest
            public HttpClientCall getCall() {
                throw new IllegalStateException("Call is not initialized".toString());
            }

            @Override // io.ktor.client.request.HttpRequest
            public HttpMethod getMethod() {
                return this.method;
            }

            @Override // io.ktor.client.request.HttpRequest
            public Url getUrl() {
                return this.url;
            }

            @Override // io.ktor.client.request.HttpRequest
            public Attributes getAttributes() {
                return this.attributes;
            }

            @Override // io.ktor.http.HttpMessage
            public Headers getHeaders() {
                return this.headers;
            }

            @Override // io.ktor.client.request.HttpRequest
            public OutgoingContent getContent() {
                Object body = HttpRequestBuilder.this.getBody();
                OutgoingContent outgoingContent = body instanceof OutgoingContent ? (OutgoingContent) body : null;
                if (outgoingContent != null) {
                    return outgoingContent;
                }
                throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + HttpRequestBuilder.this.getBody()).toString());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HttpResponseValidator(HttpClientConfig<?> httpClientConfig, Function1<? super HttpCallValidatorConfig, Unit> block) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        httpClientConfig.install(HttpCallValidator, block);
    }

    public static final boolean getExpectSuccess(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        Boolean bool = (Boolean) httpRequestBuilder.getAttributes().getOrNull(ExpectSuccessAttributeKey);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final void setExpectSuccess(HttpRequestBuilder httpRequestBuilder, boolean z) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        httpRequestBuilder.getAttributes().put(ExpectSuccessAttributeKey, Boolean.valueOf(z));
    }

    public static final AttributeKey<Boolean> getExpectSuccessAttributeKey() {
        return ExpectSuccessAttributeKey;
    }
}
