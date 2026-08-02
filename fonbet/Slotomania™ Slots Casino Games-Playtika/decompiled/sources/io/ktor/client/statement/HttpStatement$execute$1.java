package io.ktor.client.statement;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpStatement.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {0, 1}, l = {54, Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE, Sdk.SDKMetric.SDKMetricType.AD_START_TO_BACKGROUND_DURATION_MS_VALUE, Sdk.SDKMetric.SDKMetricType.AD_START_TO_BACKGROUND_DURATION_MS_VALUE}, m = "execute", n = {"block", "response"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class HttpStatement$execute$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpStatement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpStatement$execute$1(HttpStatement httpStatement, Continuation<? super HttpStatement$execute$1> continuation) {
        super(continuation);
        this.this$0 = httpStatement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
