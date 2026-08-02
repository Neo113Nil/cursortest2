package com.usercentrics.sdk.services.api.http;

import com.usercentrics.sdk.domain.api.http.HttpResponse;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: AndroidHttpClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.services.api.http.AndroidHttpClient$get$2", f = "AndroidHttpClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AndroidHttpClient$get$2 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<HttpResponse, Unit> $onSuccess;
    final /* synthetic */ HttpURLConnection $urlConnection;
    int label;
    final /* synthetic */ AndroidHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidHttpClient$get$2(Function1<? super HttpResponse, Unit> function1, AndroidHttpClient androidHttpClient, HttpURLConnection httpURLConnection, Continuation<? super AndroidHttpClient$get$2> continuation) {
        super(2, continuation);
        this.$onSuccess = function1;
        this.this$0 = androidHttpClient;
        this.$urlConnection = httpURLConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidHttpClient$get$2(this.$onSuccess, this.this$0, this.$urlConnection, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super Unit> continuation) {
        return ((AndroidHttpClient$get$2) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HttpResponse use;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<HttpResponse, Unit> function1 = this.$onSuccess;
        use = this.this$0.use(this.$urlConnection);
        function1.invoke(use);
        return Unit.INSTANCE;
    }
}
