package com.usercentrics.sdk.domain.api.http;

import com.usercentrics.sdk.errors.UsercentricsTimeoutException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HttpRequestsImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/usercentrics/sdk/domain/api/http/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.domain.api.http.HttpRequestsImpl$getSync2$2", f = "HttpRequestsImpl.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HttpRequestsImpl$getSync2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpResponse>, Object> {
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HttpRequestsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpRequestsImpl$getSync2$2(HttpRequestsImpl httpRequestsImpl, String str, Map<String, String> map, Continuation<? super HttpRequestsImpl$getSync2$2> continuation) {
        super(2, continuation);
        this.this$0 = httpRequestsImpl;
        this.$url = str;
        this.$headers = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HttpRequestsImpl$getSync2$2(this.this$0, this.$url, this.$headers, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpResponse> continuation) {
        return ((HttpRequestsImpl$getSync2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HttpClient httpClient;
        Map<String, String> appendUserAgent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        HttpRequestsImpl httpRequestsImpl = this.this$0;
        String str = this.$url;
        Map<String, String> map = this.$headers;
        this.L$0 = httpRequestsImpl;
        this.L$1 = str;
        this.L$2 = map;
        this.label = 1;
        HttpRequestsImpl$getSync2$2 httpRequestsImpl$getSync2$2 = this;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(httpRequestsImpl$getSync2$2), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        Function1<HttpResponse, Unit> function1 = new Function1<HttpResponse, Unit>() { // from class: com.usercentrics.sdk.domain.api.http.HttpRequestsImpl$getSync2$2$1$onSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpResponse httpResponse) {
                invoke2(httpResponse);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HttpResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CancellableContinuation<HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m11180constructorimpl(it));
            }
        };
        Function1<Throwable, Unit> function12 = new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.domain.api.http.HttpRequestsImpl$getSync2$2$1$onError$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CancellableContinuation<HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m11180constructorimpl(ResultKt.createFailure(it)));
            }
        };
        httpClient = httpRequestsImpl.httpClient;
        appendUserAgent = httpRequestsImpl.appendUserAgent(map);
        final HttpDisposable httpDisposable = httpClient.get(str, appendUserAgent, function1, function12);
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.domain.api.http.HttpRequestsImpl$getSync2$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                HttpDisposable.this.disconnect();
                cancellableContinuationImpl2.tryResumeWithException(new UsercentricsTimeoutException());
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(httpRequestsImpl$getSync2$2);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
