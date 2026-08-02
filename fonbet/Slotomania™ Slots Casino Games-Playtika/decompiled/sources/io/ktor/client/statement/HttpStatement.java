package io.ktor.client.statement;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedCallKt;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannelKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: HttpStatement.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b21\u0010\u000f\u001a-\b\u0001\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0010\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0010\u0010\u0012J\u0018\u0010\u0013\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086H¢\u0006\u0004\b\u0013\u0010\u0012JS\u0010\u0013\u001a\u00028\u0001\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0004\b\u0001\u0010\u001423\b\u0004\u0010\u000f\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086H¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\nH\u0081@¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\nH\u0081@¢\u0006\u0004\b\u0016\u0010\u0012J\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\nH\u0081@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lio/ktor/client/statement/HttpStatement;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V", "T", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "name", "response", "Lkotlin/coroutines/Continuation;", "block", "execute", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "body", "R", "fetchStreamingResponse", "fetchResponse", "", "cleanup", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "getClient$annotations", "()V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpStatement {
    private final HttpRequestBuilder builder;
    private final HttpClient client;

    public static /* synthetic */ void getClient$annotations() {
    }

    public HttpStatement(HttpRequestBuilder builder, HttpClient client) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(client, "client");
        this.builder = builder;
        this.client = client;
    }

    public final HttpClient getClient() {
        return this.client;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(2:13|14)(3:16|17|18))(3:19|20|21))(5:22|23|24|25|(2:27|28)(1:29)))(2:35|36))(3:44|45|(2:47|28))|37|38|39|(3:41|25|(0)(0))|28))|51|6|7|(0)(0)|37|38|39|(0)|28|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (cleanup(r10, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object execute(Function2<? super HttpResponse, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        HttpStatement$execute$1 httpStatement$execute$1;
        Object coroutine_suspended;
        int i;
        HttpResponse httpResponse;
        Object invoke;
        HttpResponse httpResponse2;
        try {
            if (continuation instanceof HttpStatement$execute$1) {
                httpStatement$execute$1 = (HttpStatement$execute$1) continuation;
                if ((httpStatement$execute$1.label & Integer.MIN_VALUE) != 0) {
                    httpStatement$execute$1.label -= Integer.MIN_VALUE;
                    Object obj = httpStatement$execute$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpStatement$execute$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        httpStatement$execute$1.L$0 = function2;
                        httpStatement$execute$1.label = 1;
                        obj = fetchStreamingResponse(httpStatement$execute$1);
                        if (obj == coroutine_suspended) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    Object obj2 = httpStatement$execute$1.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    return obj2;
                                }
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                th = (Throwable) httpStatement$execute$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                throw th;
                            }
                            httpResponse2 = (HttpResponse) httpStatement$execute$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                httpStatement$execute$1.L$0 = obj;
                                httpStatement$execute$1.label = 3;
                            } catch (Throwable th) {
                                httpResponse = httpResponse2;
                                th = th;
                                httpStatement$execute$1.L$0 = th;
                                httpStatement$execute$1.label = 4;
                            }
                            return cleanup(httpResponse2, httpStatement$execute$1) != coroutine_suspended ? coroutine_suspended : obj;
                        }
                        function2 = (Function2) httpStatement$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    httpResponse = (HttpResponse) obj;
                    httpStatement$execute$1.L$0 = httpResponse;
                    httpStatement$execute$1.label = 2;
                    invoke = function2.invoke(httpResponse, httpStatement$execute$1);
                    if (invoke != coroutine_suspended) {
                        obj = invoke;
                        httpResponse2 = httpResponse;
                        httpStatement$execute$1.L$0 = obj;
                        httpStatement$execute$1.label = 3;
                        if (cleanup(httpResponse2, httpStatement$execute$1) != coroutine_suspended) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            httpResponse = (HttpResponse) obj;
            httpStatement$execute$1.L$0 = httpResponse;
            httpStatement$execute$1.label = 2;
            invoke = function2.invoke(httpResponse, httpStatement$execute$1);
            if (invoke != coroutine_suspended) {
            }
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        httpStatement$execute$1 = new HttpStatement$execute$1(this, continuation);
        Object obj3 = httpStatement$execute$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$execute$1.label;
    }

    public final Object execute(Continuation<? super HttpResponse> continuation) {
        return fetchResponse(continuation);
    }

    public final /* synthetic */ <T> Object body(Continuation<? super T> continuation) {
        try {
            HttpResponse httpResponse = (HttpResponse) fetchStreamingResponse(null);
            try {
                HttpClientCall call = httpResponse.getCall();
                Intrinsics.reifiedOperationMarker(4, "T");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                try {
                    Intrinsics.reifiedOperationMarker(6, "T");
                } catch (Throwable unused) {
                }
                Object bodyNullable = call.bodyNullable(new TypeInfo(orCreateKotlinClass, null), null);
                Intrinsics.reifiedOperationMarker(1, "T");
                Object obj = bodyNullable;
                return bodyNullable;
            } finally {
                HttpResponseKt.complete(httpResponse);
            }
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
    }

    public final /* synthetic */ <T, R> Object body(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        try {
            HttpResponse httpResponse = (HttpResponse) fetchStreamingResponse(null);
            try {
                HttpClientCall call = httpResponse.getCall();
                Intrinsics.reifiedOperationMarker(4, "T");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                try {
                    Intrinsics.reifiedOperationMarker(6, "T");
                } catch (Throwable unused) {
                }
                Object bodyNullable = call.bodyNullable(new TypeInfo(orCreateKotlinClass, null), null);
                Intrinsics.reifiedOperationMarker(1, "T");
                Object obj = bodyNullable;
                return function2.invoke(bodyNullable, null);
            } finally {
                cleanup(httpResponse, null);
            }
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchStreamingResponse(Continuation<? super HttpResponse> continuation) {
        HttpStatement$fetchStreamingResponse$1 httpStatement$fetchStreamingResponse$1;
        int i;
        try {
            if (continuation instanceof HttpStatement$fetchStreamingResponse$1) {
                httpStatement$fetchStreamingResponse$1 = (HttpStatement$fetchStreamingResponse$1) continuation;
                if ((httpStatement$fetchStreamingResponse$1.label & Integer.MIN_VALUE) != 0) {
                    httpStatement$fetchStreamingResponse$1.label -= Integer.MIN_VALUE;
                    Object obj = httpStatement$fetchStreamingResponse$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpStatement$fetchStreamingResponse$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        HttpRequestBuilder takeFromWithExecutionContext = new HttpRequestBuilder().takeFromWithExecutionContext(this.builder);
                        DoubleReceivePluginKt.skipSaveBody(takeFromWithExecutionContext);
                        HttpClient httpClient = this.client;
                        httpStatement$fetchStreamingResponse$1.label = 1;
                        obj = httpClient.execute$ktor_client_core(takeFromWithExecutionContext, httpStatement$fetchStreamingResponse$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return ((HttpClientCall) obj).getResponse();
                }
            }
            if (i != 0) {
            }
            return ((HttpClientCall) obj).getResponse();
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        httpStatement$fetchStreamingResponse$1 = new HttpStatement$fetchStreamingResponse$1(this, continuation);
        Object obj2 = httpStatement$fetchStreamingResponse$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$fetchStreamingResponse$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchResponse(Continuation<? super HttpResponse> continuation) {
        HttpStatement$fetchResponse$1 httpStatement$fetchResponse$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        HttpClientCall httpClientCall;
        try {
            if (continuation instanceof HttpStatement$fetchResponse$1) {
                httpStatement$fetchResponse$1 = (HttpStatement$fetchResponse$1) continuation;
                if ((httpStatement$fetchResponse$1.label & Integer.MIN_VALUE) != 0) {
                    httpStatement$fetchResponse$1.label -= Integer.MIN_VALUE;
                    obj = httpStatement$fetchResponse$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpStatement$fetchResponse$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        HttpRequestBuilder takeFromWithExecutionContext = new HttpRequestBuilder().takeFromWithExecutionContext(this.builder);
                        HttpClient httpClient = this.client;
                        httpStatement$fetchResponse$1.label = 1;
                        obj = httpClient.execute$ktor_client_core(takeFromWithExecutionContext, httpStatement$fetchResponse$1);
                        if (obj == coroutine_suspended) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                HttpResponse httpResponse = (HttpResponse) httpStatement$fetchResponse$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                return httpResponse;
                            }
                            httpClientCall = (HttpClientCall) httpStatement$fetchResponse$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            HttpResponse response = ((HttpClientCall) obj).getResponse();
                            HttpResponse response2 = httpClientCall.getResponse();
                            httpStatement$fetchResponse$1.L$0 = response;
                            httpStatement$fetchResponse$1.label = 3;
                            return cleanup(response2, httpStatement$fetchResponse$1) == coroutine_suspended ? coroutine_suspended : response;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    httpClientCall = (HttpClientCall) obj;
                    httpStatement$fetchResponse$1.L$0 = httpClientCall;
                    httpStatement$fetchResponse$1.label = 2;
                    obj = SavedCallKt.save(httpClientCall, httpStatement$fetchResponse$1);
                    if (obj == coroutine_suspended) {
                    }
                    HttpResponse response3 = ((HttpClientCall) obj).getResponse();
                    HttpResponse response22 = httpClientCall.getResponse();
                    httpStatement$fetchResponse$1.L$0 = response3;
                    httpStatement$fetchResponse$1.label = 3;
                    if (cleanup(response22, httpStatement$fetchResponse$1) == coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            httpClientCall = (HttpClientCall) obj;
            httpStatement$fetchResponse$1.L$0 = httpClientCall;
            httpStatement$fetchResponse$1.label = 2;
            obj = SavedCallKt.save(httpClientCall, httpStatement$fetchResponse$1);
            if (obj == coroutine_suspended) {
            }
            HttpResponse response32 = ((HttpClientCall) obj).getResponse();
            HttpResponse response222 = httpClientCall.getResponse();
            httpStatement$fetchResponse$1.L$0 = response32;
            httpStatement$fetchResponse$1.label = 3;
            if (cleanup(response222, httpStatement$fetchResponse$1) == coroutine_suspended) {
            }
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        httpStatement$fetchResponse$1 = new HttpStatement$fetchResponse$1(this, continuation);
        obj = httpStatement$fetchResponse$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$fetchResponse$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cleanup(HttpResponse httpResponse, Continuation<? super Unit> continuation) {
        HttpStatement$cleanup$1 httpStatement$cleanup$1;
        int i;
        if (continuation instanceof HttpStatement$cleanup$1) {
            httpStatement$cleanup$1 = (HttpStatement$cleanup$1) continuation;
            if ((httpStatement$cleanup$1.label & Integer.MIN_VALUE) != 0) {
                httpStatement$cleanup$1.label -= Integer.MIN_VALUE;
                Object obj = httpStatement$cleanup$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpStatement$cleanup$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext.Element element = httpResponse.getCoroutineContext().get(Job.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    CompletableJob completableJob = (CompletableJob) element;
                    completableJob.complete();
                    try {
                        ByteReadChannelKt.cancel(httpResponse.getRawContent());
                    } catch (Throwable unused) {
                    }
                    httpStatement$cleanup$1.L$0 = completableJob;
                    httpStatement$cleanup$1.label = 1;
                    if (completableJob.join(httpStatement$cleanup$1) == coroutine_suspended) {
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
        httpStatement$cleanup$1 = new HttpStatement$cleanup$1(this, continuation);
        Object obj2 = httpStatement$cleanup$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpStatement$cleanup$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public String toString() {
        return "HttpStatement[" + this.builder.getUrl() + AbstractJsonLexerKt.END_LIST;
    }
}
