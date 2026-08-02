package com.usercentrics.sdk.domain.api.http;

import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: HttpRequestsImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.domain.api.http.HttpRequestsImpl$post$1", f = "HttpRequestsImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HttpRequestsImpl$post$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $bodyData;
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ HttpRequestsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpRequestsImpl$post$1(HttpRequestsImpl httpRequestsImpl, String str, String str2, Map<String, String> map, Continuation<? super HttpRequestsImpl$post$1> continuation) {
        super(2, continuation);
        this.this$0 = httpRequestsImpl;
        this.$url = str;
        this.$bodyData = str2;
        this.$headers = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HttpRequestsImpl$post$1(this.this$0, this.$url, this.$bodyData, this.$headers, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super String> continuation) {
        return ((HttpRequestsImpl$post$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.this$0.postSync(this.$url, this.$bodyData, this.$headers);
    }
}
