package io.ktor.client.statement;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpStatement.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {1, 2}, l = {162, 165, 166}, m = "fetchResponse", n = {NotificationCompat.CATEGORY_CALL, "result"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class HttpStatement$fetchResponse$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpStatement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpStatement$fetchResponse$1(HttpStatement httpStatement, Continuation<? super HttpStatement$fetchResponse$1> continuation) {
        super(continuation);
        this.this$0 = httpStatement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchResponse(this);
    }
}
