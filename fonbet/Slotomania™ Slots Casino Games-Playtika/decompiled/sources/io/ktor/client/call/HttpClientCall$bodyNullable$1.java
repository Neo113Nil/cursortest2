package io.ktor.client.call;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpClientCall.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {0, 1}, l = {96, 99}, m = "bodyNullable", n = {"info", "info"}, s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
final class HttpClientCall$bodyNullable$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpClientCall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClientCall$bodyNullable$1(HttpClientCall httpClientCall, Continuation<? super HttpClientCall$bodyNullable$1> continuation) {
        super(continuation);
        this.this$0 = httpClientCall;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.bodyNullable(null, this);
    }
}
