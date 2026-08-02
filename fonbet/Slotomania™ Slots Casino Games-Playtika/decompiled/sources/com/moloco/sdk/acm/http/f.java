package com.moloco.sdk.acm.http;

import com.moloco.sdk.MetricsRequest;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.ContentType;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* loaded from: classes8.dex */
public final class f implements e {
    public final HttpClient a;
    public final String b;
    public final String c;

    @DebugMetadata(c = "com.moloco.sdk.acm.http.PostMetricsRequestImpl", f = "PostMetricsRequest.kt", i = {}, l = {54}, m = "execute-0E7RQCE", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object a = f.this.a(null, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m11179boximpl(a);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.acm.http.PostMetricsRequestImpl", f = "PostMetricsRequest.kt", i = {0, 1, 1}, l = {145, 82}, m = "makeMetricsRequest-BWLJW6A", n = {"this", "this", "responseStatus"}, s = {"L$0", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object a = f.this.a(0L, null, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m11179boximpl(a);
        }
    }

    public f(HttpClient httpClient, String apiUrl) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        this.a = httpClient;
        this.b = apiUrl;
        this.c = "PostMetricsRequest";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.moloco.sdk.acm.http.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(d dVar, Function1<? super HeadersBuilder, Unit> function1, Continuation<? super Result<String>> continuation) {
        a aVar;
        int i;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar2.c;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                aVar2.c = 1;
                Object a2 = a(5000L, dVar, function1, aVar2);
                return a2 == coroutine_suspended ? coroutine_suspended : a2;
            }
        }
        aVar = new a(continuation);
        a aVar22 = aVar;
        Object obj2 = aVar22.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar22.c;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0103 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:13:0x00f5, B:15:0x0103, B:18:0x0121), top: B:11:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0121 A[Catch: Exception -> 0x003e, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0039, B:13:0x00f5, B:15:0x0103, B:18:0x0121), top: B:11:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(final long j, d dVar, Function1<? super HeadersBuilder, Unit> function1, Continuation<? super Result<String>> continuation) {
        b bVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        f fVar;
        KType kType;
        KType kType2;
        f fVar2;
        HttpStatusCode httpStatusCode;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
                obj = bVar.c;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        HttpClient httpClient = this.a;
                        String str = this.b;
                        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
                        HttpRequestKt.url(httpRequestBuilder, str);
                        HttpTimeoutKt.timeout(httpRequestBuilder, new Function1() { // from class: com.moloco.sdk.acm.http.f$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return f.a(j, (HttpTimeoutConfig) obj2);
                            }
                        });
                        HttpMessagePropertiesKt.contentType(httpRequestBuilder, ContentType.Application.INSTANCE.getProtoBuf());
                        HttpRequestKt.headers(httpRequestBuilder, function1);
                        byte[] a2 = a(dVar);
                        if (a2 == null) {
                            httpRequestBuilder.setBody(NullBody.INSTANCE);
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(byte[].class);
                            try {
                                kType2 = Reflection.typeOf(byte[].class);
                            } catch (Throwable unused) {
                                kType2 = null;
                            }
                            httpRequestBuilder.setBodyType(new TypeInfo(orCreateKotlinClass, kType2));
                        } else if (a2 instanceof OutgoingContent) {
                            httpRequestBuilder.setBody(a2);
                            httpRequestBuilder.setBodyType(null);
                        } else {
                            httpRequestBuilder.setBody(a2);
                            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(byte[].class);
                            try {
                                kType = Reflection.typeOf(byte[].class);
                            } catch (Throwable unused2) {
                                kType = null;
                            }
                            httpRequestBuilder.setBodyType(new TypeInfo(orCreateKotlinClass2, kType));
                        }
                        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
                        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                        bVar.a = this;
                        bVar.e = 1;
                        obj = httpStatement.execute(bVar);
                        if (obj != coroutine_suspended) {
                            fVar = this;
                        }
                        return coroutine_suspended;
                    } catch (Exception e) {
                        e = e;
                        fVar = this;
                        fVar2 = fVar;
                        Exception exc = e;
                        com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, fVar2.c, "Post Metrics Request Exception", exc, false, 8, null);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(exc));
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpStatusCode = (HttpStatusCode) bVar.b;
                    fVar2 = (f) bVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        String str2 = (String) obj;
                        if (!Intrinsics.areEqual(httpStatusCode, HttpStatusCode.INSTANCE.getOK())) {
                            com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.a, fVar2.c, "Post Metrics Request Success: " + str2, false, 4, null);
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m11180constructorimpl(str2);
                        }
                        com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, fVar2.c, "Post Metrics Request Error: " + str2, null, false, 12, null);
                        Result.Companion companion3 = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("PostMetricsRequest Error: " + httpStatusCode)));
                    } catch (Exception e2) {
                        e = e2;
                        Exception exc2 = e;
                        com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, fVar2.c, "Post Metrics Request Exception", exc2, false, 8, null);
                        Result.Companion companion4 = Result.INSTANCE;
                        return Result.m11180constructorimpl(ResultKt.createFailure(exc2));
                    }
                }
                fVar = (f) bVar.a;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e3) {
                    e = e3;
                    fVar2 = fVar;
                    Exception exc22 = e;
                    com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, fVar2.c, "Post Metrics Request Exception", exc22, false, 8, null);
                    Result.Companion companion42 = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(exc22));
                }
                HttpResponse httpResponse = (HttpResponse) obj;
                HttpStatusCode status = httpResponse.getStatus();
                bVar.a = fVar;
                bVar.b = status;
                bVar.e = 2;
                obj = HttpResponseKt.bodyAsText$default(httpResponse, null, bVar, 1, null);
                if (obj != coroutine_suspended) {
                    fVar2 = fVar;
                    httpStatusCode = status;
                    String str22 = (String) obj;
                    if (!Intrinsics.areEqual(httpStatusCode, HttpStatusCode.INSTANCE.getOK())) {
                    }
                }
                return coroutine_suspended;
            }
        }
        bVar = new b(continuation);
        obj = bVar.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
        HttpResponse httpResponse2 = (HttpResponse) obj;
        HttpStatusCode status2 = httpResponse2.getStatus();
        bVar.a = fVar;
        bVar.b = status2;
        bVar.e = 2;
        obj = HttpResponseKt.bodyAsText$default(httpResponse2, null, bVar, 1, null);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public static final Unit a(long j, HttpTimeoutConfig timeout) {
        Intrinsics.checkNotNullParameter(timeout, "$this$timeout");
        timeout.setRequestTimeoutMillis(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    public final byte[] a(d dVar) {
        MetricsRequest.PostMetricsRequest build = MetricsRequest.PostMetricsRequest.newBuilder().addAllCounts(dVar.a()).addAllDurations(dVar.b()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        byte[] byteArray = build.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
