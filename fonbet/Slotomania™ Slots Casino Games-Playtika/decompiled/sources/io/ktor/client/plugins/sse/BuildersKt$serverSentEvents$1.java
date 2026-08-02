package io.ktor.client.plugins.sse;

import io.sentry.cache.EnvelopeCache;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: builders.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.sse.BuildersKt", f = "builders.kt", i = {0, 1}, l = {173, 175}, m = "serverSentEvents-mY9Nd3A", n = {"block", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class BuildersKt$serverSentEvents$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    BuildersKt$serverSentEvents$1(Continuation<? super BuildersKt$serverSentEvents$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BuildersKt.m10903serverSentEventsmY9Nd3A(null, null, null, null, null, null, this);
    }
}
