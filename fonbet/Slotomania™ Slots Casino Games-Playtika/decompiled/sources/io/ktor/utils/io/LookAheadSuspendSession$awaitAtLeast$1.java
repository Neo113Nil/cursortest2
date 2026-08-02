package io.ktor.utils.io;

import io.sentry.protocol.MetricSummary;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LookAheadSession.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.LookAheadSuspendSession", f = "LookAheadSession.kt", i = {0}, l = {42}, m = "awaitAtLeast", n = {MetricSummary.JsonKeys.MIN}, s = {"I$0"})
/* loaded from: classes8.dex */
final class LookAheadSuspendSession$awaitAtLeast$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LookAheadSuspendSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LookAheadSuspendSession$awaitAtLeast$1(LookAheadSuspendSession lookAheadSuspendSession, Continuation<? super LookAheadSuspendSession$awaitAtLeast$1> continuation) {
        super(continuation);
        this.this$0 = lookAheadSuspendSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitAtLeast(0, this);
    }
}
