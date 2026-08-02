package io.ktor.client.statement;

import androidx.compose.material.TextFieldImplKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpStatement.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {TextFieldImplKt.AnimationDuration}, m = "fetchStreamingResponse", n = {}, s = {})
/* loaded from: classes2.dex */
final class HttpStatement$fetchStreamingResponse$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpStatement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpStatement$fetchStreamingResponse$1(HttpStatement httpStatement, Continuation<? super HttpStatement$fetchStreamingResponse$1> continuation) {
        super(continuation);
        this.this$0 = httpStatement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchStreamingResponse(this);
    }
}
