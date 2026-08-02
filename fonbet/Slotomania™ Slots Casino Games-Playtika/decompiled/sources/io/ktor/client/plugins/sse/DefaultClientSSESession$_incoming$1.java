package io.ktor.client.plugins.sse;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.sse.ServerSentEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: DefaultClientSSESession.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lio/ktor/sse/ServerSentEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1", f = "DefaultClientSSESession.kt", i = {0, 1, 2}, l = {48, 53, Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
final class DefaultClientSSESession$_incoming$1 extends SuspendLambda implements Function2<FlowCollector<? super ServerSentEvent>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultClientSSESession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultClientSSESession$_incoming$1(DefaultClientSSESession defaultClientSSESession, Continuation<? super DefaultClientSSESession$_incoming$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultClientSSESession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultClientSSESession$_incoming$1 defaultClientSSESession$_incoming$1 = new DefaultClientSSESession$_incoming$1(this.this$0, continuation);
        defaultClientSSESession$_incoming$1.L$0 = obj;
        return defaultClientSSESession$_incoming$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super ServerSentEvent> flowCollector, Continuation<? super Unit> continuation) {
        return ((DefaultClientSSESession$_incoming$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0090 -> B:9:0x0046). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b5 -> B:7:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b8 -> B:7:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r1
            goto L3a
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L90
        L2b:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L69
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
        L3a:
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r8.this$0
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
            boolean r1 = kotlinx.coroutines.JobKt.isActive(r1)
            if (r1 == 0) goto Lbf
        L46:
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r8.this$0
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
            boolean r1 = kotlinx.coroutines.JobKt.isActive(r1)
            if (r1 == 0) goto La0
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r8.this$0
            io.ktor.utils.io.ByteReadChannel r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getInput$p(r1)
            r6 = r8
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r8.L$0 = r9
            r8.label = r4
            java.lang.Object r1 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$tryParseEvent(r1, r5, r6)
            if (r1 != r0) goto L66
            goto Lb7
        L66:
            r7 = r1
            r1 = r9
            r9 = r7
        L69:
            io.ktor.sse.ServerSentEvent r9 = (io.ktor.sse.ServerSentEvent) r9
            if (r9 != 0) goto L6f
            r9 = r1
            goto La0
        L6f:
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r8.this$0
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$isCommentsEvent(r5, r9)
            if (r5 == 0) goto L7f
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r8.this$0
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getShowCommentEvents$p(r5)
            if (r5 == 0) goto L90
        L7f:
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r8.this$0
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$isRetryEvent(r5, r9)
            if (r5 == 0) goto L92
            io.ktor.client.plugins.sse.DefaultClientSSESession r5 = r8.this$0
            boolean r5 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getShowRetryEvents$p(r5)
            if (r5 == 0) goto L90
            goto L92
        L90:
            r9 = r1
            goto L46
        L92:
            r5 = r8
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = r1.emit(r9, r5)
            if (r9 != r0) goto L90
            goto Lb7
        La0:
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r8.this$0
            boolean r1 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$getNeedToReconnect$p(r1)
            if (r1 == 0) goto Lb8
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r8.this$0
            r5 = r8
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r8.L$0 = r9
            r8.label = r2
            java.lang.Object r1 = io.ktor.client.plugins.sse.DefaultClientSSESession.access$doReconnection(r1, r5)
            if (r1 != r0) goto L3a
        Lb7:
            return r0
        Lb8:
            io.ktor.client.plugins.sse.DefaultClientSSESession r1 = r8.this$0
            io.ktor.client.plugins.sse.DefaultClientSSESession.access$close(r1)
            goto L3a
        Lbf:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
